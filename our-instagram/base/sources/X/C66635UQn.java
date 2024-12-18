package X;

/* renamed from: X.UQn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66635UQn extends C0T6 implements XFB {
    public final int A00;
    public final int A01;
    public final String A02;

    public C66635UQn(int i, String str, int i2) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66635UQn) {
                C66635UQn c66635UQn = (C66635UQn) obj;
                if (this.A00 != c66635UQn.A00 || !C14360o3.A0K(this.A02, c66635UQn.A02) || this.A01 != c66635UQn.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, this.A00 * 31) + this.A01;
    }
}
