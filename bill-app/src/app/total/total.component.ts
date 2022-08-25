import { Component, OnInit } from '@angular/core';
import { TotalService } from '../total.service';

@Component({
  selector: 'app-total',
  templateUrl: './total.component.html',
  styleUrls: ['./total.component.css']
})
export class TotalComponent implements OnInit {

  hash = {};

  valor : number = 0;

  constructor(private service: TotalService) { }

  ngOnInit(): void {

    this.service
    .hash()
    .subscribe(resposta => this.hash = resposta);

    this.service
    .total()
    .subscribe(resposta => this.valor = resposta);
  }

}
