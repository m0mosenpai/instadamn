package X;

/* renamed from: X.KUo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45937KUo extends AbstractC46443Kh3 {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45937KUo) {
                C45937KUo c45937KUo = (C45937KUo) obj;
                if (!C14360o3.A0K(this.A01, c45937KUo.A01) || this.A00 != c45937KUo.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + this.A00;
    }

    public C45937KUo(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
