package X;

/* renamed from: X.GyY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38631GyY extends C0T6 {
    public final EnumC39623HeX A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38631GyY) {
                C38631GyY c38631GyY = (C38631GyY) obj;
                if (this.A00 != c38631GyY.A00 || !C14360o3.A0K(this.A02, c38631GyY.A02) || this.A04 != c38631GyY.A04 || !C14360o3.A0K(this.A03, c38631GyY.A03) || this.A05 != c38631GyY.A05 || this.A06 != c38631GyY.A06 || !C14360o3.A0K(this.A01, c38631GyY.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC167007dF.A0D(this.A04, (AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A02)) * 31)))) + AbstractC166997dE.A0I(this.A01);
    }

    public C38631GyY(EnumC39623HeX enumC39623HeX, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A00 = enumC39623HeX;
        this.A02 = str;
        this.A04 = z;
        this.A03 = str2;
        this.A05 = z2;
        this.A06 = z3;
        this.A01 = num;
    }
}
