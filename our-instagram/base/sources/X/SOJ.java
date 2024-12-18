package X;

import android.os.SystemClock;
import java.util.EnumSet;

/* loaded from: classes10.dex */
public final class SOJ {
    public final /* synthetic */ C63364SiN A00;

    public SOJ(C63364SiN c63364SiN) {
        this.A00 = c63364SiN;
    }

    public final void A00() {
        C63364SiN c63364SiN = this.A00;
        EnumSet enumSet = C63364SiN.A0c;
        synchronized (c63364SiN) {
            c63364SiN.notifyAll();
        }
    }

    public final void A01(String str, String str2) {
        C63364SiN c63364SiN = this.A00;
        EnumSet enumSet = C63364SiN.A0c;
        c63364SiN.A0T = SystemClock.elapsedRealtime();
        c63364SiN.A0A.A02(String.format("O %s%s", str, str2));
        c63364SiN.A0R = c63364SiN.A0T;
        c63364SiN.A0B.A06(str, str2, c63364SiN.A0a, false);
        c63364SiN.A08.A00();
    }

    public final void A02(Throwable th) {
        C63364SiN c63364SiN = this.A00;
        EnumSet enumSet = C63364SiN.A0c;
        C62488SDp c62488SDp = c63364SiN.A0X;
        if (c62488SDp != null) {
            c62488SDp.A01.A05.post(new TO4(c62488SDp, th));
        }
    }
}
