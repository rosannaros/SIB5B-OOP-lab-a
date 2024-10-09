public class Player {
    private int x, y;
    private int health = 100;
    private int speed = 1;
    private int attack = 2;
    private int defense = 10;
    private boolean firstSkill = true;
    private boolean secondSkill = true;
    private boolean ultimateSkilL = true;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String getInfo() {
        return "x: " + x + ", y: " + y + ", health: " + health + 
               ", speed: " + speed + ", attack: " + attack;
    }
    public void moveRight() {
        x += speed;
    }
    public void moveLeft() {
        x -= speed;
    }

    public void moveUp() {
        y += speed;
    }

    public void moveDown() {
        y -= speed;
    }

    // Metode untuk mendapatkan damage
    public void getDamage() {
        health -= Math.max(0, 2 - defense);
        if (health < 0) {
            health = 0;
        }
    }
     // Metode untuk mendapatkan power
     public int getPower() {
        return attack + 5;
    }
    // Metode untuk menyerang
    public int attackEnemy() {
        return attack * 2;
    }
    // Metode untuk dash
    public void dash() {
        speed = 5; // Mengatur speed menjadi 5
    }
    // Metode untuk mengecek apakah pemain mati
    public boolean isDead() {
        return health <= 0;
    }
    // Metode untuk respawn
    public void respawn() {
        if (isDead()) {
            health = 100;
        }
    }
    // Metode untuk skill
    public void firstSkill() {
        if (firstSkill) {
            attack += 4;
            firstSkill = false;
            System.out.println("Player menggunakan Skill Pertama!");
            System.out.println(getInfo());  // Tampilkan informasi setelah menggunakan skill
        } else {
            System.out.println("Skill Pertama sudah digunakan.");
        }
    }
    public void secondSkill() {
        if (secondSkill) {
            attack += 7;
            secondSkill = false;
            System.out.println("Player menggunakan Skill Kedua!");
            System.out.println(getInfo());  // Tampilkan informasi setelah menggunakan skill
        } else {
            System.out.println("Skill Kedua sudah digunakan.");
        }
    }
    public void ultimateSkill() {
        if (ultimateSkilL) {
            attack += 10;
            ultimateSkilL = false;
            System.out.println("Player menggunakan Skill Ultimate!");
            System.out.println(getInfo());  // Tampilkan informasi setelah menggunakan skill
        } else {
            System.out.println("Skill Ultimate sudah digunakan.");
        }
    }
}