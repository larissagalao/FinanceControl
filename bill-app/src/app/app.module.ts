import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TemplateModule } from './template/template.module';
import { TotalService } from './total.service';
import { TotalComponent } from './total/total.component';
import { ListComponent } from './list/list.component';
import { ListService } from './list.service';
import {HttpClientModule} from '@angular/common/http'
import { BodyService } from './body.service';


@NgModule({
  declarations: [
    AppComponent,
    TotalComponent,
    ListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, 
    TemplateModule,
    HttpClientModule
  ],
  providers: [TotalService, ListService, BodyService],
  bootstrap: [AppComponent]
})
export class AppModule { }
