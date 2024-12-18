package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.SqC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63604SqC implements InterfaceC65183TfR {
    public Handler A00;
    public HandlerThread A01;
    public SVP A02;
    public final Context A03;
    public final C53532cb A04;
    public final Object A05 = AbstractC58318PtA.A0b();
    public final Rr9 A06;

    public static void A00(C63604SqC c63604SqC) {
        c63604SqC.A02 = null;
        synchronized (c63604SqC.A05) {
            c63604SqC.A00.removeCallbacks(null);
            HandlerThread handlerThread = c63604SqC.A01;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            c63604SqC.A00 = null;
            c63604SqC.A01 = null;
        }
    }

    public C63604SqC(Context context, C53532cb c53532cb, Rr9 rr9) {
        C02R.A03(context, "Context cannot be null");
        C02R.A03(c53532cb, "FontRequest cannot be null");
        this.A03 = context.getApplicationContext();
        this.A04 = c53532cb;
        this.A06 = rr9;
    }
}
