package X;

/* loaded from: classes10.dex */
public final class TKJ implements Runnable {
    public final /* synthetic */ AnonymousClass206 A00;

    public TKJ(AnonymousClass206 anonymousClass206) {
        this.A00 = anonymousClass206;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C94464My c94464My = this.A00.A02;
        if (c94464My != null) {
            synchronized (c94464My) {
                c94464My.A04.A01();
            }
        }
    }
}
