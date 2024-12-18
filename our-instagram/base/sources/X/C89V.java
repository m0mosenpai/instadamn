package X;

import java.io.Closeable;

/* renamed from: X.89V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89V implements Closeable, InterfaceC09670ek {
    public boolean A00;
    public final C152406tQ A01;
    public final String A02;

    public final void A00(C07T c07t, C08U c08u) {
        if (!this.A00) {
            this.A00 = true;
            c07t.A09(this);
            c08u.A03(this.A01.A00, this.A02);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        C14360o3.A0B(c07x, 0);
        C14360o3.A0B(c07r, 1);
        if (c07r == C07R.ON_DESTROY) {
            this.A00 = false;
            c07x.getLifecycle().A0A(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C89V(C152406tQ c152406tQ, String str) {
        this.A02 = str;
        this.A01 = c152406tQ;
    }
}
