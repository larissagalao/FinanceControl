import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BodyService {

  constructor(private http: HttpClient) { }

  graph() {

    return this.http.get('http://localhost:8080/bills/graph');
  
  }

}
