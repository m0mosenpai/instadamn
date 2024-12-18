package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Uwh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67716Uwh extends UFZ implements InterfaceC71900X9k {
    public AbstractC70120W4v A00;
    public LoggingData A01;
    public String A03;
    public String A04;
    public String A05;
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(X3o.A00);
    public C63406Sjd A02 = C63406Sjd.A03(null);
    public final C58252li A06 = new C58252li();

    public static final void A03(C67716Uwh c67716Uwh, String str, String str2) {
        A04(c67716Uwh, str, null, null, str2, null, null, null);
    }

    @Override // X.InterfaceC71900X9k
    public final void COL(UFY ufy) {
        C14360o3.A0B(ufy, 0);
        String str = this.A03;
        if (str == null) {
            C14360o3.A0F("financialID");
            throw C00O.createAndThrow();
        }
        ufy.A04(new C2GT(str));
        AbstractC58321PtD.A1D(ufy.A06, this.A06, new X59(this, 27), 16);
        AbstractC58321PtD.A1D(ufy.A08, super.A03, new X59(this, 28), 16);
    }

    public static final void A02(C67716Uwh c67716Uwh, String str) {
        int i;
        String str2 = c67716Uwh.A05;
        if (str2 == null) {
            C14360o3.A0F("payoutRecordID");
            throw C00O.createAndThrow();
        }
        Integer A0i = AbstractC003100w.A0i(str2);
        if (A0i != null) {
            i = A0i.intValue();
        } else {
            i = 0;
        }
        C2FP.A02();
        AbstractC70159WDv.A00(667750821, i, str, AbstractC06930Yk.A0E());
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [X.Uw3, X.Vjc] */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.Uw5, X.Vjc] */
    public static final void A01(C67716Uwh c67716Uwh) {
        C66723UZh c66723UZh;
        C66721UZf c66721UZf;
        C2JS c2js;
        String str;
        String str2;
        C67528UnS c67528UnS;
        C2JS reinterpretRequired;
        C2JS A03;
        C2JS A02;
        C67528UnS c67528UnS2;
        String optionalStringField;
        C2JS reinterpretRequired2;
        C2JS A032;
        C2JS optionalTreeField;
        C2JS reinterpretRequired3;
        C2JS optionalTreeField2;
        C2JS optionalTreeField3;
        C2JS reinterpretRequired4;
        C2JS A033;
        C2JS optionalTreeField4;
        C2JS reinterpretRequired5;
        C2JS reinterpretRequired6;
        C2JS A034;
        C2JS A022;
        C2JS reinterpretRequired7;
        ImmutableList requiredCompactedTreeListField;
        String optionalStringField2;
        String str3;
        String str4;
        String str5;
        C2JS optionalTreeField5;
        C2JS A04;
        C2JS A023;
        C2JS optionalTreeField6;
        C2JS reinterpretRequired8;
        String A09;
        String optionalStringField3;
        C70514WZv c70514WZv;
        C2JS A035;
        ImmutableList.Builder builder = ImmutableList.builder();
        AbstractC70120W4v abstractC70120W4v = c67716Uwh.A00;
        if (abstractC70120W4v != null) {
            builder.add((Object) abstractC70120W4v);
        }
        if (C63406Sjd.A0J(c67716Uwh.A02)) {
            WFx wFx = WFx.A00;
            C14360o3.A0A(builder);
            C2JS c2js2 = (C2JS) c67716Uwh.A02.A01;
            C66701UYl c66701UYl = null;
            if (c2js2 != null && (A035 = c2js2.A03(UX5.class, "total_summary", 174739642)) != null) {
                c66723UZh = (C66723UZh) A035.A01(C66723UZh.class, 723759619);
            } else {
                c66723UZh = null;
            }
            ((UFZ) c67716Uwh).A00 = Boolean.valueOf(WFx.A03(c66723UZh, builder));
            C2JS c2js3 = (C2JS) c67716Uwh.A02.A01;
            if (c2js3 != null && (optionalTreeField6 = c2js3.getOptionalTreeField(3, "user_info", UX7.class, -224519140)) != null && (reinterpretRequired8 = optionalTreeField6.reinterpretRequired(0, C66745Ua3.class, -2055568776)) != null && (A09 = reinterpretRequired8.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) != null && A09.length() != 0 && (optionalStringField3 = reinterpretRequired8.getOptionalStringField(1, "image_uri")) != null && optionalStringField3.length() != 0) {
                int i = 43;
                if (C14360o3.A0K(reinterpretRequired8.getOptionalStringField(2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), "Meta")) {
                    i = 49;
                }
                if (C14360o3.A0K(reinterpretRequired8.getOptionalStringField(2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), "Meta")) {
                    c70514WZv = new C70514WZv(null, 14, R.drawable.ring_background, R.dimen.account_recs_header_image_margin);
                } else {
                    c70514WZv = null;
                }
                C67689UwG c67689UwG = new C67689UwG(i);
                ?? abstractC69209Vjc = new AbstractC69209Vjc();
                abstractC69209Vjc.A02 = new C70513WZu(reinterpretRequired8.getOptionalStringField(1, "image_uri"), null, !C14360o3.A0K(reinterpretRequired8.getOptionalStringField(2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), "Meta"), true);
                abstractC69209Vjc.A00 = c70514WZv;
                Uw5 A00 = Uw5.A00(abstractC69209Vjc, c67689UwG);
                Uw5.A03(Wab.A00(reinterpretRequired8, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 2), A00, VEP.A0o);
                c67689UwG.A00(Uw5.A01(Wab.A00(reinterpretRequired8, "user_name", 3), A00, VEP.A0G), 1);
                WDT wdt = new WDT(null, null, C05F.A00, false, false, false);
                wdt.A01 = Wab.A00(reinterpretRequired8, "accessibility_label", 0);
                ((AbstractC69335Vlh) c67689UwG).A02 = new W4A(wdt);
                builder.add((Object[]) new AbstractC70120W4v[]{new C67696UwN(c67689UwG), new AbstractC70120W4v(new AbstractC69335Vlh(4))});
            }
            C2JS c2js4 = (C2JS) c67716Uwh.A02.A01;
            if (c2js4 != null && (A023 = c2js4.A02(UX4.class, "status_info", -278207430)) != null) {
                c66721UZf = (C66721UZf) A023.A01(C66721UZf.class, 641502205);
            } else {
                c66721UZf = null;
            }
            wFx.A04(c66721UZf, builder, new X2o(c67716Uwh, 10));
            boolean z = false;
            C67690UwH.A00(builder);
            C2JS c2js5 = (C2JS) c67716Uwh.A02.A01;
            if (c2js5 != null && (A04 = c2js5.A04(UX6.class, "transaction_info", -131268372)) != null) {
                c66701UYl = (C66701UYl) A04.reinterpretRequired(0, C66701UYl.class, 710338203);
            }
            if (wFx.A05(c66701UYl, builder)) {
                Boolean bool = ((UFZ) c67716Uwh).A00;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        z = true;
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            ((UFZ) c67716Uwh).A00 = Boolean.valueOf(z);
            C2JS c2js6 = (C2JS) c67716Uwh.A02.A01;
            if (c2js6 != null && (reinterpretRequired6 = c2js6.reinterpretRequired(4, C66726UZk.class, 1287181796)) != null && (A034 = reinterpretRequired6.A03(C66725UZj.class, "summary_info", 1199340044)) != null && (A022 = A034.A02(C66724UZi.class, "cost_breakdown", -49716190)) != null && (reinterpretRequired7 = A022.reinterpretRequired(0, UWf.class, 1903095879)) != null && (requiredCompactedTreeListField = reinterpretRequired7.getRequiredCompactedTreeListField(0, "breakdown", UWe.class, -1337682235)) != null && !requiredCompactedTreeListField.isEmpty() && (optionalStringField2 = A034.getOptionalStringField(0, "section_title")) != null && optionalStringField2.length() != 0) {
                C67690UwH.A00(builder);
                WFx.A02(builder, A034.getOptionalStringField(0, "section_title"));
                Iterator<E> it = requiredCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    C2JS c2js7 = (C2JS) it.next();
                    C67689UwG c67689UwG2 = new C67689UwG(18);
                    ?? abstractC69209Vjc2 = new AbstractC69209Vjc();
                    if (c2js7 != null) {
                        str3 = c2js7.A08("label");
                    } else {
                        str3 = null;
                    }
                    Wab wab = new Wab(str3);
                    VEP vep = VEP.A0q;
                    c67689UwG2.A00(Uw5.A02(wab, abstractC69209Vjc2, vep), 1);
                    ?? abstractC69209Vjc3 = new AbstractC69209Vjc();
                    if (c2js7 != null && (optionalTreeField5 = c2js7.getOptionalTreeField(0, "amount", UWd.class, 1005747091)) != null) {
                        str4 = optionalTreeField5.getOptionalStringField(0, "formatted_amount");
                    } else {
                        str4 = null;
                    }
                    c67689UwG2.A06 = Uw5.A02(new Wab(str4), abstractC69209Vjc3, vep);
                    WDT wdt2 = new WDT(null, null, C05F.A00, false, false, false);
                    if (c2js7 != null) {
                        str5 = c2js7.A09("accessibility_label");
                    } else {
                        str5 = null;
                    }
                    wdt2.A01 = new Wab(str5);
                    W4A.A00(wdt2, c67689UwG2, builder);
                }
                C2FP.A02().A08();
            }
            C2JS c2js8 = (C2JS) c67716Uwh.A02.A01;
            String str6 = null;
            if (c2js8 != null && (reinterpretRequired4 = c2js8.reinterpretRequired(4, C66726UZk.class, 1287181796)) != null && (A033 = reinterpretRequired4.A03(C66725UZj.class, "summary_info", 1199340044)) != null && (optionalTreeField4 = A033.getOptionalTreeField(1, "cost_breakdown", C66724UZi.class, -49716190)) != null && (reinterpretRequired5 = optionalTreeField4.reinterpretRequired(1, UZ9.class, -391262911)) != null) {
                c2js = reinterpretRequired5.A03(UZ8.class, "payout_amount_row", -1465670426);
            } else {
                c2js = null;
            }
            C67689UwG c67689UwG3 = new C67689UwG(18);
            ?? abstractC69209Vjc4 = new AbstractC69209Vjc();
            if (c2js != null) {
                str = c2js.A08("label");
            } else {
                str = null;
            }
            Uw5.A03(new Wab(str), abstractC69209Vjc4, VEP.A0q);
            abstractC69209Vjc4.A03 = false;
            c67689UwG3.A00(new C67684UwB(abstractC69209Vjc4), 1);
            ?? abstractC69209Vjc5 = new AbstractC69209Vjc();
            if (c2js != null && (optionalTreeField3 = c2js.getOptionalTreeField(0, "amount", UZ7.class, -1676254049)) != null) {
                str2 = optionalTreeField3.getOptionalStringField(0, "formatted_amount");
            } else {
                str2 = null;
            }
            c67689UwG3.A06 = Uw5.A02(new Wab(str2), abstractC69209Vjc5, VEP.A0H);
            WDT wdt3 = new WDT(null, null, C05F.A00, false, false, false);
            if (c2js != null) {
                str6 = c2js.A09("accessibility_label");
            }
            wdt3.A01 = new Wab(str6);
            W4A.A00(wdt3, c67689UwG3, builder);
            C2JS c2js9 = (C2JS) c67716Uwh.A02.A01;
            if (c2js9 != null && (reinterpretRequired2 = c2js9.reinterpretRequired(4, C66726UZk.class, 1287181796)) != null && (A032 = reinterpretRequired2.A03(C66725UZj.class, "summary_info", 1199340044)) != null && (optionalTreeField = A032.getOptionalTreeField(1, "cost_breakdown", C66724UZi.class, -49716190)) != null && (reinterpretRequired3 = optionalTreeField.reinterpretRequired(2, UX2.class, 916810890)) != null && (optionalTreeField2 = reinterpretRequired3.getOptionalTreeField(0, "disclaimer", UX1.class, -1588411184)) != null) {
                c67528UnS = (C67528UnS) optionalTreeField2.reinterpretRequired(0, C67528UnS.class, -1925217936);
            } else {
                c67528UnS = null;
            }
            WFx.A00(c67528UnS, builder, new X2o(c67716Uwh, 8));
            C2JS c2js10 = (C2JS) c67716Uwh.A02.A01;
            if (c2js10 != null && (reinterpretRequired = c2js10.reinterpretRequired(5, UXN.class, 1537176104)) != null && (A03 = reinterpretRequired.A03(UXM.class, "earnings_support_info", 569823286)) != null && (A02 = A03.A02(UXL.class, "support_uri", -669724366)) != null && (c67528UnS2 = (C67528UnS) A02.reinterpretRequired(0, C67528UnS.class, -1925217936)) != null && (optionalStringField = c67528UnS2.getOptionalStringField(0, "text")) != null && optionalStringField.length() != 0) {
                C67690UwH.A00(builder);
                WFx.A02(builder, A03.getOptionalStringField(0, "section_title"));
                WFx.A00(c67528UnS2, builder, new X2o(c67716Uwh, 9));
            }
        }
        c67716Uwh.A06.A0B(builder.build());
    }

    public static final void A04(C67716Uwh c67716Uwh, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        C2GC c2gc = C2FP.A02().A01;
        LoggingData loggingData = c67716Uwh.A01;
        if (loggingData == null) {
            str8 = "loggingData";
        } else {
            HashMap A00 = VNP.A00(loggingData);
            String str9 = c67716Uwh.A03;
            if (str9 == null) {
                str8 = "financialID";
            } else {
                A00.put("financial_entity_id", str9);
                String str10 = c67716Uwh.A05;
                if (str10 == null) {
                    str8 = "payoutRecordID";
                } else {
                    A00.put("payout_record_id", str10);
                    A00.put("view_name", "earning_details");
                    String str11 = c67716Uwh.A04;
                    if (str11 != null) {
                        A00.put("managed_merchant_account_id", str11);
                    }
                    if (str2 != null) {
                        A00.put("target_name", str2);
                    }
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
            }
        }
        C14360o3.A0F(str8);
        throw C00O.createAndThrow();
    }

    @Override // X.UFZ
    public final void A09(Bundle bundle) {
        String string;
        String str;
        super.A09(bundle);
        String str2 = null;
        if (bundle != null) {
            str2 = bundle.getString("payout_record_id");
        }
        if (str2 != null) {
            this.A05 = str2;
            if (bundle != null && (string = bundle.getString("financial_entity_id")) != null) {
                this.A03 = string;
                this.A04 = bundle.getString("managed_merchant_account_id");
                LoggingData loggingData = (LoggingData) bundle.getParcelable("logging_data");
                if (loggingData != null) {
                    this.A01 = loggingData;
                    super.A07.A0B(new C69756Vur(new Waa(new Object[0], 2131961226), ImmutableList.of(), false));
                    super.A00 = null;
                    A03(this, "client_fetch_payouthub_init", "BSC_PAYOUT_EARNINGS_DETAIL");
                    A02(this, "fetch_init");
                    C58252li c58252li = this.A06;
                    Object value = this.A07.getValue();
                    String str3 = this.A05;
                    if (str3 == null) {
                        str = "payoutRecordID";
                    } else {
                        LoggingData loggingData2 = this.A01;
                        if (loggingData2 == null) {
                            str = "loggingData";
                        } else {
                            String str4 = loggingData2.A00;
                            String str5 = this.A03;
                            if (str5 == null) {
                                str = "financialID";
                            } else {
                                Q8J A00 = REU.A00(new C70274WPf(value, str4, str5, this.A04, str3, 0), C2FP.A06());
                                C14360o3.A07(A00);
                                AbstractC63246Sg0.A02(A00, c58252li, new C70303WQi(this, 1));
                                return;
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
