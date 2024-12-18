package X;

/* renamed from: X.12Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C12Q extends C12R {
    public static final C12Q A00 = new C12Q();

    @Override // X.C12T
    public final String toString() {
        return "Dispatchers.Default";
    }

    public C12Q() {
        this.A00 = new ExecutorC213312l(AbstractC212912g.A01, AbstractC212912g.A02, AbstractC212912g.A05, AbstractC212912g.A03);
    }

    @Override // X.C12R, X.C12S, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // X.C12T
    public final C12T A03(int i) {
        AbstractC214112t.A00(i);
        if (i >= AbstractC212912g.A01) {
            return this;
        }
        AbstractC214112t.A00(i);
        return new C214212u(this, i);
    }
}
