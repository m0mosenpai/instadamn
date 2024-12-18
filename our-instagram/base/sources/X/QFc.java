package X;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class QFc extends AbstractC121025du {
    public static long A01;
    public static final C61816RuA A02 = new Object();
    public static final QFc A03 = new QFc();
    public final C62542SFt A00;

    @Override // X.AbstractC121025du
    public final boolean A00(int i) {
        C62542SFt c62542SFt = this.A00;
        AtomicReference atomicReference = c62542SFt.A02;
        RunnableC64698TQd runnableC64698TQd = (RunnableC64698TQd) atomicReference.get();
        if (runnableC64698TQd == null) {
            return false;
        }
        runnableC64698TQd.A02 = true;
        c62542SFt.A00.removeCallbacks(runnableC64698TQd);
        C1EM.A00(runnableC64698TQd, null, atomicReference);
        return true;
    }

    @Override // X.AbstractC121025du
    public final boolean A01(Bundle bundle, InterfaceC121045dw interfaceC121045dw, int i) {
        C62542SFt c62542SFt = this.A00;
        RunnableC64698TQd runnableC64698TQd = new RunnableC64698TQd(interfaceC121045dw, c62542SFt.A01, c62542SFt);
        c62542SFt.A02.set(runnableC64698TQd);
        c62542SFt.A00.post(runnableC64698TQd);
        return true;
    }

    public QFc() {
        HandlerThread A0A = MSY.A0A("PushTokenRefresherJobLogic");
        A0A.start();
        Looper looper = A0A.getLooper();
        if (looper != null) {
            this.A00 = new C62542SFt(looper, STU.A00);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
