package X;

import android.os.Bundle;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class UFO extends AbstractC52922bZ {
    public LoggingData A00;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;
    public Integer A05;
    public final C2GS A06;
    public final C2GS A07;
    public final C2GS A08;
    public final C2GS A09;
    public final C2GS A0A;
    public final C2GS A0B;
    public final C2GS A0C;
    public final InterfaceC58362lv A0D;
    public final C152406tQ A0E;
    public final InterfaceC09390do A0F;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.2GT, X.2GS] */
    public UFO(C152406tQ c152406tQ) {
        C14360o3.A0B(c152406tQ, 1);
        this.A0E = c152406tQ;
        this.A0F = AbstractC09440dt.A01(C71771X3y.A00);
        this.A0C = new C2GS();
        this.A09 = new C2GS();
        this.A07 = new C2GS();
        this.A0B = new C2GS();
        this.A06 = new C2GS();
        this.A08 = new C2GS();
        this.A0A = new C2GT(new C69756Vur(new Waa(new Object[0], 2131969421), ImmutableList.of(), true));
        c152406tQ.A04.put("tab_index_bundle", new WT4(this, 3));
        this.A0D = new C70303WQi(this, 7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0027. Please report as an issue. */
    public static final String A00(UFO ufo) {
        C69766Vv3 c69766Vv3;
        Number number = (Number) ufo.A08.A02();
        if (number != null) {
            int intValue = number.intValue();
            List list = (List) ufo.A06.A02();
            if (list != null && (c69766Vv3 = (C69766Vv3) AbstractC001800i.A0O(list, intValue)) != null) {
                String str = c69766Vv3.A03;
                switch (str.hashCode()) {
                    case -1868875270:
                        if (str.equals("transactions_fragment")) {
                            return "transactions";
                        }
                        break;
                    case -966253274:
                        if (str.equals("earnings_fragment")) {
                            return "payouthub_earnings";
                        }
                        break;
                    case 48250454:
                        if (str.equals("overview_fragment")) {
                            return "overview";
                        }
                        break;
                    case 1148185282:
                        if (str.equals("payouts_fragment")) {
                            return "payouthub_payouts";
                        }
                        break;
                }
            }
        }
        return null;
    }

    public final Bundle A02() {
        String str;
        Bundle bundle = new Bundle();
        List list = this.A03;
        if (list == null) {
            str = "financialEntities";
        } else {
            C63368SiU.A05(list, bundle);
            bundle.putString("page_id", this.A02);
            bundle.putBoolean(AbstractC58317Pt9.A00(284), true);
            LoggingData loggingData = this.A00;
            if (loggingData == null) {
                str = "loggingData";
            } else {
                bundle.putParcelable("logging_data", loggingData);
                bundle.putBoolean("IS_V2", this.A04);
                return bundle;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A03(String str, String str2) {
        int i;
        Integer num = this.A05;
        if (num != null) {
            int intValue = num.intValue();
            C2FP.A02();
            AbstractC70159WDv.A02(intValue, 0, (short) 615);
        }
        int hashCode = str.hashCode();
        if (hashCode != -1868875270) {
            if (hashCode != -1260171540) {
                if (hashCode == 48250454 && str.equals("overview_fragment")) {
                    i = 667754853;
                } else {
                    return;
                }
            } else if (!str.equals("settings_fragment")) {
                return;
            } else {
                i = 667749724;
            }
        } else if (!str.equals("transactions_fragment")) {
            return;
        } else {
            i = 667758015;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            int intValue2 = valueOf.intValue();
            C2FP.A02();
            AbstractC70159WDv.A03(null, str2, null, null, null, null, null, null, null, intValue2, 0);
            this.A05 = valueOf;
        }
    }

    public static final void A01(UFO ufo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list) {
        C2GC c2gc = C2FP.A02().A01;
        LoggingData loggingData = ufo.A00;
        if (loggingData == null) {
            C14360o3.A0F("loggingData");
            throw C00O.createAndThrow();
        }
        HashMap A00 = VNP.A00(loggingData);
        if (str3 != null) {
            A00.put("target_name", str3);
        }
        if (str4 != null) {
            A00.put("target_url", str4);
        }
        if (str2 != null) {
            A00.put("view_name", str2);
        }
        if (str5 != null) {
            A00.put("endpoint", str5);
        }
        if (str6 != null) {
            A00.put("error_message", str6);
        }
        if (str7 != null) {
            A00.put("error_stacktrace", str7);
        }
        if (str8 != null) {
            A00.put("exception_class", str8);
        }
        if (list != null) {
            A00.put("financial_entities_id_list", list);
        }
        c2gc.Chz(str, A00);
    }
}
