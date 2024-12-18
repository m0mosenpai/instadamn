package X;

/* loaded from: classes5.dex */
public final class CW4 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof CW4)) {
                long j = this.A00;
                CW4 cw4 = (CW4) obj;
                long j2 = cw4.A00;
                long j3 = C1132359l.A01;
                if (j != j2 || this.A04 != cw4.A04 || this.A03 != cw4.A03 || this.A02 != cw4.A02 || this.A01 != cw4.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = C1132359l.A01;
        int A07 = AbstractC167007dF.A07(this.A02, AbstractC167007dF.A07(this.A03, AbstractC167007dF.A07(this.A04, AbstractC25227BEk.A03(j))));
        long j3 = this.A01;
        return A07 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public CW4(long j, long j2, long j3, long j4, long j5) {
        this.A00 = j;
        this.A04 = j2;
        this.A03 = j3;
        this.A02 = j4;
        this.A01 = j5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ContextMenuColors(backgroundColor=");
        A1C.append((Object) C1132359l.A06(this.A00));
        A1C.append(", textColor=");
        A1C.append((Object) C1132359l.A06(this.A04));
        A1C.append(", iconColor=");
        A1C.append((Object) C1132359l.A06(this.A03));
        A1C.append(", disabledTextColor=");
        A1C.append((Object) C1132359l.A06(this.A02));
        A1C.append(", disabledIconColor=");
        return AbstractC167017dG.A0o(C1132359l.A06(this.A01), A1C);
    }
}
