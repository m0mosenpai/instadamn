package X;

/* loaded from: classes6.dex */
public final class GM4 implements Runnable {
    public final /* synthetic */ C35229FgM A00;

    public GM4(C35229FgM c35229FgM) {
        this.A00 = c35229FgM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34571FLg c34571FLg = this.A00.A01;
        c34571FLg.A02.post(new GKV(c34571FLg));
    }
}
