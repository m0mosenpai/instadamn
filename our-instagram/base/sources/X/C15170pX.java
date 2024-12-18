package X;

/* renamed from: X.0pX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15170pX implements C0N9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.C0N9
    public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
        int i = this.A00;
        final C0Pe A05 = c0nk.A05();
        final C0LW A04 = c0nk.A04();
        final InterfaceC08830cm interfaceC08830cm = (InterfaceC08830cm) this.A05;
        final C04140Kg c04140Kg = (C04140Kg) this.A04;
        final boolean z = this.A09;
        final int i2 = this.A03;
        final boolean z2 = this.A07;
        final int i3 = this.A01;
        final boolean z3 = this.A08;
        final int i4 = this.A02;
        if (i != 0) {
            return new C02640An(c04140Kg, A04, A05, interfaceC08830cm, i2, i3, i4, z, z2, z3) { // from class: X.0hT
                @Override // X.C02640An, X.C0OO
                public final void start() {
                    if (this.A06) {
                        C02640An.A00(this, true);
                    } else {
                        super.start();
                    }
                }
            };
        }
        return new C10640hY(c04140Kg, A04, A05, this, interfaceC08830cm, i2, i3, i4, z, z2, z3);
    }

    public C15170pX(C04140Kg c04140Kg, InterfaceC08830cm interfaceC08830cm, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i4;
        this.A05 = interfaceC08830cm;
        this.A04 = c04140Kg;
        this.A09 = z;
        this.A03 = i;
        this.A07 = z2;
        this.A01 = i2;
        this.A08 = z3;
        this.A02 = i3;
        this.A06 = z4;
    }
}
