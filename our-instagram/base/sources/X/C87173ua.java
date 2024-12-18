package X;

/* renamed from: X.3ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87173ua extends C0T6 {
    public final C87163uZ A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87173ua) {
                C87173ua c87173ua = (C87173ua) obj;
                if (!C14360o3.A0K(this.A01, c87173ua.A01) || this.A07 != c87173ua.A07 || this.A04 != c87173ua.A04 || this.A09 != c87173ua.A09 || this.A0A != c87173ua.A0A || this.A05 != c87173ua.A05 || this.A03 != c87173ua.A03 || this.A08 != c87173ua.A08 || this.A06 != c87173ua.A06 || !C14360o3.A0K(this.A00, c87173ua.A00) || this.A02 != c87173ua.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A09) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0A) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A05) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A03) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A08) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A06) {
            i15 = 1231;
        }
        int hashCode2 = (((i14 + i15) * 31) + this.A00.hashCode()) * 31;
        int i16 = 1237;
        if (this.A02) {
            i16 = 1231;
        }
        return hashCode2 + i16;
    }

    public C87173ua(C87163uZ c87163uZ, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A01 = str;
        this.A07 = z;
        this.A04 = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A05 = z5;
        this.A03 = z6;
        this.A08 = z7;
        this.A06 = z8;
        this.A00 = c87163uZ;
        this.A02 = z9;
    }
}
