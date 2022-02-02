import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RestfulServiceService {

  constructor(private http: HttpClient) { }

  getAccountList() {
    return this.http.get("http://localhost:4009/userInfo");
  }
}
