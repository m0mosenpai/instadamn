package X;

/* loaded from: classes7.dex */
public final class H6a extends C0T6 implements InterfaceC58248Prs {
    public final JJ0 A00;
    public final C38321qM A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6a) {
                H6a h6a = (H6a) obj;
                if (!C14360o3.A0K(this.A01, h6a.A01) || !C14360o3.A0K(this.A00, h6a.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H6a(JJ0 jj0, C38321qM c38321qM) {
        this.A01 = c38321qM;
        this.A00 = jj0;
    }
}
