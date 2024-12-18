package X;

/* renamed from: X.Mrb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51644Mrb extends C0T6 {
    public final float A00;
    public final C51606Mqy A01;
    public final C51606Mqy A02;
    public final C51606Mqy A03;
    public final C51606Mqy A04;
    public final C51606Mqy A05;
    public final C51606Mqy A06;
    public final Integer A07;
    public final Integer A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51644Mrb) {
                C51644Mrb c51644Mrb = (C51644Mrb) obj;
                if (!C14360o3.A0K(this.A07, c51644Mrb.A07) || !C14360o3.A0K(this.A08, c51644Mrb.A08) || this.A0B != c51644Mrb.A0B || this.A09 != c51644Mrb.A09 || this.A0A != c51644Mrb.A0A || !C14360o3.A0K(this.A05, c51644Mrb.A05) || !C14360o3.A0K(this.A06, c51644Mrb.A06) || !C14360o3.A0K(this.A04, c51644Mrb.A04) || !C14360o3.A0K(this.A03, c51644Mrb.A03) || !C14360o3.A0K(this.A01, c51644Mrb.A01) || !C14360o3.A0K(this.A02, c51644Mrb.A02) || Float.compare(this.A00, c51644Mrb.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A05, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0B, ((AbstractC167017dG.A0M(this.A07) * 31) + AbstractC166997dE.A0I(this.A08)) * 31))))))))) + Float.floatToIntBits(this.A00);
    }

    public C51644Mrb(C51606Mqy c51606Mqy, C51606Mqy c51606Mqy2, C51606Mqy c51606Mqy3, C51606Mqy c51606Mqy4, C51606Mqy c51606Mqy5, C51606Mqy c51606Mqy6, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3) {
        this.A07 = num;
        this.A08 = num2;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A05 = c51606Mqy;
        this.A06 = c51606Mqy2;
        this.A04 = c51606Mqy3;
        this.A03 = c51606Mqy4;
        this.A01 = c51606Mqy5;
        this.A02 = c51606Mqy6;
        this.A00 = f;
    }
}
