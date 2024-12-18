package X;

/* loaded from: classes8.dex */
public abstract class LCG {
    public static final boolean A00(int i) {
        return i == 2 || i == 8 || i == 11 || i == 16;
    }

    public static final boolean A01(L8R l8r) {
        return A00(l8r.A00.mResultSet.getInteger(0, 17));
    }
}
