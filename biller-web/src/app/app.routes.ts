import { Routes } from '@angular/router';
import { LoginPageComponent } from './login-page/login-page.component';
import { ConsumerDeskComponent } from './consumer-desk/consumer-desk.component';
import { BillingDeskComponent } from './billing-desk/billing-desk.component';
import { Injectable } from '@angular/core';
import { CanActivate, Router } from '@angular/router';
import { ServiceUtilService } from './service-util/service-util.service';

@Injectable({
    providedIn: 'root',
})
export class AuthGuard implements CanActivate {
    constructor(private serviceUtil: ServiceUtilService, private router: Router) {}

    canActivate(): boolean {
        if (this.serviceUtil.isLoginSuccess) {
            return true;
        } else {
            this.router.navigate(['/login']);
            return false;
        }
    }
}

export const routes: Routes = [
    { path: 'login', component: LoginPageComponent },
    { path: 'biller', component: BillingDeskComponent, canActivate: [AuthGuard] },
    { path: 'consumer', component: ConsumerDeskComponent, canActivate: [AuthGuard] }
];
