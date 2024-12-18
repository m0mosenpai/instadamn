package X;

/* loaded from: classes5.dex */
public final class BL9 extends C0T6 implements InterfaceC30881Dhu {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final C38321qM A02;
    public final boolean A03;
    public final boolean A04;
    public final EnumC129395t1 A05;
    public final Integer A06;

    public BL9(C120985dq c120985dq, EnumC129395t1 enumC129395t1, C37644Ghd c37644Ghd, C38321qM c38321qM, Integer num, boolean z, boolean z2) {
        C14360o3.A0B(enumC129395t1, 4);
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A02 = c38321qM;
        this.A05 = enumC129395t1;
        this.A06 = num;
        this.A03 = z;
        this.A04 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BL9) {
                BL9 bl9 = (BL9) obj;
                if (!C14360o3.A0K(this.A00, bl9.A00) || !C14360o3.A0K(this.A01, bl9.A01) || !C14360o3.A0K(this.A02, bl9.A02) || this.A05 != bl9.A05 || !C14360o3.A0K(this.A06, bl9.A06) || this.A03 != bl9.A03 || this.A04 != bl9.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC167007dF.A0D(this.A03, (AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)))) + AbstractC167017dG.A0M(this.A06)) * 31));
    }
}
