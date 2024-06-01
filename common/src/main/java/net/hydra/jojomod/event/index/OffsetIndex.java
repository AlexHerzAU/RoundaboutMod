package net.hydra.jojomod.event.index;

public class OffsetIndex {
    /**Easy way to reference bytes as specific offset types, for a stand
     * floating by its user (follow) vs being in front (fixed)
     * vs moving on its own (loose), etc.*/
    public static final byte FOLLOW = 0;
    public static final byte ATTACK = 1;
    public static final byte GUARD = 2;
    public static final byte LOOSE = 3;
    public static final byte FLOAT = 5;



    public static final byte FOLLOW_STYLE = 0;
    public static final byte FIXED_STYLE = 1;
    public static final byte LOOSE_STYLE = 2;

    public static byte OffsetStyle(byte offsetType){
        if (offsetType == FOLLOW){
            return FOLLOW_STYLE;
        } else if (offsetType == ATTACK || offsetType == GUARD){
            return FIXED_STYLE;
        } else if (offsetType == LOOSE){
            return LOOSE_STYLE;
        }
        return 0;
    }
}