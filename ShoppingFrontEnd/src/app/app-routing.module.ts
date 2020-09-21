import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from'./user/login/login.component';
import { RegisterComponent } from'./user/register/register.component';
import { ForgotComponent } from'./user/forgot/forgot.component';
import { CartComponent } from './cart/cart.component';
import { WishlistComponent } from './wishlist/wishlist.component';
import { CarouselComponent } from './carousel/carousel.component';

const routes: Routes = [
   { path: 'login',component:LoginComponent },
   { path: 'register',component:RegisterComponent },
   { path: 'forgot',component:ForgotComponent },
   { path: 'cart',component:CartComponent},
   {path: 'wishlist',component:WishlistComponent},
   {path: 'carousel',component:CarouselComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
