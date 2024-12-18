package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.analytics2.logger.legacy.uploader.HighPriUploadRetryReceiver;

/* loaded from: classes10.dex */
public final class TYB extends Thread {
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ HighPriUploadRetryReceiver A03;

    public TYB(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent, HighPriUploadRetryReceiver highPriUploadRetryReceiver) {
        this.A03 = highPriUploadRetryReceiver;
        this.A02 = intent;
        this.A01 = context;
        this.A00 = pendingResult;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            Bundle extras = this.A02.getExtras();
            Context context = this.A01;
            C88633xO A00 = C88633xO.A00(context, extras);
            C88643xQ.A00(context).A05(new C88633xO(context, null, null, A00.A06, new C88623xN(0L, 0L, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", A00.A02), "com.facebook.analytics2.logger.UPLOAD_NOW");
            this.A00.finish();
        } catch (C906842g e) {
            C0K8.A0J("HighPriUploadRetryReceiver", "Exception when scheduling high pri upload via alarm", e);
        }
    }
}
