package X;

/* renamed from: X.MxR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51944MxR extends C0T6 implements InterfaceC57885Plp {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51944MxR) {
                C51944MxR c51944MxR = (C51944MxR) obj;
                if (!C14360o3.A0K(this.A01, c51944MxR.A01) || !C14360o3.A0K(this.A00, c51944MxR.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C51944MxR(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
