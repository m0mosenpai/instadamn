package X;

import android.os.Process;
import com.facebook.systrace.Systrace;

/* loaded from: classes8.dex */
public final class JXR implements C11R {
    public final C11R A00;
    public final Integer A01;

    @Override // X.C11R
    public final String getName() {
        return this.A00.getName();
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return this.A00.getRunnableId();
    }

    @Override // X.C11R
    public final void onCancel() {
        this.A00.onCancel();
    }

    @Override // X.C11R
    public final void onFinish() {
        this.A00.onFinish();
    }

    @Override // X.C11R
    public final void onStart() {
        this.A00.onStart();
    }

    @Override // X.C11R
    public final void run() {
        int threadPriority;
        int intValue;
        Integer num = this.A01;
        if (num != null && (intValue = num.intValue()) < (threadPriority = Process.getThreadPriority(Process.myTid()))) {
            if (Systrace.A0E(1L)) {
                C0fO.A01(AbstractC167017dG.A0n(num, "ScopedBoost priority=", AbstractC166987dD.A1C()), 975726106);
            }
            Process.setThreadPriority(intValue);
            try {
                this.A00.run();
                Process.setThreadPriority(threadPriority);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1405146987);
                    return;
                }
                return;
            } catch (Throwable th) {
                Process.setThreadPriority(threadPriority);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1970267686);
                }
                throw th;
            }
        }
        this.A00.run();
    }

    public JXR(C11R c11r, Integer num) {
        this.A00 = c11r;
        this.A01 = num;
    }
}
