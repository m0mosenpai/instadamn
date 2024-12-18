package X;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class CU6 {
    public final Handler A00;
    public final Runnable A01;
    public final AtomicBoolean A02;
    public final long A03;

    public CU6(Runnable runnable, long j) {
        C14360o3.A0B(runnable, 2);
        this.A03 = j;
        this.A01 = runnable;
        this.A02 = new AtomicBoolean(false);
        this.A00 = AbstractC167007dF.A0J();
    }

    public final void A00() {
        this.A00.postDelayed(new D18(this), this.A03);
    }
}
