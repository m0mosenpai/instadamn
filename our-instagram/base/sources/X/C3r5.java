package X;

import java.io.Closeable;

/* renamed from: X.3r5, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3r5 implements Closeable {
    public C19L A00 = null;
    public boolean A01;

    public final C19L A03() {
        C19L c19l = this.A00;
        if (c19l == null) {
            C19K A02 = AnonymousClass194.A02(new AnonymousClass197(null).plus(C12L.A00.AOT(1473286220, 3)));
            this.A00 = A02;
            return A02;
        }
        return c19l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C19L c19l;
        if (!this.A01 && (c19l = this.A00) != null) {
            AnonymousClass194.A05(null, c19l);
        }
    }

    public void A04(AbstractC61152qd abstractC61152qd, boolean z) {
        this.A00 = AbstractC141776au.A00(abstractC61152qd);
        this.A01 = true;
        abstractC61152qd.addCloseable((Closeable) this);
    }
}
