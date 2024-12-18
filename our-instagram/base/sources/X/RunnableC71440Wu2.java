package X;

import java.util.Map;

/* renamed from: X.Wu2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71440Wu2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WDD A01;

    public RunnableC71440Wu2(WDD wdd, int i) {
        this.A01 = wdd;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WDD wdd = this.A01;
        Map map = wdd.A02;
        int i = this.A00;
        if (map.containsKey(Integer.valueOf(i))) {
            WDD.A00(wdd, i, wdd.A00.currentMonotonicTimestamp(), (short) 113);
        }
    }
}
