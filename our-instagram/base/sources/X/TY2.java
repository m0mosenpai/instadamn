package X;

import android.os.Process;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class TY2 extends Thread {
    public final /* synthetic */ C63149Sdw A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TY2(C63149Sdw c63149Sdw) {
        super("NativeMetricsLogWriter");
        this.A00 = c63149Sdw;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        C63149Sdw c63149Sdw = this.A00;
        C63149Sdw.A00(c63149Sdw);
        c63149Sdw.A03.postDelayed(this, TimeUnit.HOURS.toMillis(4L));
    }
}
