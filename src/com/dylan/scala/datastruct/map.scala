package com.dylan.scala.datastruct

import com.dylan.scala.classz.BankAccount

object myMap{
  
	
//	val mutalescores = new scala.collection.mutable.HashMap[String,Int];
	
	val initscores = scala.collection.mutable.Map("Alice"->10,"Bob"->3,"Cindy"->8);
	
	
	def main(args:Array[String]):Unit = {
	  
			val scores = Map("Alice"->10,"Bob"->3,"Cindy"->8);
	  
			for((k,v)<- scores){
				println(k);
			}
			
			val mutalescores = new scala.collection.mutable.HashMap[Int,String];
			val resscores = for((k,v)<- scores) { 
			  mutalescores.+=(v->k);
			  mutalescores
			}
			
			for((k,v)<- mutalescores){
				println(k);
			}
			
			
		  var account = new BankAccount();
		  
		  println(account.deposit(2))
		  println(account.withdraw(1))
		  println(account.result)
		  println(account.id)
			
	}
	
  
}

