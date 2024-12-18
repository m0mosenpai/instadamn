package X;

/* renamed from: X.0NB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0NB extends Exception {
    public boolean A00 = true;

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        if (this.A00) {
            super.fillInStackTrace();
        }
        return this;
    }
}
