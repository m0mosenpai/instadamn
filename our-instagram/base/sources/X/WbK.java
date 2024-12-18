package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebookpay.expresscheckout.models.CheckoutAvailability;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.offsite.models.message.AvailabilityInitiator$Companion;
import com.facebookpay.offsite.models.message.MessageType$Companion;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentContainerType;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.offsite.models.message.PaymentDetails;
import com.facebookpay.offsite.models.message.PaymentMode;
import com.facebookpay.offsite.models.message.PaymentOffer;
import com.facebookpay.offsite.models.message.PaymentOptions;
import com.facebookpay.offsite.models.message.PaymentPickupInfo;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.PaymentUXFlags;
import com.facebookpay.offsite.models.message.W3CShippingAddress;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class WbK implements InterfaceC72010XEy {
    public W6H A00 = new W6H(null);
    public boolean A01;

    @Override // X.InterfaceC72010XEy
    public final List Bbo(C69478Vo1 c69478Vo1) {
        List list;
        String str;
        ShippingAddress shippingAddress;
        W3CShippingAddress w3CShippingAddress;
        String str2;
        PaymentPickupInfo paymentPickupInfo;
        String str3;
        W3CShippingAddress w3CShippingAddress2;
        String str4;
        ArrayList arrayList = new ArrayList();
        W6H w6h = this.A00;
        PaymentDetails paymentDetails = w6h.A01;
        if (paymentDetails == null || (list = paymentDetails.offers) == null) {
            list = C16930sl.A00;
        }
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((PaymentOffer) it.next()).code);
        }
        if (!AbstractC16990sr.A0d(A0q.toArray(new String[0]), c69478Vo1.A0C.toArray(new String[0]))) {
            arrayList.add(PaymentDetailChangeTypes$Companion.OFFERS);
        }
        String str5 = c69478Vo1.A0A;
        String str6 = null;
        if (str5 != null) {
            PaymentDetails paymentDetails2 = w6h.A01;
            if (paymentDetails2 != null) {
                str4 = paymentDetails2.shippingOptionId;
            } else {
                str4 = null;
            }
            if (!C14360o3.A0K(str4, str5)) {
                arrayList.add(PaymentDetailChangeTypes$Companion.SHIPPING_OPTION_ID);
            }
        }
        ShippingAddress shippingAddress2 = c69478Vo1.A01;
        if (shippingAddress2 != null) {
            PaymentDetails paymentDetails3 = w6h.A01;
            if (paymentDetails3 != null) {
                w3CShippingAddress2 = paymentDetails3.shippingAddress;
            } else {
                w3CShippingAddress2 = null;
            }
            if (!W6a.A02(w3CShippingAddress2, W6a.A01(shippingAddress2, null))) {
                arrayList.add(PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS);
            }
        }
        String str7 = c69478Vo1.A06;
        if (str7 != null) {
            PaymentDetails paymentDetails4 = w6h.A01;
            if (paymentDetails4 != null) {
                str3 = paymentDetails4.fulfillmentOptionId;
            } else {
                str3 = null;
            }
            if (!C14360o3.A0K(str3, str7)) {
                arrayList.add(PaymentDetailChangeTypes$Companion.FULFILLMENT_OPTION_ID);
            }
        }
        String str8 = c69478Vo1.A09;
        if (str8 != null) {
            PaymentDetails paymentDetails5 = w6h.A01;
            if (paymentDetails5 != null && (paymentPickupInfo = paymentDetails5.pickupInfo) != null) {
                str2 = paymentPickupInfo.pickupRadiusZipCode;
            } else {
                str2 = null;
            }
            if (!C14360o3.A0K(str2, str8)) {
                arrayList.add(PaymentDetailChangeTypes$Companion.PICKUP_ZIP_CODE);
            }
        }
        if (A01() == null && (shippingAddress = c69478Vo1.A00) != null) {
            PaymentDetails paymentDetails6 = w6h.A01;
            if (paymentDetails6 != null) {
                w3CShippingAddress = paymentDetails6.billingAddress;
            } else {
                w3CShippingAddress = null;
            }
            if (!W6a.A02(w3CShippingAddress, W6a.A01(shippingAddress, null))) {
                arrayList.add(PaymentDetailChangeTypes$Companion.BILLING_ADDRESS);
            }
        }
        if (A01() != null) {
            String str9 = c69478Vo1.A05;
            if (str9 != null) {
                PaymentDetails paymentDetails7 = w6h.A01;
                if (paymentDetails7 != null) {
                    str = paymentDetails7.emailId;
                } else {
                    str = null;
                }
                if (!C14360o3.A0K(str, str9)) {
                    arrayList.add(PaymentDetailChangeTypes$Companion.EMAIL);
                }
            }
            String str10 = c69478Vo1.A08;
            if (str10 != null) {
                PaymentDetails paymentDetails8 = w6h.A01;
                if (paymentDetails8 != null) {
                    str6 = paymentDetails8.phoneId;
                }
                if (!C14360o3.A0K(str6, str10)) {
                    arrayList.add(PaymentDetailChangeTypes$Companion.PHONE_NUMBER);
                }
            }
        }
        if (A01() != null && C14360o3.A0K(c69478Vo1.A03, "DEFAULT") && arrayList.size() == 1) {
            if (arrayList.contains(PaymentDetailChangeTypes$Companion.OFFERS) || arrayList.contains(PaymentDetailChangeTypes$Companion.SHIPPING_OPTION_ID) || arrayList.contains(PaymentDetailChangeTypes$Companion.FULFILLMENT_OPTION_ID)) {
                return C16930sl.A00;
            }
            return arrayList;
        }
        return arrayList;
    }

    private final boolean A00() {
        String str;
        C69779VvG c69779VvG;
        String str2;
        W6H w6h = this.A00;
        PaymentReceiverInfo A00 = w6h.A00();
        if (A00 != null) {
            str = A00.A02;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            UserSession userSession = C2FP.A0D().A00;
            C06090Tz c06090Tz = C06090Tz.A06;
            if (AbstractC001900j.A0Q(C18U.A04(c06090Tz, userSession, 36884796886221395L), new char[]{','}, 0).contains(str) && ((c69779VvG = w6h.A04) == null || (str2 = c69779VvG.A01) == null || str2.length() == 0 || !AbstractC001900j.A0Q(C18U.A04(c06090Tz, C2FP.A0D().A00, 36884796886352468L), new char[]{','}, 0).contains(str2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.VNb] */
    public final C68341VNb A01() {
        W6H w6h = this.A00;
        if (!C14360o3.A0K(w6h.A03(), "FIRMLY_TEST") && !C14360o3.A0K(w6h.A03(), "FIRMLY_PROD")) {
            return null;
        }
        return new Object();
    }

    @Override // X.InterfaceC72010XEy
    public final PaymentRequest AMk() {
        if (A01() != null) {
            W6H w6h = this.A00;
            String A03 = w6h.A03();
            String A04 = w6h.A04();
            PaymentMode A01 = w6h.A01();
            C14360o3.A0B(A01, 2);
            if (A03 != null && A04 != null) {
                String format = String.format(Locale.ROOT, "%s::%s", MSX.A1b(A03, A04, 2));
                C14360o3.A07(format);
                boolean z = !AbstractC167007dF.A0m(C18U.A04(C06090Tz.A05, C2FP.A0D().A00, 36876451766468721L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0).contains(format);
                PaymentDetails paymentDetails = new PaymentDetails(null, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null, null, null, null, null, null, null, null);
                PaymentOptions paymentOptions = new PaymentOptions(false, z, z, true, true, null, null, null, true, false, null, null, null, null, null, null);
                Map A0n = AbstractC167007dF.A0n(PaymentContainerType.FIRMLY_TOKEN_V1, AbstractC06930Yk.A0E());
                java.util.Set singleton = Collections.singleton(PaymentUXFlags.META_CHECKOUT);
                C14360o3.A07(singleton);
                return new PaymentRequest("", new PaymentRequestContent(paymentDetails, paymentOptions, new PaymentConfiguration("", A03, A04, A0n, A01, null, null, "", "", singleton, null, null, null, null)), System.currentTimeMillis(), null, MessageType$Companion.PAYMENT_REQUEST, null);
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC72010XEy
    public final java.util.Set AbM(PaymentRequest paymentRequest) {
        C01G c01g = new C01G();
        java.util.Set<PaymentContainerType> keySet = paymentRequest.content.paymentConfiguration.supportedContainers.keySet();
        ArrayList A0q = AbstractC167017dG.A0q(keySet);
        Iterator<PaymentContainerType> it = keySet.iterator();
        while (it.hasNext()) {
            A0q.add(VNI.A00(it.next().getType()));
        }
        java.util.Set A06 = this.A00.A06();
        if (A06 == null) {
            A06 = C16910sj.A00;
        }
        java.util.Set A0l = AbstractC001800i.A0l(A0q, AbstractC001800i.A0k(A06));
        if (A0l.contains(VEM.A05) || A0l.contains(VEM.A06) || A0l.contains(VEM.A08)) {
            c01g.add(EnumC68119VCc.A02);
        }
        if (A0l.contains(VEM.A0A)) {
            c01g.add(EnumC68119VCc.A03);
        }
        return AbstractC10090gM.A04(c01g);
    }

    @Override // X.InterfaceC72010XEy
    public final W6H AnO() {
        return this.A00;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1T() {
        return true;
    }

    @Override // X.InterfaceC72010XEy
    public final Boolean B1e() {
        return null;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1f() {
        return true;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1g() {
        return true;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean Bgn() {
        String str;
        java.util.Set A05;
        C63406Sjd c63406Sjd;
        CheckoutAvailability checkoutAvailability;
        ImmutableList requiredCompactedEnumListField;
        Iterable iterable;
        Boolean bool;
        VD8 vd8;
        java.util.Set A052;
        W6H w6h = this.A00;
        PaymentRequest paymentRequest = w6h.A02;
        if (paymentRequest != null) {
            str = OffsiteInitAvailabilityRequestKt.isIAWAvailabilityRequest(paymentRequest);
        } else {
            str = null;
        }
        if (!C14360o3.A0K(str, AvailabilityInitiator$Companion.INITIATOR_JS_SDK)) {
            return true;
        }
        java.util.Set A06 = w6h.A06();
        if (A06 != null && (A05 = w6h.A05()) != null && !AbstractC001800i.A0l(A05, A06).isEmpty()) {
            if (A01() != null) {
                return true;
            }
            if (!C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36313501812131883L) || (c63406Sjd = w6h.A05) == null || (checkoutAvailability = (CheckoutAvailability) c63406Sjd.A01) == null || (requiredCompactedEnumListField = checkoutAvailability.A00.A01.getRequiredCompactedEnumListField(2, "availability_conditions", VFN.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null || !requiredCompactedEnumListField.contains(VFN.MC_PUX_C)) {
                return true;
            }
            java.util.Set A062 = w6h.A06();
            if (A062 != null && (A052 = w6h.A05()) != null) {
                iterable = AbstractC001800i.A0l(A052, A062);
            } else {
                iterable = C16910sj.A00;
            }
            List A0a = AbstractC001800i.A0a(iterable);
            ArrayList arrayList = new ArrayList();
            Iterator it = A0a.iterator();
            while (it.hasNext()) {
                int ordinal = ((VEM) it.next()).ordinal();
                if (ordinal != 0 && ordinal != 5) {
                    if (ordinal == 2) {
                        vd8 = VD8.A08;
                    }
                } else {
                    vd8 = VD8.A07;
                }
                arrayList.add(vd8);
            }
            if (!arrayList.isEmpty()) {
                LinkedHashMap A00 = VNF.A00(AbstractC001800i.A0k(arrayList));
                if (!A00.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        Object obj = A00.get(it2.next());
                        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null && bool.booleanValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean BoJ() {
        return false;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean BvX() {
        return this.A01;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean Bvb() {
        return false;
    }

    @Override // X.InterfaceC72010XEy
    public final Boolean CQi() {
        String str;
        PaymentReceiverInfo A00 = this.A00.A00();
        if (A00 != null && (str = A00.A00) != null) {
            return Boolean.valueOf(AbstractC167007dF.A0m(C18U.A04(C06090Tz.A05, C2FP.A0D().A00, 36876451766796402L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0).contains(AbstractC167007dF.A0m(str, "::", 0).get(1)));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC72010XEy
    public final void E4g(Map map) {
        ?? r1;
        W6H w6h = this.A00;
        if (w6h.A02 != null) {
            DHZ dhz = new DHZ(41, map, this, VNF.A00(AbstractC009903n.A0K(VD8.values())));
            Iterator it = C70189WFs.A03.iterator();
            while (it.hasNext()) {
                dhz.invoke(it.next());
            }
            java.util.Set A05 = w6h.A05();
            if (A05 != null) {
                r1 = AbstractC167017dG.A0q(A05);
                Iterator it2 = A05.iterator();
                while (it2.hasNext()) {
                    r1.add(((VEM) it2.next()).A00);
                }
            } else {
                r1 = C16930sl.A00;
            }
            map.put("MERCHANT_CONTAINER_TYPES", r1);
        }
    }

    @Override // X.InterfaceC72010XEy
    public final void clear() {
        W6H w6h = this.A00;
        w6h.A07 = null;
        w6h.A06 = null;
        w6h.A00 = null;
        w6h.A03 = null;
        w6h.A01 = null;
        w6h.A08 = true;
    }

    @Override // X.InterfaceC72010XEy
    public final String getProductId() {
        return "1302814060304063";
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1X() {
        return AbstractC167007dF.A1W(A01());
    }

    @Override // X.InterfaceC72010XEy
    public final Boolean B1a() {
        if (!A00()) {
            Boolean A0c = AbstractC166997dE.A0c(C06090Tz.A06, C2FP.A0D().A00, 36321846932678505L);
            C14360o3.A0A(A0c);
            return A0c;
        }
        return null;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1c() {
        if (A01() == null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1i() {
        return AbstractC167007dF.A1W(A01());
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B7o() {
        return AbstractC167007dF.A1W(A01());
    }

    @Override // X.InterfaceC72010XEy
    public final boolean C3L() {
        return AbstractC167007dF.A1W(A01());
    }

    @Override // X.InterfaceC72010XEy
    public final boolean CRH() {
        if (A01() != null) {
            return false;
        }
        return C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36313501812394030L);
    }

    @Override // X.InterfaceC72010XEy
    public final void CjG() {
        java.util.Set set;
        java.util.Set A05;
        if (A00()) {
            W6H w6h = this.A00;
            java.util.Set A06 = w6h.A06();
            if (A06 != null && (A05 = w6h.A05()) != null) {
                set = AbstractC001800i.A0l(A05, A06);
            } else {
                set = C16910sj.A00;
            }
            if (set.contains(VEM.A06)) {
                if (!C18U.A06(C06090Tz.A06, C2FP.A0D().A00, 36321846933006187L) || C2FP.A01().A0D.A0C(new C62735SOb(null, "1302814060304063"), VDW.A05)) {
                    C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36313501812656177L);
                }
            }
        }
    }

    @Override // X.InterfaceC72010XEy
    public final void EeA(boolean z) {
        this.A01 = z;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.0oO, java.lang.Object] */
    @Override // X.InterfaceC72010XEy
    public final Boolean Eij(String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ) {
        boolean z;
        String str2;
        if (A01() == null) {
            if (C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36313501812131883L)) {
                PaymentRequest paymentRequest = this.A00.A02;
                if (paymentRequest != null) {
                    str2 = OffsiteInitAvailabilityRequestKt.isIAWAvailabilityRequest(paymentRequest);
                } else {
                    str2 = null;
                }
                if (!C14360o3.A0K(str2, AvailabilityInitiator$Companion.INITIATOR_JS_SDK)) {
                    C58252li A05 = C2FP.A01().A0D.A05(new C62735SOb(null, "1302814060304063"));
                    ?? obj = new Object();
                    obj.A00 = AbstractC25229BEm.A1a(A05.A08, C2GT.A0A);
                    A05.A09(new C63617SqP(0, interfaceC16820sZ, this, obj, A05));
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
