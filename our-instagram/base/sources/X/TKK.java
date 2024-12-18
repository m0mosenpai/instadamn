package X;

/* loaded from: classes10.dex */
public final class TKK implements Runnable {
    public final /* synthetic */ AnonymousClass206 A00;

    public TKK(AnonymousClass206 anonymousClass206) {
        this.A00 = anonymousClass206;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass206 anonymousClass206 = this.A00;
        if (anonymousClass206.A0F == null) {
            AnonymousClass206.A01(null, anonymousClass206, C05F.A0N);
        }
        C20H c20h = anonymousClass206.A0F;
        if (c20h != null) {
            c20h.kickOffConnection();
        }
    }
}
