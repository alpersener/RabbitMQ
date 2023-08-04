# Demo project for rabbitMQ
## Endpoints
### POST (JSON)

Example request endpoint

```
https://api.example.com/api/v2/publish

```
Returns:
```
Json Mesajı Gönderildi->User(id=1, firstName=example, lastName=example)
Json Mesajı geldi->User(id=1, firstName=example, lastName=example)
```

### GET (String)

Example request endpoint

```
https://api.example.com/api/v1/publish

```
Returns:
```
Message RabbitMQ'ya Gönderildi.->{message}
Mesaj Alındı!->{message}
```

