package X;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: X.ApB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC24244ApB implements Runnable {
    public final /* synthetic */ C88003w8 A00;

    public /* synthetic */ RunnableC24244ApB(C88003w8 c88003w8) {
        this.A00 = c88003w8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C88003w8 c88003w8 = this.A00;
        if (c88003w8.A02) {
            if (SystemClock.uptimeMillis() - c88003w8.A00 > 30000) {
                c88003w8.A00();
                c88003w8.A03 = true;
                return;
            }
            Handler handler = c88003w8.A01;
            if (handler == null) {
                handler = AbstractC167007dF.A0J();
                c88003w8.A01 = handler;
            }
            handler.postDelayed(new RunnableC24244ApB(c88003w8), 30000L);
        }
    }
}
