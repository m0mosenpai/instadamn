package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.PaymentRequest;

/* loaded from: classes10.dex */
public final class TOH implements Runnable {
    public final /* synthetic */ T2U A00;
    public final /* synthetic */ PaymentRequest A01;

    public TOH(T2U t2u, PaymentRequest paymentRequest) {
        this.A00 = t2u;
        this.A01 = paymentRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String A05;
        T2U t2u = this.A00;
        R8Y r8y = (R8Y) t2u;
        QF6 C9a = r8y.A02.C9a();
        if (C9a != null && (A05 = C9a.A05()) != null) {
            PaymentRequest paymentRequest = this.A01;
            InterfaceC09390do interfaceC09390do = t2u.A07;
            C2GS A09 = ((CheckoutHandler) interfaceC09390do.getValue()).A09(paymentRequest, A05, AbstractC63402SjX.A05(r8y.A06), C16930sl.A00);
            FragmentActivity fragmentActivity = t2u.A02;
            A09.A06(fragmentActivity, t2u.A04);
            ((CheckoutHandler) interfaceC09390do.getValue()).A0N.A06(fragmentActivity, t2u.A03);
            return;
        }
        C0K8.A0C("OffsiteMessageHandler", "Security Origin is empty for Payment Request event");
    }
}
