package X;

import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes10.dex */
public final class TLQ implements Runnable {
    public final /* synthetic */ AbstractC62939SYh A00;

    public TLQ(AbstractC62939SYh abstractC62939SYh) {
        this.A00 = abstractC62939SYh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        AbstractC62939SYh abstractC62939SYh = this.A00;
        if (myLooper == mainLooper) {
            SX6 sx6 = abstractC62939SYh.A00.A03;
            C3U5.A02(sx6);
            sx6.A02.submit(this);
            return;
        }
        boolean A1M = AbstractC167007dF.A1M((abstractC62939SYh.A02 > 0L ? 1 : (abstractC62939SYh.A02 == 0L ? 0 : -1)));
        abstractC62939SYh.A02 = 0L;
        if (!A1M) {
            return;
        }
        if (abstractC62939SYh instanceof C60697RMp) {
            C60692RMk c60692RMk = ((C60697RMp) abstractC62939SYh).A00;
            try {
                C60693RMl c60693RMl = c60692RMk.A04;
                SX6.A00();
                c60693RMl.A0I();
                SYI syi = c60693RMl.A00;
                if (syi.A00(86400000L)) {
                    syi.A00 = SystemClock.elapsedRealtime();
                    AbstractC63371Sic.A09(c60693RMl, "Deleting stale hits (if any)", 2);
                    c60693RMl.A0D("Deleted stale hits, count", Integer.valueOf(c60693RMl.A0J().delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)})));
                }
                c60692RMk.A0K();
            } catch (SQLiteException e) {
                c60692RMk.A0F("Failed to delete stale hits", e);
            }
            c60692RMk.A05.A01(86400000L);
            return;
        }
        if (abstractC62939SYh instanceof C60696RMo) {
            C60692RMk c60692RMk2 = ((C60696RMo) abstractC62939SYh).A00;
            long j2 = c60692RMk2.A00;
            SX6.A00();
            c60692RMk2.A0I();
            C60688RMg c60688RMg = ((AbstractC63371Sic) c60692RMk2).A00.A0D;
            C63335Shm.A02(c60688RMg);
            long A0K = c60688RMg.A0K();
            if (A0K != 0) {
                j = Math.abs(AbstractC37300Gc1.A00(A0K));
            } else {
                j = -1;
            }
            c60692RMk2.A0E("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j));
            C60692RMk.A03(c60692RMk2);
            try {
                C60692RMk.A04(c60692RMk2);
                C63335Shm.A02(c60688RMg);
                c60688RMg.A0L();
                c60692RMk2.A0K();
                c60692RMk2.A0K();
                if (c60692RMk2.A00 == j2) {
                    return;
                }
                C63335Shm.A03(c60692RMk2);
                return;
            } catch (Exception e2) {
                c60692RMk2.A0G("Local dispatch failed", e2);
                C63335Shm.A02(c60688RMg);
                c60688RMg.A0L();
                c60692RMk2.A0K();
                c60692RMk2.A0K();
                return;
            }
        }
        C60689RMh c60689RMh = ((C60695RMn) abstractC62939SYh).A00;
        SX6.A00();
        SX6.A00();
        c60689RMh.A0I();
        if (c60689RMh.A00 == null) {
            return;
        }
        AbstractC63371Sic.A09(c60689RMh, "Inactivity, disconnecting from device AnalyticsService", 2);
        c60689RMh.A0J();
    }
}
