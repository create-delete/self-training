package level4Inheritance.fourZero;
/*
4.0. Реализовать иерархию классов, описывающую трёхмерные фигуры

Задача:

Реализуйте иерархию классов:
Share (-volume: double; +getVolume(): double)
Pyramid extends Share (-s: double; -h:double)
Box extends Share (+Box(double): void; +add(Share):boolean)

SolidOfRevolution extends Share (-radius: double; +getRadius(): double)
Cylinder extends SolidOfRevolution (-height: double)
Ball extends SolidOfrevolution


Класс Box является контейнером, он можем содержать в себе другие фигуры.
Метод add() принимает на вход Shape.
Нужно добавлять новые фигуры до тех пор, пока для них хватаем места в Box (будем считать только объём, игнорируя форму. Допустим, мы переливаем жидкость).
Если места для добавления новой фигуры не хватает, то метод должен вернуть false.
 */
public class Main {
}
