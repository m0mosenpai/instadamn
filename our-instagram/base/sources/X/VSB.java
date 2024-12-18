package X;

/* loaded from: classes11.dex */
public abstract class VSB {
    public static C102884kP A00(C6FG c6fg, C6FQ c6fq, C102884kP c102884kP) {
        AnonymousClass630 A02 = AnonymousClass634.A02(c6fg);
        if (AnonymousClass634.A0B(c6fg)) {
            return C6AU.A00(null, new C6VZ(A02.A0D, c102884kP), c102884kP);
        }
        AnonymousClass632 anonymousClass632 = c6fq.A04;
        if (anonymousClass632 == null) {
            anonymousClass632 = A02.A05();
        }
        C6AV A00 = C136366Fp.A00(c6fg, anonymousClass632, null, c102884kP, c6fg.A02.AgS().AgX(), C1339162z.A00);
        if (!A00.A04.isEmpty()) {
            AbstractC25241Le.A02("BloksBind", "Undefined Behavior: BloksBind::evaluate() returned controller binding operations");
        }
        return A00.A01;
    }
}
