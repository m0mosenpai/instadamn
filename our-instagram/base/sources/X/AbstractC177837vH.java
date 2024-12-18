package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.7vH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC177837vH {
    public static String A00(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(";");
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.AbstractCollection, java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v0, types: [X.7wE] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, java.util.AbstractCollection, java.util.Collection, java.util.LinkedList] */
    public static void A01(InterfaceC178407wE interfaceC178407wE, String str, List list, long j) {
        String str2;
        List list2;
        LinkedList linkedList;
        Object obj;
        Object obj2;
        String str3;
        if (interfaceC178407wE != 0) {
            boolean Bh9 = interfaceC178407wE.Bh9();
            ?? linkedList2 = new LinkedList();
            LinkedList<String> linkedList3 = new LinkedList();
            LinkedList linkedList4 = new LinkedList();
            LinkedList linkedList5 = new LinkedList();
            LinkedList linkedList6 = new LinkedList();
            Iterator it = list.iterator();
            while (true) {
                str2 = "0";
                if (!it.hasNext()) {
                    break;
                }
                C200648u7 c200648u7 = (C200648u7) it.next();
                String str4 = NetInfoModule.CONNECTION_TYPE_NONE;
                Map map = c200648u7.A00;
                if (map == null) {
                    obj = "0";
                    obj2 = "0";
                } else {
                    if (!map.containsKey("effect_id")) {
                        str3 = "0";
                    } else {
                        str3 = (String) map.get("effect_id");
                    }
                    if (map.containsKey("filter_type")) {
                        str4 = (String) map.get("filter_type");
                    }
                    if (!map.containsKey("effect_instance_id")) {
                        obj = "0";
                    } else {
                        obj = map.get("effect_instance_id");
                    }
                    if (!map.containsKey("effect_session_id")) {
                        obj2 = "0";
                    } else {
                        obj2 = map.get("effect_session_id");
                    }
                    if (str4.equals("msqrd") && !str3.equals("0")) {
                        linkedList3.add(str3);
                    }
                    str2 = str3;
                }
                linkedList2.add(str2);
                linkedList4.add(str4);
                linkedList5.add(obj);
                linkedList6.add(obj2);
            }
            InterfaceC178477wL AkA = interfaceC178407wE.AkA();
            if (Bh9) {
                list2 = Collections.emptyList();
                linkedList = Collections.emptyList();
            } else {
                list2 = linkedList2;
                linkedList = linkedList5;
            }
            List Abh = AkA.Abh(list2, linkedList, linkedList6);
            List Abi = AkA.Abi(linkedList4);
            if (!linkedList2.equals(Abh)) {
                C196498mf c196498mf = null;
                if (!linkedList3.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (String str5 : linkedList3) {
                        if (!Abh.contains(str5)) {
                            sb.append(str5);
                            sb.append(";");
                        }
                    }
                    if (sb.length() > 0) {
                        if (!Bh9) {
                            str2 = sb.substring(0, sb.length() - 1);
                        }
                        c196498mf = interfaceC178407wE.BcP().ARJ(str2);
                    }
                } else if (Abi.contains("msqrd")) {
                    c196498mf = interfaceC178407wE.BcP().ARI();
                }
                HashMap hashMap = new HashMap();
                if (!Bh9) {
                    if (Abh.size() < linkedList2.size()) {
                        ArrayList arrayList = new ArrayList((Collection) linkedList2);
                        arrayList.removeAll(Abh);
                        hashMap.put("effects_added", A00(arrayList));
                    } else {
                        if (Abh.size() <= linkedList2.size()) {
                            ArrayList arrayList2 = new ArrayList((Collection) linkedList2);
                            arrayList2.removeAll(Abh);
                            hashMap.put("effects_added", A00(arrayList2));
                        }
                        ?? arrayList3 = new ArrayList(Abh);
                        arrayList3.removeAll(linkedList2);
                        hashMap.put("effects_removed", A00(arrayList3));
                    }
                }
                interfaceC178407wE.CkX(j, "media_pipeline_update_effects_list", str, interfaceC178407wE.COW(c196498mf, hashMap));
            }
        }
    }
}
