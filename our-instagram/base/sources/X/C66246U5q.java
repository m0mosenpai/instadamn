package X;

/* renamed from: X.U5q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66246U5q {
    public final C192988ge A00;
    public final C1338962x A01;
    public final InterfaceC103384lE A02;
    public final String A03;

    public static C66246U5q A00(C1338462s c1338462s) {
        InterfaceC103384lE interfaceC103384lE;
        C102884kP c102884kP = c1338462s.A02;
        if (c102884kP != null && c102884kP.A05 == 13343) {
            interfaceC103384lE = c102884kP.A0A();
        } else {
            interfaceC103384lE = null;
        }
        return new C66246U5q(c1338462s.A00, c1338462s.A01, interfaceC103384lE, c1338462s.A03);
    }

    public C66246U5q(C192988ge c192988ge, C1338962x c1338962x, InterfaceC103384lE interfaceC103384lE, String str) {
        this.A01 = c1338962x;
        this.A02 = interfaceC103384lE;
        this.A03 = str;
        this.A00 = c192988ge;
    }
}
