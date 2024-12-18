package X;

import android.os.SystemClock;
import java.util.EnumSet;

/* loaded from: classes10.dex */
public final class TL3 implements Runnable {
    public final /* synthetic */ C63364SiN A00;

    public TL3(C63364SiN c63364SiN) {
        this.A00 = c63364SiN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63364SiN c63364SiN = this.A00;
        EnumSet enumSet = C63364SiN.A0c;
        try {
            if (c63364SiN.A0Y == C05F.A0C) {
                C63293Sgt c63293Sgt = c63364SiN.A0E;
                synchronized (c63293Sgt) {
                    C63293Sgt.A02(c63293Sgt, new C62671SLj(new C63146Sds(EnumC61172RgY.PINGREQ), null, null), c63293Sgt.A01);
                }
                c63364SiN.A0U = SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            C63364SiN.A03(c63364SiN, EnumC61139Rft.PING, RhR.A00(th), th);
        }
    }
}
