package X;

import android.os.Bundle;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* renamed from: X.Uwe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67713Uwe extends UFZ {
    public String A01;
    public String A02;
    public LoggingData A03;
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(X3n.A00);
    public C63406Sjd A00 = C63406Sjd.A03(null);
    public final C58252li A04 = new C58252li();

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Uw5, X.Vjc] */
    public static final void A02(ImmutableList.Builder builder, int i) {
        C67689UwG c67689UwG = new C67689UwG(0);
        c67689UwG.A00(Uw5.A02(new Waa(new Object[0], i), new AbstractC69209Vjc(), VEP.A1E), 1);
        WDT wdt = new WDT(null, null, C05F.A00, false, false, false);
        WDT.A00(wdt, new Object[0], i);
        wdt.A05 = true;
        W4A.A00(wdt, c67689UwG, builder);
    }

    public static final void A01(C67713Uwe c67713Uwe, String str, String str2, String str3) {
        String str4;
        C2GC c2gc = C2FP.A02().A01;
        LoggingData loggingData = c67713Uwe.A03;
        if (loggingData == null) {
            str4 = "loggingData";
        } else {
            HashMap A00 = VNP.A00(loggingData);
            String str5 = c67713Uwe.A01;
            if (str5 == null) {
                str4 = "financialID";
            } else {
                A00.put("financial_entity_id", str5);
                String str6 = c67713Uwe.A02;
                if (str6 == null) {
                    str4 = "payoutRecordID";
                } else {
                    A00.put("payout_record_id", str6);
                    AbstractC65703TsZ.A1O("view_name", "earning_details", str2, A00);
                    if (str3 != null) {
                        A00.put("target_url", str3);
                    }
                    c2gc.Chz(str, A00);
                    return;
                }
            }
        }
        C14360o3.A0F(str4);
        throw C00O.createAndThrow();
    }

    @Override // X.UFZ
    public final void A09(Bundle bundle) {
        String string;
        String str;
        super.A09(bundle);
        String str2 = null;
        if (bundle != null) {
            str2 = bundle.getString("financial_entity_id");
        }
        if (str2 != null) {
            this.A01 = str2;
            if (bundle != null && (string = bundle.getString("payout_record_id")) != null) {
                this.A02 = string;
                LoggingData loggingData = (LoggingData) bundle.getParcelable("logging_data");
                if (loggingData != null) {
                    this.A03 = loggingData;
                    C58252li c58252li = this.A04;
                    Object value = this.A05.getValue();
                    String str3 = this.A01;
                    if (str3 == null) {
                        str = "financialID";
                    } else {
                        String str4 = this.A02;
                        if (str4 == null) {
                            str = "payoutRecordID";
                        } else {
                            Q8J A00 = REU.A00(new WPd(value, str3, str4, 0), C2FP.A06());
                            C14360o3.A07(A00);
                            AbstractC63246Sg0.A02(A00, c58252li, new C70303WQi(this, 0));
                            return;
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
