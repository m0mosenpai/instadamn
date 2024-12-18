package X;

/* renamed from: X.7fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168557fp extends C0T6 {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C168557fp) {
                C168557fp c168557fp = (C168557fp) obj;
                if (this.A08 != c168557fp.A08 || this.A01 != c168557fp.A01 || !C14360o3.A0K(this.A04, c168557fp.A04) || this.A03 != c168557fp.A03 || this.A07 != c168557fp.A07 || this.A00 != c168557fp.A00 || !C14360o3.A0K(this.A05, c168557fp.A05) || this.A02 != c168557fp.A02 || this.A06 != c168557fp.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = ((i * 31) + this.A01) * 31;
        String str = this.A04;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int A00 = (((i2 + hashCode) * 31) + AbstractC225899y8.A00(this.A03)) * 31;
        int i4 = 1237;
        if (this.A07) {
            i4 = 1231;
        }
        int i5 = (((A00 + i4) * 31) + this.A00) * 31;
        String str2 = this.A05;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int A002 = (((i5 + i3) * 31) + AbstractC225899y8.A00(this.A02)) * 31;
        int i6 = 1237;
        if (this.A06) {
            i6 = 1231;
        }
        return A002 + i6;
    }

    public C168557fp(Integer num, Integer num2, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A08 = z;
        this.A01 = i;
        this.A04 = str;
        this.A03 = num;
        this.A07 = z2;
        this.A00 = i2;
        this.A05 = str2;
        this.A02 = num2;
        this.A06 = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C168557fp() {
        /*
            r10 = this;
            r3 = 0
            r5 = 0
            java.lang.Integer r1 = X.C05F.A00
            r0 = r10
            r2 = r1
            r4 = r3
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168557fp.<init>():void");
    }
}
