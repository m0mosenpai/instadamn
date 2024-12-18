package X;

/* renamed from: X.Mxb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51954Mxb extends C0T6 implements InterfaceC57890Plu {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C51954Mxb(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str4, 4);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51954Mxb) {
                C51954Mxb c51954Mxb = (C51954Mxb) obj;
                if (!C14360o3.A0K(this.A01, c51954Mxb.A01) || !C14360o3.A0K(this.A02, c51954Mxb.A02) || !C14360o3.A0K(this.A00, c51954Mxb.A00) || !C14360o3.A0K(this.A03, c51954Mxb.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, ((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A00)) * 31);
    }
}
