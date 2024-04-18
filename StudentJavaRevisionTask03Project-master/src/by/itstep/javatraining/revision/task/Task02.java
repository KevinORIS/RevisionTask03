package by.itstep.javatraining.revision.task;

/*	Task 02. Chess Pawn 1 [шахматная пешка]
 *
 *	Шахматная пешка - это самая слабая шахматная фигура,
 *	но во время игры может превратиться в любую шахматную фигуру кроме Короля.
 *	Предположим, пешка ходит только ВПЕРЁД по вертикали и только НА ОДНУ клетку.
 *	Даны две различные клетки шахматной доски, определите,
 *	может ли пешка попасть с первой клетки на вторую одним ходом.
 *
 *	Примечание
 *	1) Чтобы увидеть решение и разработать алгоритм, нарисуйте себе шахматную доску
 *	и поставьте в клетках соответствующие координаты x и y.
 *	2) Помните, пешка всегда начинает свой ход со второй горизонтальной линии, т.е.
 *	координата клеток по y должна должна быть из диапазона от 2 до 8.
 *	3) Не забудьте про "защиту от дурака". Если пользователь задаёт неверные коориднаты клеток,
 *	то метод должен возвратить булевское значение false.
 *	4) Для решения достаточно встроенных в язык арифметических операций, операций отношения
 *	и логических операций.
 *
 *	Формат входных данных [input]
 *	Метод принимает на вход четыре целочисленных значения, задающие номер столбца
 *  (при корректных данных - от 1 до 8) и номер строки (при корректных данных - от 2 до 8)
 *  сначала для первой клетки (x1, y1), а потом для второй клетки (x2, y2),
 *  где x - координата клетки по горизонтали, а y - координата клетки по вертикали.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить булевское значение - результат решения.
 *
 *	[ input 1]: 4 4 5 5
 *	[output 1]: false
 *
 *	[ input 2]: 4 1 4 2
 *	[output 2]: false
 *
 *	[ input 3]: 0 4 0 5
 *	[output 3]: false
 *
 *	[ input 4]: 4 4 4 5
 *	[output 4]: true
 */

public class Task02 {
	public static boolean start(int x1, int y1, int x2, int y2) { 
	    if (x1 < 1 || x1 > 8 || x2 < 1 || x2 > 8
	    		|| y1 < 1 || y1 > 8 || y2 < 1 || y2 > 8 || (x1 == x2 && y1 == y2)) { 
	        return false; 
	    } 
	    
	    return ((x1 == x2 - 1 || x1 == x2) && (y1 == y2 - 1 || y1 == y2)); 
	}
}