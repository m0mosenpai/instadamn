package X;

/* renamed from: X.Apx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24292Apx implements Runnable {
    public final /* synthetic */ C214899fR A00;

    public RunnableC24292Apx(C214899fR c214899fR) {
        this.A00 = c214899fR;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1821285w interfaceC1821285w = this.A00.A0D;
        if (interfaceC1821285w == null) {
            C14360o3.A0F("loadingIndicatorController");
            throw C00O.createAndThrow();
        }
        interfaceC1821285w.CMh();
    }
}
