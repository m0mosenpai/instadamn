package X;

/* loaded from: classes10.dex */
public final class TNT implements Runnable {
    public final /* synthetic */ C1UP A00;
    public final /* synthetic */ Throwable A01;

    public TNT(C1UP c1up, Throwable th) {
        this.A00 = c1up;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00 = this.A01;
        throw AbstractC166987dD.A15("onSharedPreferenceChanged");
    }
}
