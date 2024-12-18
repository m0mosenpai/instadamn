package X;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.5Lq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115775Lq {
    public static final C115775Lq A00 = new Object();
    public static final Map A06 = new LinkedHashMap();
    public static final Map A03 = new LinkedHashMap();
    public static final Map A07 = new LinkedHashMap();
    public static final Map A05 = new LinkedHashMap();
    public static final Map A04 = new LinkedHashMap();
    public static final Map A02 = new LinkedHashMap();
    public static final Map A01 = new LinkedHashMap();
    public static final Map A09 = new LinkedHashMap();
    public static final Queue A08 = new ConcurrentLinkedQueue();

    public static final void A03(String str) {
        C14360o3.A0B(str, 0);
        A06.remove(str);
        A03.remove(str);
        A09.remove(str);
        A02.remove(str);
        A01.remove(str);
    }

    public static final void A04(String str, String str2) {
        C14360o3.A0B(str2, 1);
        Map map = A09;
        AbstractCollection abstractCollection = (AbstractCollection) map.get(str);
        if (abstractCollection == null) {
            abstractCollection = new HashSet();
        }
        abstractCollection.add(str2);
        map.put(str, abstractCollection);
    }

    public static final boolean A05(String str, String str2) {
        C14360o3.A0B(str2, 1);
        AbstractCollection abstractCollection = (AbstractCollection) A09.get(str);
        if (abstractCollection == null || abstractCollection.isEmpty()) {
            return false;
        }
        return abstractCollection.contains(str2);
    }

    public final void A08(EnumC77673dr enumC77673dr, AbstractC115815Lv abstractC115815Lv, String str, String str2) {
        C14360o3.A0B(str2, 2);
        Map map = A06;
        AbstractMap abstractMap = (AbstractMap) map.get(str);
        if (abstractMap == null) {
            abstractMap = new HashMap();
        }
        AbstractMap abstractMap2 = (AbstractMap) abstractMap.get(enumC77673dr);
        if (abstractMap2 == null) {
            abstractMap2 = new HashMap();
        }
        abstractMap2.put(str2, abstractC115815Lv);
        abstractMap.put(enumC77673dr, abstractMap2);
        map.put(str, abstractMap);
        if (!abstractC115815Lv.A01.containsKey("index_of_card")) {
            A08.add(new C51u(str, enumC77673dr, str2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Zx, X.6Ow] */
    public static final C138406Ow A00(String str) {
        C138406Ow c138406Ow = (C138406Ow) A03.get(str);
        if (c138406Ow == null) {
            return new C0Zx();
        }
        return c138406Ow;
    }

    public static final Double A01(String str) {
        Object obj;
        Map map = A01;
        Object obj2 = null;
        if (!map.containsKey(str)) {
            return null;
        }
        AbstractMap abstractMap = (AbstractMap) map.get(str);
        if (abstractMap != null) {
            obj = abstractMap.get("dwell_time");
        } else {
            obj = null;
        }
        if (!(obj instanceof Double)) {
            return null;
        }
        AbstractMap abstractMap2 = (AbstractMap) map.get(str);
        if (abstractMap2 != null) {
            obj2 = abstractMap2.get("dwell_time");
        }
        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Double");
        return (Double) obj2;
    }

    public static final ArrayList A02(String str) {
        Object obj;
        Map map = A01;
        ArrayList arrayList = null;
        if (map.containsKey(str)) {
            AbstractMap abstractMap = (AbstractMap) map.get(str);
            if (abstractMap != null) {
                obj = abstractMap.get("client_cop_options");
            } else {
                obj = null;
            }
            if (obj instanceof List) {
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : iterable) {
                    if (obj2 instanceof String) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.size() == ((List) obj).size()) {
                    arrayList = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (obj3 instanceof String) {
                            arrayList.add(obj3);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final Integer A06(String str) {
        C115785Lr c115785Lr = (C115785Lr) A02.get(str);
        if (c115785Lr == null) {
            return null;
        }
        return c115785Lr.A00;
    }

    public final ArrayList A07(String str) {
        Object obj;
        Map map = A01;
        ArrayList arrayList = null;
        if (map.containsKey(str)) {
            AbstractMap abstractMap = (AbstractMap) map.get(str);
            if (abstractMap != null) {
                obj = abstractMap.get("server_cop_options");
            } else {
                obj = null;
            }
            if ((obj instanceof ArrayList) && (!((Collection) obj).isEmpty())) {
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : iterable) {
                    if (obj2 instanceof String) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.size() == ((AbstractCollection) obj).size()) {
                    arrayList = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (obj3 instanceof String) {
                            arrayList.add(obj3);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final void A09(String str, String str2, String str3) {
        Map map = A04;
        C0Zx c0Zx = (C0Zx) map.get(str);
        if (c0Zx == null) {
            c0Zx = new C0Zx();
        }
        c0Zx.A06(MSV.A00(447), str2);
        c0Zx.A06("flow_step", "lead_ads_first_question_impression");
        c0Zx.A06(MSV.A00(253), str3);
        map.put(str, c0Zx);
    }
}
