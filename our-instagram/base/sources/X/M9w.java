package X;

import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes8.dex */
public final class M9w extends TimerTask {
    public final /* synthetic */ C1345366c A00;

    public M9w(C1345366c c1345366c) {
        this.A00 = c1345366c;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ConcurrentMap concurrentMap;
        C1345366c c1345366c = this.A00;
        List list = c1345366c.A03;
        synchronized (list) {
            c1345366c.A00 = null;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                L43 l43 = (L43) it.next();
                if (l43.A00 + StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS < System.currentTimeMillis()) {
                    String str = l43.A03;
                    String str2 = l43.A01;
                    boolean z = l43.A05;
                    boolean z2 = l43.A04;
                    boolean z3 = true;
                    boolean z4 = false;
                    if (z2) {
                        z3 = false;
                        z4 = true;
                    }
                    C1345366c.A01(c1345366c, str, str2, l43.A02, 2000000L, z3, z4, AbstractC167007dF.A1N(z ? 1 : 0));
                    if (!z2) {
                        concurrentMap = c1345366c.A05;
                    } else {
                        concurrentMap = c1345366c.A04;
                    }
                    ConcurrentMap concurrentMap2 = (ConcurrentMap) concurrentMap.get(str);
                    if (concurrentMap2 != null) {
                        concurrentMap2.remove(str2);
                    }
                    it.remove();
                }
            }
            C1345366c.A00(c1345366c);
        }
    }
}
