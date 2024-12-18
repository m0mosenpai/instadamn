package X;

/* renamed from: X.MrM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51629MrM extends C0T6 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final int A03;
    public final int A04;
    public final EnumC53300Nhc A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51629MrM) {
                C51629MrM c51629MrM = (C51629MrM) obj;
                if (this.A05 != c51629MrM.A05 || !C14360o3.A0K(this.A01, c51629MrM.A01) || this.A07 != c51629MrM.A07 || this.A04 != c51629MrM.A04 || !C14360o3.A0K(this.A00, c51629MrM.A00) || this.A06 != c51629MrM.A06 || this.A03 != c51629MrM.A03 || this.A02 != c51629MrM.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, (AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0K(this.A00, (AbstractC167007dF.A0D(this.A07, (AbstractC166987dD.A0G(this.A05) + AbstractC167017dG.A0O(this.A01)) * 31) + this.A04) * 31)) + this.A03) * 31);
    }

    public C51629MrM(EnumC53300Nhc enumC53300Nhc, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A05 = enumC53300Nhc;
        this.A01 = str;
        this.A07 = z;
        this.A04 = i;
        this.A00 = str2;
        this.A06 = z2;
        this.A03 = i2;
        this.A02 = z3;
    }
}
