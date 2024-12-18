package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class YIU implements Runnable {
    public final long A00;
    public final C72331XbT A01;
    public final Runnable A02;

    @Override // java.lang.Runnable
    public final void run() {
        C72331XbT c72331XbT = this.A01;
        if (!c72331XbT.A03) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long convert = timeUnit.convert(System.currentTimeMillis(), timeUnit);
            long j = this.A00;
            if (j > convert) {
                try {
                    Thread.sleep(j - convert);
                } catch (InterruptedException e) {
                    AbstractC58318PtA.A18();
                    AbstractC142886co.A02(e);
                    return;
                }
            }
            if (!c72331XbT.A03) {
                this.A02.run();
            }
        }
    }

    public YIU(C72331XbT c72331XbT, Runnable runnable, long j) {
        this.A02 = runnable;
        this.A01 = c72331XbT;
        this.A00 = j;
    }
}
