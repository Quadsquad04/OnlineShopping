import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from'./user/login/login.component';
import { RegisterComponent } from'./user/register/register.component';
import { ForgotComponent } from'./user/forgot/forgot.component';


const routes: Routes = [
   { path: 'login',component:LoginComponent },
   { path: 'register',component:RegisterComponent },
   { path: 'forgot',component:ForgotComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
