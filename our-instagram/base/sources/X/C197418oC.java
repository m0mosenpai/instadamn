package X;

/* renamed from: X.8oC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197418oC {
    public int A00;
    public int A01;
    public C197788op A02;
    public int A03;
    public int A04;
    public int A05;
    public InterfaceC199678sJ A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final C178747wm A0A;

    public final void A02(InterfaceC179037xF interfaceC179037xF) {
        InterfaceC199678sJ interfaceC199678sJ = this.A06;
        if (interfaceC199678sJ != null) {
            A01(interfaceC199678sJ, interfaceC179037xF);
            A00(this.A05, this.A04, this.A03, this.A07, this.A08);
        }
    }

    public final void A00(int i, int i2, int i3, boolean z, boolean z2) {
        boolean z3 = false;
        if (i3 % 180 != 0) {
            z3 = true;
        }
        this.A05 = i;
        this.A04 = i2;
        int i4 = i;
        if (z3) {
            i4 = i2;
        }
        this.A01 = i4;
        if (!z3) {
            i = i2;
        }
        this.A00 = i;
        this.A03 = i3;
        this.A07 = z;
        this.A08 = z2;
        C197788op c197788op = this.A02;
        if (c197788op != null) {
            c197788op.A01 = i4;
            c197788op.A00 = i;
            c197788op.A02 = i3;
            c197788op.A06 = z;
            c197788op.A07 = z2;
        }
    }

    public final void A01(InterfaceC199678sJ interfaceC199678sJ, InterfaceC179037xF interfaceC179037xF) {
        if (this.A06 == interfaceC199678sJ && this.A02 != null) {
            return;
        }
        this.A06 = interfaceC199678sJ;
        C197788op c197788op = new C197788op(interfaceC199678sJ, false);
        this.A02 = c197788op;
        interfaceC179037xF.EWA(new C1809380v(this.A0A, c197788op), this.A09);
    }

    public C197418oC(C178747wm c178747wm, int i) {
        this.A09 = i;
        this.A0A = c178747wm;
    }
}
