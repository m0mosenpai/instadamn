package X;

import android.content.BroadcastReceiver;

/* loaded from: classes10.dex */
public final class TLH implements Runnable {
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;

    public TLH(BroadcastReceiver.PendingResult pendingResult) {
        this.A00 = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.A00;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
