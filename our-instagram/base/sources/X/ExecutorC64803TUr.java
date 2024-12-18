package X;

import java.util.concurrent.Executor;

/* renamed from: X.TUr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64803TUr implements Executor {
    public ThreadLocal A00 = new ThreadLocal();

    private void A00() {
        ThreadLocal threadLocal = this.A00;
        Number number = (Number) threadLocal.get();
        if (number == null) {
            number = AbstractC25227BEk.A0p();
        }
        int intValue = number.intValue() - 1;
        if (intValue == 0) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(intValue));
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ThreadLocal threadLocal = this.A00;
        Number number = (Number) threadLocal.get();
        if (number == null) {
            number = AbstractC25227BEk.A0p();
        }
        int intValue = number.intValue() + 1;
        threadLocal.set(Integer.valueOf(intValue));
        try {
            if (intValue <= 15) {
                runnable.run();
            } else {
                SWR.A03.A01.execute(runnable);
            }
        } finally {
            A00();
        }
    }
}
