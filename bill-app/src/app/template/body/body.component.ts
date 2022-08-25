import { Component, OnInit } from '@angular/core';
import { BodyService } from 'src/app/body.service';

@Component({
  selector: 'app-body',
  templateUrl: './body.component.html',
  styleUrls: ['./body.component.css']
})
export class BodyComponent implements OnInit {

  constructor(private service: BodyService) { }

 ngOnInit(): void {
  
  }

  graph(){
    this.service.graph().subscribe(resposta => resposta);  
  }

}
