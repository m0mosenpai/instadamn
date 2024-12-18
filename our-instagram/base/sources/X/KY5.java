package X;

/* loaded from: classes8.dex */
public final class KY5 extends AbstractC46472KhW {
    public final String A00;
    public final Throwable A01;

    public KY5(String str, Throwable th) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KY5) {
                KY5 ky5 = (KY5) obj;
                if (!C14360o3.A0K(this.A00, ky5.A00) || !C14360o3.A0K(this.A01, ky5.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0M(this.A01);
    }
}
