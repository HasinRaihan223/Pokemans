public class Pokemon {
  private int level, exp, hp, baseDef, baseAttack, currentHp, currentBaseDef, currentBaseAttack, levelToEvolve;
  private String[] attacks, sprites, type, abilities;
  private String heldItems, name, nickname;
  private Pokemon[] evolutions;

  public Pokemon(int level, int exp, int hp, int baseDef, int baseAttack, int levelToEvolve, String[] attacks,
  String[] sprites, String[] types, String name, Pokemon[] evolutions){
    this.level = level;
    this.exp = exp;
    this.hp = hp;
    this.currentHp = hp;
    this.baseDef = baseDef;
    this.currentBaseDef = baseDef;
    this.currentBaseAttack = baseAttack;
    this.baseAttack = baseAttack;
    this.name = name;
    this.nickname = name;
    this.sprites = sprites;
    this.attacks = attacks;
    this.evolutions = evolutions;
  }
  
  public int maxHealth(){
    return this.hp;
  }

  public int currentHp(){
    return this.currentHp;
  }

  public int level(){
    return this.level;
  }

  public int exp(){
    return this.exp;
  }

  public int baseDef(){
    return this.baseDef;
  }

  public int baseAttack(){
    return this.baseAttack;
  }

  public int currentBaseDef(){
    return this.currentBaseDef;
  }

  public int currentBaseAttack(){
    return this.currentBaseAttack;
  }

  public int levelToEvolve(){
    return this.levelToEvolve();
  }

  public String name(){
    return this.name;
  }

  public String nickname(){
    return this.nickname;
  }

  public int changeHealth(int change){
    this.currentHp += change;
    return this.currentHp;
  }
}
