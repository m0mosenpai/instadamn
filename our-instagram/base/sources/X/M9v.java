package X;

import java.util.TimerTask;

/* loaded from: classes8.dex */
public final class M9v extends TimerTask {
    public final /* synthetic */ C49497LuA A00;

    public M9v(C49497LuA c49497LuA) {
        this.A00 = c49497LuA;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C49497LuA c49497LuA = this.A00;
        c49497LuA.A00 += 100 / c49497LuA.A04;
        c49497LuA.A00();
        if (c49497LuA.A00 >= 100) {
            c49497LuA.A05.cancel();
        }
    }
}
