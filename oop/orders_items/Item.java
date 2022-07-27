public class Item {
    private String name;
    private double price;

    public void createItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
}

/*
                ^    ^
               / \  //\
 |\___/|      /   \//  .\
 /O  O  \__  /    //  | \ \
/     /  \/_/    //   |  \  \
@___@'    \/_   //    |   \   \ 
   |       \/_ //     |    \    \ 
   |        \///      |     \     \ 
  _|_ /   )  //       |      \     _\
 '/,_ _ _/  ( ; -.    |    _ _\.-~        .-~~~^-.
 ,-{        _      `-.|.-~-.           .~         `.
  '/\      /                 ~-. _ .-~      .-~^-.  \
     `.   {            }                   /      \  \
   .----~-.\        \-'                 .~         \  `. \^-.
  ///.----..>    c   \             _ -~             `.  ^-`   ^-_
    ///-._ _ _ _ _ _ _}^ - - - - ~                     ~--,   .-~
                                                          /.-'
*/