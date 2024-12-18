package X;

/* loaded from: classes12.dex */
public final class YHB implements Runnable {
    public final /* synthetic */ C72186XRw A00;
    public final /* synthetic */ boolean A01;

    public YHB(C72186XRw c72186XRw, boolean z) {
        this.A00 = c72186XRw;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C72186XRw c72186XRw = this.A00;
            int i = 9;
            if (this.A01) {
                i = 3;
            }
            c72186XRw.A00(i);
        } catch (RuntimeException e) {
            C0K8.A0J("PeriodicEventHandler", "Exception happened within maybeLog", e);
        }
    }
}
