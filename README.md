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
![Снимок экрана (4)](https://github.com/MakaroffDima/myfinalproject/assets/126796029/d0a8f1fd-899f-4906-b77c-89159daa6d2b)

Скриншот базы данных


![Снимок экрана (5)](https://github.com/MakaroffDima/myfinalproject/assets/126796029/d783c998-6c1d-4ad9-bafb-b090de499db0)

