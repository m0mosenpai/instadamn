package X;

/* loaded from: classes11.dex */
public abstract class VL1 {
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP c102884kP = (C102884kP) c6fw.A01();
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
            A06.getClass();
            W1l w1l = (W1l) A06;
            float A00 = AbstractC43593JPy.A00(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
            InterfaceC58682mR interfaceC58682mR = w1l.A00;
            if (interfaceC58682mR == null) {
                w1l.A01.A00 = A00;
            } else {
                interfaceC58682mR.EMk(A00);
            }
            return C0eB.A00;
        }
        throw AbstractC166997dE.A0g();
    }
}
