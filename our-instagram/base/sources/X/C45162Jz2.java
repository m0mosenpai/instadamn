package X;

/* renamed from: X.Jz2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45162Jz2 extends C0T6 implements InterfaceC50391MMt {
    public final C69749Vuj A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45162Jz2) {
                C45162Jz2 c45162Jz2 = (C45162Jz2) obj;
                if (!C14360o3.A0K(this.A00, c45162Jz2.A00) || this.A01 != c45162Jz2.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C45162Jz2(C69749Vuj c69749Vuj, boolean z) {
        this.A00 = c69749Vuj;
        this.A01 = z;
    }
}
