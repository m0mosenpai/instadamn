package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.9Qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210059Qt {
    public final BroadcastReceiver A00 = new C9R9(this);
    public final Context A01;
    public final AudioManager A02;
    public final Handler A03;
    public final C9RA A04;
    public volatile boolean A05;

    public final synchronized void A00() {
        if (this.A05) {
            try {
                this.A01.unregisterReceiver(this.A00);
            } catch (Exception e) {
                if (!e.getMessage().contains("DeadSystemException")) {
                    throw e;
                }
            }
            this.A05 = false;
        }
    }

    public C210059Qt(Context context, AudioManager audioManager, Handler handler, C9RA c9ra) {
        this.A01 = context.getApplicationContext();
        this.A02 = audioManager;
        this.A04 = c9ra;
        this.A03 = handler;
    }
}
