package X;

/* renamed from: X.CVe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27982CVe {
    public final int A00;
    public final long A01;
    public final BIZ A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27982CVe) {
                C27982CVe c27982CVe = (C27982CVe) obj;
                if (this.A02 != c27982CVe.A02 || this.A00 != c27982CVe.A00 || this.A01 != c27982CVe.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A02) + this.A00) * 31) + AbstractC25228BEl.A03(this.A01);
    }

    public C27982CVe(BIZ biz, int i, long j) {
        this.A02 = biz;
        this.A00 = i;
        this.A01 = j;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AnchorInfo(direction=");
        A1C.append(this.A02);
        A1C.append(", offset=");
        A1C.append(this.A00);
        A1C.append(", selectableId=");
        A1C.append(this.A01);
        return AbstractC167017dG.A0p(A1C);
    }
}
