package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.PvL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58442PvL {
    public static final String A06(Map map) {
        C14360o3.A0B(map, 0);
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData != null) {
                String A00 = fBPayLoggerData.A00();
                if (A00 != null && A00.length() != 0) {
                    return A00;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return A03(AbstractC63083Sc6.A00(), map);
    }

    public static FBPayLoggerData A00() {
        C62697SMl c62697SMl = new C62697SMl();
        c62697SMl.A00(A02());
        c62697SMl.A01 = "fbpay_hub";
        return new FBPayLoggerData(c62697SMl);
    }

    public static final String A04(Map map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData != null) {
                String str = fBPayLoggerData.A00;
                if (str != null && str.length() != 0) {
                    return str;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return AbstractC58318PtA.A0i("external_session_id", map);
    }

    public static final String A05(Map map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData != null) {
                String str = fBPayLoggerData.A01;
                if (str != null && str.length() != 0) {
                    return str;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return A03("flow_name", map);
    }

    public static final String A07(Map map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData != null) {
                String str = fBPayLoggerData.A04;
                if (str != null && str.length() != 0) {
                    return str;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return AbstractC58318PtA.A0i(CacheBehaviorLogger.SOURCE, map);
    }

    public static final Object A01(String str, Map map) {
        Object obj = map.get(str);
        if (obj == null) {
            throw AbstractC166997dE.A0g();
        }
        return obj;
    }

    public static final String A02() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s", "upl", String.valueOf(System.currentTimeMillis()), AbstractC25231BEo.A0p());
        C14360o3.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public static String A03(String str, Map map) {
        return (String) A01(str, map);
    }

    public static final LinkedHashMap A08(FBPayLoggerData fBPayLoggerData) {
        LinkedHashMap A0i = AbstractC37302Gc3.A0i(fBPayLoggerData);
        A0i.put("logger_data", fBPayLoggerData);
        String A00 = fBPayLoggerData.A00();
        if (A00 != null && A00.length() != 0) {
            String A002 = fBPayLoggerData.A00();
            if (A002 != null) {
                A0i.put(AbstractC63083Sc6.A00(), A002);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return A0i;
    }
}
