package X;

/* renamed from: X.Bei, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25994Bei extends C0T6 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final long A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25994Bei) {
                C25994Bei c25994Bei = (C25994Bei) obj;
                if (!C14360o3.A0K(this.A04, c25994Bei.A04) || !C14360o3.A0K(this.A03, c25994Bei.A03) || !C14360o3.A0K(this.A02, c25994Bei.A02) || !C14360o3.A0K(this.A01, c25994Bei.A01) || this.A00 != c25994Bei.A00 || this.A05 != c25994Bei.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A07(this.A05, AbstractC167007dF.A07(this.A00, (AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A04))) + AbstractC167017dG.A0O(this.A01)) * 31)) + AbstractC53644Nnp.A00();
    }

    public C25994Bei(long j, String str, String str2, String str3, String str4, long j2) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A00 = j;
        this.A05 = j2;
    }
}
