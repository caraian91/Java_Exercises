# Exercise 1 
📚\
Can be found in the **Car** folder (src->Car).

📝\
Create the Cars class. Private Fields and Getters, Setters: brand, engine capacity, price, model, year of manufacture, color. Make a constructor default and parameterized constructor.\
Methods: 
1. [ ] void changeColor(String colorReadKeyboard);\
2. [ ] void displayCar();

In the main method: Class Main, create an array with elements of the Car type.\
Example: `Car[] carArray = new Car[size];`
- Populate this array with 3 Car type elements, the properties of each element in the array read from the keyboard.
- Display elements of the car array. A method for this will be built in the Main class.
- Obtain the first element from the array and save it in the variable of the same type as the elements of the array and modify its attributes with others.
- To update the element from position 0 in the array with the new element with modified values.
- To change the color of each element in the array with a color read from the keyboard for each element. The changeColor method from the Car class will be used.
- Display the elements of the array again after changing their color.

# Exercise 2

📚\
Can be found in the **Products** folder (src->Products).

📝\
Create the class Product. Private fields and Getters,Setters: name, price, weight. Make a constructor default and parameterized constructor.\
Methods: 
1. [ ] voidChangePrice(double price); -> change the price of the product on which this method was applied.
2. [ ] void displayProduct(); -> The fields of a Product type object must be specified
 
In the main method: Class Main, create an array with Product elements.\
Example: `Product[] productArray = new Product[size];
        productsArray[index].displayProduct();`
- Populate this array with 5 Product type elements, the properties of each element in the array read from the keyboard.
- Create a method in the Main class that calculates and returns the total price of the products in the array. The result of this method is saved in a variable in the Main method and displayed.
- Create a method in the Main class that displays the products with a higher price than a number read from the keyboard. It will be called in the Main method.
- Create a method in the Main class that will display all the products in the array.
- Get the last element from the array and save the intro variable of the same type as the elements of the array and modify the attributes with others.
- To update the element from the last position in the array with the new element with modified values.

# Exercise 3 - working progress [loading]

📚\
Can be found in the **Mouse** folder (src->Mouse).

📝\
Create class Mouse.
Private fields + getters and setters: name, age, weight, color, length, width. Make a constructor default and parameterized constructor.\
Methods: 
1. [ ] void changeName(String name);
2. [ ] void eat(int amount): 
   - quantity 1 => +0.1kg will gain weight. 
   - quantity 2 => +0.2kg will gain weight. 
   - quantity 3 => +0.3kg will gain weight.
   - If the amount is greater (>) than 3, then the message "The mouse xName cannot eat more than 3 pieces at one meal and its weight will remain the same" will be displayed

In the method main -> Class Main to create an array of Mouse.\
Example: `Product[] mouseArray = new Mouse[size];
mouseArray[index].eat();`

* Populate this array with 4 elements of the Mouse type, the properties of each element in the array read from the keyboard.
* To display elements of the mouse array. A method for this will be built in the Main class.
* Create a method in the class where the array is located that checks if there is a mouse in the array with a name read from the keyboard, and if there is the element at that position, replace it with another Mouse type element with other properties.
* Display the array again with the modified elements using the method created above.