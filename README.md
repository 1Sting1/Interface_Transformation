# Interface_Transformation

## Исходные фигуры
Rect(x=0, y=0, width=10, height=5, area=50.0)

Circle(x=20, y=20, radius=5, area=78.53982)

Square(x=40, y=40, size=8, area=64.0)

### Тест перемещения (move)
#### После перемещения:

Rect(x=5, y=3, width=10, height=5, area=50.0)

Circle(x=10, y=25, radius=5, area=78.53982)

Square(x=42, y=38, size=8, area=64.0)

### Тест масштабирования (resize)
#### После увеличения:

Rect(x=5, y=3, width=20, height=10, area=200.0)

Circle(x=10, y=25, radius=15, area=706.85834)

Square(x=42, y=38, size=16, area=256.0)

### Тест поворота по часовой стрелке
#### Центр поворота: (50, 50)

#### До поворота:
Rect(x=50, y=40, width=10, height=5, area=50.0)

Circle(x=60, y=50, radius=3, area=28.274334)

Square(x=50, y=60, size=6, area=36.0)

#### После поворота по часовой стрелке:
Rect(x=40, y=50, width=5, height=10, area=50.0)

Circle(x=50, y=40, radius=3, area=28.274334)

Square(x=60, y=50, size=6, area=36.0)

### Тест поворота против часовой стрелки
#### После поворота против часовой стрелки (возврат):

Rect(x=50, y=40, width=10, height=5, area=50.0)

Circle(x=60, y=50, radius=3, area=28.274334)

Square(x=50, y=60, size=6, area=36.0)

### Работа с коллекциями
#### Площади всех фигур:
Фигура 0: площадь = 15.0

Фигура 1: площадь = 50.265484

Фигура 2: площадь = 36.0

#### Общая площадь всех фигур: 101.26548385620117
#### Массовое перемещение фигур
Rect(x=100, y=100, width=1, height=1, area=1.0)

Circle(x=105, y=105, radius=2, area=12.566371)

Square(x=110, y=110, size=3, area=9.0)