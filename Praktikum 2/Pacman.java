public class Pacman {
    int x,y,width,height;

    void moveLeft(){
        x-=1;
    }
    void moveRight(){
        x+=1;
    }
    void moveUp(){
        y-=1;
    }
    void moveDown(){
        y+=1;
    }
    void printPosition(){
        System.out.println("Posisi Pac Man saat ini berada di koordinat "+x+","+y);
    }
}