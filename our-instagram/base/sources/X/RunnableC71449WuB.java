package X;

import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.AvailabilityInitiator$Companion;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentContainerType;
import com.facebookpay.offsite.models.message.PaymentCurrencyAmount;
import com.facebookpay.offsite.models.message.PaymentItem;
import com.facebookpay.offsite.models.message.PaymentMode;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.UriUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: X.WuB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71449WuB implements Runnable {
    public final /* synthetic */ T2U A00;
    public final /* synthetic */ PaymentRequest A01;

    public RunnableC71449WuB(T2U t2u, PaymentRequest paymentRequest) {
        this.A00 = t2u;
        this.A01 = paymentRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VDU vdu;
        PaymentCurrencyAmount paymentCurrencyAmount;
        String name;
        T2U t2u = this.A00;
        C69779VvG A00 = t2u.A00();
        if (A00 != null) {
            PaymentRequest paymentRequest = this.A01;
            CheckoutHandler checkoutHandler = (CheckoutHandler) t2u.A07.getValue();
            PaymentRequestContent paymentRequestContent = paymentRequest.content;
            C2GS c2gs = new C2GS();
            if (A00.A07 && checkoutHandler.A03 != null && C14360o3.A0K(checkoutHandler.A0A().getProductId(), AbstractC68343VNd.A00(paymentRequestContent))) {
                String A0D = checkoutHandler.A0D(paymentRequest.content);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap A0E = checkoutHandler.A0E(paymentRequest, A00, A0D);
                A0E.put("INITIATOR", AvailabilityInitiator$Companion.INITIATOR_JS_SDK);
                checkoutHandler.A0I(VDH.A09, A0E);
                String str = A00.A04;
                if (str != null) {
                    linkedHashMap.put("sdkFeatureFlags", str);
                }
                CheckoutHandler.A00(checkoutHandler).A04 = A00;
                UriUtils uriUtils = UriUtils.INSTANCE;
                String uriAuthorityAndPath = uriUtils.toUriAuthorityAndPath(A00.A05);
                C14360o3.A0B(uriAuthorityAndPath, 0);
                checkoutHandler.A05 = uriAuthorityAndPath;
                checkoutHandler.A0E = str;
                checkoutHandler.A0V.set("0");
                PaymentRequestContent paymentRequestContent2 = paymentRequest.content;
                PaymentConfiguration paymentConfiguration = paymentRequestContent2.paymentConfiguration;
                checkoutHandler.A0A = paymentConfiguration.pixelId;
                checkoutHandler.A06 = paymentConfiguration.eventId;
                checkoutHandler.A07 = paymentConfiguration.externalId;
                String str2 = paymentRequest.msgId;
                String A0C = checkoutHandler.A0C();
                LoggingPolicy loggingPolicy = C70189WFs.A00;
                boolean Bc7 = checkoutHandler.A0A().Bc7();
                boolean z = checkoutHandler.A0a;
                AbstractC43594JPz.A1P(str2, loggingPolicy);
                PaymentConfiguration paymentConfiguration2 = paymentRequestContent2.paymentConfiguration;
                C14360o3.A0B(paymentConfiguration2, 0);
                String format = String.format(Locale.ROOT, "%s::%s", MSX.A1b(paymentConfiguration2.partnerId, paymentConfiguration2.partnerMerchantId, 2));
                C14360o3.A07(format);
                PaymentReceiverInfo paymentReceiverInfo = new PaymentReceiverInfo(format, paymentConfiguration2.merchantName, null, null);
                String A002 = AbstractC68343VNd.A00(paymentRequestContent2);
                String uriAuthorityAndPath2 = uriUtils.toUriAuthorityAndPath(A0C);
                java.util.Set singleton = Collections.singleton(VDD.A0D);
                C14360o3.A07(singleton);
                VD7[] vd7Arr = {VD7.A03, VD7.A04, VD7.A05};
                C14360o3.A0B(vd7Arr, 0);
                java.util.Set A0K = AbstractC009903n.A0K(vd7Arr);
                PaymentMode paymentMode = paymentRequestContent2.paymentConfiguration.mode;
                if (paymentMode == null || (name = paymentMode.name()) == null || (vdu = VDU.valueOf(name)) == null) {
                    vdu = VDU.A04;
                }
                String uriAuthorityAndPath3 = uriUtils.toUriAuthorityAndPath(A0C);
                ArrayList A1M = AbstractC16960so.A1M(EnumC68131VCp.A04);
                PaymentItem paymentItem = paymentRequestContent2.paymentDetails.total;
                if (paymentItem != null && (paymentCurrencyAmount = paymentItem.amount) != null) {
                    CurrencyAmount A003 = WDw.A00(paymentCurrencyAmount);
                    java.util.Set<PaymentContainerType> keySet = paymentRequestContent2.paymentConfiguration.supportedContainers.keySet();
                    ArrayList A0q = AbstractC167017dG.A0q(keySet);
                    Iterator<PaymentContainerType> it = keySet.iterator();
                    while (it.hasNext()) {
                        A0q.add(VNI.A00(it.next().getType()));
                    }
                    checkoutHandler.A02 = new ECPAvailabilityRequestParams(new ECPPaymentConfiguration(A003, null, vdu, null, uriAuthorityAndPath3, A1M, A0q, null, null, null), paymentReceiverInfo, loggingPolicy, A0D, str2, A002, uriAuthorityAndPath2, singleton, A0K, 0, Bc7, !z, true);
                    checkoutHandler.A0G = AbstractC23641Du.A04(AnonymousClass191.A00, new MCR(linkedHashMap, paymentRequest, A00, c2gs, checkoutHandler, A0E, (InterfaceC23621Ds) null, 6), checkoutHandler.A0Z);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                CheckoutHandler.A02(c2gs, checkoutHandler, MessageAvailabilityResponseId$Companion.NOT_AVAILABLE, paymentRequest.msgId);
            }
            AbstractC31180DnO.A1F(t2u.A02, c2gs, new X67(2, paymentRequest, t2u), 25);
        }
    }
}
