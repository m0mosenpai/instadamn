package X;

/* renamed from: X.4Za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97404Za extends C0T6 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final C206259Bi A03;
    public final C4ZY A04;
    public final EnumC79303gb A05;
    public final EnumC74373Vt A06;
    public final Float A07;
    public final Integer A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final C75113Zb A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C97404Za) {
                C97404Za c97404Za = (C97404Za) obj;
                if (this.A01 != c97404Za.A01 || this.A0C != c97404Za.A0C || !C14360o3.A0K(this.A07, c97404Za.A07) || this.A09 != c97404Za.A09 || !C14360o3.A0K(this.A08, c97404Za.A08) || this.A04 != c97404Za.A04 || Float.compare(this.A00, c97404Za.A00) != 0 || this.A0B != c97404Za.A0B || this.A0A != c97404Za.A0A || this.A02 != c97404Za.A02 || this.A06 != c97404Za.A06 || this.A05 != c97404Za.A05 || !C14360o3.A0K(this.A03, c97404Za.A03) || !C14360o3.A0K(this.A0D, c97404Za.A0D)) {
                }
            }
            return false;
        }
        return true;
    }

    public C97404Za(C206259Bi c206259Bi, C75113Zb c75113Zb, C4ZY c4zy, EnumC79303gb enumC79303gb, EnumC74373Vt enumC74373Vt, Float f, Integer num, float f2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(enumC74373Vt, 11);
        C14360o3.A0B(enumC79303gb, 12);
        this.A01 = i;
        this.A0C = z;
        this.A07 = f;
        this.A09 = z2;
        this.A08 = num;
        this.A04 = c4zy;
        this.A00 = f2;
        this.A0B = z3;
        this.A0A = z4;
        this.A02 = i2;
        this.A06 = enumC74373Vt;
        this.A05 = enumC79303gb;
        this.A03 = c206259Bi;
        this.A0D = c75113Zb;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.A01 * 31;
        int i2 = 1237;
        if (this.A0C) {
            i2 = 1231;
        }
        int i3 = (i + i2) * 31;
        Float f = this.A07;
        int i4 = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        int i6 = 1237;
        if (this.A09) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        Integer num = this.A08;
        if (num != null) {
            i4 = num.hashCode();
        }
        int hashCode2 = (((((i7 + i4) * 31) + this.A04.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31;
        int i8 = 1237;
        if (this.A0B) {
            i8 = 1231;
        }
        int i9 = (hashCode2 + i8) * 31;
        int i10 = 1237;
        if (this.A0A) {
            i10 = 1231;
        }
        return ((((((((((i9 + i10) * 31) + this.A02) * 31) + this.A06.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A0D.hashCode();
    }
}
