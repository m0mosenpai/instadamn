package X;

import android.content.Context;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class SX6 {
    public static volatile SX6 A06;
    public Thread.UncaughtExceptionHandler A00;
    public final Context A01;
    public final C64928Ta3 A02;
    public final List A03;
    public final T4n A04;
    public volatile C60645RFv A05;

    public SX6(Context context) {
        Context applicationContext = context.getApplicationContext();
        C3U5.A02(applicationContext);
        this.A01 = applicationContext;
        this.A02 = new C64928Ta3(this);
        this.A03 = new CopyOnWriteArrayList();
        this.A04 = new T4n();
    }

    public static void A00() {
        if (Thread.currentThread() instanceof C64870TXv) {
        } else {
            throw AbstractC166987dD.A14("Call expected from worker thread");
        }
    }
}
