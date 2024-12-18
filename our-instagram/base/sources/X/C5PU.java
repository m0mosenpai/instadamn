package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: X.5PU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5PU extends BroadcastReceiver implements Runnable {
    public final Handler A00;
    public final C5P6 A01;
    public final /* synthetic */ C5PT A02;

    public C5PU(Handler handler, C5P6 c5p6, C5PT c5pt) {
        this.A02 = c5pt;
        this.A00 = handler;
        this.A01 = c5p6;
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A01 = C0f9.A01(-2039989857);
        C0fM.A01(this, context, intent);
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.A00.post(this);
        }
        C0f9.A0E(1559599198, A01, intent);
    }
}
