package X;

import android.content.BroadcastReceiver;

/* renamed from: X.0qR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC15710qR implements Runnable {
    public final /* synthetic */ BroadcastReceiver A00;
    public final /* synthetic */ C18150uz A01;

    public RunnableC15710qR(BroadcastReceiver broadcastReceiver, C18150uz c18150uz) {
        this.A01 = c18150uz;
        this.A00 = broadcastReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A05.unregisterReceiver(this.A00);
    }
}
