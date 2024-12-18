package X;

/* renamed from: X.19c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C227419c implements InterfaceC12870lZ {
    public C1A3 A00 = null;
    public final AbstractRunnableC14200nk A01 = new AbstractRunnableC14200nk() { // from class: X.19d
        @Override // java.lang.Runnable
        public final void run() {
            throw new RuntimeException();
        }

        {
            super(1559692924, 2, false, false);
        }
    };
    public volatile boolean A02 = false;

    public C227419c() {
        C218914p.A03(EnumC220415e.A03, this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-157367347);
        if (this.A02) {
            C14270nr.A00().A02(this.A01);
            throw new RuntimeException();
        }
        C0f9.A0A(1889875762, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1905033446, C0f9.A03(1335285054));
    }
}
