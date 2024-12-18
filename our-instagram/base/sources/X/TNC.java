package X;

import android.content.Context;

/* loaded from: classes10.dex */
public final class TNC implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C63305ShB A01;

    public TNC(Context context, C63305ShB c63305ShB) {
        this.A01 = c63305ShB;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63305ShB c63305ShB = this.A01;
        Context context = this.A00;
        int i = c63305ShB.A00 - 1;
        c63305ShB.A00 = i;
        if (i == 0 && c63305ShB.A01 != null) {
            if (c63305ShB.A06 != null) {
                synchronized (c63305ShB) {
                    if (c63305ShB.A04 != null) {
                        C0L6.A04(C0LK.A70);
                        C0L6.A04(C0LK.A6z);
                        c63305ShB.A04 = null;
                    }
                }
                context.unbindService(c63305ShB.A01);
            }
            c63305ShB.A03.quit();
            c63305ShB.A01 = null;
            c63305ShB.A06 = null;
            c63305ShB.A07 = null;
            c63305ShB.A03 = null;
            c63305ShB.A02 = null;
        }
    }
}
