package X;

/* renamed from: X.0tQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17290tQ extends C0T6 implements InterfaceC19680xv {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C17290tQ) {
                C17290tQ c17290tQ = (C17290tQ) obj;
                if (this.A02 != c17290tQ.A02 || this.A03 != c17290tQ.A03 || this.A00 != c17290tQ.A00 || this.A01 != c17290tQ.A01 || !C14360o3.A0K(this.A0B, c17290tQ.A0B) || !C14360o3.A0K(this.A08, c17290tQ.A08) || !C14360o3.A0K(this.A09, c17290tQ.A09) || this.A06 != c17290tQ.A06 || !C14360o3.A0K(this.A0A, c17290tQ.A0A) || !C14360o3.A0K(this.A07, c17290tQ.A07) || this.A04 != c17290tQ.A04 || this.A05 != c17290tQ.A05) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC19680xv
    public final long BLL() {
        return this.A00;
    }

    @Override // X.InterfaceC19680xv
    public final long BLM() {
        return this.A01;
    }

    @Override // X.InterfaceC19680xv
    public final long BLN() {
        return this.A02;
    }

    @Override // X.InterfaceC19680xv
    public final long BLO() {
        return this.A03;
    }

    @Override // X.InterfaceC19680xv
    public final long BLP() {
        return this.A04;
    }

    @Override // X.InterfaceC19680xv
    public final long BLQ() {
        return this.A05;
    }

    @Override // X.InterfaceC19680xv
    public final String BLd() {
        return this.A07;
    }

    @Override // X.InterfaceC19680xv
    public final String BLe() {
        return this.A08;
    }

    @Override // X.InterfaceC19680xv
    public final String BLf() {
        return this.A09;
    }

    @Override // X.InterfaceC19680xv
    public final String BLg() {
        return this.A0A;
    }

    @Override // X.InterfaceC19680xv
    public final String BLh() {
        return this.A0B;
    }

    @Override // X.InterfaceC19680xv
    public final long BLi() {
        return this.A06;
    }

    public final int hashCode() {
        long j = this.A02;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A03;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A00;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.A01;
        int hashCode = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.A0B.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A09.hashCode()) * 31;
        long j5 = this.A06;
        int hashCode2 = (((((hashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.A0A.hashCode()) * 31) + this.A07.hashCode()) * 31;
        long j6 = this.A04;
        int i4 = (hashCode2 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.A05;
        return i4 + ((int) (j7 ^ (j7 >>> 32)));
    }

    public C17290tQ(String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.A02 = j;
        this.A03 = j2;
        this.A00 = j3;
        this.A01 = j4;
        this.A0B = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A06 = j5;
        this.A0A = str4;
        this.A07 = str5;
        this.A04 = j6;
        this.A05 = j7;
    }
}
