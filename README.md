
### Feature Toggle

 

 ##### 📖 A técnica de Feature Flag, também conhecida como Feature Toggle, possibilita que ocorram mudanças no comportamento da aplicação a partir de condições que possam "ligar" ou "desligar" funcionalidades de uma aplicação sem a necessidade de realizar um novo deployment.



#### 🛠️Dependencias 
#####  Cliente:
- Config Client: Conecta-se a um Spring Cloud Config Server para obter a configuração da aplicação.
- Spring Actuator: Fornece recursos para monitorar e gerenciar aplicativos em tempo de execução.
- Spring Web: Suporte para construir aplicativos da web usando o Spring MVC.
##### Servidor:
- Config Server: Serve configurações para aplicativos clientes, permitindo centralização e distribuição de configurações em ambientes distribuídos.

##### Método Post : http://localhost:8081/actuator/refresh