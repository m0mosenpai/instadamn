package X;

/* renamed from: X.8Z8, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8Z8 {
    public static final boolean A00(C1810981l c1810981l, C8FG c8fg, C8JU c8ju) {
        boolean z;
        C88X A0D;
        C14360o3.A0B(c1810981l, 0);
        C14360o3.A0B(c8ju, 2);
        if (c8fg != null && (c8fg.A0D() == null || ((A0D = c8fg.A0D()) != null && A0D.A04 == C88Z.A0G))) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = false;
        if (((java.util.Set) c1810981l.A07.A00).size() < 2) {
            z2 = true;
        }
        boolean CZY = c8ju.CZY();
        boolean z3 = true;
        if (c8ju.Aus().A00.ordinal() == 0) {
            z3 = false;
        }
        if (z || z2 || z3 || CZY) {
            return true;
        }
        return false;
    }
}
