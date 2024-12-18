package X;

import android.os.PowerManager;

/* loaded from: classes10.dex */
public final class RcF extends AbstractRunnableC14200nk {
    public final /* synthetic */ PowerManager.WakeLock A00;
    public final /* synthetic */ Runnable A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcF(PowerManager.WakeLock wakeLock, Runnable runnable) {
        super(53, 3, false, false);
        this.A01 = runnable;
        this.A00 = wakeLock;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A01.run();
        } finally {
            AbstractC09820fg.A01(this.A00);
        }
    }
}
