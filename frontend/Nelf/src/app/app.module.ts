import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NftComponent } from 'src/nft/nft.component';
import { RoomComponent } from 'src/room/room.component';
import { UserComponent } from 'src/user/user.component';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


@NgModule({
  declarations: [
    AppComponent,
    RoomComponent,
    UserComponent,
    NftComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
