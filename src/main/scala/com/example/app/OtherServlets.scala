package com.example.app
import org.scalatra._
import scalate.ScalateSupport

class StockServlet extends MyScalatraWebAppStack{
	get("/"){
		<p>Hello from StockServlet</p>
	}
	get("/foo"){
		<h1>FOO</h1>
	}
}

class BondServlet extends MyScalatraWebAppStack{
	get("/"){
		<p>Hello from BondServlet</p>
	}
}