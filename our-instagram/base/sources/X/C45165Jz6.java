package X;

/* renamed from: X.Jz6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45165Jz6 extends C0T6 implements InterfaceC50392MMu {
    public final C45037JwS A00;
    public final C45125Jxu A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45165Jz6) {
                C45165Jz6 c45165Jz6 = (C45165Jz6) obj;
                if (!C14360o3.A0K(this.A00, c45165Jz6.A00) || !C14360o3.A0K(this.A01, c45165Jz6.A01) || this.A02 != c45165Jz6.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)) + AbstractC46612Kjp.A00(this.A02);
    }

    public C45165Jz6(C45037JwS c45037JwS, C45125Jxu c45125Jxu, Integer num) {
        AbstractC167027dH.A13(c45037JwS, c45125Jxu, num);
        this.A00 = c45037JwS;
        this.A01 = c45125Jxu;
        this.A02 = num;
    }
}
