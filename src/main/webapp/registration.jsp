<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<style>
@import url(https://fonts.googleapis.com/css?family=Roboto:300);
<c:url var="home" value="/" scope="request" />
.login-page {
  width: 360px;
  padding: 8% 0 0;
  margin: auto;
}
.front-slider{
  
  padding: 8% 0 0;
  margin: auto;
}
.form {
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: #52b8b8;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
  font-family: "Lucida Console", Courier, monospace;
  
}
.form button:hover,.form button:active,.form button:focus {
  background: #6fc29d;
}
.form .message {
  margin: 15px 0 0;
  color: #b3b3b3;
  font-size: 12px;
}
.form .message a {
  color: #4CAF50;
  text-decoration: none;
}
.form .register-form {
  display: none;
}
.container {
  position: relative;
  z-index: 1;
  max-width: 300px;
  margin: 0 auto;
}
.container:before, .container:after {
  content: "";
  display: block;
  clear: both;
}
.container .info {
  margin: 50px auto;
  text-align: center;
}
.container .info h1 {
  margin: 0 0 15px;
  padding: 0;
  font-size: 36px;
  font-weight: 300;
  color: #1a1a1a;
}
.container .info span {
  color: #4d4d4d;
  font-size: 12px;
}
.container .info span a {
  color: #000000;
  text-decoration: none;
}
.container .info span .fa {
  color: #EF3B3A;
}
body {
  background: #52b8b8; /* fallback for old browsers */
  background: -webkit-linear-gradient(right, #52b8b8, #6fc29d);
  background: -moz-linear-gradient(right, #52b8b8, #6fc29d);
  background: -o-linear-gradient(right, #52b8b8, #6fc29d);
  background: linear-gradient(to left, #52b8b8, #6fc29d);
  font-family: "Roboto", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;      
}

#carousel {
position: relative;
width:60%;
margin:0 auto;
}

#slides {
overflow: hidden;
position: relative;
width: 100%;
height: 250px;
}

#slides ul {
list-style: none;
width:100%;
height:250px;
margin: 0;
padding: 0;
position: relative;
}

 #slides li {
width:100%;
height:250px;
float:left;
text-align: center;
position: relative;
font-family:lato, sans-serif;
}
/* Styling for prev and next buttons */
.btn-bar{
    max-width: 346px;
    margin: 0 auto;
    display: block;
    position: relative;
    top: 40px;
    width: 100%;
}

 #buttons {
padding:0 0 5px 0;
float:right;
}

#buttons a {
text-align:center;
display:block;
font-size:50px;
float:left;
outline:0;
margin:0 60px;
color:#b14943;
text-decoration:none;
display:block;
padding:9px;
width:35px;
}

a#prev:hover, a#next:hover {
color:#FFF;
text-shadow:.5px 0px #b14943;  
}

.quote-phrase, .quote-author {
font-family:sans-serif;
font-weight:300;
display: table-cell;
vertical-align: middle;
padding: 5px 20px;
font-family:'Lato', Calibri, Arial, sans-serif;
}

.quote-phrase {
height: 200px;
font-size:24px;
color:#FFF;
font-style:italic;
text-shadow:.5px 0px #b14943;  
}

.quote-marks {
font-size:30px;
padding:0 3px 3px;
position:inherit;
}

.quote-author {
font-style:normal;
font-size:20px;
color:#b14943;
font-weight:400;
height: 30px;
}

.quoteContainer, .authorContainer {
display: table;
width: 100%;
}
.monospace {
  font-family: "Lucida Console", Courier, monospace;
  color:#52b8b8;
}
.navbar {
    position: relative;
    min-height: 50px;
    margin-bottom: 20px;
    border: 1px solid transparent;
    margin-top: -44px; important!
}
</style>
<script>

$('.message a').click(function(){
	   $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
	});

