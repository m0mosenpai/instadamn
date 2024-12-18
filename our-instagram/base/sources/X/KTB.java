package X;

/* loaded from: classes8.dex */
public final class KTB extends AbstractC129515tG implements InterfaceC129555tK {
    public final int A00;
    public final int A01;
    public final C7QX A02;
    public final C2EY A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KTB) {
                KTB ktb = (KTB) obj;
                if (!C14360o3.A0K(this.A04, ktb.A04) || this.A00 != ktb.A00 || this.A01 != ktb.A01 || this.A05 != ktb.A05 || !C14360o3.A0K(this.A02, ktb.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC167007dF.A0D(this.A05, (((AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A04)) + this.A00) * 31) + this.A01) * 31));
    }

    public KTB(C7QX c7qx, C2EY c2ey, String str, int i, int i2, boolean z) {
        super(c7qx);
        this.A04 = str;
        this.A03 = c2ey;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = z;
        this.A02 = c7qx;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
