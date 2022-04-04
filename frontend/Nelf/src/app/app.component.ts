import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Nelf';

  constructor(private httpClient: HttpClient){

  }

  onTestHttp(){
    this.httpClient.get('/api/room').subscribe(resp=>{
      console.log('OK', resp)
    })
  }
}
