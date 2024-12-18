package X;

/* loaded from: classes7.dex */
public final class H6Y extends C0T6 implements InterfaceC31094Dlc {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6Y) {
                H6Y h6y = (H6Y) obj;
                if (!C14360o3.A0K(this.A00, h6y.A00) || !C14360o3.A0K(this.A01, h6y.A01) || !C14360o3.A0K(this.A02, h6y.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00)));
    }

    public H6Y(String str, String str2, String str3) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
