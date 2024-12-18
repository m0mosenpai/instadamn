package X;

/* loaded from: classes5.dex */
public final class BPK extends C0T6 implements InterfaceC30860DhZ {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final boolean A02;
    public final C92584Cs A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BPK) {
                BPK bpk = (BPK) obj;
                if (!C14360o3.A0K(this.A00, bpk.A00) || !C14360o3.A0K(this.A01, bpk.A01) || !C14360o3.A0K(this.A03, bpk.A03) || this.A02 != bpk.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, (AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0M(this.A03)) * 31);
    }

    public BPK(C120985dq c120985dq, C37644Ghd c37644Ghd, C92584Cs c92584Cs, boolean z) {
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A03 = c92584Cs;
        this.A02 = z;
    }
}
