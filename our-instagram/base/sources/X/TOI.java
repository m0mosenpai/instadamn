package X;

import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.GsonUtils;

/* loaded from: classes10.dex */
public final class TOI implements Runnable {
    public final /* synthetic */ T2U A00;
    public final /* synthetic */ String A01;

    public TOI(T2U t2u, String str) {
        this.A00 = t2u;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T2U t2u = this.A00;
        ((CheckoutHandler) t2u.A07.getValue()).A0J(GsonUtils.INSTANCE.toOffsitePaymentUpdatedMsg(this.A01, t2u.A01), false);
    }
}
