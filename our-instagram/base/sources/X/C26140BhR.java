package X;

/* renamed from: X.BhR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26140BhR extends C0T6 implements InterfaceC31121Dm3 {
    public final int A00;
    public final String A01;

    public C26140BhR(String str, int i) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    @Override // X.InterfaceC31121Dm3
    public final C26140BhR Exa() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26140BhR) {
                C26140BhR c26140BhR = (C26140BhR) obj;
                if (!C14360o3.A0K(this.A01, c26140BhR.A01) || this.A00 != c26140BhR.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + this.A00;
    }

    @Override // X.InterfaceC31121Dm3
    public final String AzF() {
        return this.A01;
    }

    @Override // X.InterfaceC31121Dm3
    public final int B2P() {
        return this.A00;
    }
}
