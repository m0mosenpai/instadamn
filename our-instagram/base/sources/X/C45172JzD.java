package X;

/* renamed from: X.JzD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45172JzD extends C0T6 implements InterfaceC50396MMy {
    public final long A00;
    public final C2Fb A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45172JzD) {
                C45172JzD c45172JzD = (C45172JzD) obj;
                if (!C14360o3.A0K(this.A03, c45172JzD.A03) || this.A01 != c45172JzD.A01 || !C14360o3.A0K(this.A02, c45172JzD.A02) || this.A00 != c45172JzD.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A03))) + AbstractC25228BEl.A03(this.A00);
    }

    public C45172JzD(C2Fb c2Fb, String str, String str2, long j) {
        AbstractC167027dH.A13(str, c2Fb, str2);
        this.A03 = str;
        this.A01 = c2Fb;
        this.A02 = str2;
        this.A00 = j;
    }
}
