package X;

import com.fbpay.w3c.FBPaymentServiceCardDetailsCallback;
import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;

/* loaded from: classes10.dex */
public final class TOQ implements Runnable {
    public final /* synthetic */ FBPaymentServiceCardDetailsCallback A00;
    public final /* synthetic */ FBPaymentServiceImpl A01;

    public TOQ(FBPaymentServiceCardDetailsCallback fBPaymentServiceCardDetailsCallback, FBPaymentServiceImpl fBPaymentServiceImpl) {
        this.A01 = fBPaymentServiceImpl;
        this.A00 = fBPaymentServiceCardDetailsCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A01;
        C62761SPt c62761SPt = fBPaymentServiceImpl.A02;
        if (c62761SPt != null) {
            S24.A00(fBPaymentServiceImpl, c62761SPt.A00(), new DRW(this.A00, 8));
        }
    }
}
