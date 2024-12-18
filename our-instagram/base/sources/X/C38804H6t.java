package X;

/* renamed from: X.H6t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38804H6t extends C0T6 implements JJ3 {
    public final JJ2 A00;
    public final JJ4 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38804H6t) {
                C38804H6t c38804H6t = (C38804H6t) obj;
                if (!C14360o3.A0K(this.A00, c38804H6t.A00) || !C14360o3.A0K(this.A01, c38804H6t.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38804H6t(JJ2 jj2, JJ4 jj4) {
        this.A00 = jj2;
        this.A01 = jj4;
    }
}
