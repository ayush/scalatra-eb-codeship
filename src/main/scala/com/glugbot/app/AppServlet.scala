package com.glugbot.app

import org.scalatra._
import scalate.ScalateSupport

class AppServlet extends AppStack {

  get("/") {
    <html>
      <body>
        <h1>Hello Scalatra + Elastic Beanstalk + Codeship!</h1>
        Wanna see <a href="hello-scalate">Scalate?</a>.
      </body>
    </html>
  }
  
}