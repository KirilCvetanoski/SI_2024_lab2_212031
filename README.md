# SI_2024_lab2_212031
## Кирил Цветаноски 212031  
### Control Flow Graph
![ControlFlow Diagram](https://github.com/KirilCvetanoski/SI_2024_lab2_212031/blob/master/ControlFlowGraph.jpg?raw=true)
### Цикломатска комплексност
Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=9, па цикломатската комплексност изнесува 10.
### Тест случаи според Every branch
| Every Branch            | `allItems` = null \|\| `price` = 0 \|\| `barcode` = null \|\| `quantity` = null \|\| `AllItems` = null | `allItems` = [ ], `price` = 0, `barcode` = null, `quantity` = null, `AllItems` = [ ] | `allItems` = [Item(" ", "01234", 500, 0.4f)], `price` = 2, `barcode` = "01234", `quantity` = 500 | `allItems` = [Item("Teodor", "0a34b", 20, 0.5f)], `price` = 1, `barcode` = "0a34b", `quantity` = 20 | `allItems` = [Item("", "01234", 400, 0.5f)], `price` = 200, `barcode` = "01234", `quantity` = 400 |
|-------------------------|-------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|
| 1,2 → 3                 | *                                                                                                     |                                                                                                |                                                                                                 |                                                                                                 |                                                                                                 |
| 1,2 → 4                 |                                                                                                       | *                                                                                              | *                                                                                               | *                                                                                               | *                                                                                               |
| 3 → 28                  | *                                                                                                     |                                                                                                |                                                                                                 |                                                                                                 |                                                                                                 |
| 4 → 5                   |                                                                                                       |                                                                                              |                                                                                                 |                                                                                                 |                                                                                                 |
| 4 → 6,7                 |                                                                                                       |                                                                                              | *                                                                                               | *                                                                                               | *                                                                                               |
| 5 → 6,7                 |                                                                                                       | *                                                                                              |                                                                                                 |                                                                                                 |                                                                                                 |
| 6,7 → 8                 |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 |                                                                                                 |
| 6,7 → 9                 |                                                                                                       | *                                                                                              |                                                                                                 |                                                                                                 | *                                                                                               |
| 8 → 10,11               |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 |                                                                                                 |
| 9 → 12.1                |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |
| 10,11 → 12.1            |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 |                                                                                                 |
| 12.1 → 12.2             |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |
| 12.2 → 12.3             |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 |                                                                                                 |
| 12.2 → 13,14            |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |
| 13,14 → 16              |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |
| 16 → 17                 |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |
| 17 → 18                 |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |
| 18 → 19,20              |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |
| 19,20 → 15              |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |
| 15 → 21,22              |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |
| 21,22 → 27              |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 |                                                                                                 |
| 27 → 25                 |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |
| 25 → 5.3                |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |
| 25 → 26                 |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |
| 26 → 30                 |                                                                                                       |                                                                                                |                                                                                                 |                                                                                                 | *                                                                                               |.    
### Тест случаи според критериумот Every path
Тест Случај 1: TTT <br>
Услов: item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'
Вредности:
item.getPrice() = 400 (Точно)
item.getDiscount() = 0.5 (Точно)
item.getBarcode().charAt(0) == '0' (Точно)
Очекуван Резултат: Точно
Причина: Сите три услови се исполнети. Цената е поголема од 300, попустот е поголем од 0 и баркодот започнува со '0'. <br>
Тест Случај 2: TTN 
Услов: item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'
Вредности:
item.getPrice() = 400 (Точно)
item.getDiscount() = 0.5 (Точно)
item.getBarcode().charAt(0) != '0' (Неточно)
Очекуван Резултат: Неточно
Причина: Третиот услов не е исполнет. Цената е поголема од 300 и попустот е поголем од 0, но баркодот не започнува со '0'. <br>
Тест Случај 3: NXX
Услов: item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'
Вредности:
item.getPrice() = 100 (Неточно)
Преостанатите услови не играат улога
Очекуван Резултат: Неточно
Причина: Првиот услов не е исполнет. Цената не е поголема од 300, па останатите услови не се релевантни. <br>
Тест Случај 4: TNX 
Услов: item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'
Вредности:
item.getPrice() = 400 (Точно)
item.getDiscount() = 0 (Неточно)
Преостанатиот услов не игра улога
Очекуван Резултат: Неточно
Причина: Вториот услов не е исполнет. Цената е поголема од 300, но попустот не е поголем од 0, па останатите услови не се релевантни.
