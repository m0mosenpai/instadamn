package X;

/* renamed from: X.5sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129365sy extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public C129365sy(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, boolean z, boolean z2) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(str4, 8);
        C14360o3.A0B(str5, 9);
        this.A02 = j;
        this.A03 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A08 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = str4;
        this.A05 = str5;
        this.A09 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C129365sy) {
                C129365sy c129365sy = (C129365sy) obj;
                if (this.A02 != c129365sy.A02 || !C14360o3.A0K(this.A03, c129365sy.A03) || !C14360o3.A0K(this.A07, c129365sy.A07) || !C14360o3.A0K(this.A04, c129365sy.A04) || this.A08 != c129365sy.A08 || this.A01 != c129365sy.A01 || this.A00 != c129365sy.A00 || !C14360o3.A0K(this.A06, c129365sy.A06) || !C14360o3.A0K(this.A05, c129365sy.A05) || this.A09 != c129365sy.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentFilterDictionaryMetadataEntity(id=");
        sb.append(this.A02);
        sb.append(", dictionaryKey=");
        sb.append(this.A03);
        sb.append(", name=");
        sb.append(this.A07);
        sb.append(", language=");
        sb.append(this.A04);
        sb.append(", isEditable=");
        sb.append(this.A08);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", strategyId=");
        sb.append(this.A00);
        sb.append(", loadedVersion=");
        sb.append(this.A06);
        sb.append(", latestVersion=");
        sb.append(this.A05);
        sb.append(", supportsVersioning=");
        sb.append(this.A09);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        long j = this.A02;
        int hashCode = ((((((((int) (j ^ (j >>> 32))) * 31) + this.A03.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int hashCode2 = (((((((((hashCode + i) * 31) + this.A01) * 31) + this.A00) * 31) + this.A06.hashCode()) * 31) + this.A05.hashCode()) * 31;
        int i2 = 1237;
        if (this.A09) {
            i2 = 1231;
        }
        return hashCode2 + i2;
    }
}
