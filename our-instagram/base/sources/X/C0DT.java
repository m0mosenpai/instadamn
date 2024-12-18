package X;

import java.util.Comparator;
import java.util.concurrent.FutureTask;

/* renamed from: X.0DT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0DT implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Runnable runnable = (Runnable) obj;
        Runnable runnable2 = (Runnable) obj2;
        C14360o3.A0B(runnable, 0);
        C14360o3.A0B(runnable2, 1);
        boolean z = runnable instanceof FutureTask;
        if (!z && !(runnable2 instanceof FutureTask)) {
            if (runnable instanceof C0SU) {
                runnable = ((C0SU) runnable).A00;
            }
            C14360o3.A0C(runnable, "null cannot be cast to non-null type com.facebook.common.appinit.invoker.AppInitScheduler.OrderedRunnable");
            C0DS c0ds = (C0DS) runnable;
            if (runnable2 instanceof C0SU) {
                runnable2 = ((C0SU) runnable2).A00;
            }
            C14360o3.A0C(runnable2, "null cannot be cast to non-null type com.facebook.common.appinit.invoker.AppInitScheduler.OrderedRunnable");
            int i = c0ds.A00;
            int i2 = ((C0DS) runnable2).A00;
            if (i >= i2) {
                if (i != i2) {
                    return 1;
                }
                return 0;
            }
            return -1;
        }
        if ((runnable2 instanceof FutureTask) && !z) {
            return 1;
        }
        return -1;
    }
}
