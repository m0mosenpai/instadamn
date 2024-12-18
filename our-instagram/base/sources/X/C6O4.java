package X;

/* renamed from: X.6O4, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6O4 {
    public static final int A00(C6O2 c6o2, Object obj, int i) {
        int itemCount;
        int BHP;
        if (obj == null || (itemCount = c6o2.getItemCount()) == 0 || ((i < itemCount && obj.equals(c6o2.BKc(i))) || (BHP = c6o2.BHP(obj)) == -1)) {
            return i;
        }
        return BHP;
    }
}
