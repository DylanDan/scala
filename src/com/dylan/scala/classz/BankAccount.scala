package com.dylan.scala.classz

class BankAccount {
  
  private var balance:Int = 0
  
  val id = BankAccount.newuniqueNumber();
  
  def deposit(value : Int)={
    
    balance += value
    
    balance
  }
  
  def withdraw(value : Int)={
    balance -= value
    
    balance
    
  }
  
  def result = balance
 
}

object BankAccount{
  
  private var lastNum = 0;
  
  private def newuniqueNumber() = { lastNum += 1;lastNum}
  
}