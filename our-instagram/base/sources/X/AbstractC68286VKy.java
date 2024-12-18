package X;

/* renamed from: X.VKy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68286VKy {
    public static final Boolean A00(C6FQ c6fq, C6FW c6fw) {
        boolean z;
        C102884kP c102884kP = (C102884kP) c6fw.A01();
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
            A06.getClass();
            W1l w1l = (W1l) A06;
            InterfaceC58682mR interfaceC58682mR = w1l.A00;
            if (interfaceC58682mR != null) {
                z = interfaceC58682mR.isPlaying();
            } else {
                z = w1l.A01.A04;
            }
            return Boolean.valueOf(z);
        }
        throw AbstractC166997dE.A0g();
    }
}
