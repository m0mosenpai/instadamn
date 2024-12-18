package X;

/* renamed from: X.Jsp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44818Jsp extends AbstractC46350KfY {
    public final String A00;
    public final Throwable A01;

    public C44818Jsp(String str, Throwable th) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44818Jsp) {
                C44818Jsp c44818Jsp = (C44818Jsp) obj;
                if (!C14360o3.A0K(this.A00, c44818Jsp.A00) || !C14360o3.A0K(this.A01, c44818Jsp.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0M(this.A01);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Failure(errorMessage=");
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(279));
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
