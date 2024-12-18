package X;

/* renamed from: X.Beo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26000Beo extends C0T6 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26000Beo) {
                C26000Beo c26000Beo = (C26000Beo) obj;
                if (!C14360o3.A0K(this.A03, c26000Beo.A03) || !C14360o3.A0K(this.A02, c26000Beo.A02) || this.A01 != c26000Beo.A01 || this.A00 != c26000Beo.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A03)) + this.A01) * 31) + this.A00;
    }

    public C26000Beo(String str, String str2, int i, int i2) {
        AbstractC167017dG.A1P(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = i;
        this.A00 = i2;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C57526Pg0(this, 4));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C57526Pg0(this, 5));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C57526Pg0(this, 3));
    }
}
