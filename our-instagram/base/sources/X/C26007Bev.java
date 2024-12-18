package X;

/* renamed from: X.Bev, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26007Bev extends C0T6 {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26007Bev) {
                C26007Bev c26007Bev = (C26007Bev) obj;
                if (!C14360o3.A0K(this.A04, c26007Bev.A04) || !C14360o3.A0K(this.A03, c26007Bev.A03) || !C14360o3.A0K(this.A02, c26007Bev.A02) || this.A05 != c26007Bev.A05 || this.A06 != c26007Bev.A06 || this.A07 != c26007Bev.A07 || !C14360o3.A0K(this.A01, c26007Bev.A01) || !C14360o3.A0K(this.A00, c26007Bev.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, ((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C26007Bev(Integer num, Integer num2, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A01 = num;
        this.A00 = num2;
    }
}
