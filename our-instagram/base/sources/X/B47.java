package X;

import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class B47 implements C19D {
    public final Future A00;

    @Override // X.C19D
    public final void dispose() {
        this.A00.cancel(false);
    }

    public B47(Future future) {
        this.A00 = future;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DisposableFutureHandle[");
        A1C.append(this.A00);
        A1C.append(']');
        return A1C.toString();
    }
}
