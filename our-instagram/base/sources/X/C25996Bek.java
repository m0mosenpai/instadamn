package X;

/* renamed from: X.Bek, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25996Bek extends C0T6 {
    public final String A00;
    public final String A01;
    public final C5Hc A02;
    public final C5Hc A03;
    public final int A04;
    public final int A05;

    public C25996Bek(String str, String str2, C5Hc c5Hc, C5Hc c5Hc2, int i, int i2) {
        C14360o3.A0B(c5Hc, 1);
        this.A03 = c5Hc;
        this.A05 = i;
        this.A00 = str;
        this.A04 = i2;
        this.A01 = str2;
        this.A02 = c5Hc2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25996Bek) {
                C25996Bek c25996Bek = (C25996Bek) obj;
                if (!C14360o3.A0K(this.A03, c25996Bek.A03) || this.A05 != c25996Bek.A05 || !C14360o3.A0K(this.A00, c25996Bek.A00) || this.A04 != c25996Bek.A04 || !C14360o3.A0K(this.A01, c25996Bek.A01) || !C14360o3.A0K(this.A02, c25996Bek.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, (AbstractC166997dE.A0K(this.A00, (AbstractC166987dD.A0G(this.A03) + this.A05) * 31) + this.A04) * 31) + AbstractC167017dG.A0M(this.A02);
    }
}
