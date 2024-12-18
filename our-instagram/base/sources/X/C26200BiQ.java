package X;

/* renamed from: X.BiQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26200BiQ extends C0T6 implements InterfaceC30819Dgu {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26200BiQ) {
                C26200BiQ c26200BiQ = (C26200BiQ) obj;
                if (this.A07 != c26200BiQ.A07 || !C14360o3.A0K(this.A02, c26200BiQ.A02) || this.A08 != c26200BiQ.A08 || !C14360o3.A0K(this.A06, c26200BiQ.A06) || !C14360o3.A0K(this.A05, c26200BiQ.A05) || !C14360o3.A0K(this.A03, c26200BiQ.A03) || this.A01 != c26200BiQ.A01 || this.A00 != c26200BiQ.A00 || !C14360o3.A0K(this.A04, c26200BiQ.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A06, AbstractC167007dF.A0D(this.A08, (AbstractC25225BEi.A08(this.A07) + AbstractC167017dG.A0O(this.A02)) * 31))) + AbstractC167017dG.A0O(this.A03)) * 31) + this.A01) * 31) + this.A00) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public C26200BiQ(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2) {
        this.A07 = z;
        this.A02 = str;
        this.A08 = z2;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = str5;
    }
}
