package X;

import android.os.Handler;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Wxm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71640Wxm implements Runnable {
    public static final RunnableC71640Wxm A00 = new RunnableC71640Wxm();

    @Override // java.lang.Runnable
    public final void run() {
        Date date = new Date(System.currentTimeMillis() - 10000);
        ConcurrentHashMap concurrentHashMap = W2P.A03;
        synchronized (concurrentHashMap) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator A14 = AbstractC166997dE.A14(concurrentHashMap);
            while (A14.hasNext()) {
                Map.Entry entry = (Map.Entry) A14.next();
                if (((C68905Ve5) entry.getValue()).A01.compareTo(date) < 0) {
                    AbstractC31177DnL.A1S(entry, linkedHashMap);
                }
            }
            Iterator A142 = AbstractC166997dE.A14(linkedHashMap);
            while (A142.hasNext()) {
                Map.Entry entry2 = (Map.Entry) A142.next();
                WD8 wd8 = ((C68905Ve5) entry2.getValue()).A00;
                ConcurrentHashMap concurrentHashMap2 = wd8.A08;
                Iterator A0t = AbstractC167017dG.A0t(concurrentHashMap2);
                while (A0t.hasNext()) {
                    C1VO.A01(((C68904Ve3) A0t.next()).A01);
                }
                concurrentHashMap2.clear();
                wd8.A00 = -1;
                concurrentHashMap.remove(entry2.getKey());
            }
        }
        ((Handler) W1F.A06.getValue()).postDelayed(W1F.A01, 10000L);
    }
}
