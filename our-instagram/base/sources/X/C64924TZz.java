package X;

import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* renamed from: X.TZz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64924TZz extends FutureTask {
    public final /* synthetic */ C64928Ta3 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64924TZz(C64928Ta3 c64928Ta3, Object obj, Runnable runnable) {
        super(runnable, obj);
        this.A00 = c64928Ta3;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A00.A00.A00;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (android.util.Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            android.util.Log.e("GAv4", MSZ.A0u("MeasurementExecutor: job failed with ", valueOf, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 37)));
        }
        super.setException(th);
    }
}
