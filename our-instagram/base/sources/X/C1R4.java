package X;

/* renamed from: X.1R4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1R4 extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1R4) {
                C1R4 c1r4 = (C1R4) obj;
                if (this.A06 != c1r4.A06 || this.A07 != c1r4.A07 || this.A04 != c1r4.A04 || this.A01 != c1r4.A01 || this.A08 != c1r4.A08 || !C14360o3.A0K(this.A05, c1r4.A05) || this.A09 != c1r4.A09 || this.A00 != c1r4.A00 || this.A0A != c1r4.A0A || this.A02 != c1r4.A02 || this.A03 != c1r4.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C1R4 A02(C1R4 c1r4, Integer num, String str, int i, int i2, int i3, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        long j3 = j2;
        long j4 = j;
        int i4 = i2;
        boolean z6 = z4;
        String str2 = str;
        boolean z7 = z3;
        int i5 = i;
        boolean z8 = z5;
        Integer num2 = num;
        boolean z9 = z2;
        boolean z10 = z;
        if ((i3 & 1) != 0) {
            z10 = c1r4.A06;
        }
        if ((i3 & 2) != 0) {
            z9 = c1r4.A07;
        }
        if ((i3 & 4) != 0) {
            num2 = c1r4.A04;
        }
        if ((i3 & 8) != 0) {
            i5 = c1r4.A01;
        }
        if ((i3 & 16) != 0) {
            z7 = c1r4.A08;
        }
        if ((i3 & 32) != 0) {
            str2 = c1r4.A05;
        }
        if ((i3 & 64) != 0) {
            z6 = c1r4.A09;
        }
        if ((i3 & 128) != 0) {
            i4 = c1r4.A00;
        }
        if ((i3 & 256) != 0) {
            z8 = c1r4.A0A;
        }
        if ((i3 & 512) != 0) {
            j4 = c1r4.A02;
        }
        if ((i3 & 1024) != 0) {
            j3 = c1r4.A03;
        }
        C14360o3.A0B(num2, 2);
        return new C1R4(num2, str2, i5, i4, j4, j3, z10, z9, z7, z6, z8);
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A07) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        Integer num = this.A04;
        int hashCode2 = (((i4 + AbstractC54301NzL.A00(num).hashCode() + num.intValue()) * 31) + this.A01) * 31;
        int i5 = 1237;
        if (this.A08) {
            i5 = 1231;
        }
        int i6 = (hashCode2 + i5) * 31;
        String str = this.A05;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i7 = (i6 + hashCode) * 31;
        int i8 = 1237;
        if (this.A09) {
            i8 = 1231;
        }
        int i9 = (((i7 + i8) * 31) + this.A00) * 31;
        int i10 = 1237;
        if (this.A0A) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        long j = this.A02;
        int i12 = (i11 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A03;
        return i12 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("State(enabled=");
        sb.append(this.A06);
        sb.append(", isAppBackgrounded=");
        sb.append(this.A07);
        sb.append(", requestedMode=");
        Integer num = this.A04;
        if (num != null) {
            str = AbstractC54301NzL.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", requestedModeId=");
        sb.append(this.A01);
        sb.append(", isModeRequestRunning=");
        sb.append(this.A08);
        sb.append(", modeRequestError=");
        sb.append(this.A05);
        sb.append(", isTokenFetchRunning=");
        sb.append(this.A09);
        sb.append(", carrierId=");
        sb.append(this.A00);
        sb.append(", manuallyChanged=");
        sb.append(this.A0A);
        sb.append(", imageBytes=");
        sb.append(this.A02);
        sb.append(", videoBytes=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C1R4(Integer num, String str, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = z;
        this.A07 = z2;
        this.A04 = num;
        this.A01 = i;
        this.A08 = z3;
        this.A05 = str;
        this.A09 = z4;
        this.A00 = i2;
        this.A0A = z5;
        this.A02 = j;
        this.A03 = j2;
    }

    public C1R4() {
        this(C05F.A01, null, 0, 0, 0L, 0L, false, true, false, false, false);
    }
}
