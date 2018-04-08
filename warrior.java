public class warrior { public String life, magic, speed,physicalattack, magicattack, attackspeed , attackdistance;
    public  warrior (String life1, String magic1, String speed1, String physicalattack1, String magicattack1, String attackspeed1, String attackdistance1) {
        this.setLife(life1);
        this.setMagic(magic1);
        this.setSpeed(speed1);
        this.setPhysicalattack(physicalattack1);
        this.setMagicattack(magicattack1);
        this.setAttackspeed(attackspeed1);
        this.setAttackdistance(attackdistance1);
    }
    public void setLife(String life1) {
        if (life1.matches("[0-9]{9}")) {
            System.out.println("correct");
        }else {
            System.out.println("re-enter");
        }
        this.life = life1;
    }

    public String getLife() {
        return life;
    }
    public void setMagic(String magic1) {
        if (magic1.matches("[0-15]{15}")) {
            System.out.println("correct");
        }else {
            System.out.println("re-enter");
        }
        this.magic = magic1;
    }
    public String getMagic() {
        return magic;
    }
    public void setSpeed(String speed1) {
        this.speed = speed1;
    }
    public String getSpeed() {
        return speed;
    }
    public void setPhysicalattack(String physicalattack1) {
        this.physicalattack = physicalattack1;
    }
    public String setPhysicalattack() {
        return physicalattack;
    }
    public void setMagicattack(String magicattack1) {
        if (magicattack1.matches("[0-9]{9}")) {
            System.out.println("correct");
        }else {
            System.out.println("re-enter");
        }
        this.magicattack = magicattack1;
    }
    public String getMagicattack() {
        return magicattack;
    }

    public void setAttackspeed(String attackspeed1) {
        this.attackspeed = attackspeed1;
    }
    public String getAttackspeed() {
        return attackspeed;
    }
    public void setAttackdistance(String attackdistance1) {
        if (attackdistance1.matches("[0-9]{9}")) {
            System.out.println("correct");
        }else {
            System.out.println("re-enter");
        }
        this.attackdistance = attackdistance1;
    }
    public String getAttackdistance() {
        return attackdistance;
        }
    }



