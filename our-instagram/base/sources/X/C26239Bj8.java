package X;

/* renamed from: X.Bj8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26239Bj8 extends C0T6 implements InterfaceC31098Dlg {
    public final String A00;
    public final String A01;
    public final InterfaceC16820sZ A02;

    public C26239Bj8(String str, String str2, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 2);
        this.A00 = str;
        this.A02 = interfaceC16820sZ;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26239Bj8) {
                C26239Bj8 c26239Bj8 = (C26239Bj8) obj;
                if (!C14360o3.A0K(this.A00, c26239Bj8.A00) || !C14360o3.A0K(this.A02, c26239Bj8.A02) || !C14360o3.A0K(this.A01, c26239Bj8.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A00)) + AbstractC167017dG.A0O(this.A01);
    }
}
