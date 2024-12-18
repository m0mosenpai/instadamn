package X;

/* loaded from: classes8.dex */
public final class KOW extends AbstractC46417Kgd {
    public final Exception A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KOW) {
                KOW kow = (KOW) obj;
                if (!C14360o3.A0K(this.A01, kow.A01) || !C14360o3.A0K(this.A00, kow.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public KOW(Exception exc, String str) {
        this.A01 = str;
        this.A00 = exc;
    }
}
