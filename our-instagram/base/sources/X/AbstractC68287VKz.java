package X;

/* renamed from: X.VKz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68287VKz {
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP c102884kP = (C102884kP) c6fw.A03(0);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
            A06.getClass();
            W1l w1l = (W1l) A06;
            InterfaceC58682mR interfaceC58682mR = w1l.A00;
            if (interfaceC58682mR == null) {
                w1l.A01.A04 = false;
            } else {
                interfaceC58682mR.pause();
            }
            return C0eB.A00;
        }
        throw AbstractC166997dE.A0g();
    }
}
