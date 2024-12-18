package X;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: classes8.dex */
public final class KM2 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C63000SaO A00;
    public final /* synthetic */ SettableFuture A01;

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.set(this.A00.A01());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KM2(C63000SaO c63000SaO, SettableFuture settableFuture) {
        super(1891369907, 2, false, true);
        this.A00 = c63000SaO;
        this.A01 = settableFuture;
    }
}
