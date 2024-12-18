package X;

/* loaded from: classes8.dex */
public final class K2Z extends C0T6 implements InterfaceC129555tK {
    public final int A00;
    public final int A01;
    public final String A02;
    public final C2EY A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2Z) {
                K2Z k2z = (K2Z) obj;
                if (!C14360o3.A0K(this.A02, k2z.A02) || this.A03 != k2z.A03 || this.A00 != k2z.A00 || this.A01 != k2z.A01 || this.A04 != k2z.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, (((AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A02)) + this.A00) * 31) + this.A01) * 31);
    }

    public K2Z(C2EY c2ey, String str, int i, int i2, boolean z) {
        this.A02 = str;
        this.A03 = c2ey;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
