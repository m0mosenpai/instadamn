package X;

/* renamed from: X.1st, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39701st implements InterfaceC37991pg {
    public C39841t8 A00;
    public C39831t7 A01;
    public String A02;
    public boolean A03;
    public final InterfaceC39221rz A04;
    public final InterfaceC38361qQ A05;
    public final C37951pc A06;
    public final boolean A07;

    private synchronized void A00() {
        if (!this.A03) {
            throw new IllegalStateException("SessionDelegate should have called bootstrapIfNeeded");
        }
    }

    public static void A01(C39701st c39701st) {
        c39701st.A02 = c39701st.A05.E6h();
        c39701st.A02(null);
        synchronized (c39701st) {
            c39701st.A04.Enc(c39701st.A00);
        }
    }

    private void A02(Boolean bool) {
        C39841t8 c39841t8;
        boolean equals = Boolean.TRUE.equals(bool);
        C39831t7 c39831t7 = this.A01;
        String str = this.A02;
        if (equals) {
            c39841t8 = new C39841t8(c39831t7, str, true);
        } else {
            c39841t8 = new C39841t8(c39831t7, str);
        }
        this.A00 = c39841t8;
    }

    public C39701st(InterfaceC39221rz interfaceC39221rz, InterfaceC38361qQ interfaceC38361qQ, C37951pc c37951pc, boolean z) {
        this.A06 = c37951pc;
        this.A04 = interfaceC39221rz;
        this.A05 = interfaceC38361qQ;
        this.A07 = z;
    }

    @Override // X.InterfaceC37991pg
    public final void Cyz() {
        InterfaceC39221rz interfaceC39221rz;
        A00();
        this.A02 = this.A05.E6h();
        A02(true);
        synchronized (this) {
            interfaceC39221rz = this.A04;
            interfaceC39221rz.Enc(this.A00);
        }
        if (this.A07) {
            interfaceC39221rz.F8b();
        }
    }

    @Override // X.InterfaceC37991pg
    public final void DI6() {
        A00();
        A01(this);
    }
}
