package X;

import com.facebookpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.WGm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70199WGm {
    public static final EnumC72431Xdb A01(EnumC72407Xcu enumC72407Xcu) {
        C14360o3.A0B(enumC72407Xcu, 0);
        String name = enumC72407Xcu.name();
        Locale locale = Locale.US;
        C14360o3.A08(locale);
        String upperCase = name.toUpperCase(locale);
        C14360o3.A07(upperCase);
        return EnumC72431Xdb.valueOf(upperCase);
    }

    public final void A0E(EnumC129485tD enumC129485tD, LoggingContext loggingContext, C70073W1q c70073W1q, C63406Sjd c63406Sjd, String str) {
        C14360o3.A0B(loggingContext, 0);
        A09(c63406Sjd, new ME8(enumC129485tD, c70073W1q, loggingContext, str, 1), new C50365MLr(enumC129485tD, c70073W1q, loggingContext, str, 20));
    }

    public final void A0F(LoggingContext loggingContext, C70073W1q c70073W1q, String str, String str2, List list, boolean z) {
        LinkedHashMap A1B;
        C25531Mh c25531Mh;
        InterfaceC16660sJ interfaceC16660sJ;
        C14360o3.A0B(loggingContext, 0);
        int i = 3;
        int hashCode = str.hashCode();
        if (hashCode != -1785516855) {
            if (hashCode != 1996002556) {
                if (hashCode == 2012838315 && str.equals("DELETE")) {
                    Wap wap = C2FP.A01().A04;
                    A1B = AbstractC58320PtC.A1B(c70073W1q);
                    c25531Mh = new C25531Mh(MSY.A0H(wap.A00, "client_remove_fbpayaccountmutation_init"), 110);
                    i = 5;
                    interfaceC16660sJ = new MIF(i, list, A1B, loggingContext, z);
                }
            } else if (str.equals("CREATE")) {
                Wap wap2 = C2FP.A01().A04;
                if (str2 != null) {
                    LinkedHashMap A1B2 = AbstractC58320PtC.A1B(c70073W1q);
                    c25531Mh = new C25531Mh(MSY.A0H(wap2.A00, "client_add_fbpayaccountmutation_init"), 22);
                    interfaceC16660sJ = new C43650JSi(loggingContext, list, A1B2, str2, 7, z);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            throw AbstractC167007dF.A0c(MSV.A00(351), str);
        }
        if (str.equals("UPDATE")) {
            Wap wap3 = C2FP.A01().A04;
            A1B = AbstractC58320PtC.A1B(c70073W1q);
            c25531Mh = new C25531Mh(MSY.A0H(wap3.A00, "client_edit_fbpayaccountmutation_init"), 31);
            interfaceC16660sJ = new MIF(i, list, A1B, loggingContext, z);
        }
        throw AbstractC167007dF.A0c(MSV.A00(351), str);
        Wap.A03(c25531Mh, loggingContext, interfaceC16660sJ);
    }

    public static final long A00(Map map) {
        Object obj = map.get("component_data_id");
        if (obj != null) {
            return ((Number) obj).longValue();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final String A05(Map map) {
        Object obj = map.get("TARGET_NAME");
        if (obj != null) {
            return (String) obj;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final String A06(Map map) {
        Object obj = map.get("VIEW_NAME");
        if (obj != null) {
            return (String) obj;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final Map A07(Map map) {
        Object obj = map.get("extra_data");
        if (obj != null) {
            return (Map) obj;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A08(C70073W1q c70073W1q, Map map) {
        if (c70073W1q.A01) {
            map.put("is_one_time_checkout", "true");
            String str = c70073W1q.A00;
            if (str != null) {
                if (str.equals("NEW_PAYPAL_CHECKOUT")) {
                    str = "paypal_otc";
                } else if (str.equals("PAYPAL_CHECKOUT")) {
                    str = "paypal_ba";
                }
                map.put("one_time_checkout_type", str);
            }
        }
    }

    public static final void A0A(Object obj, String str, Map map) {
        Map linkedHashMap;
        Object obj2 = map.get("extra_data");
        if (!(obj2 instanceof Map) || (((obj2 instanceof InterfaceC15590qF) && !(obj2 instanceof InterfaceC16540rz)) || (linkedHashMap = (Map) obj2) == null)) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(str, obj);
        map.put("extra_data", linkedHashMap);
    }

    public static final boolean A0B(Map map) {
        return AbstractC167007dF.A1W(map.get("component_data_id"));
    }

    public static final boolean A0C(Map map) {
        return AbstractC167007dF.A1W(map.get("extra_data"));
    }

    public final void A0D(EnumC61204Rh4 enumC61204Rh4, LoggingContext loggingContext, C70073W1q c70073W1q, C63406Sjd c63406Sjd, String str, String str2, List list, boolean z) {
        boolean A1b = AbstractC25233BEq.A1b(loggingContext, c63406Sjd, str);
        if (!C63406Sjd.A0I(c63406Sjd)) {
            A09(c63406Sjd, new X36(loggingContext, c70073W1q, str, str2, list, z), new C57575Pgn(enumC61204Rh4, loggingContext, list, c70073W1q, str, str2, A1b ? 1 : 0, z));
        }
    }

    public static final String A02(VG3 vg3) {
        int ordinal = vg3.ordinal();
        if (ordinal != 14) {
            if (ordinal != 13) {
                if (ordinal == 12) {
                    return "continue_to_credential";
                }
                throw AbstractC37303Gc4.A0M(vg3, "Invalid component type: ", new StringBuilder());
            }
            return "continue_to_shippingaddress";
        }
        return "continue_to_contact";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A03(java.lang.String r1) {
        /*
            int r0 = X.AbstractC25235BEs.A07(r1)
            switch(r0) {
                case -2090528606: goto L6a;
                case -2025722585: goto L67;
                case -2015699207: goto L5c;
                case -1914196587: goto L59;
                case -1866204256: goto L4e;
                case -1782362100: goto L4b;
                case -1687991221: goto L48;
                case -1236011159: goto L45;
                case -761852157: goto L42;
                case -671563076: goto L3f;
                case -523881439: goto L3c;
                case -513858061: goto L39;
                case 330394238: goto L36;
                case 340417616: goto L33;
                case 467992134: goto L2c;
                case 567396712: goto L29;
                case 1166557272: goto L22;
                case 1265961850: goto L1f;
                case 1322332207: goto L1c;
                case 1360260766: goto L19;
                case 2023755892: goto L12;
                case 2066463891: goto Lf;
                default: goto L7;
            }
        L7:
            java.lang.String r1 = "Invalid view name"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        Lf:
            java.lang.String r0 = "add_name_save"
            goto L50
        L12:
            r0 = 559(0x22f, float:7.83E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            goto L5e
        L19:
            java.lang.String r0 = "add_email_save"
            goto L70
        L1c:
            java.lang.String r0 = "add_name_inline"
            goto L50
        L1f:
            java.lang.String r0 = "add_email_inline"
            goto L70
        L22:
            r0 = 257(0x101, float:3.6E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            goto L70
        L29:
            java.lang.String r0 = "add_phone_inline"
            goto L5e
        L2c:
            r0 = 258(0x102, float:3.62E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            goto L5e
        L33:
            java.lang.String r0 = "add_phone"
            goto L5e
        L36:
            java.lang.String r0 = "add_email"
            goto L70
        L39:
            java.lang.String r0 = "remove_phone"
            goto L5e
        L3c:
            java.lang.String r0 = "remove_email"
            goto L70
        L3f:
            java.lang.String r0 = "edit_name_save"
            goto L50
        L42:
            java.lang.String r0 = "edit_phone_save"
            goto L5e
        L45:
            java.lang.String r0 = "add_name"
            goto L50
        L48:
            java.lang.String r0 = "add_contact_info"
            goto L70
        L4b:
            java.lang.String r0 = "add_phone_save"
            goto L5e
        L4e:
            java.lang.String r0 = "edit_name"
        L50:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r0 = "name"
            return r0
        L59:
            java.lang.String r0 = "edit_email_save"
            goto L70
        L5c:
            java.lang.String r0 = "edit_phone"
        L5e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r0 = "phone"
            return r0
        L67:
            java.lang.String r0 = "edit_email"
            goto L70
        L6a:
            r0 = 557(0x22d, float:7.8E-43)
            java.lang.String r0 = X.MSV.A00(r0)
        L70:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r0 = "email"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70199WGm.A03(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A04(java.lang.String r1) {
        /*
            int r0 = X.AbstractC25235BEs.A07(r1)
            switch(r0) {
                case -2025722585: goto L3a;
                case -2024140158: goto L37;
                case -2015699207: goto L2c;
                case -1866204256: goto L21;
                case -1236011159: goto L1e;
                case 330394238: goto L1b;
                case 340417616: goto L18;
                case 567396712: goto L15;
                case 1265961850: goto L12;
                case 1322332207: goto Lf;
                default: goto L7;
            }
        L7:
            java.lang.String r1 = "Invalid view name"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        Lf:
            java.lang.String r0 = "add_name_inline"
            goto L23
        L12:
            java.lang.String r0 = "add_email_inline"
            goto L3c
        L15:
            java.lang.String r0 = "add_phone_inline"
            goto L2e
        L18:
            java.lang.String r0 = "add_phone"
            goto L2e
        L1b:
            java.lang.String r0 = "add_email"
            goto L3c
        L1e:
            java.lang.String r0 = "add_name"
            goto L23
        L21:
            java.lang.String r0 = "edit_name"
        L23:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r0 = "name"
            return r0
        L2c:
            java.lang.String r0 = "edit_phone"
        L2e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r0 = "phone"
            return r0
        L37:
            java.lang.String r0 = "add_contact"
            goto L3c
        L3a:
            java.lang.String r0 = "edit_email"
        L3c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r0 = "email"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70199WGm.A04(java.lang.String):java.lang.String");
    }

    public static final void A09(C63406Sjd c63406Sjd, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        String str;
        if (C63406Sjd.A0J(c63406Sjd) || (C63406Sjd.A0H(c63406Sjd) && c63406Sjd.A01 != null)) {
            interfaceC16820sZ.invoke();
            return;
        }
        if (!C63406Sjd.A0G(c63406Sjd)) {
            return;
        }
        Throwable th = c63406Sjd.A02;
        if (th != null) {
            str = AbstractC63064Sbl.A01(th);
        } else {
            str = "";
        }
        interfaceC16660sJ.invoke(str);
    }
}
