import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Bill } from './list/Bill';

@Injectable({
  providedIn: 'root'
})
export class ListService {

  constructor(private http: HttpClient) { 
    
  }

  getList() : Observable<Bill[]>{

    return this.http.get<Bill[]>('http://localhost:8080/bills/list');
  }

}
