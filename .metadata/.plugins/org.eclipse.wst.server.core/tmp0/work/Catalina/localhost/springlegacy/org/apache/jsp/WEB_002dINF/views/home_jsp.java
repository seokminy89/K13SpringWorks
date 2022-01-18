/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-01-18 09:33:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1642384278947L));
    _jspx_dependants.put("jar:file:/C:/02WorkspaceYSM/K13SpringWorks/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SpringLegacy/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Home</title>\n");
      out.write("<!-- 부트스트랩 코어 -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/springlegacy/static/bootstrap5.1.3/css/bootstrap.css\" />\n");
      out.write("<!-- jQuery 코어 -->\n");
      out.write("<script src=\"/springlegacy/resources/jquery/jquery-3.6.0.js\"></script>\n");
      out.write("<style>\n");
      out.write("	h3{margin-top: 30px;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("	<h2>Spring Framework 시작하기</h2>\n");
      out.write("	\n");
      out.write("	<!-- \n");
      out.write("	Spring MVC에서는 이미지와 같은 정적 리소스를 사용하기 위해 별도의 \n");
      out.write("	resource폴더를 제고한다. 해당 폴더의 매핑은 servlet-context.xml에서\n");
      out.write("	변경하거나 추가할 수 있다.\n");
      out.write("	 -->\n");
      out.write("	<h3>resources 폴더 사용하기</h3>\n");
      out.write("	<!-- views폴더 하위에 있는 해당 이미지는 출력되지 않는다.\n");
      out.write("	views 폴더는 View파일, 즉 jsp만 위치할 수 있다. -->\n");
      out.write("	<img src=\"./img_avatar1.png\" alt=\"부트스트랩 아바타1\" />\n");
      out.write("	\n");
      out.write("	<!-- \n");
      out.write("		원래의 폴더명은 resources이지만 그 아래에 static처럼 개발자가 별도로 \n");
      out.write("		별칭을 부여하여 매핑할 수 있다.(servlet-context.xml에서)\n");
      out.write("	 -->\n");
      out.write("	<img src=\"./resources/images/img_avatar2.png\" alt=\"부트스트랩 아바타2\"  width=\"200\"/>\n");
      out.write("	\n");
      out.write("	<img src=\"./static/images/1.png\" alt=\"스펀지밥 \"  width=\"200\"/>\n");
      out.write("	\n");
      out.write("	<!-- 1.컨트롤러 제작을 위해 제일먼저 요청명을 결정한다. -->\n");
      out.write("	<h3>첫번째 컨트롤러 만들기</h3>\n");
      out.write("	<ul>\n");
      out.write("		<li>\n");
      out.write("			<a href=\"./home/helloSpring\" target=\"_blank\">\n");
      out.write("				첫번째 컨트롤러 바로가기\n");
      out.write("			</a>\n");
      out.write("		</li>\n");
      out.write("	</ul>\n");
      out.write("	\n");
      out.write("	<!-- 컨트롤러 : FormController.java -->\n");
      out.write("	<h3>form값 처리하기</h3>\n");
      out.write("	<li>\n");
      out.write("		<a href=\"./form/servletRequest?id=kosmo&pw=1234\" target=\"_blank\">\n");
      out.write("			HttpServletRequest로 폼값 받기\n");
      out.write("		</a>\n");
      out.write("	</li>\n");
      out.write("	\n");
      out.write("	<li>\n");
      out.write("		<a href=\"./form/requestParam.do?id=kosmo&pw=1234&name=홍길동&email=hong@gildong.com\" target=\"_blank\">\n");
      out.write("			@requestParam 어노테이션으로 폼값 받기\n");
      out.write("		</a>\n");
      out.write("	</li>\n");
      out.write("	\n");
      out.write("	<li>\n");
      out.write("		<a href=\"./form/commandObjGet.do?id=kosmo&pw=1234&name=홍길동&email=hong@gildong.com\" target=\"_blank\">\n");
      out.write("			커맨드(Command)객체로 한번에 폼값 받기\n");
      out.write("		</a>\n");
      out.write("	</li>\n");
      out.write("	\n");
      out.write("	<li>\n");
      out.write("		<a href=\"./form/gildong99/코스모\" target=\"_blank\">\n");
      out.write("			pathVariable 어노테이션으로 폼값 받기\n");
      out.write("		</a>\n");
      out.write("	</li>\n");
      out.write("	\n");
      out.write("	<!-- 컨트롤러 : RequestMappingController.java -->\n");
      out.write("	<h3>@RequestMapping 어노테이션 활용</h3>\n");
      out.write("	<li>\n");
      out.write("		<a href=\"./requestMapping/index.do\" target=\"_blank\">\n");
      out.write("			RequestMapping 시작페이지 바로가기\n");
      out.write("		</a>\n");
      out.write("	</li>\n");
      out.write("	\n");
      out.write("	<!-- 컨트롤러 : ValidateController.java -->\n");
      out.write("	<h3>폼 데이터 검증하기 - Validator</h3>\n");
      out.write("	<li>\n");
      out.write("		<a href=\"./validate/memberRegist.do\" target=\"_blank\">\n");
      out.write("			회원가입 바로가기\n");
      out.write("		</a>\n");
      out.write("	</li>\n");
      out.write("	\n");
      out.write("	<!-- 컨트롤러 : EnvironmentController.java -->\n");
      out.write("	<h3>Environment 객체를 이용한 외부파일 참조하기</h3>\n");
      out.write("	<li>\n");
      out.write("		<a href=\"environment/main1\" target=\"_blank\">\n");
      out.write("			외부파일 참조하기 1(Environment 객체 사용)\n");
      out.write("		</a>\n");
      out.write("	</li>\n");
      out.write("	\n");
      out.write("	<!-- 컨트롤러 : DIController.java -->\n");
      out.write("	<h3>DI(Dependency Injection) : 의존성 주입</h3>\n");
      out.write("	<li>\n");
      out.write("		<a href=\"di/mydi1.do\" target=\"_blank\">\n");
      out.write("			XML설정파일을 통한 빈 생성1(생성자와 setter)\n");
      out.write("		</a>\n");
      out.write("	</li>\n");
      out.write("	\n");
      out.write("	<li>\n");
      out.write("		<a href=\"di/mydi2.do\" target=\"_blank\">\n");
      out.write("			XML설정파일을 통한 빈 생성2(다양한 멤버변수)\n");
      out.write("		</a>\n");
      out.write("	</li>\n");
      out.write("	\n");
      out.write("	<li>\n");
      out.write("		<a href=\"di/mydi3.do\" target=\"_blank\">\n");
      out.write("			어노테이션을 통한 빈 생성\n");
      out.write("		</a>\n");
      out.write("	</li>\n");
      out.write("	\n");
      out.write("	<h3>파일업로드</h3>\n");
      out.write("	<li>\n");
      out.write("		<a href=\"./fileUpload/uploadPath.do\" target=\"_blank\">\n");
      out.write("			upload폴더의 물리적 경로 확인하기\n");
      out.write("		</a>\n");
      out.write("	</li>\n");
      out.write("	\n");
      out.write("	<li>\n");
      out.write("		<a href=\"./fileUpload/uploadForm.do\" target=\"_blank\">\n");
      out.write("			파일 업로드 폼\n");
      out.write("		</a>\n");
      out.write("	</li>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
