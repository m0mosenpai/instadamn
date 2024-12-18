package X;

import android.os.SystemClock;

/* renamed from: X.WrO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71294WrO implements Runnable {
    public final /* synthetic */ UCo A00;

    public RunnableC71294WrO(UCo uCo) {
        this.A00 = uCo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UCo uCo = this.A00;
        if (uCo.A07 > 0) {
            SystemClock.uptimeMillis();
        }
        uCo.setVisibility(0);
    }
}
