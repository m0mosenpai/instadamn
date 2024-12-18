package X;

/* renamed from: X.Rbf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60925Rbf extends Q08 {
    public final Throwable A00;
    public final Q03 A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60925Rbf) {
                C60925Rbf c60925Rbf = (C60925Rbf) obj;
                if (!C14360o3.A0K(this.A02, c60925Rbf.A02) || !C14360o3.A0K(this.A00, c60925Rbf.A00) || !C14360o3.A0K(this.A01, c60925Rbf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02)));
    }

    public C60925Rbf(Q03 q03, String str, Throwable th) {
        super(q03, str);
        this.A02 = str;
        this.A00 = th;
        this.A01 = q03;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Failure(key=");
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(279));
        A1C.append(this.A00);
        A1C.append(", summary=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
