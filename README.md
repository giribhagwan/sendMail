# sendMail
send email using java

send email by using https://mvnrepository.com/artifact/javax.mail/mail/1.4.7 API

**Run**
1. goto src/main/java/com/config file
2. change yourID@gmail.com to your gmail ID and "*******" to your gmail Password
3. go to application directory
4. fire command: ./gradlew bootrun

**Example:**
1. curl -H "Content-Type: application/json" -X POST -d '{"to":"receiverID@gmail.com","subject":"your subject","data":"your message"}' http://localhost:8080/api/send
