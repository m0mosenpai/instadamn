package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class Q1t extends BroadcastReceiver {
    public static AtomicReference A01 = new AtomicReference();
    public final Context A00;

    public Q1t(Context context) {
        this.A00 = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A04 = AbstractC58318PtA.A04(this, context, intent, -1811081252);
        synchronized (C63342Shx.A09) {
            try {
                Iterator A16 = AbstractC166997dE.A16(C63342Shx.A0A);
                while (A16.hasNext()) {
                    C63342Shx.A02((C63342Shx) A16.next());
                }
            } catch (Throwable th) {
                C0f9.A0E(1567831290, A04, intent);
                throw th;
            }
        }
        this.A00.unregisterReceiver(this);
        C0f9.A0E(2001282574, A04, intent);
    }
}
