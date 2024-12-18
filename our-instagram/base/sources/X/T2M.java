package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* loaded from: classes10.dex */
public final class T2M implements InterfaceC65504TlY {
    public final C62643SKa A01 = new C62643SKa();
    public final SKb A02 = new SKb();
    public final C62985Sa9 A00 = new C62985Sa9();

    public static final synchronized void A00(C58252li c58252li, T2M t2m, String str, List list) {
        synchronized (t2m) {
            C63406Sjd.A0C(c58252li, new SG5(((SG5) C63406Sjd.A07(c58252li)).A00, str, list));
        }
    }

    public final synchronized void A04(C62735SOb c62735SOb) {
        C63406Sjd c63406Sjd;
        C58252li A01 = A01(c62735SOb);
        C14360o3.A0C(A01, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
        C63406Sjd A0S = AbstractC58318PtA.A0S(A01);
        if (A0S != null) {
            c63406Sjd = C63406Sjd.A01(C63577Spk.A00, A0S);
        } else {
            c63406Sjd = null;
        }
        A01.A0B(c63406Sjd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (((com.facebookpay.shippingaddress.model.ShippingAddress) r3.get(0)).A0C != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.C62735SOb r8, X.C63406Sjd r9, java.lang.String r10, boolean r11) {
        /*
            r7 = this;
            r6 = 0
            X.AbstractC167007dF.A1K(r8, r10)
            X.2li r5 = r7.A01(r8)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>"
            X.C14360o3.A0C(r5, r0)
            boolean r0 = X.C63406Sjd.A0J(r9)
            if (r0 == 0) goto L71
            java.lang.Object r3 = X.C63406Sjd.A08(r9)
            X.R0b r3 = (X.C60475R0b) r3
            X.QWb r0 = r3.A0E()
            if (r0 != 0) goto L71
            boolean r0 = X.C63406Sjd.A0F(r5)
            if (r0 == 0) goto L71
            java.lang.Class<X.QWc> r2 = X.C59070QWc.class
            java.lang.String r1 = "shipping_address"
            r0 = 482258055(0x1cbeac87, float:1.2617743E-21)
            X.2JS r3 = r3.getOptionalTreeField(r6, r1, r2, r0)
            r1 = 0
            if (r3 == 0) goto L74
            java.lang.Class<X.UZc> r2 = X.C66718UZc.class
            r0 = -1235561061(0xffffffffb65ad59b, float:-3.2608866E-6)
            X.2JS r0 = r3.reinterpretRequired(r6, r2, r0)
            X.UZc r0 = (X.C66718UZc) r0
            if (r0 == 0) goto L74
            com.facebookpay.shippingaddress.model.ShippingAddress r4 = X.WDu.A02(r0, r11)
            java.lang.Object r0 = X.C63406Sjd.A07(r5)
            X.SG5 r0 = (X.SG5) r0
            java.util.List r3 = r0.A02
            java.lang.String r0 = "CREATE"
            boolean r0 = r10.equals(r0)
            r2 = 1
            if (r0 == 0) goto L72
            java.lang.String r1 = r4.A04
            boolean r0 = X.AbstractC166987dD.A1b(r3)
            if (r0 == 0) goto L72
            java.lang.Object r0 = r3.get(r6)
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = (com.facebookpay.shippingaddress.model.ShippingAddress) r0
            boolean r0 = r0.A0C
            if (r0 == 0) goto L72
        L68:
            X.TdN r0 = X.C65090TdN.A00
            java.util.List r0 = X.AbstractC63058Sbf.A02(r4, r3, r0, r2)
            A00(r5, r7, r1, r0)
        L71:
            return
        L72:
            r2 = 0
            goto L68
        L74:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T2M.A05(X.SOb, X.Sjd, java.lang.String, boolean):void");
    }

    public final void A03(C62735SOb c62735SOb) {
        C62985Sa9.A00(this.A00, c62735SOb.A00, c62735SOb);
    }

    @Override // X.InterfaceC65504TlY
    public final C2GT AOg(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        Object obj = sparseArray.get(12);
        if (obj != null) {
            String str4 = (String) obj;
            C70073W1q c70073W1q = null;
            C70199WGm c70199WGm = AbstractC62321S6r.A00;
            C0Zx c0Zx = new C0Zx();
            c0Zx.A01(AbstractC58323PtF.A0L(c0Zx, "shipping_address", "DELETE"), "mutation_type");
            List A1J = AbstractC166987dD.A1J(c0Zx);
            if (otcInput != null) {
                c70073W1q = AbstractC63060Sbh.A01(otcInput);
            }
            c70199WGm.A0F(loggingContext, c70073W1q, "DELETE", null, A1J, false);
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, "DELETE", "mutation_type");
            C0CA.A00(A0T, str4, "shipping_address_id");
            C0CA.A00(A0T, AbstractC166997dE.A0b(), "skip_validation");
            Be9 A0M = AbstractC58323PtF.A0M(str, str2, str3);
            AbstractC31173DnH.A1M(A0T, A0M, "shipping_address_input");
            A0M.A07("", "platform_trust_token");
            AbstractC63060Sbh.A02(A0M, otcInput);
            RET ret = new RET(A0M, loggingContext, otcInput, this, C2FP.A06(), "DELETE", null, str2);
            AbstractC63144Sdq.A02(ret);
            Q8J q8j = ((AbstractC63144Sdq) ret).A03;
            C14360o3.A0C(q8j, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<*>>");
            C58252li A01 = C75M.A01(q8j, new C50361MLn(str4, 9));
            C58252li A012 = A01(new C62735SOb(otcInput2, str2));
            C14360o3.A0C(A012, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
            AbstractC58321PtD.A1D(A01, A012, new C50365MLr(A01, this, A012, str4, 21), 28);
            return q8j;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.0ps, java.lang.Object] */
    @Override // X.InterfaceC65504TlY
    public final C58252li ENq(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        boolean z;
        Boolean bool;
        int A06 = AbstractC167007dF.A06(1, str, str2);
        Object obj = sparseArray.get(3);
        String str4 = null;
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Object obj2 = sparseArray.get(4);
        Object obj3 = null;
        if (obj2 instanceof String) {
            obj3 = obj2;
        }
        Object obj4 = "";
        if (obj3 == null) {
            obj3 = "";
        }
        Object obj5 = sparseArray.get(A06);
        if (!(obj5 instanceof String) || obj5 == null) {
            obj5 = "";
        }
        Object obj6 = sparseArray.get(5);
        if (!(obj6 instanceof String) || obj6 == null) {
            obj6 = "";
        }
        Object obj7 = sparseArray.get(6);
        if (!(obj7 instanceof String) || obj7 == null) {
            obj7 = "";
        }
        Object obj8 = sparseArray.get(7);
        if (!(obj8 instanceof String) || obj8 == null) {
            obj8 = "";
        }
        Object obj9 = sparseArray.get(8);
        if (!(obj9 instanceof String) || obj9 == null) {
            obj9 = "";
        }
        Object obj10 = sparseArray.get(9);
        if ((obj10 instanceof String) && obj10 != null) {
            obj4 = obj10;
        }
        String A01 = C63287Sgm.A01(sparseArray);
        String str5 = null;
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, obj3, "label");
        C0CA.A00(A0T, obj5, "care_of");
        C0CA.A00(A0T, obj6, "street_1");
        C0CA.A00(A0T, obj7, "street_2");
        C0CA.A00(A0T, obj8, ServerW3CShippingAddressConstants.CITY);
        C0CA.A00(A0T, obj9, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        C0CA.A00(A0T, obj4, "postal_code");
        C0CA.A00(A0T, A01, "country_code");
        AbstractC58322PtE.A1J(A0T, z);
        C0CA.A00(A0T, true, "provide_suggestion");
        Object obj11 = sparseArray.get(12);
        if (obj11 instanceof String) {
            str4 = (String) obj11;
        }
        ?? obj12 = new Object();
        String str6 = "CREATE";
        obj12.A00 = "CREATE";
        if (str4 != null && str4.length() != 0) {
            str6 = "UPDATE";
            obj12.A00 = "UPDATE";
        }
        C70073W1q c70073W1q = null;
        if (str6.equals("CREATE")) {
            str5 = "pux_checkout";
        }
        C70199WGm c70199WGm = AbstractC62321S6r.A00;
        C0Zx c0Zx = new C0Zx();
        c0Zx.A01(AbstractC58323PtF.A0L(c0Zx, "shipping_address", str6), "mutation_type");
        List A1J = AbstractC166987dD.A1J(c0Zx);
        if (otcInput != null) {
            c70073W1q = AbstractC63060Sbh.A01(otcInput);
        }
        String str7 = str6;
        c70199WGm.A0F(loggingContext, c70073W1q, str7, str5, A1J, false);
        C2JO c2jo = new C2JO();
        c2jo.A09(str6, "mutation_type");
        c2jo.A09(str4, "shipping_address_id");
        c2jo.A08("skip_validation", true);
        AbstractC31173DnH.A1M(A0T, c2jo, "save_shipping_address_input");
        Be9 A0M = AbstractC58323PtF.A0M(str, str2, str3);
        A0M.A06(c2jo, "shipping_address_input");
        A0M.A07("", "platform_trust_token");
        AbstractC63060Sbh.A02(A0M, otcInput);
        RET ret = new RET(A0M, loggingContext, otcInput, this, C2FP.A06(), str7, str5, str2);
        AbstractC63144Sdq.A02(ret);
        Q8J q8j = ((AbstractC63144Sdq) ret).A03;
        C14360o3.A0C(q8j, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<*>>");
        C58252li A012 = C75M.A01(q8j, new C50361MLn(str4, 10));
        C62735SOb c62735SOb = new C62735SOb(otcInput2, str2);
        C58252li A013 = A01(c62735SOb);
        C14360o3.A0C(A013, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
        AbstractC58321PtD.A1D(A012, A013, new C43752JWo(1, this, otcInput, c62735SOb, A013, A012, obj12), 28);
        return C75M.A01(q8j, C65058Tcn.A00);
    }

    public final C58252li A01(C62735SOb c62735SOb) {
        boolean A02 = C2FP.A0D().A02();
        C63406Sjd c63406Sjd = null;
        C62985Sa9 c62985Sa9 = this.A00;
        if (!A02) {
            c63406Sjd = C63406Sjd.A03(null);
        }
        return c62985Sa9.A01(c63406Sjd, c62735SOb);
    }

    public final C58252li A02(C63019Saj c63019Saj, LoggingContext loggingContext, boolean z) {
        C70073W1q c70073W1q;
        Wap A0H = AbstractC43592JPx.A0H();
        List A1J = AbstractC166987dD.A1J(EnumC129485tD.A0J);
        String str = c63019Saj.A09;
        boolean A0K = C14360o3.A0K(str, "PRE_WARM");
        OtcInput otcInput = c63019Saj.A04;
        if (otcInput != null) {
            c70073W1q = AbstractC63060Sbh.A01(otcInput);
        } else {
            c70073W1q = null;
        }
        A0H.A0U(loggingContext, str, A1J, AbstractC58320PtC.A1B(c70073W1q), A0K);
        A04(AbstractC62191S1m.A00(c63019Saj));
        c63019Saj.A01(ImmutableList.of((Object) PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS));
        REP rep = new REP(C2FP.A06(), this, c63019Saj, 1, z);
        AbstractC63144Sdq.A02(rep);
        Q8J q8j = ((AbstractC63144Sdq) rep).A03;
        C58252li A01 = A01(AbstractC62191S1m.A00(c63019Saj));
        C14360o3.A0C(A01, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
        if (A01.A02() == null) {
            C63406Sjd.A0D(A01, null);
        }
        C14360o3.A0A(q8j);
        AbstractC63246Sg0.A02(q8j, A01, new C63626SqY(A01, c63019Saj, loggingContext, 8));
        return A01;
    }

    public final boolean A06(C62735SOb c62735SOb) {
        SG5 sg5;
        C63406Sjd A0S = AbstractC58318PtA.A0S(A01(c62735SOb));
        if (A0S == null || (sg5 = (SG5) A0S.A01) == null || !AbstractC166987dD.A1b(sg5.A02)) {
            return false;
        }
        return true;
    }
}
