package X;

/* renamed from: X.9ZJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZJ extends C0T6 {
    public final int A00;
    public final int A01;
    public final C7GX A02;
    public final C7H2 A03;
    public final C7H2 A04;
    public final String A05;
    public final int A06;
    public final C7GY A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZJ) {
                C9ZJ c9zj = (C9ZJ) obj;
                if (this.A01 != c9zj.A01 || this.A00 != c9zj.A00 || this.A02 != c9zj.A02 || this.A06 != c9zj.A06 || !C14360o3.A0K(this.A05, c9zj.A05) || this.A07 != c9zj.A07 || !C14360o3.A0K(this.A04, c9zj.A04) || !C14360o3.A0K(this.A03, c9zj.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A07, (((AbstractC166997dE.A0J(this.A02, ((this.A01 * 31) + this.A00) * 31) + this.A06) * 31) + AbstractC167017dG.A0O(this.A05)) * 31)));
    }

    public C9ZJ(C7GY c7gy, C7GX c7gx, C7H2 c7h2, C7H2 c7h22, String str, int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c7gx;
        this.A06 = i3;
        this.A05 = str;
        this.A07 = c7gy;
        this.A04 = c7h2;
        this.A03 = c7h22;
    }
}
