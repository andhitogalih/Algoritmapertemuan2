class PacmanMain {
    public static void main(String args[]) {
        
        Pacman pc = new Pacman();
        pc.x = 5;
        pc.y= 3;
        pc.width = 30;
        pc.height = 25;
        if(pc.x <0 || pc.x > pc.width){
            System.exit(0);
        }
        if(pc.y <0 || pc.y > pc.height){
            System.exit(0);
        }
        System.out.println("Posisi Awal Pac Man berada di koordinat "+pc.x+","+pc.y);
        
        pc.moveDown();
        pc.moveLeft();
        pc.moveLeft();
        pc.moveLeft();
        pc.printPosition();
    }
}