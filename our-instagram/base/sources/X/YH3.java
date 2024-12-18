package X;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* loaded from: classes12.dex */
public final class YH3 implements Runnable {
    public final /* synthetic */ C72862XpO A00;
    public final /* synthetic */ Callable A01;

    public YH3(C72862XpO c72862XpO, Callable callable) {
        this.A00 = c72862XpO;
        this.A01 = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.A02(this.A01.call());
        } catch (CancellationException unused) {
            this.A00.A00();
        } catch (Exception e) {
            this.A00.A01(e);
        }
    }
}
