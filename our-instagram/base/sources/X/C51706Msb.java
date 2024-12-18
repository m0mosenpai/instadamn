package X;

/* renamed from: X.Msb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51706Msb extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Float A04;
    public final Float A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51706Msb) {
                C51706Msb c51706Msb = (C51706Msb) obj;
                if (this.A06 != c51706Msb.A06 || this.A0A != c51706Msb.A0A || !C14360o3.A0K(this.A07, c51706Msb.A07) || !C14360o3.A0K(this.A04, c51706Msb.A04) || this.A09 != c51706Msb.A09 || this.A03 != c51706Msb.A03 || !C14360o3.A0K(this.A08, c51706Msb.A08) || !C14360o3.A0K(this.A05, c51706Msb.A05) || this.A00 != c51706Msb.A00 || this.A0D != c51706Msb.A0D || this.A02 != c51706Msb.A02 || this.A01 != c51706Msb.A01 || this.A0B != c51706Msb.A0B || this.A0C != c51706Msb.A0C) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        String str3;
        int intValue = this.A06.intValue();
        if (1 != intValue) {
            str = "SQUARE";
        } else {
            str = "PORTRAIT";
        }
        int A0F = AbstractC25228BEl.A0F(str, intValue);
        int intValue2 = this.A0A.intValue();
        switch (intValue2) {
            case 1:
                str2 = "CENTER";
                break;
            case 2:
                str2 = "RIGHT";
                break;
            default:
                str2 = "LEFT";
                break;
        }
        int A0H = (((AbstractC25231BEo.A0H(str2, intValue2, A0F) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
        int intValue3 = this.A09.intValue();
        switch (intValue3) {
            case 1:
                str3 = "FIXED";
                break;
            case 2:
                str3 = "FIXED_RATIO";
                break;
            default:
                str3 = "DEFAULT";
                break;
        }
        return AbstractC166987dD.A0K(this.A0C, AbstractC167007dF.A0D(this.A0B, (((AbstractC167007dF.A0D(this.A0D, (((((((AbstractC25231BEo.A0H(str3, intValue3, A0H) + this.A03) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC166997dE.A0I(this.A05)) * 31) + this.A00) * 31) + this.A02) * 31) + this.A01) * 31));
    }

    public C51706Msb(Float f, Float f2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.A06 = num;
        this.A0A = num2;
        this.A07 = num3;
        this.A04 = f;
        this.A09 = num4;
        this.A03 = i;
        this.A08 = num5;
        this.A05 = f2;
        this.A00 = i2;
        this.A0D = z;
        this.A02 = i3;
        this.A01 = i4;
        this.A0B = z2;
        this.A0C = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51706Msb() {
        /*
            r15 = this;
            r1 = 0
            java.lang.Integer r3 = X.C05F.A01
            java.lang.Integer r6 = X.C05F.A00
            r8 = 6
            r9 = 0
            r0 = r15
            r2 = r1
            r4 = r3
            r5 = r1
            r7 = r1
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51706Msb.<init>():void");
    }
}
