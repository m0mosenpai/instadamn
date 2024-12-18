package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPOffer;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.PickupFulfillmentOption;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.MessageType$Companion;
import com.facebookpay.offsite.models.message.PaymentDetails;
import com.facebookpay.offsite.models.message.PaymentDetailsChangedContent;
import com.facebookpay.offsite.models.message.PaymentDetailsChangedEvent;
import com.facebookpay.offsite.models.message.PaymentDetailsUpdate;
import com.facebookpay.offsite.models.message.PaymentDetailsUpdatedResponse;
import com.facebookpay.offsite.models.message.PaymentResponse;
import com.facebookpay.offsite.models.message.PaymentResponseContent;
import com.facebookpay.offsite.models.message.PaymentResponseWithAdditionalData;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class Wad implements ECPHandler {
    public final /* synthetic */ CheckoutHandler A00;

    @Override // X.XEU
    public final void CJP(C63406Sjd c63406Sjd) {
        VDH vdh;
        String message;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        CheckoutHandler checkoutHandler = this.A00;
        linkedHashMap.putAll(checkoutHandler.A0F);
        linkedHashMap.put("REQUEST_TIMESTAMP", AbstractC31173DnH.A0g());
        ECPPaymentResponseParams eCPPaymentResponseParams = CheckoutHandler.A00(checkoutHandler).A00;
        if (eCPPaymentResponseParams != null && (str = eCPPaymentResponseParams.A0C) != null) {
            linkedHashMap.put("CONTAINER_TYPE", str);
        }
        if (C63406Sjd.A0J(c63406Sjd)) {
            ECPPaymentResponseParams eCPPaymentResponseParams2 = (ECPPaymentResponseParams) c63406Sjd.A01;
            if (eCPPaymentResponseParams2 != null) {
                Map map = null;
                PaymentResponseContent A02 = WDw.A02(eCPPaymentResponseParams2, null);
                C2GS c2gs = checkoutHandler.A0P;
                String valueOf = String.valueOf(T2U.A09.getAndIncrement());
                String str2 = checkoutHandler.A0B;
                if (str2 == null) {
                    str2 = "";
                }
                PaymentResponse paymentResponse = new PaymentResponse(valueOf, str2, A02, System.currentTimeMillis(), (String) checkoutHandler.A0V.get(), MessageType$Companion.PAYMENT_RESPONSE, null);
                String str3 = eCPPaymentResponseParams2.A00;
                if (str3 != null) {
                    map = AbstractC167007dF.A0n(AbstractC58317Pt9.A00(552), str3);
                }
                c2gs.A0B(new PaymentResponseWithAdditionalData(paymentResponse, map));
                checkoutHandler.A0I(VDH.A0J, linkedHashMap);
                CheckoutHandler.A04(checkoutHandler);
                return;
            }
            vdh = VDH.A0H;
            AbstractC43592JPx.A1W("RETRYABLE", linkedHashMap, false);
            linkedHashMap.put("ERROR_CODE", "PAYPAL_AUTHORIZATION_ERROR");
        } else {
            if (!C63406Sjd.A0G(c63406Sjd)) {
                return;
            }
            AbstractC43592JPx.A1W("RETRYABLE", linkedHashMap, true);
            linkedHashMap.put("ERROR_CODE", "PAYPAL_AUTHORIZATION_ERROR");
            Throwable th = c63406Sjd.A02;
            if (th != null && (message = th.getMessage()) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Locale locale = Locale.ROOT;
                C14360o3.A08(locale);
                String lowerCase = "ERROR_MESSAGE".toLowerCase(locale);
                C14360o3.A07(lowerCase);
                linkedHashMap2.put(lowerCase, message);
                linkedHashMap.put("EVENT_EXTRA", linkedHashMap2);
            }
            vdh = VDH.A0H;
        }
        checkoutHandler.A0I(vdh, linkedHashMap);
    }

    @Override // X.XEU
    public final void CJe() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2GT, X.2GS] */
    @Override // X.XEU
    public final C2GS E3o() {
        return new C2GT(C63406Sjd.A03(null));
    }

    @Override // com.facebookpay.expresscheckout.handler.ECPHandler
    public final void ENN(C69478Vo1 c69478Vo1) {
        TransactionInfo transactionInfo;
        C14360o3.A0B(c69478Vo1, 0);
        CheckoutHandler checkoutHandler = this.A00;
        String A0D = checkoutHandler.A0D(null);
        checkoutHandler.A0I(VDH.A0F, C70189WFs.A01(c69478Vo1, checkoutHandler.A0A().getProductId(), A0D, checkoutHandler.A0F));
        AtomicReference atomicReference = checkoutHandler.A0W;
        if (!C14360o3.A0K(atomicReference.get(), "0")) {
            checkoutHandler.A0I(VDH.A0E, C70189WFs.A01(c69478Vo1, checkoutHandler.A0A().getProductId(), A0D, checkoutHandler.A0F));
            return;
        }
        C2GS c2gs = checkoutHandler.A0R;
        C63406Sjd c63406Sjd = (C63406Sjd) c2gs.A02();
        if (c63406Sjd == null || (transactionInfo = (TransactionInfo) c63406Sjd.A01) == null) {
            return;
        }
        C63406Sjd.A0D(c2gs, transactionInfo);
        String valueOf = String.valueOf(T2U.A09.getAndIncrement());
        long currentTimeMillis = System.currentTimeMillis();
        List Bbo = checkoutHandler.A0A().Bbo(c69478Vo1);
        if (!Bbo.isEmpty()) {
            W6H A00 = CheckoutHandler.A00(checkoutHandler);
            ShippingAddress shippingAddress = c69478Vo1.A01;
            ShippingAddress shippingAddress2 = c69478Vo1.A00;
            A00.A01 = AbstractC69847VwY.A01(transactionInfo, shippingAddress, shippingAddress2, null, c69478Vo1.A0A, c69478Vo1.A06, c69478Vo1.A09, c69478Vo1.A05, c69478Vo1.A08, c69478Vo1.A0C);
            atomicReference.set(valueOf);
            if (checkoutHandler.A0A().B1i()) {
                AbstractC63246Sg0.A01(null, ((C62635SJs) checkoutHandler.A0X.getValue()).A00(WGr.A01(c69478Vo1)), new C70307WQn(4, c69478Vo1, checkoutHandler));
                return;
            } else {
                checkoutHandler.A0N.A0B(new PaymentDetailsChangedEvent(valueOf, new PaymentDetailsChangedContent(AbstractC69847VwY.A01(transactionInfo, c69478Vo1.A01, shippingAddress2, checkoutHandler.A0A().BlK(), c69478Vo1.A0A, c69478Vo1.A06, c69478Vo1.A09, c69478Vo1.A05, c69478Vo1.A08, c69478Vo1.A0C), Bbo), currentTimeMillis, null, MessageType$Companion.PAYMENT_DETAILS_CHANGED, null));
                return;
            }
        }
        checkoutHandler.A0J(new PaymentDetailsUpdatedResponse(valueOf, new PaymentDetailsUpdate(null, null, CheckoutHandler.A00(checkoutHandler).A01, null), currentTimeMillis, null, MessageType$Companion.PAYMENT_DETAILS_UPDATED, null), true);
    }

    @Override // com.facebookpay.expresscheckout.handler.ECPHandler
    public final void ERM(C64863TXo c64863TXo) {
    }

    public Wad(CheckoutHandler checkoutHandler) {
        this.A00 = checkoutHandler;
    }

    @Override // X.XEU
    public final C2GS AHI() {
        return new C2GS();
    }

    @Override // X.XEU
    public final void CJf(boolean z) {
        CheckoutHandler checkoutHandler = this.A00;
        if (checkoutHandler.A0K) {
            long currentTimeMillis = System.currentTimeMillis();
            checkoutHandler.A0U.A01(new C69549VrD(currentTimeMillis, null), currentTimeMillis);
        }
        if (checkoutHandler.A03 != null) {
            checkoutHandler.A0A().Aa4().A01();
        }
        C63406Sjd.A0D(checkoutHandler.A0R, null);
        checkoutHandler.A0Q.A0B(null);
        checkoutHandler.A0N.A0B(null);
        checkoutHandler.A0P.A0B(null);
        checkoutHandler.A09 = null;
        checkoutHandler.A0G();
    }

    @Override // X.XEU
    public final C2GS CKC(ECPPaymentResponseParams eCPPaymentResponseParams) {
        C0CA c0ca;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        String str4;
        C69779VvG c69779VvG;
        C69779VvG c69779VvG2;
        Date date;
        Integer num;
        Date date2;
        Integer num2;
        String country;
        CheckoutHandler checkoutHandler = this.A00;
        C2GS c2gs = checkoutHandler.A0Q;
        if (!C63406Sjd.A0H((C63406Sjd) c2gs.A02())) {
            checkoutHandler.A08 = eCPPaymentResponseParams.A0D;
            String str5 = null;
            C63406Sjd.A0D(c2gs, null);
            C04060Jx c04060Jx = GraphQlCallInput.A02;
            C0CA c0ca2 = null;
            String str6 = eCPPaymentResponseParams.A0K;
            if (str6 != null) {
                c0ca2 = c04060Jx.A02();
                C0CA.A00(c0ca2, str6, "pickup_person_email");
            }
            String str7 = eCPPaymentResponseParams.A0N;
            if (str7 != null) {
                C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, str7, AbstractC58317Pt9.A00(128));
                try {
                    PhoneNumberUtil phoneNumberUtil = checkoutHandler.A00;
                    if (phoneNumberUtil == null || (country = phoneNumberUtil.A0H(phoneNumberUtil.A0F(str7, null))) == null) {
                        C2FP.A08();
                        country = C1Q2.A02().getCountry();
                    }
                } catch (C40f unused) {
                    C2FP.A08();
                    country = C1Q2.A02().getCountry();
                }
                C0CA.A00(A0T, country, "country_code");
                if (c0ca2 == null) {
                    c0ca2 = c04060Jx.A02();
                }
                c0ca2.A0E(A0T, "pickup_person_phone");
            }
            String str8 = eCPPaymentResponseParams.A0L;
            if (str8 != null) {
                if (c0ca2 == null) {
                    c0ca2 = c04060Jx.A02();
                }
                C0CA.A00(c0ca2, str8, "pickup_person_name");
            }
            String str9 = eCPPaymentResponseParams.A0M;
            if (str9 != null) {
                if (c0ca2 == null) {
                    c0ca2 = c04060Jx.A02();
                }
                C0CA.A00(c0ca2, str9, "pickup_notes");
            }
            FulfillmentOption fulfillmentOption = eCPPaymentResponseParams.A01;
            if (fulfillmentOption != null) {
                boolean z = fulfillmentOption instanceof PickupFulfillmentOption;
                if (z) {
                    ShippingAddress shippingAddress = ((PickupFulfillmentOption) fulfillmentOption).A02;
                    C0CA A0T2 = AbstractC25227BEk.A0T(c04060Jx, shippingAddress.A01, ServerW3CShippingAddressConstants.CITY);
                    C0CA.A00(A0T2, shippingAddress.A07, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                    C0CA.A00(A0T2, shippingAddress.A02, "country_code");
                    C0CA.A00(A0T2, shippingAddress.A08, "street");
                    C0CA.A00(A0T2, shippingAddress.A09, "street2");
                    C0CA.A00(A0T2, shippingAddress.A06, ServerW3CShippingAddressConstants.POSTAL_CODE);
                    if (c0ca2 == null) {
                        c0ca2 = c04060Jx.A02();
                    }
                    c0ca2.A0E(A0T2, "pickup_address");
                }
                if (z) {
                    date = ((PickupFulfillmentOption) fulfillmentOption).A06;
                } else {
                    date = fulfillmentOption.A03;
                }
                if (date != null) {
                    num = Integer.valueOf((int) date.getTime());
                } else {
                    num = null;
                }
                c0ca = c04060Jx.A02();
                C0CA.A00(c0ca, num, "fulfillment_start_date_time");
                if (z) {
                    date2 = ((PickupFulfillmentOption) fulfillmentOption).A05;
                } else {
                    date2 = fulfillmentOption.A02;
                }
                if (date2 != null) {
                    num2 = Integer.valueOf((int) date2.getTime());
                } else {
                    num2 = null;
                }
                C0CA.A00(c0ca, num2, "fulfillment_end_date_time");
                if (z) {
                    C0CA.A00(c0ca, "PICKUP", "fulfillment_type");
                } else {
                    C0CA.A00(c0ca, "SHIPPING", "fulfillment_type");
                }
            } else {
                c0ca = null;
            }
            String str10 = eCPPaymentResponseParams.A0E;
            String str11 = eCPPaymentResponseParams.A0A;
            TransactionInfo transactionInfo = eCPPaymentResponseParams.A03;
            CurrencyAmount A03 = WGr.A03(transactionInfo);
            C2JO c2jo = new C2JO();
            c2jo.A09(A03.A01, "amount");
            c2jo.A09(A03.A00, "currency_code");
            String str12 = eCPPaymentResponseParams.A0H;
            String str13 = eCPPaymentResponseParams.A0F;
            String str14 = eCPPaymentResponseParams.A0G;
            ShippingAddress shippingAddress2 = eCPPaymentResponseParams.A07;
            if (shippingAddress2 != null) {
                str5 = shippingAddress2.A04;
            }
            List<ECPOffer> list = eCPPaymentResponseParams.A0S;
            ArrayList A0i = AbstractC167007dF.A0i(list);
            for (ECPOffer eCPOffer : list) {
                C2JO c2jo2 = new C2JO();
                String str15 = eCPOffer.A01;
                String str16 = eCPOffer.A00;
                if (str15 == str16) {
                    str15 = null;
                }
                c2jo2.A09(str15, "offer_id");
                c2jo2.A09(str16, "offer_code");
                A0i.add(c2jo2);
            }
            ArrayList<PriceInfo> arrayList2 = transactionInfo.A08;
            if (arrayList2 != null) {
                ArrayList<PriceInfo> arrayList3 = new ArrayList();
                Iterator<PriceInfo> it = arrayList2.iterator();
                while (it.hasNext()) {
                    PriceInfo next = it.next();
                    VE5 ve5 = next.A01;
                    if (ve5 == VE5.A04 || ve5 == VE5.A07) {
                        arrayList3.add(next);
                    }
                }
                arrayList = AbstractC167007dF.A0i(arrayList3);
                for (PriceInfo priceInfo : arrayList3) {
                    C2JO c2jo3 = new C2JO();
                    C2JO c2jo4 = new C2JO();
                    CurrencyAmount currencyAmount = priceInfo.A00;
                    c2jo4.A09(currencyAmount.A01, "amount");
                    c2jo4.A09(currencyAmount.A00, "currency_code");
                    c2jo3.A06(c2jo4, "amount");
                    c2jo3.A09(priceInfo.A04, DialogModule.KEY_TITLE);
                    arrayList.add(c2jo3);
                }
            } else {
                arrayList = null;
            }
            String str17 = checkoutHandler.A0A;
            String str18 = checkoutHandler.A06;
            String str19 = checkoutHandler.A07;
            if (CheckoutHandler.A08(checkoutHandler)) {
                str = checkoutHandler.A0C();
            } else {
                str = null;
            }
            if (CheckoutHandler.A08(checkoutHandler) && (c69779VvG2 = CheckoutHandler.A00(checkoutHandler).A04) != null) {
                str2 = c69779VvG2.A01;
            } else {
                str2 = null;
            }
            if (CheckoutHandler.A08(checkoutHandler)) {
                str3 = checkoutHandler.A0A().getProductId();
            } else {
                str3 = null;
            }
            if (CheckoutHandler.A08(checkoutHandler) && checkoutHandler.A0A().B1j() && (c69779VvG = CheckoutHandler.A00(checkoutHandler).A04) != null) {
                str4 = c69779VvG.A03;
            } else {
                str4 = null;
            }
            Be9 be9 = new Be9();
            be9.A07(str10, "order_id");
            be9.A07(str11, "typed_container_id");
            be9.A06(c2jo, "total_amount");
            be9.A07(str12, "buyer_phone_number");
            be9.A07(str13, "buyer_email");
            be9.A07(str14, "buyer_name");
            be9.A07(str5, AbstractC58317Pt9.A00(12));
            be9.A05("discounts", A0i);
            be9.A05("discount_lines", arrayList);
            be9.A07(str17, "pixel_id");
            be9.A07(str18, "event_id");
            be9.A07(str19, "user_external_id");
            be9.A07(str, AbstractC43591JPw.A00(967));
            be9.A07(str2, "ad_id");
            be9.A07(str3, AbstractC58317Pt9.A00(335));
            C0CA A02 = be9.A02();
            if (c0ca == null) {
                c0ca = c04060Jx.A02();
            }
            A02.A0E(c0ca, "fulfillment_info");
            C0CA A022 = be9.A02();
            if (c0ca2 == null) {
                c0ca2 = c04060Jx.A02();
            }
            A022.A0E(c0ca2, "pickup_info");
            be9.A07(str4, "tracking_token");
            AbstractC23641Du.A05(AnonymousClass191.A00, new C57172PZq(checkoutHandler, be9, eCPPaymentResponseParams, (InterfaceC23621Ds) null, 48), checkoutHandler.A0Z);
            return c2gs;
        }
        throw new IllegalStateException("Update order mutation is already in progress. Cannot handle new payment responses from ECP concurrently");
    }

    @Override // com.facebookpay.expresscheckout.handler.ECPHandler
    public final void Eg7(C63406Sjd c63406Sjd) {
        CheckoutHandler checkoutHandler = this.A00;
        C2GS c2gs = checkoutHandler.A0R;
        C63406Sjd c63406Sjd2 = (C63406Sjd) c2gs.A02();
        PaymentDetails paymentDetails = null;
        if (c63406Sjd2 == null || c63406Sjd2.A01 == null) {
            W6H A00 = CheckoutHandler.A00(checkoutHandler);
            TransactionInfo transactionInfo = (TransactionInfo) c63406Sjd.A01;
            if (transactionInfo != null) {
                paymentDetails = AbstractC69847VwY.A01(transactionInfo, null, null, null, null, null, null, null, null, null);
            }
            A00.A01 = paymentDetails;
            c2gs.A0B(c63406Sjd);
        }
    }

    @Override // com.facebookpay.expresscheckout.handler.ECPHandler
    public final C2GS F8A() {
        return this.A00.A0R;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.XEU
    public final void CJa(SIL sil, LoggingContext loggingContext, Integer num) {
        Map A0n;
        CheckoutHandler checkoutHandler;
        String str;
        Map map;
        String str2;
        switch (num.intValue()) {
            case 0:
                checkoutHandler = this.A00;
                if (checkoutHandler.A0K) {
                    long currentTimeMillis = System.currentTimeMillis();
                    checkoutHandler.A0U.A01(new C69549VrD(currentTimeMillis, C05F.A00), currentTimeMillis);
                }
                Object obj = checkoutHandler.A0V.get();
                C14360o3.A07(obj);
                str = (String) obj;
                map = null;
                str2 = "ABORTED";
                CheckoutHandler.A05(checkoutHandler, str, str2, map, map, map);
                CheckoutHandler checkoutHandler2 = this.A00;
                C63406Sjd.A0D(checkoutHandler2.A0R, null);
                checkoutHandler2.A0Q.A0B(null);
                checkoutHandler2.A0N.A0B(null);
                checkoutHandler2.A0P.A0B(null);
                checkoutHandler2.A09 = null;
                checkoutHandler2.A0G();
                return;
            case 1:
                checkoutHandler = this.A00;
                Object obj2 = checkoutHandler.A0V.get();
                C14360o3.A07(obj2);
                str = (String) obj2;
                map = null;
                str2 = "INTERNAL_ERROR";
                CheckoutHandler.A05(checkoutHandler, str, str2, map, map, map);
                CheckoutHandler checkoutHandler22 = this.A00;
                C63406Sjd.A0D(checkoutHandler22.A0R, null);
                checkoutHandler22.A0Q.A0B(null);
                checkoutHandler22.A0N.A0B(null);
                checkoutHandler22.A0P.A0B(null);
                checkoutHandler22.A09 = null;
                checkoutHandler22.A0G();
                return;
            case 2:
                checkoutHandler = this.A00;
                Object obj3 = checkoutHandler.A0V.get();
                C14360o3.A07(obj3);
                str = (String) obj3;
                map = null;
                str2 = "CHECKOUT_ERROR_RISK";
                CheckoutHandler.A05(checkoutHandler, str, str2, map, map, map);
                CheckoutHandler checkoutHandler222 = this.A00;
                C63406Sjd.A0D(checkoutHandler222.A0R, null);
                checkoutHandler222.A0Q.A0B(null);
                checkoutHandler222.A0N.A0B(null);
                checkoutHandler222.A0P.A0B(null);
                checkoutHandler222.A09 = null;
                checkoutHandler222.A0G();
                return;
            case 3:
                CheckoutHandler checkoutHandler2222 = this.A00;
                C63406Sjd.A0D(checkoutHandler2222.A0R, null);
                checkoutHandler2222.A0Q.A0B(null);
                checkoutHandler2222.A0N.A0B(null);
                checkoutHandler2222.A0P.A0B(null);
                checkoutHandler2222.A09 = null;
                checkoutHandler2222.A0G();
                return;
            case 4:
                CheckoutHandler checkoutHandler3 = this.A00;
                Object obj4 = checkoutHandler3.A0V.get();
                C14360o3.A07(obj4);
                CheckoutHandler.A05(checkoutHandler3, (String) obj4, "DISMISSED_FOR_SESSION", null, null, null);
                if (checkoutHandler3.A03 != null) {
                    checkoutHandler3.A0A().Aa4().A01();
                }
                CheckoutHandler checkoutHandler22222 = this.A00;
                C63406Sjd.A0D(checkoutHandler22222.A0R, null);
                checkoutHandler22222.A0Q.A0B(null);
                checkoutHandler22222.A0N.A0B(null);
                checkoutHandler22222.A0P.A0B(null);
                checkoutHandler22222.A09 = null;
                checkoutHandler22222.A0G();
                return;
            case 5:
                CheckoutHandler checkoutHandler4 = this.A00;
                String A00 = AbstractC62190S1l.A00(((C67719Uwk) checkoutHandler4).A00);
                if (A00 == null) {
                    A0n = null;
                } else {
                    A0n = AbstractC167007dF.A0n(AbstractC58317Pt9.A00(634), A00);
                }
                if (checkoutHandler4.A03 != null) {
                    checkoutHandler4.A0A().Aa4().A01();
                }
                Object obj5 = checkoutHandler4.A0V.get();
                C14360o3.A07(obj5);
                CheckoutHandler.A05(checkoutHandler4, (String) obj5, "CHECKOUT_UNAVAILABLE", null, null, A0n);
                CheckoutHandler checkoutHandler222222 = this.A00;
                C63406Sjd.A0D(checkoutHandler222222.A0R, null);
                checkoutHandler222222.A0Q.A0B(null);
                checkoutHandler222222.A0N.A0B(null);
                checkoutHandler222222.A0P.A0B(null);
                checkoutHandler222222.A09 = null;
                checkoutHandler222222.A0G();
                return;
            default:
                throw new RuntimeException();
        }
    }
}
