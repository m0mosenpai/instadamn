package X;

/* loaded from: classes11.dex */
public abstract class VL7 {
    public static C102884kP A00(C6FG c6fg, String str) {
        C102884kP A00;
        AnonymousClass630 A02 = AnonymousClass634.A02(c6fg);
        C102884kP A06 = A02.A06();
        if (A06 != null && (A00 = U5O.A00(A06, new U5I(str))) != null) {
            return A00;
        }
        C102884kP A002 = U5O.A00(A02.A07(), new U5I(str));
        AbstractC25241Le.A02("BloksModelFinder", String.format("Found node %s in unbound tree but not in bound tree %s", str, A02.A06()));
        return A002;
    }
}
