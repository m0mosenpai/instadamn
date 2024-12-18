package X;

import java.util.Random;

/* loaded from: classes10.dex */
public final class SME {
    public int A00;
    public final int A01;
    public final int A02;
    public final Random A03 = new Random();

    public final String toString() {
        return AbstractC58318PtA.A0k("ParameterizedRetryState (%d,%d): multiplier:%d, interval:%d", new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A02), -2, Integer.valueOf(this.A00)});
    }

    public SME(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i;
    }
}
