package X;

/* renamed from: X.Mr4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51611Mr4 extends C0T6 {
    public final int A00;
    public final int A01;
    public final EnumC53134Nen A02;
    public final EnumC53105NeI A03;
    public final boolean A04;

    public C51611Mr4(EnumC53134Nen enumC53134Nen, EnumC53105NeI enumC53105NeI, int i, int i2, boolean z) {
        C14360o3.A0B(enumC53134Nen, 3);
        this.A00 = i;
        this.A03 = enumC53105NeI;
        this.A02 = enumC53134Nen;
        this.A04 = z;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51611Mr4) {
                C51611Mr4 c51611Mr4 = (C51611Mr4) obj;
                if (this.A00 != c51611Mr4.A00 || this.A03 != c51611Mr4.A03 || this.A02 != c51611Mr4.A02 || this.A04 != c51611Mr4.A04 || this.A01 != c51611Mr4.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A02, ((this.A00 * 31) + AbstractC167017dG.A0M(this.A03)) * 31)) + this.A01;
    }
}
