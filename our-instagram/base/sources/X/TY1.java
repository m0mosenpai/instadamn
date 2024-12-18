package X;

import android.content.Context;
import android.os.Process;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class TY1 extends Thread {
    public final /* synthetic */ C63149Sdw A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TY1(C63149Sdw c63149Sdw) {
        super("NativeMetricsLogWriter");
        this.A00 = c63149Sdw;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        C63149Sdw c63149Sdw = this.A00;
        C63149Sdw c63149Sdw2 = C63149Sdw.A06;
        if (C0Sf.A00(c63149Sdw.A00, AnonymousClass001.A0R("nativemetrics_", c63149Sdw.A02))) {
            Context context = c63149Sdw.A00;
            C14360o3.A0A(context);
            c63149Sdw.A01 = new C62408SAh(context, c63149Sdw.A02);
            C63149Sdw.A00(c63149Sdw);
            c63149Sdw.A03.postDelayed(c63149Sdw.A05, TimeUnit.MINUTES.toMillis(2L));
        }
    }
}
