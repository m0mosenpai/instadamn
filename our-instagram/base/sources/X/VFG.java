package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VFG {
    public static final /* synthetic */ VFG[] A01;
    public static final VFG A02;
    public final String A00;

    static {
        VFG vfg = new VFG("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A02 = vfg;
        VFG vfg2 = new VFG("AFFIRMATIVE", 1, "AFFIRMATIVE");
        VFG vfg3 = new VFG("ANGRY", 2, "ANGRY");
        VFG vfg4 = new VFG("ANNOYED", 3, "ANNOYED");
        VFG vfg5 = new VFG("BORED", 4, "BORED");
        VFG vfg6 = new VFG("CONFUSED", 5, "CONFUSED");
        VFG vfg7 = new VFG("CONTENT", 6, "CONTENT");
        VFG vfg8 = new VFG("DISAGREEING", 7, "DISAGREEING");
        VFG vfg9 = new VFG("DISBELIEF", 8, "DISBELIEF");
        VFG vfg10 = new VFG("DISGUSTED", 9, "DISGUSTED");
        VFG vfg11 = new VFG("EMPATHIC", 10, "EMPATHIC");
        VFG vfg12 = new VFG("ENTHUSIASTIC", 11, "ENTHUSIASTIC");
        VFG vfg13 = new VFG("EXPECTANT", 12, "EXPECTANT");
        VFG vfg14 = new VFG("FEARFUL", 13, "FEARFUL");
        VFG vfg15 = new VFG("FUNNY", 14, "FUNNY");
        VFG vfg16 = new VFG("HAPPY", 15, "HAPPY");
        VFG vfg17 = new VFG("HUMORED", 16, "HUMORED");
        VFG vfg18 = new VFG("IMPATIENT", 17, "IMPATIENT");
        VFG vfg19 = new VFG("INTERESTED", 18, "INTERESTED");
        VFG vfg20 = new VFG("IRONY", 19, "IRONY");
        VFG vfg21 = new VFG("NEUTRAL", 20, "NEUTRAL");
        VFG vfg22 = new VFG("POLITE", 21, "POLITE");
        VFG vfg23 = new VFG("SAD", 22, "SAD");
        VFG vfg24 = new VFG("SURPRISED", 23, "SURPRISED");
        VFG vfg25 = new VFG("SYMPATHETIC", 24, "SYMPATHETIC");
        VFG vfg26 = new VFG("THINKING", 25, "THINKING");
        VFG vfg27 = new VFG("TIRED", 26, "TIRED");
        VFG[] vfgArr = new VFG[30];
        System.arraycopy(new VFG[]{new VFG("UNSPECIFIED", 27, "UNSPECIFIED"), new VFG("UPSET", 28, "UPSET"), new VFG("WONDERING", 29, "WONDERING")}, AbstractC31175DnJ.A1b(new VFG[]{vfg, vfg2, vfg3, vfg4, vfg5, vfg6, vfg7, vfg8, vfg9, vfg10, vfg11, vfg12, vfg13, vfg14, vfg15, vfg16, vfg17, vfg18, vfg19, vfg20, vfg21, vfg22, vfg23, vfg24, vfg25, vfg26, vfg27}, vfgArr) ? 1 : 0, vfgArr, 27, 3);
        A01 = vfgArr;
    }

    public static VFG valueOf(String str) {
        return (VFG) Enum.valueOf(VFG.class, str);
    }

    public static VFG[] values() {
        return (VFG[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public VFG(String str, int i, String str2) {
        this.A00 = str2;
    }
}
