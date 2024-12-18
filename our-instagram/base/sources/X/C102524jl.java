package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4jl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102524jl {
    public static final C102524jl A03 = new C102524jl();
    public static final IntentFilter A02 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    public final List A01 = new ArrayList();
    public BroadcastReceiver A00 = null;

    public final void A00(Object obj) {
        Runnable runnable = (Runnable) obj;
        if (runnable == null) {
            C0K8.A0D("IgZeroPlatform", "Ignoring an attempt to cancel a null Runnable");
        } else {
            C14270nr.A00().A02(runnable);
        }
    }

    public final void A01(final Runnable runnable, long j) {
        if (runnable == null) {
            C0K8.A0D("IgZeroPlatform", "Ignoring an attempt to schedule a null Runnable");
        } else {
            C14270nr.A00().A01(new AbstractRunnableC14200nk() { // from class: X.4le
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(606);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    runnable.run();
                }
            }, j);
        }
    }
}
