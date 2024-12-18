package X;

/* renamed from: X.E6n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32061E6n extends C0T6 {
    public final int A00 = 0;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public C32061E6n(int i, String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            return super.equals(obj);
        }
        if (this != obj) {
            if (obj instanceof C32061E6n) {
                C32061E6n c32061E6n = (C32061E6n) obj;
                if (c32061E6n.A00 != 0 || !C14360o3.A0K(this.A02, c32061E6n.A02) || this.A01 != c32061E6n.A01 || this.A03 != c32061E6n.A03) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return super.hashCode();
        }
        return AbstractC166987dD.A0K(this.A03, (AbstractC166987dD.A0J(this.A02) + this.A01) * 31);
    }

    public C32061E6n(String str, boolean z, int i) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = i;
    }
}
