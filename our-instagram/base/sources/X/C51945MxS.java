package X;

/* renamed from: X.MxS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51945MxS extends C0T6 implements InterfaceC57885Plp {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51945MxS) {
                C51945MxS c51945MxS = (C51945MxS) obj;
                if (!C14360o3.A0K(this.A00, c51945MxS.A00) || !C14360o3.A0K(this.A02, c51945MxS.A02) || !C14360o3.A0K(this.A01, c51945MxS.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A00)));
    }

    public C51945MxS(String str, String str2, String str3) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
