package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8uV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC200888uV {
    public String A01 = "2.0";
    public String A00 = "";

    public static void A00(EnumC200948ub enumC200948ub, String str, String str2, String str3, String str4, Map map, AbstractC200888uV abstractC200888uV) {
        Enum r1;
        Enum r12;
        if (abstractC200888uV instanceof C200908uX) {
            C18920wW A02 = AbstractC12220kQ.A02(((C200908uX) abstractC200888uV).A00);
            C25531Mh c25531Mh = new C25531Mh(A02.A00(A02.A00, "fx_access_library"), 158);
            String str5 = abstractC200888uV.A00;
            if (str5.isEmpty()) {
                if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                    str5 = "";
                } else {
                    return;
                }
            }
            c25531Mh.A0M(enumC200948ub, "event");
            try {
                r1 = Enum.valueOf(EnumC223289tL.class, "ACCOUNT_ITEM");
            } catch (IllegalArgumentException unused) {
                r1 = null;
            }
            c25531Mh.A0M((EnumC223289tL) r1, "item_type");
            c25531Mh.A0M((EnumC223279tK) A3E.A00(EnumC223279tK.class, str2), "target_credential_source");
            c25531Mh.A0M((EnumC223269tJ) A3E.A00(EnumC223269tJ.class, str), "target_app_source");
            try {
                r12 = Enum.valueOf(EnumC46256Kdo.class, "");
            } catch (IllegalArgumentException unused2) {
                r12 = null;
            }
            c25531Mh.A0M((EnumC46256Kdo) r12, "target_device_item_source");
            c25531Mh.A0R(TraceFieldType.FailureReason, str3);
            c25531Mh.A0R("event_session_id", str4);
            ((AbstractC02600Aj) c25531Mh).A00.A9M("debug_test_data", map);
            c25531Mh.A0R("version_id", abstractC200888uV.A01);
            c25531Mh.A0R("table_join_id", str5);
            c25531Mh.Cht();
        }
    }

    public final HashMap A01(String... strArr) {
        HashMap hashMap = new HashMap();
        int length = strArr.length;
        if (length % 2 != 1) {
            for (int i = 0; i < length; i += 2) {
                String str = strArr[i];
                if (str == null) {
                    str = "";
                }
                String str2 = strArr[i + 1];
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    public final C200958uc A02() {
        if (this instanceof C200908uX) {
            return new C200958uc(C006802i.A0p);
        }
        return null;
    }

    public final void A03(Integer num, String str, String str2, Map map) {
        A00(EnumC200948ub.A03, str, str2, AbstractC201198v1.A00(num), null, map, this);
        if (A02() != null) {
            C200958uc A02 = A02();
            int A00 = C200958uc.A00(map);
            QuickPerformanceLogger quickPerformanceLogger = A02.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(857814189, A00, (short) 3);
            }
        }
    }

    public final void A04(Integer num, String str, Map map) {
        QuickPerformanceLogger quickPerformanceLogger;
        A00(EnumC200948ub.A0K, str, "ACTIVE_ACCOUNT", AbstractC201198v1.A00(num), null, map, this);
        if (A02() != null && (quickPerformanceLogger = A02().A00) != null) {
            quickPerformanceLogger.markerEnd(857814589, (short) 3);
        }
    }

    public final void A07(String str, Integer num, String str2) {
        A00(EnumC200948ub.A02, str, str2, AbstractC201198v1.A00(num), null, null, this);
    }

    public final void A08(String str, Map map, String str2) {
        String str3 = str2;
        String str4 = str;
        A00(EnumC200948ub.A04, str4, str3, null, null, map, this);
        if (A02() != null) {
            C200958uc A02 = A02();
            int A00 = C200958uc.A00(map);
            QuickPerformanceLogger quickPerformanceLogger = A02.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerStart(857814189, A00);
                quickPerformanceLogger.markerAnnotate(857814189, A00, "platform", "Android");
                quickPerformanceLogger.markerAnnotate(857814189, A00, "app_id", 567067343352427L);
                if (str == null) {
                    str4 = "";
                }
                quickPerformanceLogger.markerAnnotate(857814189, A00, "app_source", str4);
                quickPerformanceLogger.markerAnnotate(857814189, A00, "item_type", "ACCOUNT_ITEM");
                if (str2 == null) {
                    str3 = "";
                }
                quickPerformanceLogger.markerAnnotate(857814189, A00, "credential_source", str3);
                quickPerformanceLogger.markerAnnotate(857814189, A00, "logging_version", "3.0");
            }
            C200958uc.A01(map, A02, A00);
        }
    }

    public final void A05(Integer num, List list, List list2, Map map) {
        if (!list2.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    A00(EnumC200948ub.A09, str, (String) it2.next(), AbstractC201198v1.A00(num), (String) map.get("waterfall_id"), map, this);
                }
            }
        }
    }

    public final void A06(Integer num, List list, List list2, Map map) {
        if (!list2.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    A00(EnumC200948ub.A0F, str, (String) it2.next(), AbstractC201198v1.A00(num), (String) map.get("waterfall_id"), map, this);
                }
            }
        }
    }
}
