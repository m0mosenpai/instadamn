package X;

import java.util.Random;

/* loaded from: classes10.dex */
public final class T1X implements InterfaceC65546TmL {
    public int A00;
    public final int A02;
    public final int A03;
    public final Random A04 = new Random();
    public int A01 = 0;

    @Override // X.InterfaceC65546TmL
    public final EnumC61093Rf7 C2X() {
        return EnumC61093Rf7.BACK_OFF;
    }

    @Override // X.InterfaceC65546TmL
    public final boolean CLP(boolean z) {
        return AbstractC167007dF.A1Q(this.A01, Integer.MAX_VALUE);
    }

    @Override // X.InterfaceC65546TmL
    public final int Csp(boolean z) {
        int i;
        this.A01++;
        int i2 = this.A00;
        if (!z && i2 < (i = this.A02)) {
            i2 = i;
        }
        int nextFloat = (int) ((this.A04.nextFloat() + 0.5d) * Math.min(i2 * 2, this.A03));
        this.A00 = nextFloat;
        return nextFloat;
    }

    public final String toString() {
        return AbstractC58318PtA.A0k("BackoffRetryStrategy: attempt:%d/Infinite, delay:%d seconds", AbstractC25228BEl.A1Z(Integer.valueOf(this.A01), this.A00));
    }

    public T1X(int i, int i2, int i3) {
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i;
    }
}
