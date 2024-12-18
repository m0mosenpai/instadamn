package X;

/* loaded from: classes11.dex */
public final class UQp extends C0T6 implements JIV {
    public final int A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQp) {
                UQp uQp = (UQp) obj;
                if (this.A00 != uQp.A00 || this.A01 != uQp.A01 || !C14360o3.A0K(this.A02, uQp.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + AbstractC167017dG.A0O(this.A02);
    }

    public UQp(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }
}
