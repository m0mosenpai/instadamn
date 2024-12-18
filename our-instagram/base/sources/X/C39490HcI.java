package X;

/* renamed from: X.HcI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39490HcI extends AbstractC39675Hj7 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39490HcI) {
                C39490HcI c39490HcI = (C39490HcI) obj;
                if (!C14360o3.A0K(this.A02, c39490HcI.A02) || !C14360o3.A0K(this.A01, c39490HcI.A01) || !C14360o3.A0K(this.A00, c39490HcI.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A02)));
    }

    public C39490HcI(String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }
}