$(document).ready(function () {
    //rotation speed and timer
    var speed = 5000;
    
    var run = setInterval(rotate, speed);
    var slides = $('.slide');
    var container = $('#slides ul');
    var elm = container.find(':first-child').prop("tagName");
    var item_width = container.width();
    var previous = 'prev'; //id of previous button
    var next = 'next'; //id of next button
    slides.width(item_width); //set the slides to the correct pixel width
    container.parent().width(item_width);
    container.width(slides.length * item_width); //set the slides container to the correct total width
    container.find(elm + ':first').before(container.find(elm + ':last'));
    resetSlides();
    
    
    //if user clicked on prev button
    
    $('#buttons a').click(function (e) {
        //slide the item
        
        if (container.is(':animated')) {
            return false;
        }
        if (e.target.id == previous) {
            container.stop().animate({
                'left': 0
            }, 1500, function () {
                container.find(elm + ':first').before(container.find(elm + ':last'));
                resetSlides();
            });
        }
        
        if (e.target.id == next) {
            container.stop().animate({
                'left': item_width * -2
            }, 1500, function () {
                container.find(elm + ':last').after(container.find(elm + ':first'));
                resetSlides();
            });
        }
        
        //cancel the link behavior            
        return false;
        
    });
    
    //if mouse hover, pause the auto rotation, otherwise rotate it    
    container.parent().mouseenter(function () {
        clearInterval(run);
    }).mouseleave(function () {
        run = setInterval(rotate, speed);
    });
    
    
    function resetSlides() {
        //and adjust the container so current is in the frame
        container.css({
            'left': -1 * item_width
        });
    }
    
});
//a simple function to click next link
//a timer will call this function, and the rotation will begin

function rotate() {
    $('#next').click();
}

</script>


<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Create an account</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<nav class="navbar navbar-expand-sm bg-dark">

  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a href="#" class="navbar-brand">
           <h4 class='monospace'>Dharohar</h4>
        </a>
    </li>
    
  </ul>

</nav>
<div class="row">
<div class="col-md-8">
	<div class="front-slider pull-left">
	<div id="carousel">
  <div class="btn-bar">
    <div id="buttons"><a id="prev" href="#"><</a><a id="next" href="#">></a> </div></div>
    <div id="slides">
        <ul>
            <li class="slide">
                <div class="quoteContainer">
                    <p class="quote-phrase"><span class="quote-marks">"</span> I was literally BLOWN AWAY by Company A's work! They went above and beyond all of our expectations with design, usability. and branding, I will reccommend them to everyone I know!<class="quote-marks">"</span>

                    </p>
                </div>
                <div class="authorContainer">
                    <p class="quote-author">John Doe // Local Business Owner</p>
                </div>
            </li>
            <li class="slide">
                <div class="quoteContainer">
                    <p class="quote-phrase"><span class="quote-marks">"</span>
                      I could not stop staring! Company A's Web Solutions are by far the most elegant solutions, you can't beat their quality and attention to detail!
                    <span class="quote-marks">"</span>

                    </p>
                </div>
                <div class="authorContainer">
                    <p class="quote-author">Andy Fakename // CEO: Andy's Camping Supplies</p>
                </div>
            </li>
            <li class="slide">
                <div class="quoteContainer">
                    <p class="quote-phrase"><span class="quote-marks">"</span>Carl Fakeguy, was the most helpful designer I've ever hired. He listened to my ideas and advised against things that could negatively affect my CEO. Company A is by far the most generous and helpful company, 5/5!<span class="quote-marks">"</span>

                    </p>
                </div>
                <div class="authorContainer">
                    <p class="quote-author">Janice Falsename</p>
                </div>
            </li>
        </ul>
    </div>
	</div>
	</div>
	</div>
	<div class="col-md=4"><div class="login-page">
  <div class="form">
<div class="container">

    <form:form method="POST" modelAttribute="userForm" class="form-signin">
        <h2 class="form-signin-heading">Create your account</h2>
        <spring:bind path="username">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="username" class="form-control" placeholder="Username"
                            autofocus="true"></form:input>
                <form:errors path="username"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="password">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="password" class="form-control" placeholder="Password"></form:input>
                <form:errors path="password"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="passwordConfirm">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="passwordConfirm" class="form-control"
                            placeholder="Confirm your password"></form:input>
                <form:errors path="passwordConfirm"></form:errors>
            </div>
        </spring:bind>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
    </form:form>
</div>
</div>
</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
