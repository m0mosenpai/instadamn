package X;

import com.fbpay.w3c.FBPaymentServiceContactCallback;
import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;

/* loaded from: classes10.dex */
public final class TOR implements Runnable {
    public final /* synthetic */ FBPaymentServiceContactCallback A00;
    public final /* synthetic */ FBPaymentServiceImpl A01;

    public TOR(FBPaymentServiceContactCallback fBPaymentServiceContactCallback, FBPaymentServiceImpl fBPaymentServiceImpl) {
        this.A01 = fBPaymentServiceImpl;
        this.A00 = fBPaymentServiceContactCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A01;
        C62761SPt c62761SPt = fBPaymentServiceImpl.A02;
        if (c62761SPt != null) {
            InterfaceC65512Tlh interfaceC65512Tlh = ((C62706SMu) c62761SPt.A01.get()).A02;
            C14360o3.A0B(interfaceC65512Tlh, 0);
            S24.A00(fBPaymentServiceImpl, C75M.A01(new Q8H(interfaceC65512Tlh), C65064Tct.A00), new DRW(this.A00, 9));
        }
    }
}
