package X;

/* renamed from: X.Jyf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45139Jyf extends C0T6 implements InterfaceC43462JIa {
    public final JIZ A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45139Jyf) {
                C45139Jyf c45139Jyf = (C45139Jyf) obj;
                if (!C14360o3.A0K(this.A02, c45139Jyf.A02) || !C14360o3.A0K(this.A00, c45139Jyf.A00) || !C14360o3.A0K(this.A01, c45139Jyf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, (AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    public C45139Jyf(JIZ jiz, String str, String str2) {
        AbstractC167017dG.A1Q(str, str2);
        this.A02 = str;
        this.A00 = jiz;
        this.A01 = str2;
    }
}
