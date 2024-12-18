package X;

import android.os.Process;
import com.facebook.systrace.Systrace;

/* renamed from: X.3Wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74553Wn extends C0YY implements InterfaceC16660sJ {
    public static final C74553Wn A00 = new C74553Wn();

    public C74553Wn() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final Runnable runnable = (Runnable) obj;
        C14360o3.A0B(runnable, 0);
        C14120nc.A00().ATO(C14190nj.A00(new Runnable() { // from class: X.3Wo
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                int threadPriority = Process.getThreadPriority(Process.myTid());
                if (-8 >= threadPriority) {
                    runnable2.run();
                    return;
                }
                if (Systrace.A0E(1L)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ScopedBoost priority=");
                    sb.append((Object) (-8));
                    C0fO.A01(sb.toString(), -752477832);
                }
                Process.setThreadPriority(-8);
                try {
                    runnable2.run();
                    Process.setThreadPriority(threadPriority);
                    if (!Systrace.A0E(1L)) {
                        return;
                    }
                    C0fO.A00(1468222050);
                } catch (Throwable th) {
                    Process.setThreadPriority(threadPriority);
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1859895591);
                    }
                    throw th;
                }
            }
        }, 167028507, 1, true, true));
        return C0eB.A00;
    }
}
