package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class Wao implements C2GC {
    public final InterfaceC02550Ad A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f5  */
    @Override // X.C2GC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Chz(java.lang.String r8, java.util.Map r9) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Wao.Chz(java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.ULD] */
    public static final ULD A00(LoggingContext loggingContext, Map map) {
        List list;
        ?? c0Zx = new C0Zx();
        AbstractC43594JPz.A1E(c0Zx, loggingContext);
        String str = (String) map.get("PARTNER_ID");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c0Zx.A06("partner_merchant_id", A05(c0Zx, str, map));
        String str3 = (String) map.get("MERCHANT_REQUEST_ID");
        if (str3 != null) {
            str2 = str3;
        }
        c0Zx.A06("merchant_request_id", str2);
        C44872Jtm A00 = AbstractC63059Sbg.A00(loggingContext);
        if (A00 != null) {
            c0Zx.A02(A00, "logging_policy");
            c0Zx.A03("cache_available", (Boolean) map.get("CACHE_AVAILABLE"));
            c0Zx.A06("view_name", "ecp_checkout");
            Object obj = map.get("TARGET_NAME");
            if (obj != null && (obj instanceof String)) {
                c0Zx.A06("target_name", (String) obj);
            }
            Object obj2 = map.get("CACHE_AVAILABLE");
            if (obj2 != null && (obj2 instanceof Boolean)) {
                c0Zx.A03("cache_available", (Boolean) obj2);
            }
            Object obj3 = map.get("AD_ID");
            if (obj3 != null && (obj3 instanceof String)) {
                c0Zx.A05("ad_id", AbstractC25231BEo.A0j(0, (String) obj3));
            }
            Object obj4 = map.get("INITIATOR");
            if (obj4 != null && (obj4 instanceof String)) {
                c0Zx.A06("initiator", (String) obj4);
            }
            Object obj5 = map.get("IAB_SESSION_ID");
            if (obj5 != null && (obj5 instanceof String)) {
                c0Zx.A06(AbstractC58317Pt9.A00(41), (String) obj5);
            }
            Object obj6 = map.get("MERCHANT_CONTAINER_TYPES");
            if ((obj6 instanceof List) && (list = (List) obj6) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : list) {
                    C14360o3.A0C(obj7, "null cannot be cast to non-null type kotlin.String");
                    arrayList.add(obj7);
                }
                c0Zx.A07("merchant_container_types", arrayList);
            }
            Object obj8 = map.get("USER_HAS_CARD");
            if (obj8 != null && (obj8 instanceof String)) {
                c0Zx.A06("user_has_card", (String) obj8);
            }
            Object obj9 = map.get("USER_HAS_TOKENIZED_CARD");
            if (obj9 != null && (obj9 instanceof String)) {
                c0Zx.A06("user_has_tokenized_card", (String) obj9);
            }
            Object obj10 = map.get("USER_HAS_SHIPPING_ADDRESS");
            if (obj10 != null && (obj10 instanceof String)) {
                c0Zx.A06("user_has_shipping_address", (String) obj10);
            }
            Object obj11 = map.get("USER_HAS_EMAIL");
            if (obj11 != null && (obj11 instanceof String)) {
                c0Zx.A06("user_has_email", (String) obj11);
            }
            Object obj12 = map.get("USER_HAS_PHONE");
            if (obj12 != null && (obj12 instanceof String)) {
                c0Zx.A06("user_has_phone", (String) obj12);
            }
            return c0Zx;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.ULH] */
    public static final ULH A01(LoggingContext loggingContext, Map map) {
        Long l;
        ?? c0Zx = new C0Zx();
        c0Zx.A05("product_id", Long.valueOf(loggingContext.A00));
        C44872Jtm A00 = AbstractC63059Sbg.A00(loggingContext);
        if (A00 != null) {
            c0Zx.A02(A00, "logging_policy");
            String str = (String) map.get("PARTNER_ID");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c0Zx.A06("partner_merchant_id", A05(c0Zx, str, map));
            c0Zx.A06("view_name", "ecp_checkout");
            String str3 = (String) map.get("ERROR_CODE");
            if (str3 != null) {
                str2 = str3;
            }
            c0Zx.A06(TraceFieldType.ErrorCode, str2);
            Object obj = map.get("CACHE_AVAILABLE");
            if (obj != null && (obj instanceof Boolean)) {
                c0Zx.A03("cache_available", (Boolean) obj);
            }
            Object obj2 = map.get("PRODUCT_ID");
            if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
                c0Zx.A05("product_id", l);
            }
            return c0Zx;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.ULI, X.0Zx] */
    public static final ULI A02(LoggingContext loggingContext, Map map) {
        ?? c0Zx = new C0Zx();
        String str = (String) map.get("PARTNER_ID");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c0Zx.A06("partner_merchant_id", A05(c0Zx, str, map));
        String str3 = (String) map.get("MERCHANT_REQUEST_ID");
        if (str3 == null) {
            str3 = "";
        }
        c0Zx.A06("merchant_request_id", str3);
        C44872Jtm A00 = AbstractC63059Sbg.A00(loggingContext);
        if (A00 != null) {
            c0Zx.A02(A00, "logging_policy");
            c0Zx.A06("view_name", "ecp_checkout");
            List list = (List) map.get("CHANGED_FIELDS");
            if (list == null) {
                list = C16930sl.A00;
            }
            c0Zx.A07("changed_fields", list);
            String str4 = (String) map.get("ERROR_CODE");
            if (str4 != null) {
                str2 = str4;
            }
            c0Zx.A06(TraceFieldType.ErrorCode, str2);
            A06(c0Zx, map);
            return c0Zx;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.ULJ, X.0Zx] */
    public static final ULJ A03(LoggingContext loggingContext, Map map) {
        String str;
        ?? c0Zx = new C0Zx();
        String str2 = (String) map.get("PARTNER_ID");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c0Zx.A06("partner_merchant_id", A05(c0Zx, str2, map));
        String str4 = (String) map.get("MERCHANT_REQUEST_ID");
        if (str4 == null) {
            str4 = "";
        }
        c0Zx.A06("merchant_request_id", str4);
        C44872Jtm A00 = AbstractC63059Sbg.A00(loggingContext);
        if (A00 != null) {
            c0Zx.A02(A00, "logging_policy");
            c0Zx.A06("view_name", "ecp_checkout");
            String str5 = (String) map.get("ERROR_CODE");
            if (str5 == null) {
                str5 = "";
            }
            c0Zx.A06(TraceFieldType.ErrorCode, str5);
            c0Zx.A03("retryable", Boolean.valueOf(AbstractC167007dF.A1T((Boolean) map.get("RETRYABLE"))));
            String str6 = (String) map.get(MSV.A00(859));
            if (str6 != null) {
                str3 = str6;
            }
            c0Zx.A06("typed_container_id", str3);
            A06(c0Zx, map);
            Object obj = map.get("CONTAINER_TYPE");
            if ((obj instanceof String) && (str = (String) obj) != null) {
                c0Zx.A06("container_type", str);
            }
            return c0Zx;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.ULK, X.0Zx] */
    public static final ULK A04(LoggingContext loggingContext, Map map) {
        ?? c0Zx = new C0Zx();
        String str = (String) map.get("PARTNER_ID");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c0Zx.A06("partner_merchant_id", A05(c0Zx, str, map));
        String str3 = (String) map.get("MERCHANT_REQUEST_ID");
        if (str3 == null) {
            str3 = "";
        }
        c0Zx.A06("merchant_request_id", str3);
        C44872Jtm A00 = AbstractC63059Sbg.A00(loggingContext);
        if (A00 != null) {
            c0Zx.A02(A00, "logging_policy");
            c0Zx.A06("view_name", "ecp_checkout");
            c0Zx.A03("proactive_checkout", Boolean.valueOf(AbstractC167007dF.A1T((Boolean) map.get("PROACTIVE_CHECKOUT"))));
            String str4 = (String) map.get("ERROR_CODE");
            if (str4 != null) {
                str2 = str4;
            }
            c0Zx.A06(TraceFieldType.ErrorCode, str2);
            List list = (List) map.get("PAYMENT_OPTIONS");
            if (list == null) {
                list = C16930sl.A00;
            }
            c0Zx.A07(AbstractC111324zv.A00(5047), list);
            A06(c0Zx, map);
            return c0Zx;
        }
        throw AbstractC166997dE.A0g();
    }

    public static String A05(C0Zx c0Zx, String str, Map map) {
        c0Zx.A06(AbstractC111324zv.A00(2857), str);
        String str2 = (String) map.get("PARTNER_MERCHANT_ID");
        return str2 == null ? "" : str2;
    }

    public static void A06(C0Zx c0Zx, Map map) {
        Long l;
        Object obj = map.get("PRODUCT_ID");
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            c0Zx.A05("product_id", l);
        }
    }

    public Wao(InterfaceC02550Ad interfaceC02550Ad) {
        this.A00 = interfaceC02550Ad;
    }
}
