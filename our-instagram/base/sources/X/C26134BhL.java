package X;

/* renamed from: X.BhL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26134BhL extends C0T6 implements InterfaceC31106Dlo {
    public final C26135BhM A00;
    public final String A01;

    @Override // X.InterfaceC31106Dlo
    public final C26134BhL Ewl() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26134BhL) {
                C26134BhL c26134BhL = (C26134BhL) obj;
                if (!C14360o3.A0K(this.A01, c26134BhL.A01) || !C14360o3.A0K(this.A00, c26134BhL.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C26134BhL(C26135BhM c26135BhM, String str) {
        AbstractC167017dG.A1P(str, c26135BhM);
        this.A01 = str;
        this.A00 = c26135BhM;
    }
}
