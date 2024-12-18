package X;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TJL implements Runnable {
    public final C63650SrG A00;

    @Override // java.lang.Runnable
    public final void run() {
        boolean A1N;
        boolean A1N2;
        C63650SrG c63650SrG = this.A00;
        C48442Kl.A00();
        C63650SrG.A00();
        List list = c63650SrG.A0A;
        synchronized (list) {
            if (c63650SrG.A00 != null) {
                C48442Kl.A00();
                if (((Intent) list.remove(0)).equals(c63650SrG.A00)) {
                    c63650SrG.A00 = null;
                } else {
                    throw AbstractC166987dD.A14("Dequeue-d command is not the first.");
                }
            }
            C2LE c2le = ((C2LB) c63650SrG.A09).A01;
            C63649SrF c63649SrF = c63650SrG.A07;
            synchronized (c63649SrF.A02) {
                try {
                    A1N = AbstractC167007dF.A1N(c63649SrF.A03.isEmpty() ? 1 : 0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!A1N && list.isEmpty()) {
                synchronized (c2le.A01) {
                    try {
                        A1N2 = AbstractC167007dF.A1N(c2le.A02.isEmpty() ? 1 : 0);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!A1N2) {
                    C48442Kl.A00();
                    InterfaceC65191TfZ interfaceC65191TfZ = c63650SrG.A02;
                    if (interfaceC65191TfZ != null) {
                        SystemAlarmService systemAlarmService = (SystemAlarmService) interfaceC65191TfZ;
                        systemAlarmService.A01 = true;
                        C48442Kl.A00();
                        LinkedHashMap A1I = AbstractC166987dD.A1I();
                        synchronized (SUQ.A00) {
                            try {
                                A1I.putAll(SUQ.A01);
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        Iterator A14 = AbstractC166997dE.A14(A1I);
                        while (A14.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(A14);
                            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) A1K.getKey();
                            String A0p = AbstractC58318PtA.A0p(A1K);
                            if (wakeLock != null && wakeLock.isHeld()) {
                                C48442Kl.A00();
                                AbstractC58321PtD.A1P("WakeLock held for ", A0p, ST7.A00);
                            }
                        }
                        systemAlarmService.stopSelf();
                    }
                }
            }
            if (!list.isEmpty()) {
                C63650SrG.A01(c63650SrG);
            }
        }
    }

    public TJL(C63650SrG dispatcher) {
        this.A00 = dispatcher;
    }
}
