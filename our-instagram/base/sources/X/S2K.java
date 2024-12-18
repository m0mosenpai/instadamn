package X;

/* loaded from: classes10.dex */
public abstract class S2K {
    public static String A00(String str, int i) {
        if (i <= 0) {
            AbstractC62208S2d.A00("index out of range for prefix", str);
            return "";
        }
        return AbstractC58320PtC.A12(str, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(str) + 11), i);
    }
}
