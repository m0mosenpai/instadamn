package X;

/* renamed from: X.Muk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51780Muk extends C0T6 implements InterfaceC58220PrQ {
    public final String A00;
    public final String A01;

    public C51780Muk(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51780Muk) {
                C51780Muk c51780Muk = (C51780Muk) obj;
                if (!C14360o3.A0K(this.A00, c51780Muk.A00) || !C14360o3.A0K(this.A01, c51780Muk.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A01);
    }
}
