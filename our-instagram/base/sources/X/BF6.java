package X;

/* loaded from: classes5.dex */
public final class BF6 extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BF6) {
                BF6 bf6 = (BF6) obj;
                if (!C14360o3.A0K(this.A01, bf6.A01) || !C14360o3.A0K(this.A00, bf6.A00) || this.A03 != bf6.A03 || !C14360o3.A0K(this.A02, bf6.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, (AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public BF6(String str, String str2, boolean z, String str3) {
        this.A01 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A02 = str3;
    }
}
