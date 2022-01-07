package day4;

public class Pokemon implements DarkType, FireType {
    
    public Pokemon() {
        
    }
    
    public Pokemon(String type1, String type2, String name, int power) {
        this.type1 = type1;
        this.type2 = type2;
        this.name = name;
        this.power = power;
        scream();
    }
    
    enum Effect {EXTREME, SUPER, SEMI, NORMAL, NOT, WEAK};
    private String type1;
    private String type2;
    private String name;
    private int power;
    
    public int getPower() {
        return this.power;
    }
    
    public void setPower(int power) {
        this.power = power;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType1() {
        return this.type1;
    }
    
    public void setType1(String type1) {
        this.type1 = type1;
    }
    
    public String getType2() {
        return this.type2;
    }
    
    public void setType2(String type2) {
        this.type2 = type2;
    }
    
    public double calculateAttack(Effect dmg) {
        if(dmg == Effect.EXTREME) {
            return 4*power;
        } else if(dmg == Effect.SUPER) {
            return 2*power;
        } else if(dmg == Effect.SEMI) {
            return (double)1.5*power;
        } else if(dmg == Effect.NORMAL) {
            return power;
        } else if(dmg == Effect.NOT) {
            return (double)0.75*power;
        } else {
            return (double)0.5*power;
        }
    }
    
    
    public Effect type1Effective(String type1, String type2) {
        if(FireType.superEffectiveList.contains(type1) && FireType.superEffectiveList.contains(type2)) {
            return Effect.EXTREME;
        } else if((FireType.superEffectiveList.contains(type1) && FireType.notEffectiveList.contains(type2))
                || (FireType.superEffectiveList.contains(type2) && FireType.notEffectiveList.contains(type1))) {
            return Effect.NORMAL;
        } else {
            return Effect.WEAK;
        }
    }
    
    public Effect type2Effective(String type1, String type2) {
        if(DarkType.superEffectiveList.contains(type1) && DarkType.superEffectiveList.contains(type2)) {
            return Effect.EXTREME;
        } else if((DarkType.superEffectiveList.contains(type1) && DarkType.notEffectiveList.contains(type2))
                || (DarkType.superEffectiveList.contains(type2) && DarkType.notEffectiveList.contains(type1))) {
            return Effect.NORMAL;
        } else {
            return Effect.WEAK;
        }    
    }
    
    public double attack(String attackType, String type1, String type2) {
        Effect dmgMultiplier;
        if(attackType == FireType.fireAttribute) {
            dmgMultiplier = type1Effective(type1, type2);
        } else {
            dmgMultiplier = type2Effective(type1, type2);
        }
        
        double power = calculateAttack(dmgMultiplier);
        System.out.println("Attack does " + power + " damage");
        
        return power;
    }
    
    public void scream() {
        System.out.println("Go " + name + "! WAAAAAAAAA");
    }
    
}