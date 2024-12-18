package X;

import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class SNV {
    public final C63876SvA A00;
    public final Executor A01;

    public final boolean equals(Object obj) {
        if (obj instanceof SNV) {
            return this.A00.equals(((SNV) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public SNV(C63876SvA c63876SvA, Executor executor) {
        this.A00 = c63876SvA;
        this.A01 = executor;
    }
}
