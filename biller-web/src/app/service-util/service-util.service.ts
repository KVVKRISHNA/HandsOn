import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServiceUtilService {

  loggedInUser: string | null = null;
  isLoginSuccess: boolean = false;

  constructor() {
   this.loggedInUser = null;
   this.isLoginSuccess = false;
  }

}
