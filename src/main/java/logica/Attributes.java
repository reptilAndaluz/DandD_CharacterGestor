package logica;

import java.util.EnumMap;
import java.util.Map;

public class Attributes {


    public enum Type{
        STR, DEX, CON, INT, WIS, CHA
    }

    private final Map<Type, Integer> scores;

    public Attributes(){
        this.scores=new EnumMap<>(Type.class);
        for (Type t : Type.values()){
            scores.put(t,10);
        }
    }

    public void setScore(Type type, int value){
        scores.put(type, value);
    }

    public int getScore(Type type){
        return scores.get(type);
    }

    public int getModifier(Type type){
        return Math.floorDiv(scores.get(type)-10,2);
    }


}
