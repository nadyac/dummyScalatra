package com.example.app

import org.scalatra._

class MyScalatraServlet extends MyScalatraWebAppStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

  get("/hello"){
  	<html>
      <body>
        <h1>Hello, I am a Scala Servlet!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

/**
 * The URL
 * http://localhost:8080/saveName?fname=Alvin&lname=Alexander
 * prints: Some(Alvin), Some(Alexander) with implicit params
 */
  get("/saveName"){
    val firstName = params.get("fname")
    val lastName = params.get("lastName")
    <p>{firstName}, {lastName}</p>
  }

 /**
  * You can use named params too so
  * localhost:8080/hello/Nadya/Pena
  */
  get("/hello/:fname/:lname"){
    <p>Hello, {params("fname")}, {params("lname")}</p>
  }

}
