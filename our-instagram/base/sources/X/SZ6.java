package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.PowerManager;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class SZ6 {
    public static final IntentFilter A06;
    public final BroadcastReceiver A00;
    public final Context A01;
    public final Handler A02;
    public final AtomicLong A03 = AbstractC58318PtA.A15(-1);
    public final AtomicReference A04 = new AtomicReference(null);
    public final C62670SLh A05;

    static {
        IntentFilter intentFilter = new IntentFilter();
        A06 = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.setPriority(999);
    }

    public final boolean A00() {
        Boolean bool = (Boolean) this.A04.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            AbstractC64515THi A00 = this.A05.A00(PowerManager.class, "power");
            if (A00 instanceof C60546R6j) {
                return false;
            }
            return ((PowerManager) A00.A01()).isInteractive();
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public SZ6(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, C62670SLh c62670SLh) {
        this.A01 = context;
        this.A05 = c62670SLh;
        this.A02 = handler;
        Q1l q1l = new Q1l(realtimeSinceBootClock, this);
        this.A00 = q1l;
        try {
            C0DJ.A01(q1l, this.A01, A06, this.A02);
        } catch (Exception e) {
            if (!(e.getCause() instanceof DeadObjectException)) {
                throw e;
            }
        }
    }
}
