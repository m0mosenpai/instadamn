package X;

/* renamed from: X.7bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166077bb extends C0T6 {
    public final int A00;
    public final int A01;
    public final EnumC166067ba A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C166077bb(EnumC166067ba enumC166067ba, Integer num, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A06 = str2;
        this.A03 = num;
        this.A02 = enumC166067ba;
        this.A08 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = str3;
        this.A07 = z2;
        this.A09 = z3;
        this.A0A = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166077bb) {
                C166077bb c166077bb = (C166077bb) obj;
                if (!C14360o3.A0K(this.A04, c166077bb.A04) || !C14360o3.A0K(this.A06, c166077bb.A06) || this.A03 != c166077bb.A03 || this.A02 != c166077bb.A02 || this.A08 != c166077bb.A08 || this.A01 != c166077bb.A01 || this.A00 != c166077bb.A00 || !C14360o3.A0K(this.A05, c166077bb.A05) || this.A07 != c166077bb.A07 || this.A09 != c166077bb.A09 || this.A0A != c166077bb.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A04.hashCode() * 31;
        String str = this.A06;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        Integer num = this.A03;
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + AbstractC166107be.A01(num).hashCode() + num.intValue()) * 31) + this.A02.hashCode()) * 31;
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        int i3 = (((((hashCode3 + i2) * 31) + this.A01) * 31) + this.A00) * 31;
        String str2 = this.A05;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i4 = (i3 + i) * 31;
        int i5 = 1237;
        if (this.A07) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A09) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0A) {
            i9 = 1231;
        }
        return i8 + i9;
    }
}
