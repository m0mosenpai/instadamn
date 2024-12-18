package X;

import android.os.Process;
import com.facebook.systrace.Systrace;
import java.util.concurrent.Callable;

/* renamed from: X.1Ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC24501Ht implements Callable {
    public final /* synthetic */ C23711Eb A00;

    public CallableC24501Ht(C23711Eb c23711Eb) {
        this.A00 = c23711Eb;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Object invoke;
        C23711Eb c23711Eb = this.A00;
        String A0R = AnonymousClass001.A0R("buildApiRequest ", c23711Eb.A0E);
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0R, -654106020);
        }
        try {
            Integer num = c23711Eb.A03;
            C9F8 c9f8 = new C9F8(21, this, c23711Eb);
            if (num != null) {
                int threadPriority = Process.getThreadPriority(Process.myTid());
                Process.setThreadPriority(num.intValue());
                try {
                    invoke = c9f8.invoke();
                    Process.setThreadPriority(threadPriority);
                } catch (Throwable th) {
                    Process.setThreadPriority(threadPriority);
                    throw th;
                }
            } else {
                invoke = c9f8.invoke();
            }
            C1QZ c1qz = (C1QZ) invoke;
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1246455449);
            }
            return c1qz;
        } catch (Throwable th2) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1268932587);
            }
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Streaming ");
        sb.append(this.A00);
        return sb.toString();
    }
}
