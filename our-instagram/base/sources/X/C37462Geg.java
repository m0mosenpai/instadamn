package X;

/* renamed from: X.Geg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37462Geg extends C0T6 {
    public final boolean A00;
    public final String A01;

    public C37462Geg(String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37462Geg) {
                C37462Geg c37462Geg = (C37462Geg) obj;
                if (!C14360o3.A0K(this.A01, c37462Geg.A01) || this.A00 != c37462Geg.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC166987dD.A0J(this.A01));
    }
}
