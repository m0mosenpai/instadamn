package X;

/* renamed from: X.VvD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69776VvD {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69776VvD) {
                C69776VvD c69776VvD = (C69776VvD) obj;
                if (!C14360o3.A0K(this.A01, c69776VvD.A01) || !C14360o3.A0K(this.A05, c69776VvD.A05) || !C14360o3.A0K(this.A02, c69776VvD.A02) || this.A03 != c69776VvD.A03 || this.A06 != c69776VvD.A06 || this.A04 != c69776VvD.A04 || !C14360o3.A0K(this.A00, c69776VvD.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A03, ((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31)));
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return A0D + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Email(id=");
        sb.append(this.A01);
        sb.append(", userInputEmailAddress=");
        sb.append(this.A05);
        sb.append(", normalizedEmailAddress=");
        sb.append(this.A02);
        sb.append(", isDefault=");
        sb.append(this.A03);
        sb.append(", isOneTime=");
        sb.append(this.A06);
        sb.append(", isEditable=");
        sb.append(this.A04);
        sb.append(", externalSourceLabel=");
        return AbstractC25236BEt.A0Y(this.A00, sb);
    }

    public C69776VvD(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A03 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A00 = str4;
    }
}
