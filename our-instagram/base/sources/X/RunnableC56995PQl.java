package X;

/* renamed from: X.PQl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56995PQl implements Runnable {
    public final /* synthetic */ NMV A00;
    public final /* synthetic */ String A01;

    public RunnableC56995PQl(NMV nmv, String str) {
        this.A00 = nmv;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NMV nmv = this.A00;
        C6WQ c6wq = nmv.A01;
        if (c6wq == null) {
            C14360o3.A0F("coverFrameExtractionProgressDialog");
            throw C00O.createAndThrow();
        }
        c6wq.dismiss();
        nmv.A02 = false;
        InterfaceC09390do interfaceC09390do = nmv.A0D;
        MSW.A0b(interfaceC09390do).ESH(this.A01);
        if (nmv.A03) {
            nmv.A03 = false;
            if (nmv.isResumed()) {
                OPI.A00(nmv, interfaceC09390do);
            }
        }
    }
}
