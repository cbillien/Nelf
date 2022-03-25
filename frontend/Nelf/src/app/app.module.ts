import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RoomComponent } from './room/room.component';
import { UserComponent } from './user/user.component';
import { NftComponent } from './nft/nft.component';

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
