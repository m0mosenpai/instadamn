package X;

/* renamed from: X.6Rf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138986Rf {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final int A05;

    public C138986Rf(String str, String str2, String str3, String str4, int i, long j) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        this.A05 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C138986Rf) {
            C138986Rf c138986Rf = (C138986Rf) obj;
            if (C14360o3.A0K(c138986Rf.A04, this.A04) && C14360o3.A0K(c138986Rf.A03, this.A03) && C14360o3.A0K(c138986Rf.A01, this.A01) && c138986Rf.A05 == this.A05) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OnClickListener");
        sb.append(" on ");
        sb.append(this.A03);
        sb.append('#');
        sb.append(this.A05);
        sb.append(" with ViewID: ");
        sb.append(this.A04);
        sb.append(", with handler class: ");
        sb.append(this.A01);
        return sb.toString();
    }
}
