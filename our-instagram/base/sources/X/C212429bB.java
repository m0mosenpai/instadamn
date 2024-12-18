package X;

/* renamed from: X.9bB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212429bB extends C81E {
    public C179427xs A00;
    public C212449bD A01;
    public C212439bC A02;

    public static C179427xs A00(AbstractC179397xp abstractC179397xp, C212429bB c212429bB, int i, int i2) {
        C179427xs c179427xs = c212429bB.A00;
        if (c179427xs == null) {
            c212429bB.A00 = new C179427xs(c212429bB.A04, new C179387xo(), abstractC179397xp, false);
            ((C81E) c212429bB).A01.getClass();
            c212429bB.A00.A03(i, i2, 0);
            C179427xs c179427xs2 = c212429bB.A00;
            InterfaceC180227zC interfaceC180227zC = ((C81E) c212429bB).A00;
            interfaceC180227zC.getClass();
            c179427xs2.ACv(interfaceC180227zC);
        } else {
            c179427xs.A03(i, i2, 0);
            c212429bB.A00.A01 = abstractC179397xp;
        }
        return c212429bB.A00;
    }
}
