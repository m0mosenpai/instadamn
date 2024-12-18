package X;

/* renamed from: X.K5w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC45363K5w extends AbstractC25001Kd implements Runnable {
    public final Runnable A00;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.run();
        } catch (Throwable th) {
            setException(th);
            throw th;
        }
    }

    public RunnableC45363K5w(Runnable delegate) {
        delegate.getClass();
        this.A00 = delegate;
    }

    @Override // X.AbstractC25011Ke
    public final String A07() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("task=[");
        A1C.append(this.A00);
        return AbstractC166997dE.A0x("]", A1C);
    }
}
