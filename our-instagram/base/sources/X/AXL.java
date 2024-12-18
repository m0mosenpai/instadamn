package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AXL implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(AXL.class);
    public static final String __redex_internal_original_name = "BKBloksFxActionUpdateClientServiceCacheImpl";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.8m4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [X.5uZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        ?? obj;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, MSV.A00(115));
        List<Map> list = (List) A03;
        InterfaceC103384lE A002 = C1344465q.A00(c6fw.A00.get(1));
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        try {
            C14360o3.A0B(list, 0);
            int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(list, 10));
            if (A0L < 16) {
                A0L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
            for (Map map : list) {
                Object obj2 = map.get("service_name");
                if ((obj2 instanceof String) && (!AbstractC001900j.A0T((CharSequence) obj2))) {
                    java.util.Set keySet = map.keySet();
                    java.util.Set singleton = Collections.singleton("service_name");
                    C14360o3.A07(singleton);
                    if (C14360o3.A0K(keySet, singleton)) {
                        obj = 0;
                    } else {
                        Object obj3 = map.get("service_status");
                        boolean z = true;
                        if (!(obj3 instanceof String) || !(!AbstractC001900j.A0T((CharSequence) obj3))) {
                            z = false;
                        }
                        if (z) {
                            Object obj4 = map.get("identity_mapping_with_obid");
                            if (obj4 instanceof Map) {
                                Object obj5 = map.get("extra_client_cache_data");
                                if (obj5 instanceof Map) {
                                    String str = (String) obj3;
                                    Map map2 = (Map) obj4;
                                    ArrayList arrayList = new ArrayList(map2.size());
                                    Iterator A15 = AbstractC166997dE.A15(map2);
                                    while (A15.hasNext()) {
                                        Map.Entry A1K = AbstractC166987dD.A1K(A15);
                                        Object key = A1K.getKey();
                                        Object value = A1K.getValue();
                                        if (key instanceof Long) {
                                            if (value instanceof Map) {
                                                String valueOf = String.valueOf(AbstractC166987dD.A0N(key));
                                                Map map3 = (Map) value;
                                                ArrayList arrayList2 = new ArrayList(map3.size());
                                                Iterator A152 = AbstractC166997dE.A15(map3);
                                                while (A152.hasNext()) {
                                                    Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
                                                    Object value2 = A1K2.getValue();
                                                    C14360o3.A0C(value2, AbstractC43591JPw.A00(48));
                                                    Map map4 = (Map) value2;
                                                    String valueOf2 = String.valueOf(A1K2.getKey());
                                                    Object obj6 = map4.get("identity_type");
                                                    C14360o3.A0C(obj6, "null cannot be cast to non-null type kotlin.String");
                                                    Object obj7 = map4.get("obfuscated_identity_id");
                                                    C14360o3.A0C(obj7, "null cannot be cast to non-null type kotlin.String");
                                                    arrayList2.add(new C196168m6(valueOf2, (String) obj6, (String) obj7, C16930sl.A00));
                                                }
                                                C14360o3.A0B(valueOf, 1);
                                                ?? obj8 = new Object();
                                                obj8.A00 = valueOf;
                                                obj8.A01 = arrayList2;
                                                arrayList.add(obj8);
                                            } else {
                                                throw AbstractC166987dD.A14("Check failed.");
                                            }
                                        } else {
                                            throw AbstractC166987dD.A14("Check failed.");
                                        }
                                    }
                                    HashMap A1G = AbstractC166987dD.A1G();
                                    Iterator A153 = AbstractC166997dE.A15((Map) obj5);
                                    while (A153.hasNext()) {
                                        Map.Entry A1K3 = AbstractC166987dD.A1K(A153);
                                        Object key2 = A1K3.getKey();
                                        C14360o3.A0C(key2, "null cannot be cast to non-null type kotlin.String");
                                        Object value3 = A1K3.getValue();
                                        C14360o3.A0C(value3, "null cannot be cast to non-null type kotlin.String");
                                        A1G.put(key2, value3);
                                    }
                                    long currentTimeMillis = System.currentTimeMillis();
                                    C14360o3.A0B(str, 1);
                                    C14360o3.A0B(A1G, 3);
                                    obj = new Object();
                                    obj.A01 = str;
                                    obj.A03 = arrayList;
                                    obj.A02 = A1G;
                                    obj.A00 = currentTimeMillis;
                                } else {
                                    throw AbstractC166987dD.A14("Check failed.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Check failed.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Check failed.");
                        }
                    }
                    linkedHashMap.put(obj2, obj);
                } else {
                    throw AbstractC166987dD.A14("Check failed.");
                }
            }
            C196118m1 A003 = AbstractC196108m0.A00(userSession);
            A003.A02();
            A003.A04(A00, "ig_android_fx_bloks", linkedHashMap);
        } catch (IllegalStateException e) {
            AbstractC25241Le.A03(AbstractC111324zv.A00(760), e);
        }
        C6BQ.A0E(c6fq, A002, C6FW.A01);
        return null;
    }
}
