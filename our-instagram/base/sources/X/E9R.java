package X;

/* loaded from: classes6.dex */
public final class E9R extends C0T6 implements InterfaceC37097GWh {
    public final long A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9R) {
                E9R e9r = (E9R) obj;
                if (!C14360o3.A0K(this.A01, e9r.A01) || this.A00 != e9r.A00 || !C14360o3.A0K(this.A02, e9r.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC25236BEt.A01(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    public E9R(String str, long j, String str2) {
        AbstractC167017dG.A1Q(str, str2);
        this.A01 = str;
        this.A00 = j;
        this.A02 = str2;
    }
}
