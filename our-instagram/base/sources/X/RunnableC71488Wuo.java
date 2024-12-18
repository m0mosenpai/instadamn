package X;

import java.io.IOException;

/* renamed from: X.Wuo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71488Wuo implements Runnable {
    public final /* synthetic */ XCU A00;
    public final /* synthetic */ IOException A01;

    public RunnableC71488Wuo(XCU xcu, IOException iOException) {
        this.A00 = xcu;
        this.A01 = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onFailure(this.A01);
    }
}
