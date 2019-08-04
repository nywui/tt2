<!-- Wrap all page content here -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    
<div id="wrap" class="">
    <!-- Fixed navbar -->
    <div class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="icon-bar"></span>
 <span class="icon-bar"></span>
 <span class="icon-bar"></span>

                </button> <a class="navbar-brand" href="#" contenteditable="false">Project name</a>

            </div>
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#" class="" contenteditable="false">Home</a>

                    </li>
                    <li><a href="#about" class="" contenteditable="false">About</a>

                    </li>
                    <li><a href="#contact" class="" contenteditable="false">Contact</a>

                    </li>
                    <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>

                        <ul
                        class="dropdown-menu">
                            <li><a href="#" class="">Action</a>

                            </li>
                            <li><a href="#" class="">Another action</a>

                            </li>
                            <li><a href="#" class="">Something else here</a>

                            </li>
                            <li class="divider"></li>
                            <li class="dropdown-header">Nav header</li>
                            <li><a href="#" class="">Separated link</a>

                            </li>
                            <li><a href="#" class="">One more separated link</a>

                            </li>
                </ul>
                </li>
                </ul>
            </div>
            <!--/.nav-collapse -->
        </div>
    </div>
    <!-- Begin page content -->
    <div class="container">
        <div class="page-header">
             <h1 class="">Sticky footer with fixed navbar</h1>

        </div>
        <p class="lead">Pin a fixed-height footer to the bottom of the viewport in desktop browsers
            with this custom HTML and CSS. A fixed navbar has been added within
            <code
            class="">#wrap</code>with <code class="">padding-top: 60px;</code> on the <code class="">.container</code>.</p>
        <p
        class="">Back to <a href="../sticky-footer" class="">the default sticky footer</a> minus
            the navbar.</p>
            <button class="btn btn-default" contenteditable="false">Button</button>
            
            
            <form:form method="POST" action="loginProcess"
  modelAttribute="login">
    <form:label path="userName">Name</form:label>
    <form:input path="userName" />
     
    <form:label path="password">Password</form:label>
    <form:input path="password" />
     
    <input type="submit" value="Submit" />
</form:form>
<!-- 
            <form class="form form-horizontal" modelAttribute="loginA" action="loginProcess" method="post">
                <div class="control-group">
                    <label class="control-label">Email</label>
                    <div class="controls">
                        <input type="text" path="userName" id="userName" placeholder="Email" class="form-control"
                        contenteditable="false">
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label">Password</label>
                    <div class="controls">
                        <input type="password" path="password" id="password" placeholder="Password" class="form-control"
                        contenteditable="false">
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <label class="checkbox">
                            <input type="checkbox" class="">Remember me</label>
                        <button type="submit" class="btn">Sign in</button>
                    </div>
                </div>
            </form>
            
             -->
    </div>
</div>
<div id="footer" class="">
    <div class="container">
        <p class="text-muted credit">Example courtesy <a href="http://martinbean.co.uk" class="">Martin Bean</a> and
            <a
            href="http://ryanfait.com/sticky-footer/" class="">Ryan Fait</a>.</p>
    </div>
</div>