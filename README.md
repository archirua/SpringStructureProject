# SpringStructureProject
스프링을 사용하기에 앞서 각 구성을 확인하는데 사용한다.<br/>

# 현재 진행상황<br/>
=========================<br/>
Spring Boot<br/>
    => Spring 에서 지원하고 있는 Servlet을 이용하여 Springframework 를 설정<br/>
       @annotion을 사용하여 설정<br/>

Spring AOP 를 이용한 Parameter Set<br/>
    => Spring AOP의 Before Advice 를 이용하여 request.getParameter를 읽어와<br/>
       자동으로 Model에 설정함으로써 View 화면에서 request.getPrameter 대신 ${name} 식으로 사용함<br/>      
       
Spring MVC<br/>
    => AOP 에서 설정한 내용을 화면에 표현함 <br/>
    
Spring WEB<br/>
    => Rest 를 사용할 수 있게 설정은 하였지만 현재 사용 예제 및 방법에 대해서는 고민 중 <br/>
