<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>MyFirstServlet</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
</head>
<body>
<h1><%= "Blank for find a job:" %>
</h1>
<br/>
<form action="hello" method="POST">
    Name: <input name="username" />
    <br><br>
    Age: <input name="userage" />
    <br><br>
    Gender: <input type="radio" name="gender" value="female" checked />Female
    <input type="radio" name="gender" value="male" />Male
    <br><br>
    Country: <select name="country">
    <option>Canada</option>
    <option>Spain</option>
    <option>France</option>
    <option>Germany</option>
    <option>Kyrgyzstan</option>
</select>
    <br><br>
    Education: <input name="education" />
    Hard skills: <input name="hardskills" />
    Soft skills: <input name="softskills" /><br><br>
    Experience: <input name="experience" />
    Phone number: <input name="phone" />
    E-mail: <input name="e-mail" /><br>
    Courses:
    <input type="checkbox" name="courses" value="JavaSE"/>Java SE
    <input type="checkbox" name="courses" value="JavaFX"/>Java FX
    <input type="checkbox" name="courses" value="JavaEE"/>Java EE
    <br><br>
    Knowledge level:
    <input type="radio" name="level" value="junior"/>Junior
    <input type="radio" name="level" value="middle"/>Middle
    <input type="radio" name="level" value="senior"/>Senior
    <br><br>
    <input type="submit" value="Submit" />
</form>
</body>
</html>