package X;

/* renamed from: X.Gnj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37998Gnj implements Runnable {
    public final /* synthetic */ InterfaceC74303Vl A00;
    public final /* synthetic */ AnonymousClass758 A01;
    public final /* synthetic */ AnonymousClass435 A02;

    public RunnableC37998Gnj(InterfaceC74303Vl interfaceC74303Vl, AnonymousClass758 anonymousClass758, AnonymousClass435 anonymousClass435) {
        this.A01 = anonymousClass758;
        this.A00 = interfaceC74303Vl;
        this.A02 = anonymousClass435;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass758 anonymousClass758 = this.A01;
        C154806xV c154806xV = anonymousClass758.A01;
        InterfaceC74303Vl interfaceC74303Vl = this.A00;
        c154806xV.A07 = interfaceC74303Vl.getNextMaxId();
        c154806xV.A0A = interfaceC74303Vl.CQG();
        AbstractC154286wd abstractC154286wd = anonymousClass758.A00;
        abstractC154286wd.onSuccess(interfaceC74303Vl);
        if (this.A02.A00.isFinal) {
            c154806xV.A00(C05F.A0C);
            abstractC154286wd.onFinish();
        }
    }
}
