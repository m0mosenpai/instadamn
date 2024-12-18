package X;

/* renamed from: X.1FQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FQ implements C1BV {
    public static C1FQ A02;
    public C1FR A00 = new C1FR();
    public C1FR A01 = new C1FR();

    @Override // X.C1BV
    public final void Cz7(double d, long j, long j2) {
    }

    @Override // X.C1BV
    public final void EHV(double d) {
    }

    public static synchronized C1FQ A00() {
        C1FQ c1fq;
        synchronized (C1FQ.class) {
            c1fq = A02;
            if (c1fq == null) {
                c1fq = new C1FQ();
                A02 = c1fq;
            }
        }
        return c1fq;
    }

    @Override // X.C1BV
    public final void Cz6(double d, long j, long j2) {
        this.A00.A00(d);
    }
}
