package X;

/* renamed from: X.GyB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38608GyB extends C0T6 {
    public final long A00;
    public final C38621GyO A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38608GyB) {
                C38608GyB c38608GyB = (C38608GyB) obj;
                if (this.A00 != c38608GyB.A00 || !C14360o3.A0K(this.A01, c38608GyB.A01) || this.A02 != c38608GyB.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, (AbstractC25235BEs.A03(this.A00) + AbstractC167017dG.A0M(this.A01)) * 31);
    }

    public C38608GyB(C38621GyO c38621GyO, long j, boolean z) {
        this.A00 = j;
        this.A01 = c38621GyO;
        this.A02 = z;
    }
}
