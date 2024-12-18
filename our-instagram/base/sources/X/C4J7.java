package X;

/* renamed from: X.4J7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4J7 implements C4J8 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C3JY A01;
    public final /* synthetic */ InterfaceC26481Qd A02;
    public final /* synthetic */ C26461Qb A03;
    public final /* synthetic */ C14M A04;

    public C4J7(C3JY c3jy, InterfaceC26481Qd interfaceC26481Qd, C26461Qb c26461Qb, C14M c14m, long j) {
        this.A04 = c14m;
        this.A01 = c3jy;
        this.A00 = j;
        this.A02 = interfaceC26481Qd;
        this.A03 = c26461Qb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A02.close();
    }
}
