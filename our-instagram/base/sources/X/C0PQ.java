package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0PQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0PQ {
    public long A00;
    public final Map A02 = new HashMap();
    public final Object A01 = new Object();

    public final boolean A00(String str) {
        Map map;
        Long l;
        Object obj = this.A01;
        synchronized (obj) {
            map = this.A02;
            l = (Long) map.get(str);
            this.A00 = 0L;
        }
        if (l == null) {
            l = 0L;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long longValue = l.longValue();
        if (longValue == 0) {
            synchronized (obj) {
                map.put(str, Long.valueOf(uptimeMillis));
            }
        }
        if (longValue > uptimeMillis) {
            return true;
        }
        if (uptimeMillis - longValue < 3000) {
            long j = (longValue + 3000) - uptimeMillis;
            synchronized (obj) {
                this.A00 = j;
                map.put(str, Long.valueOf(uptimeMillis + j));
            }
            try {
                Thread.sleep(j);
                return false;
            } catch (InterruptedException e) {
                C0PC.A00().DEh("ReportSenderTrickler", e, null);
                return false;
            }
        }
        return false;
    }
}
