package X;

import android.util.Base64;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.GsonUtils;
import com.facebookpay.offsite.models.message.MessageHandler;
import com.facebookpay.offsite.models.message.MessageType$Companion;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.instagram.common.session.UserSession;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public abstract class T2U implements MessageHandler {
    public static final AtomicLong A09 = AbstractC58318PtA.A15(System.currentTimeMillis());
    public InterfaceC72010XEy A00;
    public String A01;
    public final FragmentActivity A02;
    public final SNG A05;
    public final SM1 A06;
    public final InterfaceC09390do A07;
    public final InterfaceC58362lv A03 = C63628Sqa.A00(this, 20);
    public final InterfaceC58362lv A04 = C63628Sqa.A00(this, 21);
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new X2x(this, 29));

    public final C69779VvG A00() {
        String A05;
        R8Y r8y = (R8Y) this;
        QF6 C9a = r8y.A02.C9a();
        if (C9a != null && (A05 = C9a.A05()) != null) {
            ((C67719Uwk) r8y.A08.getValue()).A00 = A05;
            String A15 = AbstractC25225BEi.A15(r8y.A09);
            boolean Cb4 = ((T2U) r8y).A00.Cb4();
            Map map = (Map) r8y.A07.getValue();
            String Br8 = ((T2U) r8y).A00.Br8();
            String A02 = r8y.A02();
            String str = r8y.A05;
            InterfaceC09390do interfaceC09390do = r8y.A0A;
            String A00 = SVS.A00((SVS) interfaceC09390do.getValue());
            UserSession userSession = r8y.A03;
            C38321qM A0h = AbstractC25229BEm.A0h(userSession, A00);
            String string = ((SVS) interfaceC09390do.getValue()).A00.getString("TrackingInfo.ARG_TRACKING_TOKEN");
            if (string == null && A0h != null) {
                string = AbstractC41071vF.A0F(userSession, A0h);
            }
            return new C69779VvG(A05, A15, Br8, A02, str, string, map, Cb4);
        }
        C0K8.A0C("IAWOffsiteMessageHandler", "Webview url is empty");
        return null;
    }

    public final void A01(PaymentRequestContent paymentRequestContent) {
        InterfaceC72010XEy interfaceC72010XEy;
        C14360o3.A0B(paymentRequestContent, 0);
        if (!C14360o3.A0K(this.A00.getProductId(), AbstractC68343VNd.A00(paymentRequestContent))) {
            interfaceC72010XEy = this.A06.A00(AbstractC68343VNd.A00(paymentRequestContent));
            InterfaceC09390do interfaceC09390do = this.A07;
            ((CheckoutHandler) interfaceC09390do.getValue()).A0G();
            CheckoutHandler checkoutHandler = (CheckoutHandler) interfaceC09390do.getValue();
            C14360o3.A0B(interfaceC72010XEy, 0);
            checkoutHandler.A03 = interfaceC72010XEy;
        } else {
            interfaceC72010XEy = this.A00;
        }
        this.A00 = interfaceC72010XEy;
        InterfaceC09390do interfaceC09390do2 = this.A07;
        if (((CheckoutHandler) interfaceC09390do2.getValue()).A03 == null) {
            CheckoutHandler checkoutHandler2 = (CheckoutHandler) interfaceC09390do2.getValue();
            InterfaceC72010XEy interfaceC72010XEy2 = this.A00;
            C14360o3.A0B(interfaceC72010XEy2, 0);
            checkoutHandler2.A03 = interfaceC72010XEy2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0020. Please report as an issue. */
    @Override // com.facebookpay.offsite.models.message.MessageHandler
    public void handleMessage(String str, String str2) {
        FragmentActivity fragmentActivity;
        String str3;
        Runnable runnableC71449WuB;
        FragmentActivity fragmentActivity2;
        Runnable runnableC71450WuC;
        C14360o3.A0B(str, 0);
        byte[] decode = Base64.decode(str, 0);
        C14360o3.A07(decode);
        Charset charset = StandardCharsets.UTF_8;
        C14360o3.A08(charset);
        String A0m = AbstractC58318PtA.A0m(charset, decode);
        GsonUtils gsonUtils = GsonUtils.INSTANCE;
        String messageType = gsonUtils.getMessageType(A0m);
        switch (messageType.hashCode()) {
            case -1142390254:
                if (messageType.equals(MessageType$Companion.AVAILABLE_REQUEST)) {
                    PaymentRequest toOffsitePaymentRequest = gsonUtils.getToOffsitePaymentRequest(A0m);
                    A01(toOffsitePaymentRequest.content);
                    fragmentActivity = this.A02;
                    if (fragmentActivity != null) {
                        runnableC71449WuB = new RunnableC71449WuB(this, toOffsitePaymentRequest);
                        fragmentActivity.runOnUiThread(runnableC71449WuB);
                        return;
                    } else {
                        str3 = "Host activity is null for Availability Request event";
                        C0K8.A0C("OffsiteMessageHandler", str3);
                        return;
                    }
                }
                throw AbstractC58319PtB.A0k("Unexpected message type ", gsonUtils.getMessageType(A0m), " received from Merchant");
            case -302871978:
                if (messageType.equals(MessageType$Companion.PAYMENT_HANDLED)) {
                    fragmentActivity2 = this.A02;
                    if (fragmentActivity2 != null) {
                        runnableC71450WuC = new RunnableC71450WuC(this, A0m);
                        fragmentActivity2.runOnUiThread(runnableC71450WuC);
                        return;
                    } else {
                        str3 = "Host activity is null for Payment Handled event";
                        C0K8.A0C("OffsiteMessageHandler", str3);
                        return;
                    }
                }
                throw AbstractC58319PtB.A0k("Unexpected message type ", gsonUtils.getMessageType(A0m), " received from Merchant");
            case 100017577:
                if (messageType.equals(MSV.A00(1480))) {
                    PaymentRequest toOffsitePaymentRequest2 = gsonUtils.getToOffsitePaymentRequest(A0m);
                    PaymentRequestContent paymentRequestContent = toOffsitePaymentRequest2.content;
                    String str4 = paymentRequestContent.paymentOptions.fulfillmentType;
                    if (str4 == null) {
                        str4 = this.A01;
                    }
                    this.A01 = str4;
                    A01(paymentRequestContent);
                    fragmentActivity = this.A02;
                    if (fragmentActivity != null) {
                        runnableC71449WuB = new TOH(this, toOffsitePaymentRequest2);
                        fragmentActivity.runOnUiThread(runnableC71449WuB);
                        return;
                    } else {
                        str3 = "Host activity is null for Payment Request event";
                        C0K8.A0C("OffsiteMessageHandler", str3);
                        return;
                    }
                }
                throw AbstractC58319PtB.A0k("Unexpected message type ", gsonUtils.getMessageType(A0m), " received from Merchant");
            case 1680331711:
                if (messageType.equals(MessageType$Companion.PAYMENT_DETAILS_UPDATED)) {
                    fragmentActivity2 = this.A02;
                    if (fragmentActivity2 != null) {
                        runnableC71450WuC = new TOI(this, A0m);
                        fragmentActivity2.runOnUiThread(runnableC71450WuC);
                        return;
                    } else {
                        str3 = "Host activity is null for Payment Details Updated event";
                        C0K8.A0C("OffsiteMessageHandler", str3);
                        return;
                    }
                }
                throw AbstractC58319PtB.A0k("Unexpected message type ", gsonUtils.getMessageType(A0m), " received from Merchant");
            default:
                throw AbstractC58319PtB.A0k("Unexpected message type ", gsonUtils.getMessageType(A0m), " received from Merchant");
        }
    }

    @Override // com.facebookpay.offsite.models.message.MessageHandler
    public final ECPHandler getEcpHandler() {
        return (ECPHandler) this.A08.getValue();
    }

    public T2U(FragmentActivity fragmentActivity, SNG sng, SM1 sm1, InterfaceC09390do interfaceC09390do) {
        this.A02 = fragmentActivity;
        this.A05 = sng;
        this.A07 = interfaceC09390do;
        this.A06 = sm1;
        this.A00 = sm1.A00("742725890006429");
    }
}
