package X;

/* renamed from: X.H4y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38758H4y extends C0T6 implements JKT {
    public final H4H A00;
    public final H6N A01;
    public final C26136BhN A02;

    @Override // X.JKT
    public final C38758H4y Ez7(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38758H4y) {
                C38758H4y c38758H4y = (C38758H4y) obj;
                if (!C14360o3.A0K(this.A00, c38758H4y.A00) || !C14360o3.A0K(this.A02, c38758H4y.A02) || !C14360o3.A0K(this.A01, c38758H4y.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKT
    public final /* bridge */ /* synthetic */ InterfaceC43573JMh BTj() {
        return this.A00;
    }

    @Override // X.JKT
    public final /* bridge */ /* synthetic */ JK0 C3C() {
        return this.A01;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38758H4y(H4H h4h, C26136BhN c26136BhN, H6N h6n) {
        this.A00 = h4h;
        this.A02 = c26136BhN;
        this.A01 = h6n;
    }

    @Override // X.JKT
    public final JKT E9m(C1DY c1dy) {
        return this;
    }
}
