package X;

/* renamed from: X.Bhn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26162Bhn extends C0T6 implements InterfaceC30799Dga {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26162Bhn) {
                C26162Bhn c26162Bhn = (C26162Bhn) obj;
                if (!C14360o3.A0K(this.A00, c26162Bhn.A00) || !C14360o3.A0K(this.A01, c26162Bhn.A01) || this.A02 != c26162Bhn.A02 || this.A03 != c26162Bhn.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00))));
    }

    public C26162Bhn(String str, String str2, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
        this.A03 = z2;
    }
}
