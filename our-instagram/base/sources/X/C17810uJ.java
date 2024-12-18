package X;

/* renamed from: X.0uJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17810uJ implements InterfaceC17710u8 {
    public long A00;
    public InterfaceC17700u7 A01;
    public final long A02;

    @Override // X.InterfaceC17710u8
    public final void AWP() {
        InterfaceC17700u7 interfaceC17700u7 = this.A01;
        if (interfaceC17700u7 != null) {
            interfaceC17700u7.E28(3);
        }
    }

    @Override // X.InterfaceC17710u8
    public final void EfQ(InterfaceC17700u7 interfaceC17700u7) {
        this.A01 = interfaceC17700u7;
    }

    public C17810uJ(long j) {
        this.A02 = j;
    }

    @Override // X.InterfaceC17710u8
    public final void EIx() {
        if (System.currentTimeMillis() - this.A00 > this.A02) {
            InterfaceC17700u7 interfaceC17700u7 = this.A01;
            if (interfaceC17700u7 != null) {
                interfaceC17700u7.E28(3);
            }
            this.A00 = System.currentTimeMillis();
        }
    }

    public C17810uJ() {
        this(1000L);
    }
}
