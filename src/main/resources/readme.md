В текущей версии работают все функции:

1) Просмотр баланса пользователя
  "/getBalance"
2) Списание денежных средств
   "/takeMoney"
3) Пополнение денежных средств
   "/putMoney"
4)  Перевод денежных средств от одного абонента другому
   "/transferMoney"
5) Просмотр операций за выбранный период
   "/getOperationsBetweenDates"

Операции просмотра баланса и просмотр операций работают в Postman через URL
Пример :
http://localhost:8080/getOperationsBetweenDates?from=2024-02-27&to=2024-02-29
http://localhost:8080/getBalance?id=2

Остальные операции работают в Postman через выбор Put и описание информации в body
Пример :

![Снимок экрана (4).png](..%2F..%2F..%2F..%2F..%2FPictures%2FScreenshots%2F%D1%ED%E8%EC%EE%EA%20%FD%EA%F0%E0%ED%E0%20%284%29.png)

Скриншот базы данных
![Снимок экрана (5).png](..%2F..%2F..%2F..%2F..%2FPictures%2FScreenshots%2F%D1%ED%E8%EC%EE%EA%20%FD%EA%F0%E0%ED%E0%20%285%29.png)