package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3w7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87993w7 {
    public static C87993w7 A02;
    public C88003w8 A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public static synchronized C87993w7 A00() {
        C87993w7 c87993w7;
        synchronized (C87993w7.class) {
            c87993w7 = A02;
            if (c87993w7 == null) {
                c87993w7 = new C87993w7();
                A02 = c87993w7;
            }
        }
        return c87993w7;
    }

    public final C72857XpD A01(int i, int i2) {
        long j;
        C88003w8 c88003w8 = this.A00;
        if (c88003w8 == null) {
            return null;
        }
        if (c88003w8.A03) {
            this.A01.clear();
            this.A00.A03 = false;
        }
        if (i2 == 0) {
            j = i;
        } else {
            j = i2 << (i + 32);
        }
        ConcurrentHashMap concurrentHashMap = this.A01;
        Long valueOf = Long.valueOf(j);
        C72857XpD c72857XpD = (C72857XpD) concurrentHashMap.get(valueOf);
        if (c72857XpD != null) {
            c72857XpD.A0B = true;
        }
        C72857XpD c72857XpD2 = new C72857XpD(i, i2);
        concurrentHashMap.put(valueOf, c72857XpD2);
        C88003w8 c88003w82 = this.A00;
        if (c88003w82.A03) {
            return c72857XpD2;
        }
        c88003w82.A00 = SystemClock.uptimeMillis();
        if (c88003w82.A02) {
            return c72857XpD2;
        }
        c88003w82.A02 = true;
        Handler handler = c88003w82.A01;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            c88003w82.A01 = handler;
        }
        handler.postDelayed(new RunnableC24244ApB(c88003w82), 30000L);
        return c72857XpD2;
    }

    public final void A02(int i, int i2) {
        long j;
        if (this.A00 != null) {
            if (i2 == 0) {
                j = i;
            } else {
                j = i2 << (i + 32);
            }
            ConcurrentHashMap concurrentHashMap = this.A01;
            C72857XpD c72857XpD = (C72857XpD) concurrentHashMap.remove(Long.valueOf(j));
            if (c72857XpD != null) {
                c72857XpD.A0C = true;
                c72857XpD.A06 = SystemClock.uptimeMillis();
                C88023wA c88023wA = this.A00.A04;
                if (((C88033wB) c88023wA).A05 == -1) {
                    long uptimeMillis = SystemClock.uptimeMillis() - ((C88033wB) c88023wA).A02;
                    c72857XpD.A00++;
                    c72857XpD.A08 += uptimeMillis;
                }
            }
            if (concurrentHashMap.isEmpty()) {
                this.A00.A00();
            }
        }
    }
}
