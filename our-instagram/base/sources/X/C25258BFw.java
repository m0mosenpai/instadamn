package X;

/* renamed from: X.BFw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25258BFw extends C0T6 {
    public final Double A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final C5Hc A04;
    public final InterfaceC65696TsI A05;
    public final boolean A06;

    public C25258BFw(Double d, String str, String str2, String str3, C5Hc c5Hc, InterfaceC65696TsI interfaceC65696TsI, boolean z) {
        C14360o3.A0B(interfaceC65696TsI, 6);
        this.A01 = str;
        this.A03 = str2;
        this.A04 = c5Hc;
        this.A02 = str3;
        this.A00 = d;
        this.A05 = interfaceC65696TsI;
        this.A06 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25258BFw) {
                C25258BFw c25258BFw = (C25258BFw) obj;
                if (!C14360o3.A0K(this.A01, c25258BFw.A01) || !C14360o3.A0K(this.A03, c25258BFw.A03) || !C14360o3.A0K(this.A04, c25258BFw.A04) || !C14360o3.A0K(this.A02, c25258BFw.A02) || !C14360o3.A0K(this.A00, c25258BFw.A00) || !C14360o3.A0K(this.A05, c25258BFw.A05) || this.A06 != c25258BFw.A06) {
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
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.A03;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode4 = (((i2 + hashCode2) * 31) + this.A04.hashCode()) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (hashCode4 + hashCode3) * 31;
        Double d = this.A00;
        if (d != null) {
            i = d.hashCode();
        }
        int hashCode5 = (((i3 + i) * 31) + this.A05.hashCode()) * 31;
        int i4 = 1237;
        if (this.A06) {
            i4 = 1231;
        }
        return hashCode5 + i4;
    }
}
