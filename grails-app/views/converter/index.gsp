<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Converter</title>
    </head>
    <body>
        <g:form controller="converter" method="post">
            <label>Enter a number to convert:</label>
            <g:textField name="number"/>
            <br>

            <br>
            <g:actionSubmit value="binary"/>
            <g:actionSubmit value="hex"/>
        </g:form> 
    </body>
</html>

