import com.example.app._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new MyScalatraServlet, "/*")

    // this tells Scalatra that StockServlet class should handle /stocks/ URI requests
    // and that BondServlet class should handle requests to /bonds/ URI
    context.mount(new StockServlet, "/stocks/*")
    context.mount(new BondServlet, "/bonds/*")
    
  }
}
