package animals;

public class Storage {
    public Cat[] cats;

    public  Storage() {
        this.cats = new Cat[0];
    }

    public void add(Cat cat) {
        Cat[] newCats = new Cat[this.cats.length +1];
        for (int i=0; i < this.cats.length; i++){
            newCats[i]=this.cats[i];
        }
        newCats[newCats.length - 1] = cat;
        cats = newCats;
    }

    public void remove(Cat cat) {
        for (int i = 0; i < this.cats.length; i++) {
           if (this.cats[i].equals(cat)) {
               Cat[] newCats = new Cat[this.cats.length - 1];
               this.cats[i] = null;
               int counter = 0;
               for (int j = 0; j < this.cats.length; j++) {
                   if (this.cats[j] != null) {
                       newCats[counter] = this.cats[j];
                       counter++;
                   }
               }
               this.cats = newCats;
               break;
           }
        }
    }

//edit уже существующего кота
    public void edit(Cat oldCat, Cat newCat) {
        for (int i = 0; i < this.cats.length; i++) {
            if (this.cats[i].equals(oldCat)) {
                this.cats[i] = newCat;
                break;
            }
        }
    }

    public Cat[] getAll() {
        return cats;
    }

    public void showAllInfo() {
        for (int i = 0; i < this.cats.length; i++) {
            System.out.println("Name: " + cats[i].name + ", Age: " + cats[i].age + ", Color: " + cats[i].color);
        }
    }
}
