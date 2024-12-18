package X;

/* renamed from: X.Bet, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26005Bet extends C0T6 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26005Bet) {
                C26005Bet c26005Bet = (C26005Bet) obj;
                long j = this.A00;
                long j2 = c26005Bet.A00;
                long j3 = C1132359l.A01;
                if (j != j2 || this.A01 != c26005Bet.A01 || this.A06 != c26005Bet.A06 || this.A07 != c26005Bet.A07 || this.A03 != c26005Bet.A03 || this.A04 != c26005Bet.A04 || this.A05 != c26005Bet.A05 || this.A02 != c26005Bet.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = C1132359l.A01;
        int A07 = AbstractC167007dF.A07(this.A05, AbstractC167007dF.A07(this.A04, AbstractC167007dF.A07(this.A03, AbstractC167007dF.A07(this.A07, AbstractC167007dF.A07(this.A06, AbstractC167007dF.A07(this.A01, AbstractC25227BEk.A03(j)))))));
        long j3 = this.A02;
        return A07 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C26005Bet(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.A00 = j;
        this.A01 = j2;
        this.A06 = j3;
        this.A07 = j4;
        this.A03 = j5;
        this.A04 = j6;
        this.A05 = j7;
        this.A02 = j8;
    }
}
