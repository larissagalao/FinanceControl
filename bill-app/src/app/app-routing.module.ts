import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListComponent } from './list/list.component';
import { BodyComponent } from './template/body/body.component';
import { TotalComponent } from './total/total.component';

const routes: Routes = [
  {path: 'total', component: TotalComponent}, {path: '', component : BodyComponent},{path: 'list', component: ListComponent} 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
