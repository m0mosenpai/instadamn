package X;

/* renamed from: X.Bh1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26117Bh1 extends C0T6 implements InterfaceC31082DlQ {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26117Bh1) {
                C26117Bh1 c26117Bh1 = (C26117Bh1) obj;
                if (!C14360o3.A0K(this.A02, c26117Bh1.A02) || !C14360o3.A0K(this.A00, c26117Bh1.A00) || !C14360o3.A0K(this.A01, c26117Bh1.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A02)));
    }

    public C26117Bh1(String str, String str2, String str3) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
