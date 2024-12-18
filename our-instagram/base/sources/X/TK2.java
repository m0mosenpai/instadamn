package X;

/* loaded from: classes10.dex */
public final class TK2 implements Runnable {
    public final /* synthetic */ C64078Syu A00;

    public TK2(C64078Syu c64078Syu) {
        this.A00 = c64078Syu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64078Syu c64078Syu = this.A00;
        c64078Syu.A00.onReleased();
        C62686SMa c62686SMa = c64078Syu.A01;
        if (c62686SMa != null) {
            try {
                c62686SMa.A02.unregisterReceiver(c62686SMa.A01);
            } catch (IllegalArgumentException e) {
                C0K8.A0F("NetworkReachabilityListener", "unregisterReceiver failed", e);
            }
        }
    }
}
