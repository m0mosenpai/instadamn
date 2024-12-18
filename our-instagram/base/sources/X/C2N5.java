package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2N5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2N5 {
    public final long A00;
    public final C2LA A01;
    public final InterfaceC49022Mv A02;
    public final Object A03;
    public final Map A04;

    public C2N5(C2LA c2la, InterfaceC49022Mv interfaceC49022Mv) {
        C14360o3.A0B(c2la, 1);
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.A01 = c2la;
        this.A02 = interfaceC49022Mv;
        this.A00 = millis;
        this.A03 = new Object();
        this.A04 = new LinkedHashMap();
    }

    public final void A00(C1113750b c1113750b) {
        Runnable runnable;
        C14360o3.A0B(c1113750b, 0);
        synchronized (this.A03) {
            runnable = (Runnable) this.A04.remove(c1113750b);
        }
        if (runnable != null) {
            ((C2L9) this.A01).A00.removeCallbacks(runnable);
        }
    }

    public final void A01(final C1113750b c1113750b) {
        C14360o3.A0B(c1113750b, 0);
        Runnable runnable = new Runnable() { // from class: X.50c
            @Override // java.lang.Runnable
            public final void run() {
                C2N5 c2n5 = this;
                c2n5.A02.Eor(c1113750b, 3);
            }
        };
        synchronized (this.A03) {
            this.A04.put(c1113750b, runnable);
        }
        C2LA c2la = this.A01;
        ((C2L9) c2la).A00.postDelayed(runnable, this.A00);
    }
}
