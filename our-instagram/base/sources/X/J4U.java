package X;

/* loaded from: classes7.dex */
public final class J4U implements Runnable {
    public final /* synthetic */ AnonymousClass758 A00;
    public final /* synthetic */ Throwable A01;

    public J4U(AnonymousClass758 anonymousClass758, Throwable th) {
        this.A00 = anonymousClass758;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass758 anonymousClass758 = this.A00;
        anonymousClass758.A01.A00(C05F.A01);
        AbstractC154286wd abstractC154286wd = anonymousClass758.A00;
        abstractC154286wd.onFail(new C115095Ie(this.A01));
        abstractC154286wd.onFinish();
    }
}
