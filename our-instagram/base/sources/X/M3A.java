package X;

/* loaded from: classes8.dex */
public final class M3A implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewOnClickListenerC44797JsK A01;

    public M3A(ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK, int i) {
        this.A01 = viewOnClickListenerC44797JsK;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A0n(this.A00);
    }
}
