package X;

import java.util.concurrent.TimeoutException;

/* renamed from: X.Wqx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71268Wqx implements Runnable {
    public final /* synthetic */ WZF A00;

    public RunnableC71268Wqx(WZF wzf) {
        this.A00 = wzf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WZF wzf = this.A00;
        if (wzf.A0x && !wzf.A0Z) {
            WZF.A0A(wzf, new TimeoutException("release timed out: check after 5 secs"));
        }
    }
}
