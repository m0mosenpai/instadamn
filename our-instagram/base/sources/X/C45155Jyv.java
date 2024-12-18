package X;

/* renamed from: X.Jyv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45155Jyv extends C0T6 implements InterfaceC50388MMq {
    public final String A00;
    public final String A01;
    public final String A02;

    public C45155Jyv(String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45155Jyv) {
                C45155Jyv c45155Jyv = (C45155Jyv) obj;
                if (!C14360o3.A0K(this.A02, c45155Jyv.A02) || !C14360o3.A0K(this.A00, c45155Jyv.A00) || !C14360o3.A0K(this.A01, c45155Jyv.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A01);
    }
}
