package X;

/* renamed from: X.Jws, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45063Jws extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C45063Jws(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, long j) {
        this.A00 = i4;
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A05 = str4;
        this.A04 = j;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C45063Jws) {
            C45063Jws c45063Jws = (C45063Jws) obj;
            if (c45063Jws.A00 != i || !C14360o3.A0K(this.A07, c45063Jws.A07) || !C14360o3.A0K(this.A06, c45063Jws.A06) || !C14360o3.A0K(this.A08, c45063Jws.A08) || !C14360o3.A0K(this.A05, c45063Jws.A05) || this.A04 != c45063Jws.A04 || this.A01 != c45063Jws.A01 || this.A02 != c45063Jws.A02 || this.A03 != c45063Jws.A03) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((AbstractC25236BEt.A01(this.A04, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0J(this.A07))))) + this.A01) * 31) + this.A02) * 31) + this.A03;
    }
}
