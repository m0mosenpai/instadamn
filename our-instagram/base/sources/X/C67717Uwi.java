package X;

import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;

/* renamed from: X.Uwi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67717Uwi extends UFZ implements InterfaceC71900X9k {
    public AbstractC70120W4v A00;
    public LoggingData A01;
    public String A03;
    public String A04;
    public String A05;
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(X41.A00);
    public C63406Sjd A02 = C63406Sjd.A03(null);
    public final C58252li A06 = new C58252li();

    public static final void A04(C67717Uwi c67717Uwi, String str, String str2, String str3) {
        A05(c67717Uwi, str, null, null, null, str2, str3, null, null, null);
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
        AbstractC58321PtD.A1D(ufy.A06, this.A06, new X59(this, 42), 22);
        AbstractC58321PtD.A1D(ufy.A08, super.A03, new X59(this, 43), 22);
    }

    public static final String A01(C67717Uwi c67717Uwi) {
        C2JS A03;
        C2JS A01;
        C2JS A02;
        C2JS A012;
        C2JS A022;
        String A07;
        C2JS c2js = (C2JS) c67717Uwi.A02.A01;
        if (c2js == null || (A02 = c2js.A02(UZA.class, "status_info", -784537479)) == null || (A012 = A02.A01(C66721UZf.class, 641502205)) == null || (A022 = A012.A02(C66719UZd.class, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 1181241025)) == null || (A07 = A022.A07("text")) == null) {
            C2JS c2js2 = (C2JS) c67717Uwi.A02.A01;
            if (c2js2 != null && (A03 = c2js2.A03(UZC.class, "total_summary", -2027266239)) != null && (A01 = A03.A01(C66723UZh.class, 723759619)) != null) {
                return A01.A09(DialogModule.KEY_TITLE);
            }
            return null;
        }
        return A07;
    }

    public static final void A03(C67717Uwi c67717Uwi, String str) {
        int i;
        String str2 = c67717Uwi.A05;
        if (str2 == null) {
            C14360o3.A0F("payoutReleaseID");
            throw C00O.createAndThrow();
        }
        Integer A0i = AbstractC003100w.A0i(str2);
        if (A0i != null) {
            i = A0i.intValue();
        } else {
            i = 0;
        }
        C2FP.A02();
        AbstractC70159WDv.A00(667750653, i, str, AbstractC06930Yk.A0E());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (r1 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0134, code lost:
    
        if (X.C14360o3.A0K(r1.A0A("payee_name"), "Meta") != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Type inference failed for: r12v5, types: [X.Uw3, X.Vjc] */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.Uw3, X.Vjc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C67717Uwi r24) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67717Uwi.A02(X.Uwi):void");
    }

    public static final void A05(C67717Uwi c67717Uwi, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String str10;
        C2GC c2gc = C2FP.A02().A01;
        LoggingData loggingData = c67717Uwi.A01;
        if (loggingData == null) {
            str10 = "loggingData";
        } else {
            HashMap A00 = VNP.A00(loggingData);
            String str11 = c67717Uwi.A03;
            if (str11 == null) {
                str10 = "financialID";
            } else {
                A00.put("financial_entity_id", str11);
                String str12 = c67717Uwi.A05;
                if (str12 == null) {
                    str10 = "payoutReleaseID";
                } else {
                    A00.put("batch_item_id", str12);
                    AbstractC65703TsZ.A1O("view_name", "payout_details", str2, A00);
                    if (str3 != null) {
                        A00.put("target_url", str3);
                    }
                    if (str4 != null) {
                        A00.put("payout_record_id", str4);
                    }
                    String str13 = c67717Uwi.A04;
                    if (str13 != null) {
                        A00.put("managed_merchant_account_id", str13);
                    }
                    if (str5 != null) {
                        A00.put("payout_status", str5);
                    }
                    if (str6 != null) {
                        A00.put("endpoint", str6);
                    }
                    if (str7 != null) {
                        A00.put("error_message", str7);
                    }
                    if (str8 != null) {
                        A00.put("error_stacktrace", str8);
                    }
                    if (str9 != null) {
                        A00.put("exception_class", str9);
                    }
                    c2gc.Chz(str, A00);
                    return;
                }
            }
        }
        C14360o3.A0F(str10);
        throw C00O.createAndThrow();
    }

    @Override // X.UFZ
    public final void A09(Bundle bundle) {
        String string;
        String str;
        super.A09(bundle);
        String str2 = null;
        if (bundle != null) {
            str2 = bundle.getString("payout_release_id");
        }
        if (str2 != null) {
            this.A05 = str2;
            if (bundle != null && (string = bundle.getString("financial_entity_id")) != null) {
                this.A03 = string;
                this.A04 = bundle.getString("managed_merchant_account_id");
                LoggingData loggingData = (LoggingData) bundle.getParcelable("logging_data");
                if (loggingData != null) {
                    this.A01 = loggingData;
                    super.A07.A0B(new C69756Vur(new Waa(new Object[0], 2131969428), ImmutableList.of(), false));
                    super.A00 = null;
                    A04(this, "client_fetch_payouthub_init", null, "BSC_PAYOUT_PAYOUTS_DETAIL");
                    A03(this, "fetch_init");
                    C58252li c58252li = this.A06;
                    Object value = this.A07.getValue();
                    LoggingData loggingData2 = this.A01;
                    if (loggingData2 == null) {
                        str = "loggingData";
                    } else {
                        String str3 = loggingData2.A00;
                        String str4 = this.A03;
                        if (str4 == null) {
                            str = "financialID";
                        } else {
                            String str5 = this.A04;
                            String str6 = this.A05;
                            if (str6 == null) {
                                str = "payoutReleaseID";
                            } else {
                                Q8J A00 = REU.A00(new C70274WPf(value, str3, str4, str5, str6, 1), C2FP.A06());
                                C14360o3.A07(A00);
                                AbstractC63246Sg0.A02(A00, c58252li, new C70303WQi(this, 9));
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
