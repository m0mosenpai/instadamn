package X;

/* renamed from: X.Tu7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65789Tu7 extends C0T6 {
    public final int A00;
    public final C38688GzT A01;
    public final EnumC39597He7 A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C65789Tu7(C38688GzT c38688GzT, EnumC39597He7 enumC39597He7, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(enumC39597He7, 3);
        this.A00 = i;
        this.A08 = z;
        this.A02 = enumC39597He7;
        this.A03 = str;
        this.A04 = z2;
        this.A05 = z3;
        this.A06 = z4;
        this.A07 = z5;
        this.A01 = c38688GzT;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C65789Tu7) {
                C65789Tu7 c65789Tu7 = (C65789Tu7) obj;
                if (this.A00 != c65789Tu7.A00 || this.A08 != c65789Tu7.A08 || this.A02 != c65789Tu7.A02 || !C14360o3.A0K(this.A03, c65789Tu7.A03) || this.A04 != c65789Tu7.A04 || this.A05 != c65789Tu7.A05 || this.A06 != c65789Tu7.A06 || this.A07 != c65789Tu7.A07 || !C14360o3.A0K(this.A01, c65789Tu7.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, (AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A08, this.A00 * 31)) + AbstractC167017dG.A0O(this.A03)) * 31)))) + this.A01.hashCode();
    }
}
