package X;

/* renamed from: X.VvA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69773VvA {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69773VvA) {
                C69773VvA c69773VvA = (C69773VvA) obj;
                if (!C14360o3.A0K(this.A01, c69773VvA.A01) || !C14360o3.A0K(this.A00, c69773VvA.A00) || this.A04 != c69773VvA.A04 || this.A02 != c69773VvA.A02 || this.A05 != c69773VvA.A05 || this.A03 != c69773VvA.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = AbstractC167017dG.A0O(this.A01) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        int A0D = AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A04, (A0O + i) * 31)));
        int i2 = 1237;
        if (this.A03) {
            i2 = 1231;
        }
        return A0D + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PriceTableRowData(priceLabel=");
        sb.append(this.A01);
        sb.append(", priceAmount=");
        sb.append(this.A00);
        sb.append(", isLabelEmphasized=");
        sb.append(this.A04);
        sb.append(", isAmountEmphasized=");
        sb.append(this.A02);
        sb.append(", isPlaceholder=");
        sb.append(this.A05);
        sb.append(", isGreen=");
        return AbstractC25236BEt.A0a(sb, this.A03);
    }

    public C69773VvA(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = str;
        this.A00 = str2;
        this.A04 = z;
        this.A02 = z2;
        this.A05 = z3;
        this.A03 = z4;
    }
}
