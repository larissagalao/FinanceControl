import { Component, OnInit } from '@angular/core';
import { ListService } from '../list.service';
import { Bill } from './Bill';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  list: Bill[] = [];


  constructor(private service: ListService ) {   }


  ngOnInit(): void {

    this.service
    .getList()
    .subscribe(resposta => this.list = resposta);
  }

}
