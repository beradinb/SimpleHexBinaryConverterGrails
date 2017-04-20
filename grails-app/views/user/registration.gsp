<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <title>Register</title>         
    </head>
    <body>
        <div class="body">
            <h1>Register</h1>
            <g:if test="${flash.message}">
                <div class="message">${flash.message}</div>
            </g:if>
            <g:form controller="user" action="Register" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>            
                            <tr class="prop">
                                <td class="name">
                                    <label for="username">Username:</label>
                                </td>
                                <td>
                                    <input type="text" id="username" name="username"/>
                                </td>
                            </tr> 

                            <tr class="prop">
                                <td class="name">
                                    <label for="password">Password:</label>
                                </td>
                                <td>
                                    <input type="password" id="password" name="password"/>
                                </td>
                            </tr> 
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button">
                        <g:actionSubmit class="button"  value="Register" />
                    </span>
                </div>
            </g:form>
        </div>
    </body>
</html>