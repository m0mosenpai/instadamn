package X;

import java.util.Map;

/* renamed from: X.SYk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62942SYk {
    public final C2LA A00;
    public final Map A03 = AbstractC166987dD.A1G();
    public final Map A02 = AbstractC166987dD.A1G();
    public final Object A01 = AbstractC58318PtA.A0b();

    static {
        C48442Kl.A01("WorkTimer");
    }

    public final void A00(final C2WP id) {
        synchronized (this.A01) {
            if (((TMk) this.A03.remove(id)) != null) {
                C48442Kl.A00();
                this.A02.remove(id);
            }
        }
    }

    public C62942SYk(C2LA scheduler) {
        this.A00 = scheduler;
    }
}
