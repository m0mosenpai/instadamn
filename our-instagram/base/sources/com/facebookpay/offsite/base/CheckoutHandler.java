package com.facebookpay.offsite.base;

import X.AbstractC001800i;
import X.AbstractC06930Yk;
import X.AbstractC09440dt;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC23641Du;
import X.AbstractC24481Hr;
import X.AbstractC25228BEl;
import X.AbstractC31177DnL;
import X.AbstractC43592JPx;
import X.AbstractC58317Pt9;
import X.AbstractC62190S1l;
import X.AbstractC65702TsY;
import X.AbstractC68343VNd;
import X.AbstractC69847VwY;
import X.AbstractC69850Vwb;
import X.AnonymousClass191;
import X.AnonymousClass195;
import X.AnonymousClass963;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C0eB;
import X.C14360o3;
import X.C16920sk;
import X.C18U;
import X.C19L;
import X.C1GJ;
import X.C1JX;
import X.C1ON;
import X.C26561Ql;
import X.C2FP;
import X.C2GS;
import X.C2GT;
import X.C56149OwF;
import X.C57533Pg7;
import X.C63406Sjd;
import X.C67657Uuo;
import X.C67719Uwk;
import X.C69075VhQ;
import X.C69076VhS;
import X.C69721VuG;
import X.C69779VvG;
import X.C70189WFs;
import X.C71764X1r;
import X.EnumC68186VFe;
import X.InterfaceC09390do;
import X.InterfaceC23621Ds;
import X.InterfaceC72010XEy;
import X.LFo;
import X.MCH;
import X.MI7;
import X.MWM;
import X.Q1y;
import X.SNQ;
import X.T2U;
import X.TU9;
import X.VDH;
import X.VEJ;
import X.VT9;
import X.VTA;
import X.VYW;
import X.W6H;
import X.W6X;
import X.Wad;
import X.WbT;
import X.X48;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebookpay.common.models.ErrorDialogContent;
import com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.facebookpay.offsite.models.message.MessageParamsKt;
import com.facebookpay.offsite.models.message.MessageType$Companion;
import com.facebookpay.offsite.models.message.OffsiteShippingType$Companion;
import com.facebookpay.offsite.models.message.PaymentDataError;
import com.facebookpay.offsite.models.message.PaymentDataErrorField;
import com.facebookpay.offsite.models.message.PaymentDetails;
import com.facebookpay.offsite.models.message.PaymentDetailsUpdate;
import com.facebookpay.offsite.models.message.PaymentDetailsUpdatedError;
import com.facebookpay.offsite.models.message.PaymentDetailsUpdatedResponse;
import com.facebookpay.offsite.models.message.PaymentError;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.PaymentResponse;
import com.facebookpay.offsite.models.message.PaymentResponseWithAdditionalData;
import com.facebookpay.offsite.models.message.W3CShippingAddress;
import com.instagram.common.session.UserSession;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public abstract class CheckoutHandler {
    public PhoneNumberUtil A00;
    public DefaultPaymentMethodFields A01;
    public ECPAvailabilityRequestParams A02;
    public InterfaceC72010XEy A03;
    public Q1y A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public AnonymousClass195 A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final Fragment A0M;
    public final C69721VuG A0U;
    public final InterfaceC09390do A0Y;
    public final C19L A0Z;
    public final boolean A0a;
    public final Wad A0S = new Wad(this);
    public final LFo A0T = new LFo();
    public final C2GS A0Q = new C2GS();
    public final C2GS A0P = new C2GS();
    public final AtomicReference A0V = new AtomicReference("0");
    public Map A0F = AbstractC06930Yk.A0E();
    public final AtomicReference A0W = new AtomicReference("0");
    public final C2GS A0N = new C2GS();
    public final C2GS A0O = new C2GS();
    public final C2GS A0R = new C2GT(C63406Sjd.A03(null));
    public final InterfaceC09390do A0X = AbstractC09440dt.A01(X48.A00);

    public final Object A0B(C2GS c2gs, PaymentRequest paymentRequest, C69779VvG c69779VvG, Boolean bool, List list, Map map, Map map2, InterfaceC23621Ds interfaceC23621Ds) {
        if (A0A().Bgo() == C05F.A01) {
            A0H(c2gs, paymentRequest, c69779VvG, map, map2);
        } else {
            Object A01 = A01(c2gs, this, paymentRequest, c69779VvG, bool, list, map, map2, interfaceC23621Ds);
            if (A01 == C1JX.A02) {
                return A01;
            }
        }
        return C0eB.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r11 = java.lang.System.currentTimeMillis();
        r9 = r3.A01;
        r1 = r9.A09;
        r8 = X.AbstractC25230BEn.A1P(((r11 - ((X.InterfaceC19630xq) r1.getValue()).getLong("proactive_checkout_cooldown_start_time_ms", 0)) > ((java.lang.Number) X.AbstractC166987dD.A17(r9.A04)).longValue() ? 1 : ((r11 - ((X.InterfaceC19630xq) r1.getValue()).getLong("proactive_checkout_cooldown_start_time_ms", 0)) == ((java.lang.Number) X.AbstractC166987dD.A17(r9.A04)).longValue() ? 0 : -1)));
        r6 = ((X.InterfaceC19630xq) r1.getValue()).getLong("proactive_checkout_cooldown_start_time_ms", 0);
        r5 = ((X.InterfaceC19630xq) r1.getValue()).getBoolean("proactive_checkout_should_stop_showing_banner", false);
        r4 = r9.A00();
        r2.put("proactiveCheckoutCooldownActive", java.lang.String.valueOf(r8));
        r2.put("proactiveCheckoutCooldownStartTimeMs", java.lang.String.valueOf(r6));
        r0 = ((com.facebookpay.offsite.base.CheckoutHandler) r3).A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
    
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0086, code lost:
    
        r1 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (r1 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        if (r1.A00 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        if (r1.A01 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0094, code lost:
    
        r2.put("proactiveCheckoutHasValidPaymentMethod", java.lang.String.valueOf(r0));
        r2.put("proactiveCheckoutShouldShowBanner", java.lang.String.valueOf(r3.A0L));
        r2.put("proactiveCheckoutShouldStopShowingBanner", java.lang.String.valueOf(r5));
        r2.put("proactiveCheckoutSessionList", new com.google.gson.Gson().A0B(r4));
        r2.put("proactiveCheckoutIsGKEnabled", java.lang.String.valueOf(r3.A0A().Bc7()));
        r2.put("proactiveCheckoutEligibleWithoutGK", java.lang.String.valueOf(r3.A0J));
        r2.put("proactiveCheckoutEligibleWithGK", java.lang.String.valueOf(r3.A0I));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e6, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002a, code lost:
    
        if (r14.equals("CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r14.equals(r0) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap A0F(java.lang.String r14) {
        /*
            r13 = this;
            r3 = r13
            X.Uwk r3 = (X.C67719Uwk) r3
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r1 = r14.hashCode()
            r0 = -1732568701(0xffffffff98bb1983, float:-4.8364127E-24)
            if (r1 == r0) goto Le7
            r0 = 967462192(0x39aa4d30, float:3.2482436E-4)
            if (r1 == r0) goto L24
            r0 = 1182280542(0x46782b5e, float:15882.842)
            if (r1 != r0) goto L23
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_SUCCESS"
        L1d:
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L2c
        L23:
            return r2
        L24:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L23
        L2c:
            long r11 = java.lang.System.currentTimeMillis()
            X.VuG r9 = r3.A01
            X.0do r1 = r9.A09
            java.lang.Object r0 = r1.getValue()
            X.0xq r0 = (X.InterfaceC19630xq) r0
            java.lang.String r10 = "proactive_checkout_cooldown_start_time_ms"
            r4 = 0
            long r6 = r0.getLong(r10, r4)
            long r11 = r11 - r6
            X.0do r0 = r9.A04
            java.lang.Object r0 = X.AbstractC166987dD.A17(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r6 = r0.longValue()
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            boolean r8 = X.AbstractC25230BEn.A1P(r0)
            java.lang.Object r0 = r1.getValue()
            X.0xq r0 = (X.InterfaceC19630xq) r0
            long r6 = r0.getLong(r10, r4)
            java.lang.Object r4 = r1.getValue()
            X.0xq r4 = (X.InterfaceC19630xq) r4
            java.lang.String r1 = "proactive_checkout_should_stop_showing_banner"
            r0 = 0
            boolean r5 = r4.getBoolean(r1, r0)
            java.util.List r4 = r9.A00()
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "proactiveCheckoutCooldownActive"
            r2.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "proactiveCheckoutCooldownStartTimeMs"
            r2.put(r0, r1)
            com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields r0 = r3.A01
            if (r0 == 0) goto L93
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r1 = r0.A00
            if (r1 == 0) goto L93
            X.RhJ r0 = r1.A00
            if (r0 == 0) goto L93
            java.lang.String r1 = r1.A01
            r0 = 1
            if (r1 != 0) goto L94
        L93:
            r0 = 0
        L94:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutHasValidPaymentMethod"
            r2.put(r0, r1)
            boolean r0 = r3.A0L
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutShouldShowBanner"
            r2.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "proactiveCheckoutShouldStopShowingBanner"
            r2.put(r0, r1)
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r1 = r0.A0B(r4)
            java.lang.String r0 = "proactiveCheckoutSessionList"
            r2.put(r0, r1)
            X.XEy r0 = r3.A0A()
            boolean r0 = r0.Bc7()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutIsGKEnabled"
            r2.put(r0, r1)
            boolean r0 = r3.A0J
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutEligibleWithoutGK"
            r2.put(r0, r1)
            boolean r0 = r3.A0I
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutEligibleWithGK"
            r2.put(r0, r1)
            return r2
        Le7:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL"
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A0F(java.lang.String):java.util.LinkedHashMap");
    }

    public final void A0G() {
        this.A0B = null;
        this.A0A = null;
        this.A06 = null;
        this.A07 = null;
        this.A0V.set("0");
        this.A0W.set("0");
        this.A0F = AbstractC06930Yk.A0E();
        this.A08 = null;
        this.A01 = null;
        this.A0J = false;
        this.A0I = false;
        this.A0K = false;
        this.A0L = false;
        if (this.A03 != null) {
            A0A().clear();
        }
        AnonymousClass195 anonymousClass195 = this.A0G;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
    }

    public final void A0H(C2GS c2gs, PaymentRequest paymentRequest, C69779VvG c69779VvG, Map map, Map map2) {
        String str;
        AbstractC167027dH.A0a(0, paymentRequest, c69779VvG, map, map2);
        VDH vdh = VDH.A08;
        if (A0A().Bgn()) {
            A07(c69779VvG, map2);
            vdh = VDH.A0A;
            this.A0H = true;
            if (A0A().B1X()) {
                A0K(c69779VvG.A05, map);
            }
            str = MessageAvailabilityResponseId$Companion.AVAILABLE;
        } else {
            map2.put("ERROR_CODE", "AVAILABILITY_PRODUCT_VERIFICATION");
            str = MessageAvailabilityResponseId$Companion.NOT_AVAILABLE;
        }
        map.put("CACHE_AVAILABLE", Boolean.valueOf(C2FP.A01().A08.A06(AbstractC68343VNd.A00(paymentRequest.content))));
        if (c2gs != null) {
            A02(c2gs, this, str, paymentRequest.msgId);
        }
        A0A().E4g(map);
        map.put("EVENT_EXTRA", map2);
        A0I(vdh, map);
    }

    public final void A0J(PaymentDetailsUpdatedResponse paymentDetailsUpdatedResponse, boolean z) {
        TransactionInfo transactionInfo;
        PaymentDetails paymentDetails;
        TransactionInfo transactionInfo2;
        C63406Sjd A04;
        VDH vdh;
        ArrayList arrayList;
        PaymentDetailsUpdatedError paymentDetailsUpdatedError;
        Collection<PaymentDataError> values;
        PaymentDetailsUpdatedError paymentDetailsUpdatedError2;
        Collection<PaymentDataError> values2;
        List<PaymentDataError> errors;
        String str;
        Integer num;
        List errors2;
        PaymentDetails paymentDetails2;
        String str2;
        String str3;
        Integer num2;
        W3CShippingAddress w3CShippingAddress;
        W3CShippingAddress w3CShippingAddress2;
        C14360o3.A0B(paymentDetailsUpdatedResponse, 0);
        List list = null;
        boolean z2 = true;
        String A0D = A0D(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isShortCircuit", String.valueOf(z));
        this.A0W.set("0");
        C2GS c2gs = this.A0R;
        C63406Sjd c63406Sjd = (C63406Sjd) c2gs.A02();
        if (c63406Sjd != null) {
            transactionInfo = (TransactionInfo) c63406Sjd.A01;
        } else {
            transactionInfo = null;
        }
        PaymentDetails paymentDetails3 = A00(this).A01;
        W6H A00 = A00(this);
        PaymentDetailsUpdate paymentDetailsUpdate = paymentDetailsUpdatedResponse.content;
        if (paymentDetailsUpdate != null) {
            paymentDetails = paymentDetailsUpdate.paymentDetails;
        } else {
            paymentDetails = null;
        }
        A00.A01 = paymentDetails;
        PaymentDetails paymentDetails4 = A00(this).A01;
        if (paymentDetails4 != null) {
            if (paymentDetails3 != null) {
                w3CShippingAddress2 = paymentDetails3.shippingAddress;
            } else {
                w3CShippingAddress2 = null;
            }
            paymentDetails4.shippingAddress = w3CShippingAddress2;
        }
        PaymentDetails paymentDetails5 = A00(this).A01;
        if (paymentDetails5 != null) {
            if (paymentDetails3 != null) {
                w3CShippingAddress = paymentDetails3.billingAddress;
            } else {
                w3CShippingAddress = null;
            }
            paymentDetails5.billingAddress = w3CShippingAddress;
        }
        PaymentDetailsUpdate paymentDetailsUpdate2 = paymentDetailsUpdatedResponse.content;
        if (paymentDetailsUpdate2 != null && (paymentDetails2 = paymentDetailsUpdate2.paymentDetails) != null) {
            if (transactionInfo != null && (num2 = transactionInfo.A04) != null) {
                int intValue = num2.intValue();
                if (intValue != 2) {
                    if (intValue == 1) {
                        str2 = OffsiteShippingType$Companion.DELIVERY;
                    }
                } else {
                    str2 = "PICKUP";
                }
                str3 = transactionInfo.A05;
                transactionInfo2 = AbstractC69847VwY.A00(paymentDetails2, str2, str3);
            }
            str2 = "SHIPPING";
            if (transactionInfo == null) {
                str3 = null;
                transactionInfo2 = AbstractC69847VwY.A00(paymentDetails2, str2, str3);
            }
            str3 = transactionInfo.A05;
            transactionInfo2 = AbstractC69847VwY.A00(paymentDetails2, str2, str3);
        } else {
            transactionInfo2 = null;
        }
        PaymentDetailsUpdate paymentDetailsUpdate3 = paymentDetailsUpdatedResponse.content;
        if ((paymentDetailsUpdate3 == null || (errors2 = MessageParamsKt.getErrors(paymentDetailsUpdate3)) == null || errors2.isEmpty()) && paymentDetailsUpdatedResponse.error == null) {
            A04 = C63406Sjd.A04(transactionInfo2);
        } else {
            z2 = false;
            if (transactionInfo2 == null && transactionInfo != null) {
                A04 = C63406Sjd.A04(transactionInfo);
            } else {
                PaymentError paymentError = paymentDetailsUpdatedResponse.error;
                if (paymentError != null) {
                    A04 = C63406Sjd.A05(null, new C67657Uuo(paymentError.message));
                } else {
                    PaymentDetailsUpdate paymentDetailsUpdate4 = paymentDetailsUpdatedResponse.content;
                    if (paymentDetailsUpdate4 != null && (errors = MessageParamsKt.getErrors(paymentDetailsUpdate4)) != null) {
                        ArrayList A0q = AbstractC167017dG.A0q(errors);
                        for (PaymentDataError paymentDataError : errors) {
                            PaymentDataErrorField paymentDataErrorField = paymentDataError.field;
                            if (paymentDataErrorField != null) {
                                str = paymentDataErrorField.toString();
                            } else {
                                str = null;
                            }
                            String name = paymentDataError.reason.name();
                            Integer[] A002 = C05F.A00(13);
                            ArrayList arrayList2 = new ArrayList(A002.length);
                            for (Integer num3 : A002) {
                                arrayList2.add(W6X.A02(num3));
                            }
                            if (arrayList2.contains(name) && name != null) {
                                num = W6X.A00(name);
                            } else {
                                num = C05F.A1F;
                            }
                            A0q.add(new C69076VhS(str, num, paymentDataError.message));
                        }
                        list = AbstractC001800i.A0a(A0q);
                    }
                    A04 = C63406Sjd.A05(transactionInfo2, new C71764X1r(list));
                }
            }
        }
        c2gs.A0B(A04);
        if (z2) {
            vdh = VDH.A0G;
        } else {
            vdh = VDH.A0E;
        }
        String productId = A0A().getProductId();
        Map map = this.A0F;
        C14360o3.A0B(map, 3);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(map);
        if (!linkedHashMap2.containsKey("logging_context")) {
            linkedHashMap2.put("logging_context", C70189WFs.A00(A0D, productId));
        }
        PaymentDetailsUpdate paymentDetailsUpdate5 = paymentDetailsUpdatedResponse.content;
        ArrayList arrayList3 = null;
        if (paymentDetailsUpdate5 != null && (paymentDetailsUpdatedError2 = paymentDetailsUpdate5.shippingAddressErrors) != null && (values2 = paymentDetailsUpdatedError2.values()) != null) {
            arrayList = AbstractC167007dF.A0i(values2);
            Iterator<PaymentDataError> it = values2.iterator();
            while (it.hasNext()) {
                AbstractC166997dE.A1S(it.next().reason, arrayList);
            }
        } else {
            arrayList = null;
        }
        PaymentDetailsUpdate paymentDetailsUpdate6 = paymentDetailsUpdatedResponse.content;
        if (paymentDetailsUpdate6 != null && (paymentDetailsUpdatedError = paymentDetailsUpdate6.offerCodeErrors) != null && (values = paymentDetailsUpdatedError.values()) != null) {
            arrayList3 = AbstractC167007dF.A0i(values);
            Iterator<PaymentDataError> it2 = values.iterator();
            while (it2.hasNext()) {
                AbstractC166997dE.A1S(it2.next().reason, arrayList3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList != null) {
            arrayList4.addAll(arrayList);
        }
        if (arrayList3 != null) {
            arrayList4.addAll(arrayList3);
        }
        PaymentError paymentError2 = paymentDetailsUpdatedResponse.error;
        if (paymentError2 != null) {
            arrayList4.add(paymentError2.code);
        }
        linkedHashMap2.put("ERROR_CODE", arrayList4.toString());
        linkedHashMap2.put("REQUEST_TIMESTAMP", Long.valueOf(paymentDetailsUpdatedResponse.timeStamp));
        linkedHashMap2.put("EVENT_EXTRA", linkedHashMap);
        A0I(vdh, linkedHashMap2);
    }

    public static final void A03(VEJ vej, CheckoutHandler checkoutHandler, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        String str7;
        String str8 = str5;
        Q1y q1y = checkoutHandler.A04;
        if (q1y != null) {
            if (str5 == null) {
                str8 = AbstractC166997dE.A0p(q1y, 2131961424);
            }
            ErrorDialogContent errorDialogContent = new ErrorDialogContent(vej, null, null, null, null, null, null, null, str8, AbstractC166997dE.A0p(q1y, i));
            SNQ A0H = C2FP.A0H();
            Drawable A03 = C2FP.A0A().A03(q1y);
            String A05 = errorDialogContent.A05(q1y);
            String A02 = errorDialogContent.A02(q1y);
            String A032 = errorDialogContent.A03(q1y);
            EnumC68186VFe A00 = errorDialogContent.A00();
            boolean A06 = errorDialogContent.A06();
            C69075VhQ c69075VhQ = errorDialogContent.A00;
            if (c69075VhQ != null) {
                str6 = c69075VhQ.A02;
            } else {
                str6 = null;
            }
            String A04 = errorDialogContent.A04(q1y);
            EnumC68186VFe A01 = errorDialogContent.A01();
            C69075VhQ c69075VhQ2 = errorDialogContent.A01;
            if (c69075VhQ2 != null) {
                str7 = c69075VhQ2.A02;
            } else {
                str7 = null;
            }
            AbstractC65702TsY.A0v(q1y, AbstractC69850Vwb.A01(A03, A00, A01, null, new WbT(vej, checkoutHandler, str, str2, str3, str4), A05, A02, A032, str6, A04, str7, A06), A0H);
        }
    }

    public static final void A05(CheckoutHandler checkoutHandler, String str, String str2, Map map, Map map2, Map map3) {
        C2GS c2gs = checkoutHandler.A0P;
        String valueOf = String.valueOf(T2U.A09.getAndIncrement());
        String str3 = checkoutHandler.A0B;
        if (str3 == null) {
            str3 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str4 = (String) ((AbstractMap) VYW.A00.getValue()).get(str2);
        if (str4 == null) {
            str4 = "No error message";
        }
        c2gs.A0B(new PaymentResponseWithAdditionalData(new PaymentResponse(valueOf, str3, null, currentTimeMillis, str, MessageType$Companion.PAYMENT_RESPONSE, new PaymentError(str2, str4)), map3));
        if (map != null) {
            map.put("ERROR_CODE", str2);
            LinkedHashMap A0F = checkoutHandler.A0F("CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL");
            if (map2 != null) {
                Iterator A14 = AbstractC166997dE.A14(A0F);
                while (A14.hasNext()) {
                    AbstractC31177DnL.A1S((Map.Entry) A14.next(), map2);
                }
            } else {
                map.put("EVENT_EXTRA", A0F);
            }
            checkoutHandler.A0I(VDH.A0K, map);
        }
    }

    public static final void A06(CheckoutHandler checkoutHandler, String str, Map map) {
        if (checkoutHandler.A0a) {
            C2FP.A01().A03.Chz(str, map);
        }
    }

    public static final boolean A08(CheckoutHandler checkoutHandler) {
        if (checkoutHandler.A05 != null && A00(checkoutHandler).A03() != null && A00(checkoutHandler).A04() != null && checkoutHandler.A03 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x025e, code lost:
    
        if (((X.InterfaceC19630xq) r59.A0U.A09.getValue()).getBoolean("proactive_checkout_should_stop_showing_banner", false) != false) goto L392;
     */
    /* JADX WARN: Removed duplicated region for block: B:239:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0685 A[LOOP:10: B:250:0x067f->B:252:0x0685, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0726  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2GS A09(com.facebookpay.offsite.models.message.PaymentRequest r60, java.lang.String r61, java.util.List r62, java.util.List r63) {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A09(com.facebookpay.offsite.models.message.PaymentRequest, java.lang.String, java.util.List, java.util.List):X.2GS");
    }

    public final InterfaceC72010XEy A0A() {
        InterfaceC72010XEy interfaceC72010XEy = this.A03;
        if (interfaceC72010XEy != null) {
            return interfaceC72010XEy;
        }
        C14360o3.A0F("selectedProductConfig");
        throw C00O.createAndThrow();
    }

    public final String A0C() {
        String str = this.A05;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("availabilityRequestDomain");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (X.C14360o3.A0K(r2, r0) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r0 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0D(com.facebookpay.offsite.models.message.PaymentRequestContent r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.A09
            if (r0 == 0) goto L37
            boolean r0 = A08(r3)
            if (r0 == 0) goto L40
            X.W6H r0 = A00(r3)
            java.lang.String r2 = r0.A04()
            r0 = 0
            if (r4 == 0) goto L3e
            com.facebookpay.offsite.models.message.PaymentConfiguration r1 = r4.paymentConfiguration
            if (r1 == 0) goto L3e
            java.lang.String r1 = r1.partnerMerchantId
        L1b:
            boolean r1 = X.C14360o3.A0K(r2, r1)
            if (r1 == 0) goto L37
            X.W6H r1 = A00(r3)
            java.lang.String r2 = r1.A03()
            if (r4 == 0) goto L31
            com.facebookpay.offsite.models.message.PaymentConfiguration r1 = r4.paymentConfiguration
            if (r1 == 0) goto L31
            java.lang.String r0 = r1.partnerId
        L31:
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto L40
        L37:
            java.lang.String r0 = X.AbstractC58442PvL.A02()
        L3b:
            r3.A09 = r0
            return r0
        L3e:
            r1 = r0
            goto L1b
        L40:
            java.lang.String r0 = r3.A09
            if (r0 != 0) goto L3b
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A0D(com.facebookpay.offsite.models.message.PaymentRequestContent):java.lang.String");
    }

    public final LinkedHashMap A0E(PaymentRequest paymentRequest, C69779VvG c69779VvG, String str) {
        PaymentRequestContent paymentRequestContent = paymentRequest.content;
        String productId = A0A().getProductId();
        long j = paymentRequest.timeStamp;
        C16920sk A0E = AbstractC06930Yk.A0E();
        AbstractC167007dF.A1G(paymentRequestContent, 0, A0E);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!linkedHashMap.containsKey("logging_context")) {
            linkedHashMap.put("logging_context", C70189WFs.A00(str, productId));
        }
        linkedHashMap.put("MERCHANT_REQUEST_ID", paymentRequestContent.paymentConfiguration.requestId);
        linkedHashMap.put("PARTNER_MERCHANT_ID", paymentRequestContent.paymentConfiguration.partnerMerchantId);
        linkedHashMap.put("PARTNER_ID", paymentRequestContent.paymentConfiguration.partnerId);
        linkedHashMap.put("REQUEST_TIMESTAMP", Long.valueOf(j));
        linkedHashMap.put("EVENT_EXTRA", A0E);
        String str2 = c69779VvG.A01;
        if (str2 != null) {
            linkedHashMap.put("AD_ID", str2);
        }
        String str3 = c69779VvG.A02;
        if (str3 != null) {
            linkedHashMap.put("IAB_SESSION_ID", str3);
        }
        return linkedHashMap;
    }

    public final void A0K(String str, Map map) {
        C67719Uwk c67719Uwk = (C67719Uwk) this;
        C14360o3.A0B(map, 1);
        String A00 = AbstractC62190S1l.A00(str);
        if (A00 != null) {
            UserSession userSession = C2FP.A0D().A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36313501812459567L)) {
                c67719Uwk.A0I(VDH.A06, map);
                if (c67719Uwk.A0T.A00(A00) != null) {
                    AbstractC43592JPx.A1W("CACHE_AVAILABLE", map, true);
                    c67719Uwk.A0I(VDH.A07, map);
                    c67719Uwk.A0O.A0A(A00);
                    return;
                }
                AbstractC43592JPx.A1W("CACHE_AVAILABLE", map, false);
                VT9 vt9 = c67719Uwk.A02;
                String A04 = C18U.A04(c06090Tz, C2FP.A0D().A00, 36876451766141040L);
                MI7 mi7 = new MI7(c67719Uwk, map, A00, 3);
                C57533Pg7 c57533Pg7 = new C57533Pg7(45, map, c67719Uwk);
                String format = String.format(Locale.US, "https://%s.com/meta_checkout/merchant.js", Arrays.copyOf(new Object[]{A04}, 1));
                C14360o3.A07(format);
                C1ON A01 = AnonymousClass963.A01(AbstractC24481Hr.A06.A00(new TU9(A00, format), 1208430023, 3, false, false).A02(new C26561Ql(null), 1699372004, 3, true, false).A01(new C56149OwF(vt9, 3), 25281092, 3), AbstractC58317Pt9.A00(586), format);
                A01.A00 = new MWM(5, c57533Pg7, mi7);
                C1GJ.A03(A01);
            }
        }
    }

    public final void A0L(Map map) {
        if (this.A03 != null && !map.containsKey("PRODUCT_ID") && A0A().getProductId().length() != 0 && TextUtils.isDigitsOnly(A0A().getProductId())) {
            map.put("PRODUCT_ID", AbstractC25228BEl.A13(A0A().getProductId()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.2GT, X.2GS] */
    public CheckoutHandler(Fragment fragment, FragmentActivity fragmentActivity, C69721VuG c69721VuG, C19L c19l, boolean z) {
        this.A0M = fragment;
        this.A0a = z;
        this.A0U = c69721VuG;
        this.A0Z = c19l;
        this.A0Y = AbstractC09440dt.A01(new C57533Pg7(44, fragmentActivity, this));
        if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            VTA A09 = C2FP.A09();
            C14360o3.A0A(A09);
            Q1y q1y = new Q1y(fragmentActivity, A09);
            this.A04 = q1y;
            this.A00 = PhoneNumberUtil.A01(q1y);
        }
    }

    public static W6H A00(CheckoutHandler checkoutHandler) {
        return checkoutHandler.A0A().AnO();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r0.A01 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r4 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r10.A0A().Bc7() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C2GS r9, com.facebookpay.offsite.base.CheckoutHandler r10, java.lang.String r11, java.lang.String r12) {
        /*
            long r6 = java.lang.System.currentTimeMillis()
            X.VuG r5 = r10.A0U
            com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields r2 = r10.A01
            X.XEy r0 = r10.A0A()
            boolean r1 = r0.BoJ()
            X.W6H r0 = A00(r10)
            X.VvG r0 = r0.A04
            if (r0 == 0) goto L9f
            java.lang.String r4 = r0.A01
        L1a:
            r8 = 0
            if (r2 == 0) goto L9d
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r0 = r2.A00
            if (r0 == 0) goto L9d
            X.RhJ r0 = r0.A00
        L23:
            r3 = 0
            if (r0 == 0) goto L2f
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r0 = r2.A00
            if (r0 == 0) goto L2f
            java.lang.String r0 = r0.A01
            r2 = 1
            if (r0 != 0) goto L30
        L2f:
            r2 = 0
        L30:
            if (r1 == 0) goto L35
            r1 = 0
            if (r4 == 0) goto L36
        L35:
            r1 = 1
        L36:
            java.lang.String r0 = "AVAILABLE"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L68
            if (r2 == 0) goto L68
            if (r1 == 0) goto L68
            X.0do r0 = r5.A09
            java.lang.Object r4 = r0.getValue()
            X.0xq r4 = (X.InterfaceC19630xq) r4
            java.lang.String r2 = "proactive_checkout_cooldown_start_time_ms"
            r0 = 0
            long r0 = r4.getLong(r2, r0)
            long r6 = r6 - r0
            X.0do r0 = r5.A04
            java.lang.Object r0 = X.AbstractC166987dD.A17(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            boolean r0 = X.AbstractC25230BEn.A1P(r0)
            if (r0 != 0) goto L68
            r3 = 1
        L68:
            r10.A0J = r3
            if (r3 == 0) goto L77
            X.XEy r0 = r10.A0A()
            boolean r1 = r0.Bc7()
            r0 = 1
            if (r1 != 0) goto L78
        L77:
            r0 = 0
        L78:
            r10.A0I = r0
            java.util.concurrent.atomic.AtomicLong r0 = X.T2U.A09
            long r0 = r0.getAndIncrement()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            boolean r1 = r10.A0J
            java.lang.String r0 = r10.A0E
            com.facebookpay.offsite.models.message.AvailableMessageContent r3 = new com.facebookpay.offsite.models.message.AvailableMessageContent
            r3.<init>(r11, r1, r0)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "fbpayAvailableResponse"
            com.facebookpay.offsite.models.message.AvailabilityResponse r1 = new com.facebookpay.offsite.models.message.AvailabilityResponse
            r6 = r12
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r9.A0B(r1)
            return
        L9d:
            r0 = r8
            goto L23
        L9f:
            r4 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A02(X.2GS, com.facebookpay.offsite.base.CheckoutHandler, java.lang.String, java.lang.String):void");
    }

    public static final void A04(CheckoutHandler checkoutHandler) {
        ECPPaymentResponseParams eCPPaymentResponseParams = A00(checkoutHandler).A00;
        if (A08(checkoutHandler) && eCPPaymentResponseParams != null) {
            C19L c19l = checkoutHandler.A0Z;
            AbstractC23641Du.A05(AnonymousClass191.A00, new MCH(eCPPaymentResponseParams, checkoutHandler, (InterfaceC23621Ds) null, 17), c19l);
        }
    }

    private final void A07(C69779VvG c69779VvG, Map map) {
        map.put("isNuxUser", String.valueOf(A00(this).A06));
        map.put("clickSourceFromIAW", c69779VvG.A00);
        Map map2 = c69779VvG.A06;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.putAll(A0F("CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS"));
    }

    public final void A0I(VDH vdh, Map map) {
        AbstractC167017dG.A1N(vdh, map);
        if (this.A0a) {
            A0L(map);
            C70189WFs.A03(vdh, map);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x032e, code lost:
    
        if (r22 == null) goto L213;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A01(X.C2GS r35, com.facebookpay.offsite.base.CheckoutHandler r36, com.facebookpay.offsite.models.message.PaymentRequest r37, X.C69779VvG r38, java.lang.Boolean r39, java.util.List r40, java.util.Map r41, java.util.Map r42, X.InterfaceC23621Ds r43) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A01(X.2GS, com.facebookpay.offsite.base.CheckoutHandler, com.facebookpay.offsite.models.message.PaymentRequest, X.VvG, java.lang.Boolean, java.util.List, java.util.Map, java.util.Map, X.1Ds):java.lang.Object");
    }
}
