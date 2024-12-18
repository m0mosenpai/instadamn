package X;

import com.facebookpay.expresscheckout.models.ECPOffer;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.offsite.models.message.PaymentRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.WFs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70189WFs {
    public static final LoggingPolicy A00;
    public static final C70189WFs A01 = new Object();
    public static final Map A02 = AbstractC06930Yk.A06(new C09530e4("USER_HAS_CARD", VD8.A07), new C09530e4("USER_HAS_TOKENIZED_CARD", VD8.A08), new C09530e4("USER_HAS_SHIPPING_ADDRESS", VD8.A02), new C09530e4("USER_HAS_EMAIL", VD8.A03), new C09530e4("USER_HAS_PHONE", VD8.A05));
    public static final java.util.Set A03;

    public static final LoggingContext A00(String str, String str2) {
        C14360o3.A0B(str, 0);
        long parseLong = Long.parseLong(str2);
        LoggingPolicy loggingPolicy = A00;
        C16910sj c16910sj = C16910sj.A00;
        return new LoggingContext(loggingPolicy, str, c16910sj, c16910sj, parseLong, false);
    }

    public static final LinkedHashMap A01(C69478Vo1 c69478Vo1, String str, String str2, Map map) {
        C14360o3.A0B(map, 3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        if (!linkedHashMap.containsKey("logging_context")) {
            linkedHashMap.put("logging_context", A00(str2, str));
        }
        ArrayList arrayList = new ArrayList();
        if (c69478Vo1.A01 != null) {
            arrayList.add(PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS);
        }
        if (c69478Vo1.A00 != null) {
            arrayList.add(PaymentDetailChangeTypes$Companion.BILLING_ADDRESS);
        }
        if (c69478Vo1.A0A != null) {
            arrayList.add(PaymentDetailChangeTypes$Companion.SHIPPING_OPTION_ID);
        }
        if (!c69478Vo1.A0C.isEmpty()) {
            arrayList.add(PaymentDetailChangeTypes$Companion.OFFERS);
        }
        if (c69478Vo1.A06 != null) {
            arrayList.add(PaymentDetailChangeTypes$Companion.FULFILLMENT_OPTION_ID);
        }
        if (c69478Vo1.A09 != null) {
            arrayList.add(PaymentDetailChangeTypes$Companion.PICKUP_ZIP_CODE);
        }
        linkedHashMap.put("CHANGED_FIELDS", arrayList);
        return linkedHashMap;
    }

    public static final void A03(VDH vdh, Map map) {
        C14360o3.A0B(map, 1);
        C2FP.A01().A0B.Chz(vdh.name(), map);
    }

    public final LinkedHashMap A04(ECPPaymentResponseParams eCPPaymentResponseParams, String str, String str2, String str3) {
        C14360o3.A0B(eCPPaymentResponseParams, 0);
        C09530e4 c09530e4 = new C09530e4("logging_context", A00(str2, str));
        List<ECPOffer> list = eCPPaymentResponseParams.A0S;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator<ECPOffer> it = list.iterator();
        while (it.hasNext()) {
            A0q.add(it.next().A00);
        }
        LinkedHashMap A07 = AbstractC06930Yk.A07(c09530e4, new C09530e4("APPLIED_DISCOUNTS", A0q), new C09530e4("CONTAINER_IDS", AbstractC166987dD.A1J(eCPPaymentResponseParams.A0B)), new C09530e4("VIEW_NAME", "merchant_validation"));
        EnumC72407Xcu enumC72407Xcu = eCPPaymentResponseParams.A04;
        if (enumC72407Xcu != null) {
            A07.put("CREDENTIAL_TYPE", enumC72407Xcu);
        }
        Long l = eCPPaymentResponseParams.A08;
        if (l != null) {
            A07.put("CREDENTIAL_ID", l);
        }
        if (str3 != null) {
            A07.put(AbstractC111324zv.A00(154), str3);
        }
        return A07;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.WFs, java.lang.Object] */
    static {
        String[] strArr = {"USER_HAS_CARD", "USER_HAS_TOKENIZED_CARD", "USER_HAS_EMAIL", "USER_HAS_PHONE", "USER_HAS_SHIPPING_ADDRESS"};
        C14360o3.A0B(strArr, 0);
        A03 = AbstractC009903n.A0K(strArr);
        A00 = new LoggingPolicy("payments_offsite_partners", new ArrayList());
    }

    public static final LinkedHashMap A02(PaymentRequest paymentRequest, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!linkedHashMap.containsKey("logging_context")) {
            linkedHashMap.put("logging_context", A00(str2, str));
        }
        linkedHashMap.put("PARTNER_MERCHANT_ID", paymentRequest.content.paymentConfiguration.partnerMerchantId);
        linkedHashMap.put("PARTNER_ID", paymentRequest.content.paymentConfiguration.partnerId);
        linkedHashMap.put("MERCHANT_REQUEST_ID", paymentRequest.content.paymentConfiguration.requestId);
        return linkedHashMap;
    }
}
