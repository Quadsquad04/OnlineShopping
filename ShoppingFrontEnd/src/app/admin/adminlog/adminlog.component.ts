import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-adminlog',
  templateUrl: './adminlog.component.html',
  styleUrls: ['./adminlog.component.css']
})
export class AdminlogComponent implements OnInit {

  model:any={}
  constructor() { }

  ngOnInit() {
  }
  adminlog(){
    console.log(this.model)
  }
}