import { Component ,OnInit} from '@angular/core';
import { RestfulServiceService } from './restful-service.service';


interface FromAccount {
  accountNumber: string;
  currency: string;
}

interface ToAccount {
  accountNumber: string;
  currency: string;
}


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'DBBApplication';
  selectedValue: string="";

  fromAccount: FromAccount[] = [];
   

  toAccount: ToAccount[] = [];
   

  constructor(private restfulServiceService: RestfulServiceService) { }

  ngOnInit() {
  console.log("call ngOnInit DBB Application");
  this.getAccountList();
  }


  getAccountList(){


    this.fromAccount = [
      {accountNumber: '12345', currency: 'Steak'},
      {accountNumber: '12345', currency: 'Pizza'},
      {accountNumber: '43434', currency: 'Tacos'},
    ];
  
    this.toAccount = [
      {accountNumber: '4345', currency: 'Volvo'},
      {accountNumber: '56356', currency: 'Saab'},
      {accountNumber: '43t45', currency: 'Mercedes'},
    ];

//create service class for below function

this.restfulServiceService.getAccountList()
.subscribe((data) => {

console.log(data);
});
     
     
    //  .subscribe( data=>{
    //    this.fromAccount=data.fromAccounts;
    //    this.toAccount=data.toAccounts;
    //  })
  }


}
