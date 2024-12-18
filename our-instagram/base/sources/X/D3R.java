package X;

/* loaded from: classes5.dex */
public final class D3R extends RuntimeException {
    public final transient C12W A00;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.A00.toString();
    }

    public D3R(C12W c12w) {
        this.A00 = c12w;
    }
}
