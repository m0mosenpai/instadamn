package X;

import android.os.Process;
import com.facebook.systrace.Systrace;

/* renamed from: X.4zA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110984zA extends C12T {
    public final Integer A00;
    public final InterfaceC14020nS A01;

    @Override // X.C12T
    public final void A05(final Runnable runnable, C12W c12w) {
        int i;
        int i2;
        C14360o3.A0B(c12w, 0);
        C14360o3.A0B(runnable, 1);
        InterfaceC14020nS interfaceC14020nS = this.A01;
        C13990nP c13990nP = (C13990nP) c12w.get(C13990nP.A01);
        if (c13990nP != null) {
            i = c13990nP.A00;
        } else {
            i = -18;
        }
        C14010nR c14010nR = (C14010nR) c12w.get(C14010nR.A01);
        if (c14010nR != null) {
            i2 = c14010nR.A00;
        } else {
            i2 = 3;
        }
        interfaceC14020nS.ATO(C14190nj.A00(new Runnable() { // from class: X.4zC
            @Override // java.lang.Runnable
            public final void run() {
                int threadPriority;
                int intValue;
                Integer num = C110984zA.this.A00;
                Runnable runnable2 = runnable;
                if (num != null && (intValue = num.intValue()) < (threadPriority = Process.getThreadPriority(Process.myTid()))) {
                    if (Systrace.A0E(1L)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("ScopedBoost priority=");
                        sb.append(num);
                        C0fO.A01(sb.toString(), -501357270);
                    }
                    Process.setThreadPriority(intValue);
                    try {
                        runnable2.run();
                        Process.setThreadPriority(threadPriority);
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-2111025802);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        Process.setThreadPriority(threadPriority);
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(427047614);
                        }
                        throw th;
                    }
                }
                runnable2.run();
            }
        }, i, i2, true, true));
    }

    public C110984zA(Integer num) {
        this.A00 = num;
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        this.A01 = A00;
    }
}
