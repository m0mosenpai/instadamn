package X;

/* renamed from: X.Mwb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51893Mwb extends C0T6 implements InterfaceC57856PlM {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51893Mwb) {
                C51893Mwb c51893Mwb = (C51893Mwb) obj;
                if (!C14360o3.A0K(this.A00, c51893Mwb.A00) || !C14360o3.A0K(this.A01, c51893Mwb.A01) || this.A06 != c51893Mwb.A06 || this.A05 != c51893Mwb.A05 || this.A03 != c51893Mwb.A03 || this.A04 != c51893Mwb.A04 || this.A02 != c51893Mwb.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, ((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01)) * 31)))));
    }

    public C51893Mwb(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = str;
        this.A01 = str2;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = z3;
        this.A04 = z4;
        this.A02 = z5;
    }
}
