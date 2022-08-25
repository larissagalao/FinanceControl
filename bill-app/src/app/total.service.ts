import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Bill } from './list/Bill';

@Injectable({
  providedIn: 'root'
})
export class TotalService {

  constructor(private http: HttpClient) { }

  hash() : Observable<Bill[]>{

    return this.http.get<Bill[]>('http://localhost:8080/bills/hash');
  }

  total() : Observable<number>{

    return this.http.get<number>('http://localhost:8080/bills/total');

  }




}
