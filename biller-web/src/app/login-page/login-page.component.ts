import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceUtilService } from '../service-util/service-util.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login-page',
  imports: [FormsModule],
  templateUrl: './login-page.component.html',
  styleUrl: './login-page.component.css'
})
export class LoginPageComponent {
  username: string = '';
  password: string = '';
  userType: string = ''; // Variable to store selected user types

  constructor(private router: Router, private serviceUtil: ServiceUtilService) {}

  onLogin(): void {
    if (this.userType ==='biller' && this.username === 'biller' && this.password === 'billerpwd') {
        this.redirection(this.userType);
    } else if (this.userType ==='consumer' && this.username === 'consumer' && this.password === 'consumerpwd') {
        this.redirection(this.userType);
    } else {
        alert('Invalid credentials \nPlease try again');
    }
  }

  onUserTypeChange(event: Event): void {
    const checkbox = event.target as HTMLInputElement;
    if (checkbox.checked) {
      this.userType = checkbox.value;
    } 
  }

  redirection(router : string): void {
    this.serviceUtil.loggedInUser = this.username;
    this.serviceUtil.isLoginSuccess = true;
    this.router.navigate(['/'+router]);
  }

}
