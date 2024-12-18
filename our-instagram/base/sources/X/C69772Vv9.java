package X;

/* renamed from: X.Vv9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69772Vv9 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69772Vv9) {
                C69772Vv9 c69772Vv9 = (C69772Vv9) obj;
                if (!C14360o3.A0K(this.A02, c69772Vv9.A02) || !C14360o3.A0K(this.A03, c69772Vv9.A03) || !C14360o3.A0K(this.A01, c69772Vv9.A01) || this.A04 != c69772Vv9.A04 || this.A05 != c69772Vv9.A05 || !C14360o3.A0K(this.A00, c69772Vv9.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = AbstractC167007dF.A0D(this.A05, (AbstractC167007dF.A0D(this.A04, ((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC53644Nnp.A00()) * 31);
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return A0D + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PhoneNumber(id=");
        sb.append(this.A02);
        sb.append(", normalizedPhoneNumber=");
        sb.append(this.A03);
        sb.append(", formattedPhoneNumberWithPlus=");
        sb.append(this.A01);
        sb.append(", isDefault=");
        sb.append(this.A04);
        AbstractC25235BEs.A1M(sb, ", isOneTime=");
        sb.append(", isEditable=");
        sb.append(this.A05);
        sb.append(", externalSourceLabel=");
        return AbstractC25236BEt.A0Y(this.A00, sb);
    }

    public C69772Vv9(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = str4;
    }
}
