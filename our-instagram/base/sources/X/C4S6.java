package X;

/* renamed from: X.4S6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4S6 extends C4S7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C3Y7 A08;
    public C75113Zb A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final InterfaceC60442pS A0E;

    public final C38321qM A00() {
        InterfaceC38381qS A00 = C4QR.A00(super.A03, this.A0D);
        if (A00 instanceof C38321qM) {
            return (C38321qM) A00;
        }
        return null;
    }

    public final void A01(boolean z) {
        if (super.A00 != z) {
            super.A00 = z;
        }
        C75113Zb c75113Zb = this.A09;
        if (c75113Zb != null && c75113Zb.A1m != z) {
            c75113Zb.A1m = z;
            C75113Zb.A00(c75113Zb, 31);
        }
    }

    public C4S6(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2, int i3, boolean z, boolean z2) {
        super(c38321qM, i);
        this.A0D = i2;
        this.A05 = i3;
        this.A0E = interfaceC60442pS;
        if (z2) {
            this.A07 = i3;
        }
        super.A00 = z;
        this.A04 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A0B = false;
    }
}
