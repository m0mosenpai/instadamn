package X;

import java.util.Arrays;

/* renamed from: X.9ZN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZN extends C0T6 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final byte[] A0A;

    public C9ZN(Integer num, Integer num2, Integer num3, String str, String str2, String str3, byte[] bArr, int i, long j, long j2, boolean z) {
        C14360o3.A0B(str, 3);
        AbstractC167007dF.A1I(str2, 4, str3);
        this.A02 = j;
        this.A01 = j2;
        this.A06 = str;
        this.A08 = str2;
        this.A0A = bArr;
        this.A09 = z;
        this.A00 = i;
        this.A07 = str3;
        this.A05 = num;
        this.A03 = num2;
        this.A04 = num3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZN) {
                C9ZN c9zn = (C9ZN) obj;
                if (this.A02 != c9zn.A02 || this.A01 != c9zn.A01 || !C14360o3.A0K(this.A06, c9zn.A06) || !C14360o3.A0K(this.A08, c9zn.A08) || !C14360o3.A0K(this.A0A, c9zn.A0A) || this.A09 != c9zn.A09 || this.A00 != c9zn.A00 || !C14360o3.A0K(this.A07, c9zn.A07) || !C14360o3.A0K(this.A05, c9zn.A05) || !C14360o3.A0K(this.A03, c9zn.A03) || !C14360o3.A0K(this.A04, c9zn.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A02;
        int A0K = AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A06, AbstractC167007dF.A07(this.A01, ((int) (j ^ (j >>> 32))) * 31)));
        byte[] bArr = this.A0A;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        return ((((AbstractC166997dE.A0K(this.A07, (AbstractC167007dF.A0D(this.A09, (A0K + hashCode) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04);
    }
}
