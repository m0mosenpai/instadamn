package X;

/* renamed from: X.BjV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26262BjV extends C0T6 implements InterfaceC30893Di6 {
    public final C22P A00;
    public final String A01;
    public final C26135BhM A02;

    public C26262BjV(C22P c22p, C26135BhM c26135BhM, String str) {
        C14360o3.A0B(str, 3);
        this.A02 = c26135BhM;
        this.A00 = c22p;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26262BjV) {
                C26262BjV c26262BjV = (C26262BjV) obj;
                if (!C14360o3.A0K(this.A02, c26262BjV.A02) || this.A00 != c26262BjV.A00 || !C14360o3.A0K(this.A01, c26262BjV.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0M(this.A02) * 31));
    }
}
