package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.R;
import com.facebook.common.locale.Country;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.Uvx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67680Uvx extends AbstractC67710Uwb implements InterfaceC71900X9k {
    public AbstractC70120W4v A00;
    public C63406Sjd A01;
    public C63406Sjd A02;
    public C63406Sjd A03;
    public C63406Sjd A04;
    public C63406Sjd A05;
    public C63406Sjd A06;
    public final C58252li A07;
    public final InterfaceC09390do A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67680Uvx(C152406tQ c152406tQ) {
        super(c152406tQ);
        C14360o3.A0B(c152406tQ, 1);
        this.A08 = AbstractC09440dt.A01(X45.A00);
        this.A04 = C63406Sjd.A03(null);
        this.A06 = C63406Sjd.A03(null);
        this.A03 = C63406Sjd.A03(null);
        this.A01 = C63406Sjd.A03(null);
        this.A05 = C63406Sjd.A03(null);
        this.A02 = C63406Sjd.A03(null);
        this.A07 = new C58252li();
    }

    public static final void A03(C67680Uvx c67680Uvx, String str) {
        ((UFZ) c67680Uvx).A00 = null;
        A02(c67680Uvx, "fetch_init");
        A04(c67680Uvx, "client_fetch_payouthub_init", "PAY_FINANCIAL_ENTITY");
        C58252li c58252li = c67680Uvx.A07;
        Object value = c67680Uvx.A08.getValue();
        Integer num = C05F.A00;
        Q8J A00 = REU.A00(new C63582Spp(num, value, str, 3), C2FP.A06());
        C14360o3.A07(A00);
        AbstractC63246Sg0.A02(A00, c58252li, new C70303WQi(c67680Uvx, 10));
    }

    public static final void A04(C67680Uvx c67680Uvx, String str, String str2) {
        A05(c67680Uvx, str, null, null, str2, null, null, null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Uw5, X.Vjc] */
    public static final void A06(ImmutableList.Builder builder, int i) {
        C67689UwG c67689UwG = new C67689UwG(0);
        ?? abstractC69209Vjc = new AbstractC69209Vjc();
        Uw5.A03(new Waa(new Object[0], i), abstractC69209Vjc, VEP.A1E);
        WDT wdt = new WDT(null, null, C05F.A00, false, false, false);
        wdt.A05 = true;
        abstractC69209Vjc.A01 = new W4A(wdt);
        C67684UwB.A01(c67689UwG, abstractC69209Vjc, builder);
    }

    @Override // X.InterfaceC71900X9k
    public final void COL(UFY ufy) {
        C14360o3.A0B(ufy, 0);
        ufy.A04(C75M.A01(((AbstractC67710Uwb) this).A03, X5X.A00));
        AbstractC58321PtD.A1D(ufy.A06, this.A07, new X59(this, 47), 23);
        AbstractC58321PtD.A1D(ufy.A08, ((UFZ) this).A03, new X59(this, 48), 23);
    }

    public static final void A02(C67680Uvx c67680Uvx, String str) {
        String optionalStringField;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2JS c2js = (C2JS) ((AbstractC67710Uwb) c67680Uvx).A03.A02();
        if (c2js != null && (optionalStringField = c2js.getOptionalStringField(0, "financial_id")) != null) {
            linkedHashMap.put("financial_entity_id", optionalStringField);
            C2FP.A02();
            AbstractC70159WDv.A00(667749724, 0, str, linkedHashMap);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Vjc, X.Uw1] */
    private final void A07(ImmutableList.Builder builder, Integer num, String str, String str2, int i) {
        C67689UwG c67689UwG = new C67689UwG(11);
        ?? abstractC69209Vjc = new AbstractC69209Vjc();
        abstractC69209Vjc.A00 = new C70512WZt(0);
        abstractC69209Vjc.A01 = new C69753Vuo(null, new Waa(new Object[0], 2131973618), VEP.A13);
        abstractC69209Vjc.A00 = new ViewOnClickListenerC55409OjK(this, str, str2, 0);
        WDT wdt = new WDT(null, null, C05F.A00, false, false, false);
        wdt.A02 = C05F.A01;
        WDT.A00(wdt, new Object[0], 2131973618);
        wdt.A00 = new Waa(new Object[0], i);
        wdt.A04 = true;
        abstractC69209Vjc.A01 = new W4A(wdt);
        if (num != null) {
            abstractC69209Vjc.A02 = Integer.valueOf(num.intValue());
        }
        c67689UwG.A00(new Uw6(abstractC69209Vjc), 1);
        AbstractC70120W4v.A00(c67689UwG, builder);
    }

    @OnLifecycleEvent(C07R.ON_RESUME)
    public final void onResume(C07X c07x) {
        C2JS c2js;
        String A07;
        Object A02 = super.A06.A02();
        if ((A02 == EnumC68120VCd.SUCCESS || A02 == EnumC68120VCd.ERROR) && (c2js = (C2JS) ((AbstractC67710Uwb) this).A03.A02()) != null && (A07 = c2js.A07("financial_id")) != null) {
            C2FP.A02();
            AbstractC70159WDv.A03(A07, "on_resume", null, null, null, null, null, null, null, 667749724, 0);
            A03(this, A07);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.Uw3, X.Vjc] */
    /* JADX WARN: Type inference failed for: r10v15, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r10v16, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r10v5, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r12v7, types: [X.Uw3, X.Vjc] */
    /* JADX WARN: Type inference failed for: r13v5, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r6v118, types: [X.Uw3, X.Vjc] */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.XFm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.Uw3, X.Vjc] */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r9v11, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r9v22, types: [X.Uw5, X.Vjc] */
    public static final void A01(C67680Uvx c67680Uvx) {
        C67522UnM c67522UnM;
        UXO A0E;
        String A07;
        UXO A0E2;
        String A072;
        ImmutableList requiredCompactedTreeListField;
        C67522UnM c67522UnM2;
        UXO A0E3;
        String A09;
        UXO A0E4;
        String A092;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C2JS c2js;
        C67522UnM c67522UnM3;
        UXO A0E5;
        String optionalStringField;
        UXO A0E6;
        String optionalStringField2;
        C2JS optionalTreeField;
        C67522UnM c67522UnM4;
        UXO A0E7;
        String A0A;
        UXO A0E8;
        String A0A2;
        ImmutableList requiredCompactedTreeListField2;
        String optionalStringField3;
        InterfaceC72013XFb waa;
        InterfaceC72013XFb wab;
        InterfaceC72024XFm c70514WZv;
        Waa waa2;
        C70514WZv c70514WZv2;
        ImmutableList.Builder builder = ImmutableList.builder();
        AbstractC70120W4v.A00(c67680Uvx.A0A(), builder);
        AbstractC70120W4v abstractC70120W4v = c67680Uvx.A00;
        if (abstractC70120W4v != null) {
            builder.add((Object) abstractC70120W4v);
        }
        A06(builder, 2131969434);
        C67689UwG c67689UwG = new C67689UwG(15);
        ?? abstractC69209Vjc = new AbstractC69209Vjc();
        abstractC69209Vjc.A02 = new C70515WZw(7, 4, 0, 1);
        abstractC69209Vjc.A03 = false;
        c67689UwG.A04 = new Uw7(abstractC69209Vjc);
        c67689UwG.A01 = 0;
        c67689UwG.A00 = 1.0f;
        ?? abstractC69209Vjc2 = new AbstractC69209Vjc();
        Waa waa3 = new Waa(new Object[0], 2131969437);
        VEP vep = VEP.A1E;
        Uw5.A03(waa3, abstractC69209Vjc2, vep);
        Waa waa4 = new Waa(new Object[0], 2131969436);
        VEP vep2 = VEP.A14;
        c67689UwG.A00(Uw5.A01(waa4, abstractC69209Vjc2, vep2), 1);
        ((AbstractC69335Vlh) c67689UwG).A01 = new Object();
        Integer num = C05F.A00;
        String str9 = null;
        String str10 = null;
        WDT wdt = new WDT(null, null, num, false, false, false);
        WDT.A00(wdt, new Object[0], 2131969435);
        W4A.A00(wdt, c67689UwG, builder);
        C63406Sjd c63406Sjd = c67680Uvx.A04;
        if (C63406Sjd.A0J(c63406Sjd)) {
            C2JS c2js2 = (C2JS) c63406Sjd.A01;
            if (c2js2 != null && (requiredCompactedTreeListField2 = c2js2.getRequiredCompactedTreeListField(0, "payout_info", UZG.class, 500922335)) != null) {
                C1LC A0I = AbstractC43592JPx.A0I(requiredCompactedTreeListField2);
                while (A0I.hasNext()) {
                    C2JS c2js3 = (C2JS) A0I.next();
                    String optionalStringField4 = c2js3.getOptionalStringField(1, "bank_name");
                    if ((optionalStringField4 == null || optionalStringField4.length() == 0) && ((optionalStringField3 = c2js3.getOptionalStringField(0, "bank_account_number")) == null || optionalStringField3.length() == 0)) {
                        waa = new Waa(new Object[0], 2131969444);
                        wab = new Wab(c2js3.A09("paypal_email"));
                        c70514WZv = new C70514WZv(null, null, R.drawable.payment_paypal, 0);
                        String A093 = c2js3.A09("paypal_email");
                        if (A093 != null) {
                            waa2 = new Waa(new Object[]{A093}, 2131969431);
                            c70514WZv2 = null;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        waa = Wab.A00(c2js3, "bank_name", 1);
                        String optionalStringField5 = c2js3.getOptionalStringField(0, "bank_account_number");
                        if (optionalStringField5 != null) {
                            wab = new Waa(new Object[]{optionalStringField5}, 2131953637);
                            c70514WZv = new C70515WZw(5, 4, 0, 1);
                            c70514WZv2 = new C70514WZv(null, 14, R.drawable.rounded_icon_background, R.dimen.account_recs_header_image_margin);
                            String optionalStringField6 = c2js3.getOptionalStringField(1, "bank_name");
                            if (optionalStringField6 != null) {
                                String optionalStringField7 = c2js3.getOptionalStringField(0, "bank_account_number");
                                if (optionalStringField7 != null) {
                                    waa2 = new Waa(new Object[]{optionalStringField6, optionalStringField7}, 2131969430);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    C67689UwG c67689UwG2 = new C67689UwG(3);
                    ?? abstractC69209Vjc3 = new AbstractC69209Vjc();
                    abstractC69209Vjc3.A02 = c70514WZv;
                    abstractC69209Vjc3.A00 = c70514WZv2;
                    abstractC69209Vjc3.A03 = false;
                    c67689UwG2.A04 = new Uw7(abstractC69209Vjc3);
                    c67689UwG2.A01 = 0;
                    c67689UwG2.A00 = 1.0f;
                    ?? abstractC69209Vjc4 = new AbstractC69209Vjc();
                    Uw5.A03(waa, abstractC69209Vjc4, VEP.A0o);
                    c67689UwG2.A00(Uw5.A01(wab, abstractC69209Vjc4, VEP.A1F), 1);
                    WDT wdt2 = new WDT(null, null, num, false, false, false);
                    wdt2.A01 = waa2;
                    wdt2.A04 = false;
                    W4A.A00(wdt2, c67689UwG2, builder);
                }
            }
            C63406Sjd c63406Sjd2 = c67680Uvx.A02;
            if (C63406Sjd.A0J(c63406Sjd2) && (c67522UnM4 = (C67522UnM) c63406Sjd2.A01) != null && (A0E7 = c67522UnM4.A0E()) != null && (A0A = A0E7.A0A("payout_method_update_uri")) != null && A0A.length() != 0) {
                C67522UnM c67522UnM5 = (C67522UnM) c67680Uvx.A02.A01;
                if (c67522UnM5 != null && (A0E8 = c67522UnM5.A0E()) != null && (A0A2 = A0E8.A0A("payout_method_update_uri")) != null) {
                    c67680Uvx.A07(builder, Integer.valueOf(R.id.payout_method_update_button), A0A2, "payouthub_setting_payoutmethod_click", 2131969432);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        C67690UwH.A00(builder);
        A06(builder, 2131975237);
        C63406Sjd c63406Sjd3 = c67680Uvx.A06;
        if (C63406Sjd.A0J(c63406Sjd3)) {
            C2JS c2js4 = (C2JS) c63406Sjd3.A01;
            if (c2js4 != null && (optionalTreeField = c2js4.getOptionalTreeField(0, "tax_form", C66729UZn.class, -27585996)) != null) {
                C67689UwG c67689UwG3 = new C67689UwG(3);
                ?? abstractC69209Vjc5 = new AbstractC69209Vjc();
                abstractC69209Vjc5.A02 = new C70515WZw(6, 4, 0, 1);
                abstractC69209Vjc5.A00 = new C70514WZv(null, 14, R.drawable.rounded_icon_background, R.dimen.account_recs_header_image_margin);
                abstractC69209Vjc5.A03 = false;
                c67689UwG3.A04 = new Uw7(abstractC69209Vjc5);
                c67689UwG3.A01 = 0;
                c67689UwG3.A00 = 1.0f;
                ?? abstractC69209Vjc6 = new AbstractC69209Vjc();
                Uw5.A03(Wab.A00(optionalTreeField, "file_name", 0), abstractC69209Vjc6, VEP.A0o);
                c67689UwG3.A00(Uw5.A01(new Waa(new Object[0], 2131974853), abstractC69209Vjc6, VEP.A1F), 1);
                WDT wdt3 = new WDT(null, null, num, false, false, false);
                String optionalStringField8 = optionalTreeField.getOptionalStringField(0, "file_name");
                if (optionalStringField8 != null) {
                    WDT.A00(wdt3, new Object[]{optionalStringField8}, 2131954346);
                    W4A.A00(wdt3, c67689UwG3, builder);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C63406Sjd c63406Sjd4 = c67680Uvx.A02;
            if (C63406Sjd.A0J(c63406Sjd4) && (c67522UnM3 = (C67522UnM) c63406Sjd4.A01) != null && (A0E5 = c67522UnM3.A0E()) != null && (optionalStringField = A0E5.getOptionalStringField(4, "update_tax_uri")) != null && optionalStringField.length() != 0) {
                C67522UnM c67522UnM6 = (C67522UnM) c67680Uvx.A02.A01;
                if (c67522UnM6 != null && (A0E6 = c67522UnM6.A0E()) != null && (optionalStringField2 = A0E6.getOptionalStringField(4, "update_tax_uri")) != null) {
                    c67680Uvx.A07(builder, null, optionalStringField2, "payouthub_setting_taxform_click", 2131975236);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        String str11 = null;
        C67690UwH.A00(builder);
        A06(builder, 2131969418);
        C63406Sjd c63406Sjd5 = c67680Uvx.A03;
        if (C63406Sjd.A0J(c63406Sjd5) && (c2js = (C2JS) c63406Sjd5.A01) != null) {
            C2JS optionalTreeField2 = c2js.getOptionalTreeField(2, "company_address", UZ5.class, -76714750);
            if (optionalTreeField2 != null && optionalTreeField2.getOptionalStringField(0, "country_code") != null) {
                C67689UwG c67689UwG4 = new C67689UwG(1);
                ?? abstractC69209Vjc7 = new AbstractC69209Vjc();
                Uw5.A03(new Waa(new Object[0], 2131969417), abstractC69209Vjc7, vep2);
                C2JS optionalTreeField3 = c2js.getOptionalTreeField(2, "company_address", UZ5.class, -76714750);
                if (optionalTreeField3 != null) {
                    str11 = optionalTreeField3.getOptionalStringField(0, "country_code");
                }
                abstractC69209Vjc7.A02 = new C69753Vuo(null, new Wab(Country.A00(null, str11).A00.getDisplayCountry()), vep2);
                C67684UwB.A01(c67689UwG4, abstractC69209Vjc7, builder);
            }
            C67689UwG c67689UwG5 = new C67689UwG(1);
            ?? abstractC69209Vjc8 = new AbstractC69209Vjc();
            Uw5.A03(new Waa(new Object[0], 2131969416), abstractC69209Vjc8, vep2);
            abstractC69209Vjc8.A02 = new C69753Vuo(null, new Wab(String.valueOf(c2js.getOptionalEnumField(0, "company_type", EnumC68156VEa.UNSET_OR_UNRECOGNIZED_ENUM_VALUE))), vep2);
            C67684UwB.A00(c67689UwG5, abstractC69209Vjc8, 1);
            C67696UwN c67696UwN = new C67696UwN(c67689UwG5);
            C67689UwG c67689UwG6 = new C67689UwG(1);
            ?? abstractC69209Vjc9 = new AbstractC69209Vjc();
            Uw5.A03(new Waa(new Object[0], 2131969415), abstractC69209Vjc9, vep2);
            abstractC69209Vjc9.A02 = new C69753Vuo(null, Wab.A00(c2js, "company_name", 1), vep2);
            C67684UwB.A00(c67689UwG6, abstractC69209Vjc9, 1);
            builder.add((Object[]) new AbstractC70120W4v[]{c67696UwN, new C67696UwN(c67689UwG6)});
        }
        C67690UwH.A00(builder);
        A06(builder, 2131952091);
        C63406Sjd c63406Sjd6 = c67680Uvx.A05;
        if (C63406Sjd.A0J(c63406Sjd6)) {
            C67529UnT c67529UnT = (C67529UnT) c63406Sjd6.A01;
            if (c67529UnT != null) {
                C67689UwG c67689UwG7 = new C67689UwG(1);
                ?? abstractC69209Vjc10 = new AbstractC69209Vjc();
                Uw5.A03(new Waa(new Object[0], 2131969420), abstractC69209Vjc10, vep2);
                UZI A0E9 = c67529UnT.A0E();
                if (A0E9 != null) {
                    str = A0E9.getOptionalStringField(0, "first_name");
                } else {
                    str = null;
                }
                UZI A0E10 = c67529UnT.A0E();
                if (A0E10 != null) {
                    str2 = A0E10.getOptionalStringField(1, "middle_name");
                } else {
                    str2 = null;
                }
                UZI A0E11 = c67529UnT.A0E();
                if (A0E11 != null) {
                    str3 = A0E11.getOptionalStringField(2, "last_name");
                } else {
                    str3 = null;
                }
                abstractC69209Vjc10.A02 = new C69753Vuo(null, new Wab(AbstractC68340VNa.A00(" ", str, str2, str3)), vep2);
                c67689UwG7.A00(new C67684UwB(abstractC69209Vjc10), 1);
                C67696UwN c67696UwN2 = new C67696UwN(c67689UwG7);
                C67689UwG c67689UwG8 = new C67689UwG(1);
                ?? abstractC69209Vjc11 = new AbstractC69209Vjc();
                Uw5.A03(new Waa(new Object[0], 2131969413), abstractC69209Vjc11, vep2);
                UZI A0E12 = c67529UnT.A0E();
                if (A0E12 != null) {
                    str4 = A0E12.getOptionalStringField(3, "street1");
                } else {
                    str4 = null;
                }
                UZI A0E13 = c67529UnT.A0E();
                if (A0E13 != null) {
                    str5 = A0E13.getOptionalStringField(4, "street2");
                } else {
                    str5 = null;
                }
                UZI A0E14 = c67529UnT.A0E();
                if (A0E14 != null) {
                    str6 = A0E14.A0C("address_city");
                } else {
                    str6 = null;
                }
                UZI A0E15 = c67529UnT.A0E();
                if (A0E15 != null) {
                    str7 = A0E15.getOptionalStringField(6, "address_state");
                } else {
                    str7 = null;
                }
                UZI A0E16 = c67529UnT.A0E();
                if (A0E16 != null) {
                    str9 = A0E16.getOptionalStringField(7, ServerW3CShippingAddressConstants.POSTAL_CODE);
                }
                UZI A0E17 = c67529UnT.A0E();
                if (A0E17 != null && A0E17.A0D("country_code") != null) {
                    UZI A0E18 = c67529UnT.A0E();
                    if (A0E18 != null) {
                        str8 = A0E18.A0D("country_code");
                    } else {
                        str8 = null;
                    }
                    str10 = Country.A00(null, str8).A00.getDisplayCountry();
                }
                abstractC69209Vjc11.A02 = new C69753Vuo(null, new Wab(AbstractC68340VNa.A00(", ", str4, str5, str6, str7, str9, str10)), vep2);
                C67684UwB.A00(c67689UwG8, abstractC69209Vjc11, 1);
                builder.add((Object[]) new AbstractC70120W4v[]{c67696UwN2, new C67696UwN(c67689UwG8)});
            }
            C63406Sjd c63406Sjd7 = c67680Uvx.A02;
            if (C63406Sjd.A0J(c63406Sjd7) && (c67522UnM2 = (C67522UnM) c63406Sjd7.A01) != null && (A0E3 = c67522UnM2.A0E()) != null && (A09 = A0E3.A09("owner_info_update_uri")) != null && A09.length() != 0) {
                C67522UnM c67522UnM7 = (C67522UnM) c67680Uvx.A02.A01;
                if (c67522UnM7 != null && (A0E4 = c67522UnM7.A0E()) != null && (A092 = A0E4.A09("owner_info_update_uri")) != null) {
                    c67680Uvx.A07(builder, null, A092, "payouthub_setting_ownerinfo_click", 2131969419);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C67690UwH.A00(builder);
        A06(builder, 2131952057);
        C63406Sjd c63406Sjd8 = c67680Uvx.A01;
        if (C63406Sjd.A0J(c63406Sjd8)) {
            C2JS c2js5 = (C2JS) c63406Sjd8.A01;
            if (c2js5 != null && (requiredCompactedTreeListField = c2js5.getRequiredCompactedTreeListField(0, "pay_admin_do_not_use", UWY.class, 109494878)) != null) {
                C1LC A0I2 = AbstractC43592JPx.A0I(requiredCompactedTreeListField);
                while (A0I2.hasNext()) {
                    C2JS c2js6 = (C2JS) A0I2.next();
                    C67689UwG c67689UwG9 = new C67689UwG(7);
                    ?? abstractC69209Vjc12 = new AbstractC69209Vjc();
                    abstractC69209Vjc12.A02 = new C70513WZu(c2js6.A0A("image_uri"), null, true, true);
                    abstractC69209Vjc12.A03 = false;
                    c67689UwG9.A04 = new Uw7(abstractC69209Vjc12);
                    c67689UwG9.A01 = 0;
                    c67689UwG9.A00 = 1.0f;
                    c67689UwG9.A00(Uw5.A02(new Wab(c2js6.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)), new AbstractC69209Vjc(), vep), 1);
                    WDT wdt4 = new WDT(null, null, num, false, false, false);
                    wdt4.A01 = new Wab(c2js6.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
                    W4A.A00(wdt4, c67689UwG9, builder);
                }
            }
            C63406Sjd c63406Sjd9 = c67680Uvx.A02;
            if (C63406Sjd.A0J(c63406Sjd9) && (c67522UnM = (C67522UnM) c63406Sjd9.A01) != null && (A0E = c67522UnM.A0E()) != null && (A07 = A0E.A07("admin_update_uri")) != null && A07.length() != 0) {
                C67522UnM c67522UnM8 = (C67522UnM) c67680Uvx.A02.A01;
                if (c67522UnM8 != null && (A0E2 = c67522UnM8.A0E()) != null && (A072 = A0E2.A07("admin_update_uri")) != null) {
                    c67680Uvx.A07(builder, null, A072, "payouthub_setting_admin_update_click", 2131969414);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        c67680Uvx.A07.A0B(builder.build());
    }

    public static final void A05(C67680Uvx c67680Uvx, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String A07;
        C2GC c2gc = C2FP.A02().A01;
        HashMap A00 = VNP.A00(c67680Uvx.A0B());
        C2JS c2js = (C2JS) ((AbstractC67710Uwb) c67680Uvx).A03.A02();
        if (c2js != null && (A07 = c2js.A07("financial_id")) != null) {
            A00.put("financial_entity_id", A07);
            AbstractC65703TsZ.A1O("view_name", "settings", str2, A00);
            if (str3 != null) {
                A00.put("target_url", str3);
            }
            if (str4 != null) {
                A00.put("endpoint", str4);
            }
            if (str5 != null) {
                A00.put("error_message", str5);
            }
            if (str6 != null) {
                A00.put("error_stacktrace", str6);
            }
            if (str7 != null) {
                A00.put("exception_class", str7);
            }
            c2gc.Chz(str, A00);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC67710Uwb, X.UFZ
    public final void A09(Bundle bundle) {
        super.A09(bundle);
        AbstractC58321PtD.A1D(((AbstractC67710Uwb) this).A03, this.A07, new X59(this, 46), 23);
        super.A07.A0B(new C69756Vur(new Waa(new Object[0], 2131973592), ImmutableList.of(), false));
    }
}
