package X;

import android.content.Context;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ShK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63312ShK {
    public static void A03(Context context, InterfaceC65508Tld interfaceC65508Tld, String str, String str2, String str3, List list, List list2, Map map) {
        String A1A = AbstractC166987dD.A1A("need_register_trusted_device_key", map);
        if (A1A != null && !A1A.equalsIgnoreCase("false")) {
            A04(context, new T3A(context, interfaceC65508Tld, str2, str3, list, list2, map), str2, str3, AbstractC166987dD.A1G());
        } else {
            A02(context, interfaceC65508Tld, false, str, "VERIFY_FACTOR", str2, null, null, str3, list, list2, map);
        }
    }

    public static C63152Se0 A00(String str, List list) {
        try {
            return C63174SeZ.A00().A06(str, list);
        } catch (IOException e) {
            throw new Exception(e);
        } catch (IllegalAccessException e2) {
            throw new Exception(e2);
        } catch (InstantiationException e3) {
            throw new Exception(e3);
        } catch (NoSuchMethodException e4) {
            throw new Exception(e4);
        } catch (InvocationTargetException e5) {
            throw new Exception(e5);
        } catch (InvalidAlgorithmParameterException e6) {
            throw new Exception(e6);
        } catch (KeyStoreException e7) {
            throw new Exception(e7);
        } catch (NoSuchAlgorithmException e8) {
            throw new Exception(e8);
        } catch (NoSuchProviderException e9) {
            throw new Exception(e9);
        } catch (CertificateException e10) {
            throw new Exception(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.SEA, java.lang.Object] */
    public static SXG A01(String str, String str2, String str3, String str4, String str5, String str6, String str7, HashSet hashSet, List list, Map map) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("PAYMENT_TYPE", str3);
        A1G.put("AUTH_METHOD_TYPE", str2);
        boolean startsWith = str4.startsWith("upl");
        String A00 = AbstractC63083Sc6.A00();
        if (!startsWith) {
            A1G.put(A00, AnonymousClass001.A0R("upl_", str4));
        } else {
            A1G.put(A00, str4);
        }
        C63346Si2 A002 = C63174SeZ.A00();
        HashSet A0k = AbstractC31171DnF.A0k(list);
        ?? obj = new Object();
        obj.A00 = map;
        obj.A01 = A0k;
        return new SXG(AbstractC63063Sbk.A00(new C64192T3b(A002, 1), hashSet), obj, str, str5, str6, str7, null, str3, A1G, hashSet);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public static void A02(Context context, InterfaceC65508Tld interfaceC65508Tld, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, Map map) {
        String str7;
        SXG A01;
        C63152Se0 c63152Se0 = null;
        if (map.get("target_account_id") != null) {
            str7 = String.valueOf(map.get("target_account_id"));
        } else {
            str7 = null;
        }
        if (bool != null && bool.booleanValue()) {
            HashSet A1H = AbstractC166987dD.A1H();
            List list3 = C63174SeZ.A00().A04;
            boolean equalsIgnoreCase = str2.equalsIgnoreCase("GENERATE_AND_SEND_MFT_OTP");
            int size = list3.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C63152Se0 c63152Se02 = (C63152Se0) list3.get(size);
                if ("PIN".equals(c63152Se02.A03) || equalsIgnoreCase) {
                    if (c63152Se02.A01 > System.currentTimeMillis() && c63152Se02.A04.equalsIgnoreCase("VALID")) {
                        A1H.add(c63152Se02);
                        break;
                    }
                }
            }
            C62434SBm c62434SBm = AbstractC61535RpF.A00;
            if (c62434SBm == null) {
                c62434SBm = new C62434SBm();
                AbstractC61535RpF.A00 = c62434SBm;
            }
            ConcurrentHashMap concurrentHashMap = c62434SBm.A00;
            List A18 = MSW.A18(str6, concurrentHashMap);
            if (A18 == null) {
                A18 = new CopyOnWriteArrayList();
                concurrentHashMap.put(str6, new CopyOnWriteArrayList());
            }
            if (!A18.isEmpty()) {
                A1H.addAll(A18);
            }
            try {
                C63152Se0 A04 = C63174SeZ.A00().A04();
                if (A04 != null) {
                    map.put("assoc_public_key", A04.A07);
                    A1H.add(A04);
                }
            } catch (KeyStoreException | NoSuchAlgorithmException unused) {
            }
            C63406Sjd.A0B(AbstractC63245Sfz.A01(A01(str2, str, str3, str6, null, str4, str5, A1H, list2, map)), C63628Sqa.A00(new T37(interfaceC65508Tld, c62434SBm, str6), 62));
            return;
        }
        if (str2.equals("EDIT_CARD")) {
            A01 = A01(str2, str, str3, str6, str7, str4, str5, AbstractC166987dD.A1H(), list2, map);
        } else {
            c63152Se0 = A00(str, list);
            map.put("public_key", c63152Se0.A07);
            map.put(AbstractC63083Sc6.A01(0, 9, 114), SYL.A00(context));
            map.put("caps", list);
            map.put("app_id", context.getPackageName());
            map.put("auth_ticket_type", c63152Se0.A03);
            HashSet A1H2 = AbstractC166987dD.A1H();
            A1H2.add(c63152Se0);
            try {
                C63152Se0 A042 = C63174SeZ.A00().A04();
                if (A042 != null) {
                    map.put("assoc_public_key", A042.A07);
                    A1H2.add(A042);
                }
            } catch (KeyStoreException | NoSuchAlgorithmException unused2) {
            }
            A01 = A01(str2, str, str3, str6, str7, str4, str5, A1H2, list2, map);
            if (!str2.equals("ADD_CARD")) {
                C63406Sjd.A0B(AbstractC63245Sfz.A01(A01), C63628Sqa.A00(new T39(context, interfaceC65508Tld, A01, str3, str6, 1), 62));
                return;
            }
        }
        C60625REk A00 = AbstractC62184S1f.A00(context, new C62734SOa(c63152Se0, A01), new C71679WyX(0), new C71679WyX(1), new C71679WyX(2));
        AbstractC63144Sdq.A02(A00);
        Q8J q8j = ((AbstractC63144Sdq) A00).A03;
        ?? obj = new Object();
        C63406Sjd.A0B(q8j, C63628Sqa.A00(obj, 63));
        T8G t8g = new T8G(interfaceC65508Tld, 6);
        C58443PvM A06 = C2FP.A06();
        C14360o3.A07(A06);
        C2OD.A03(t8g, obj, A06.A00.A03);
    }

    public static void A04(Context context, InterfaceC65508Tld interfaceC65508Tld, String str, String str2, Map map) {
        String str3;
        if (map.get("target_account_id") != null) {
            str3 = String.valueOf(map.get("target_account_id"));
        } else {
            str3 = null;
        }
        C63152Se0 A00 = A00("MFT_TRUSTED_DEVICE", AbstractC166987dD.A1E());
        map.put("public_key", A00.A07);
        map.put(AbstractC63083Sc6.A01(0, 9, 114), SYL.A00(context));
        map.put("app_id", context.getPackageName());
        map.put("auth_ticket_type", A00.A03);
        HashSet A1H = AbstractC166987dD.A1H();
        A1H.add(A00);
        SXG A01 = A01("CREATE_AUTH_TICKET_BASED_FACTOR", "MFT_TRUSTED_DEVICE", str, str2, str3, null, null, A1H, AbstractC166987dD.A1E(), map);
        C63406Sjd.A0B(AbstractC63245Sfz.A01(A01), C63628Sqa.A00(new T39(context, interfaceC65508Tld, A01, str, str2, 0), 62));
    }
}
