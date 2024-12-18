package X;

/* loaded from: classes10.dex */
public final class T1W implements InterfaceC65546TmL {
    public int A00 = 0;
    public final int A01;
    public final int A02;
    public final int A03;

    @Override // X.InterfaceC65546TmL
    public final boolean CLP(boolean z) {
        int i;
        int i2 = this.A00;
        if (z) {
            i = this.A01;
        } else {
            i = this.A02;
        }
        return i2 < i;
    }

    @Override // X.InterfaceC65546TmL
    public final EnumC61093Rf7 C2X() {
        return EnumC61093Rf7.BACK_TO_BACK;
    }

    public final String toString() {
        return AbstractC58318PtA.A0k("BackToBackRetryStrategy: attempt:%d/%d/%d, delay:%d seconds", new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03)});
    }

    public T1W(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    @Override // X.InterfaceC65546TmL
    public final int Csp(boolean z) {
        if (CLP(z)) {
            this.A00++;
            return this.A03;
        }
        return -1;
    }
}
