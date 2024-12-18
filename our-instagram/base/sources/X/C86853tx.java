package X;

/* renamed from: X.3tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86853tx extends C0T6 {
    public final double A00;
    public final C206209Bd A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final long A05;
    public final InterfaceC104834np A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86853tx) {
                C86853tx c86853tx = (C86853tx) obj;
                if (!C14360o3.A0K(this.A08, c86853tx.A08) || !C14360o3.A0K(this.A07, c86853tx.A07) || !C14360o3.A0K(this.A02, c86853tx.A02) || !C14360o3.A0K(this.A06, c86853tx.A06) || this.A05 != c86853tx.A05 || this.A04 != c86853tx.A04 || Double.compare(this.A00, c86853tx.A00) != 0 || this.A03 != c86853tx.A03 || !C14360o3.A0K(this.A01, c86853tx.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A08.hashCode() * 31;
        String str = this.A07;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.A02;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        InterfaceC104834np interfaceC104834np = this.A06;
        if (interfaceC104834np != null) {
            i = interfaceC104834np.hashCode();
        }
        int i4 = (i3 + i) * 31;
        long j = this.A05;
        int i5 = (i4 + ((int) (j ^ (j >>> 32)))) * 31;
        int i6 = 1237;
        if (this.A04) {
            i6 = 1231;
        }
        int A00 = (((i5 + i6) * 31) + AbstractC28006CWd.A00(this.A00)) * 31;
        int i7 = 1237;
        if (this.A03) {
            i7 = 1231;
        }
        return ((A00 + i7) * 31) + this.A01.hashCode();
    }

    public C86853tx(C206209Bd c206209Bd, InterfaceC104834np interfaceC104834np, String str, String str2, String str3, double d, long j, boolean z, boolean z2) {
        this.A08 = str;
        this.A07 = str2;
        this.A02 = str3;
        this.A06 = interfaceC104834np;
        this.A05 = j;
        this.A04 = z;
        this.A00 = d;
        this.A03 = z2;
        this.A01 = c206209Bd;
    }
}
