package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class TMk implements Runnable {
    public final C2WP A00;
    public final C62942SYk A01;

    @Override // java.lang.Runnable
    public final void run() {
        C62942SYk c62942SYk = this.A01;
        synchronized (c62942SYk.A01) {
            Map map = c62942SYk.A03;
            C2WP c2wp = this.A00;
            if (((TMk) map.remove(c2wp)) != null) {
                InterfaceC65193Tfb interfaceC65193Tfb = (InterfaceC65193Tfb) c62942SYk.A02.remove(c2wp);
                if (interfaceC65193Tfb != null) {
                    C63651SrH c63651SrH = (C63651SrH) interfaceC65193Tfb;
                    C48442Kl.A00();
                    c63651SrH.A0A.execute(new TJI(c63651SrH));
                }
            } else {
                C48442Kl.A00();
                String.format("Timer with %s is already marked as complete.", c2wp);
            }
        }
    }

    public TMk(C2WP workTimer, C62942SYk id) {
        this.A01 = id;
        this.A00 = workTimer;
    }
}
