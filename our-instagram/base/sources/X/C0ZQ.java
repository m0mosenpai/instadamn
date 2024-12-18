package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0ZQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ZQ implements InterfaceC02790Bd {
    public final QuickPerformanceLogger A00;
    public final long A01;
    public final Runnable A02 = new Runnable() { // from class: X.0Bj
        @Override // java.lang.Runnable
        public final void run() {
            C0ZQ.this.A00.markerEnd(7209008, (short) 2);
        }
    };
    public final ScheduledExecutorService A03;

    @Override // X.InterfaceC02790Bd
    public final void EHE(C02810Bf c02810Bf, C02840Bi c02840Bi) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        quickPerformanceLogger.markerStart(7209008);
        if (quickPerformanceLogger.isMarkerOn(7209008)) {
            quickPerformanceLogger.markerAnnotate(7209008, "CpuSpin", c02840Bi.toString());
            String str = c02810Bf.A03;
            quickPerformanceLogger.markerAnnotate(7209008, "is_backgrounded", AppStateModule.APP_STATE_BACKGROUND.equals(str));
            quickPerformanceLogger.markerAnnotate(7209008, "session_key", str);
            quickPerformanceLogger.markerAnnotate(7209008, "streak_count", c02840Bi.A04);
            quickPerformanceLogger.markerAnnotate(7209008, "process_triggered", c02840Bi.A07);
            quickPerformanceLogger.markerAnnotate(7209008, "process_pct_cpu", (int) c02840Bi.A01);
            String str2 = c02840Bi.A06;
            if (str2 != null) {
                quickPerformanceLogger.markerAnnotate(7209008, "thread1_name", str2);
                quickPerformanceLogger.markerAnnotate(7209008, "thread1_pct_cpu", (int) c02840Bi.A03);
            }
            String str3 = c02840Bi.A05;
            if (str3 != null) {
                quickPerformanceLogger.markerAnnotate(7209008, "thread2_name", str3);
                quickPerformanceLogger.markerAnnotate(7209008, "thread2_pct_cpu", (int) c02840Bi.A02);
            }
            this.A03.schedule(this.A02, this.A01, TimeUnit.MILLISECONDS);
        }
    }

    public C0ZQ(QuickPerformanceLogger quickPerformanceLogger, ScheduledExecutorService scheduledExecutorService, long j) {
        this.A00 = quickPerformanceLogger;
        this.A03 = scheduledExecutorService;
        this.A01 = j;
    }
}
