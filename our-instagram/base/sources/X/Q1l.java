package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

/* loaded from: classes10.dex */
public final class Q1l extends BroadcastReceiver {
    public final /* synthetic */ RealtimeSinceBootClock A00;
    public final /* synthetic */ SZ6 A01;

    public Q1l(RealtimeSinceBootClock realtimeSinceBootClock, SZ6 sz6) {
        this.A01 = sz6;
        this.A00 = realtimeSinceBootClock;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -1809977588);
        if (intent == null) {
            i = 1277524002;
        } else if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) && !"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            i = -620312679;
        } else {
            Boolean valueOf = Boolean.valueOf("android.intent.action.SCREEN_ON".equals(intent.getAction()));
            SZ6 sz6 = this.A01;
            IntentFilter intentFilter = SZ6.A06;
            if (!valueOf.equals(sz6.A04.getAndSet(valueOf))) {
                sz6.A03.set(SystemClock.elapsedRealtime());
            }
            i = 837755770;
        }
        C0f9.A0E(i, A04, intent);
    }
}
