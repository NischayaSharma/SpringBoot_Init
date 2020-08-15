# SpringBoot_Init
Basic end to end working demo for accepting some input from html form, Storing it in MySQL Database and then displaying back from the database

For it to work:
1. Install MySQL in your PC.
2. Run it with root privilages:

        $ sudo mysql --password
3. Enter the following commands to create and use the database:

        mysql> create database db_example;
        mysql> create user 'springuser'@'%' identified by 'ThePassword';
        mysql> grant all on db_example.* to 'springuser'@'%';
4. Run the following to test the code:

        $ mvn spring-boot:run
        
