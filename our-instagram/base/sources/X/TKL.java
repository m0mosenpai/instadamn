package X;

/* loaded from: classes10.dex */
public final class TKL implements Runnable {
    public final /* synthetic */ AnonymousClass206 A00;

    public TKL(AnonymousClass206 anonymousClass206) {
        this.A00 = anonymousClass206;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass206 anonymousClass206 = this.A00;
        anonymousClass206.A04.A01();
        anonymousClass206.A05.A00();
        C20H c20h = anonymousClass206.A0F;
        anonymousClass206.A0F = null;
        if (c20h != null) {
            c20h.stop();
        }
        AnonymousClass206.A02(C4P9.A06, anonymousClass206);
    }
}
