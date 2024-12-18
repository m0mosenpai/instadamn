package X;

/* renamed from: X.Mt1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51724Mt1 extends C0T6 {
    public final C51719Msw A00;
    public final C51720Msx A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C51724Mt1() {
        this(new C51719Msw(false, true, false), C51720Msx.A03, "", false, false, false, false, true);
    }

    public static final C51724Mt1 A00(C51719Msw c51719Msw, C51720Msx c51720Msx, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(str, 3);
        AbstractC167017dG.A1T(c51720Msx, c51719Msw);
        return new C51724Mt1(c51719Msw, c51720Msx, str, z, z2, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51724Mt1) {
                C51724Mt1 c51724Mt1 = (C51724Mt1) obj;
                if (this.A06 != c51724Mt1.A06 || this.A04 != c51724Mt1.A04 || this.A05 != c51724Mt1.A05 || !C14360o3.A0K(this.A02, c51724Mt1.A02) || this.A03 != c51724Mt1.A03 || !C14360o3.A0K(this.A01, c51724Mt1.A01) || !C14360o3.A0K(this.A00, c51724Mt1.A00) || this.A07 != c51724Mt1.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A07, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC25225BEi.A08(this.A06))))))));
    }

    public C51724Mt1(C51719Msw c51719Msw, C51720Msx c51720Msx, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A02 = str;
        this.A03 = z4;
        this.A01 = c51720Msx;
        this.A00 = c51719Msw;
        this.A07 = z5;
    }
}
