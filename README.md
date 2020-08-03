# SpringCloud_ManagementSystem
This project is divided into two interfaces: the client and the background management system. The client is aimed at ordinary users. Its functions include user login, user exit, insurance order and my order.

Background management system for the administrator, the functions include administrator login, administrator exit, add insurance, query insurance, modify insurance, delete insurance, order processing, add users, query users, delete users.

After understanding the requirements, the next step is to design the system architecture. Firstly, four service providers are assigned, namely Account, Menu, Order and User.

Account provides account services: users and administrators log in.

Menu provides insurance services: add insurance, query insurance, modify insurance, delete insurance.

Order provides order service: add order, query order, delete order, process order.

User provides user services: add users, query users, delete users.

Then allocate a service consumers, including the client's front page and backend interface, 
background management system of the front page and back office interface, 
user/manager direct access to the resources are stored in the service consumer, 
then the service consumer call four service provider corresponding interface to complete the business logic,
and through the feign complete load balancing.
