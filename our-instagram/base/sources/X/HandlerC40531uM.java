package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.1uM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC40531uM extends Handler {
    public final /* synthetic */ C40471uG A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC40531uM(Looper looper, C40471uG c40471uG) {
        super(looper);
        this.A00 = c40471uG;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 1) {
            C40471uG c40471uG = this.A00;
            c40471uG.A03.A03(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            c40471uG.A04.A03(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            C40401u8 c40401u8 = (C40401u8) message.obj;
            if (c40401u8 == null) {
                C0K8.A0E("IGAnalytics2UploadScheduler", "UploadJobConfig cannot be null in IGAnalytics2UploadScheduler");
                return;
            }
            int i = message.arg1;
            Context context = c40471uG.A01;
            C88643xQ.A00(context).A05(new C88633xO(context, null, null, c40401u8, new C88623xN(0L, 0L, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", i), "com.facebook.analytics2.logger.UPLOAD_NOW");
            c40471uG.A00 = Long.MAX_VALUE;
        }
    }
}
