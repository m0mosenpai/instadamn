package X;

/* renamed from: X.7iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170417iu extends C0T6 {
    public static final C170417iu A0D = new C170417iu(null, null, null, null, 2.0f, 0, 0, false, false, false, false, false, false);
    public final float A00;
    public final int A01;
    public final int A02;
    public final C2V3 A03;
    public final C170937jk A04;
    public final Boolean A05;
    public final Integer A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C170417iu) {
                C170417iu c170417iu = (C170417iu) obj;
                if (!C14360o3.A0K(this.A03, c170417iu.A03) || this.A09 != c170417iu.A09 || this.A07 != c170417iu.A07 || this.A0B != c170417iu.A0B || this.A0A != c170417iu.A0A || this.A01 != c170417iu.A01 || !C14360o3.A0K(this.A04, c170417iu.A04) || !C14360o3.A0K(this.A06, c170417iu.A06) || this.A08 != c170417iu.A08 || Float.compare(this.A00, c170417iu.A00) != 0 || !C14360o3.A0K(this.A05, c170417iu.A05) || this.A0C != c170417iu.A0C || this.A02 != c170417iu.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        C2V3 c2v3 = this.A03;
        int i = 0;
        if (c2v3 == null) {
            hashCode = 0;
        } else {
            hashCode = c2v3.hashCode();
        }
        int i2 = hashCode * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31 * 31;
        int i5 = 1237;
        if (this.A07) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0B) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0A) {
            i9 = 1231;
        }
        int i10 = (((i8 + i9) * 31) + this.A01) * 31;
        C170937jk c170937jk = this.A04;
        if (c170937jk == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c170937jk.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.A06;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        int i13 = 1237;
        if (this.A08) {
            i13 = 1231;
        }
        int floatToIntBits = (((i12 + i13) * 31 * 31) + Float.floatToIntBits(this.A00)) * 31;
        Boolean bool = this.A05;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i14 = (floatToIntBits + i) * 31;
        int i15 = 1237;
        if (this.A0C) {
            i15 = 1231;
        }
        return ((i14 + i15) * 31) + this.A02;
    }

    public C170417iu(C2V3 c2v3, C170937jk c170937jk, Boolean bool, Integer num, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = c2v3;
        this.A09 = z;
        this.A07 = z2;
        this.A0B = z3;
        this.A0A = z4;
        this.A01 = i;
        this.A04 = c170937jk;
        this.A06 = num;
        this.A08 = z5;
        this.A00 = f;
        this.A05 = bool;
        this.A0C = z6;
        this.A02 = i2;
        if (num != null && num.intValue() <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Estimated viewport count must be > 0: ");
            sb.append(num);
            throw new IllegalArgumentException(sb.toString());
        }
        if (f >= 0.0f) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0N("range ratio has to be bigger or equal to 0: ", f));
        }
    }

    public C170417iu() {
        this(null, null, null, null, 2.0f, 0, 0, false, false, false, false, false, false);
    }
}
