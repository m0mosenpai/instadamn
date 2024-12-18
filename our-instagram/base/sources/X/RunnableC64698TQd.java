package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* renamed from: X.TQd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64698TQd implements Runnable {
    public final InterfaceC121045dw A00;
    public final STU A01;
    public volatile boolean A02;
    public final /* synthetic */ C62542SFt A03;

    public RunnableC64698TQd(InterfaceC121045dw interfaceC121045dw, STU stu, C62542SFt c62542SFt) {
        this.A03 = c62542SFt;
        this.A01 = stu;
        this.A00 = interfaceC121045dw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        if (this.A02) {
            return;
        }
        InterfaceC08830cm interfaceC08830cm = AbstractC61815Ru9.A00().A06;
        if (interfaceC08830cm != null) {
            interfaceC08830cm.get();
        }
        synchronized (QFc.A02) {
            j = QFc.A01;
            QFc.A01 = j + 1;
        }
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null) {
            qPLInstance.markerStart(875314331);
            qPLInstance.markerAnnotate(875314331, "run_count", j);
        }
        C14360o3.A07(AbstractC61815Ru9.A00().A09.getValue());
        throw AbstractC166987dD.A15("getRefresher");
    }
}
