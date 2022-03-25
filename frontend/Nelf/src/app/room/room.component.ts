import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Room } from './Room';

@Component({
  selector: 'app-room',
  templateUrl: './room.component.html',
  styleUrls: ['./room.component.css']
})
export class RoomComponent implements OnInit {

  rooms: Room[] = [];
  showroom: boolean;
  constructor(private httpClient: HttpClient){
    this.showroom = false;
  }

  ngOnInit(): void {
    this.getRooms();
  }

  getRooms() {
    this.httpClient.get<any>('localhost:8080').subscribe((response) => {
      console.log(response.rooms);
      this.rooms = response.rooms;
    });
  }

}
