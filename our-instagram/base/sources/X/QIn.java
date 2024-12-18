package X;

/* loaded from: classes10.dex */
public final class QIn extends C0T6 {
    public final long A00;
    public final long A01;
    public final C25548BRk A02;
    public final C25548BRk A03;
    public final C25548BRk A04;
    public final C38627GyU A05;
    public final C38627GyU A06;
    public final C38627GyU A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QIn) {
                QIn qIn = (QIn) obj;
                if (this.A00 != qIn.A00 || this.A01 != qIn.A01 || !C14360o3.A0K(this.A02, qIn.A02) || !C14360o3.A0K(this.A03, qIn.A03) || !C14360o3.A0K(this.A04, qIn.A04) || !C14360o3.A0K(this.A05, qIn.A05) || !C14360o3.A0K(this.A06, qIn.A06) || !C14360o3.A0K(this.A07, qIn.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return AbstractC166987dD.A0I(this.A07, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A07(this.A01, ((int) (j ^ (j >>> 32))) * 31)))))));
    }

    public QIn(C25548BRk c25548BRk, C25548BRk c25548BRk2, C25548BRk c25548BRk3, C38627GyU c38627GyU, C38627GyU c38627GyU2, C38627GyU c38627GyU3, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = c25548BRk;
        this.A03 = c25548BRk2;
        this.A04 = c25548BRk3;
        this.A05 = c38627GyU;
        this.A06 = c38627GyU2;
        this.A07 = c38627GyU3;
    }
}
