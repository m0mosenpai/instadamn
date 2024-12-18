package X;

/* renamed from: X.Jz5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45164Jz5 extends C0T6 implements InterfaceC50391MMt {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C45164Jz5(String str, String str2, String str3, String str4, int i, int i2, boolean z) {
        C14360o3.A0B(str4, 6);
        this.A05 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A06 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45164Jz5) {
                C45164Jz5 c45164Jz5 = (C45164Jz5) obj;
                if (!C14360o3.A0K(this.A05, c45164Jz5.A05) || this.A00 != c45164Jz5.A00 || this.A01 != c45164Jz5.A01 || !C14360o3.A0K(this.A02, c45164Jz5.A02) || !C14360o3.A0K(this.A04, c45164Jz5.A04) || !C14360o3.A0K(this.A03, c45164Jz5.A03) || this.A06 != c45164Jz5.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A02, (((AbstractC166987dD.A0J(this.A05) + this.A00) * 31) + this.A01) * 31))));
    }
}
