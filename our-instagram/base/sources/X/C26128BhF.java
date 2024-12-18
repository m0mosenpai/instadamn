package X;

/* renamed from: X.BhF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26128BhF extends C0T6 implements InterfaceC31105Dln {
    public final C26134BhL A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC31105Dln
    public final C26128BhF Et8() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26128BhF) {
                C26128BhF c26128BhF = (C26128BhF) obj;
                if (!C14360o3.A0K(this.A01, c26128BhF.A01) || !C14360o3.A0K(this.A00, c26128BhF.A00) || !C14360o3.A0K(this.A02, c26128BhF.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    public C26128BhF(C26134BhL c26134BhL, String str, String str2) {
        AbstractC167027dH.A13(str, c26134BhL, str2);
        this.A01 = str;
        this.A00 = c26134BhL;
        this.A02 = str2;
    }
}
