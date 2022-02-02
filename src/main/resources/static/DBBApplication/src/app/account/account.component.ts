import { Component, OnInit } from '@angular/core';
import { RestfulServiceService } from '../restful-service.service';


interface FromAccount {
  accountNumber: string;
  currency: string;
}

interface ToAccount {
  accountNumber: string;
  currency: string;
}

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {
  

  fromAccount: FromAccount[]=[];
  toAccount: ToAccount[] = [];
   amount:any;

  constructor(private restfulServiceService: RestfulServiceService) { }

  ngOnInit() {
  console.log("call ngOnInit DBB Application");
  this.getAccountList();
  }


  getAccountList(){


//create service class for below function

            this.restfulServiceService.getAccountList()
            .subscribe((data:any) => {
            this.fromAccount=data['fromAccounts'];
            this.toAccount=data['toAccounts'];
            console.log(data);
            });
}
}
