package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class U72 {
    /* JADX WARN: Type inference failed for: r0v10, types: [X.4kK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.4kK, java.lang.Object] */
    public static C1338462s A00(C6FQ c6fq, C102884kP c102884kP, C1338862w c1338862w, String str, List list, List list2, List list3, List list4, List list5, List list6, List list7, Map map, Map map2, boolean z, boolean z2) {
        List list8;
        C102884kP c102884kP2 = c102884kP;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                Object obj = C6AM.A00(c6fq).A07.get(str2);
                if (obj != null) {
                    arrayList.add(obj);
                } else {
                    throw AbstractC167007dF.A0c(AnonymousClass001.A0g("Data Manifest for referenced internal variable id ", str2, " not found! "), AbstractC111324zv.A00(1380));
                }
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                Map singletonMap = Collections.singletonMap("initial", C6AM.A03(c6fq, str3));
                ?? obj2 = new Object();
                obj2.A00 = str3;
                obj2.A01 = "ls";
                obj2.A02 = singletonMap;
                arrayList.add(obj2);
            }
        }
        if (map != null) {
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                List list9 = c6fq.A0D;
                String A00 = C66208U4e.A00(C05F.A00, (String) entry.getKey(), list9, list9.size());
                Map singletonMap2 = Collections.singletonMap("initial", entry.getValue());
                ?? obj3 = new Object();
                obj3.A00 = A00;
                obj3.A01 = "ls";
                obj3.A02 = singletonMap2;
                arrayList.add(obj3);
            }
        }
        HashMap hashMap = new HashMap();
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                String str4 = (String) it3.next();
                hashMap.put(str4, C6AM.A01(c6fq, str4));
            }
        }
        if (z && c102884kP != null) {
            if (z2) {
                list8 = c6fq.A0D;
            } else {
                list8 = null;
            }
            c102884kP2 = C6AU.A00(null, new U7B(c102884kP, list8), c102884kP);
        }
        return C1338462s.A01(null, c102884kP2, c1338862w, str, arrayList, list4, list5, list6, list7, hashMap, map2);
    }

    public static C1338462s A01(C6FQ c6fq, C102824kJ c102824kJ, Map map, boolean z, boolean z2) {
        String str;
        C102884kP c102884kP = c102824kJ.A00;
        List list = c102824kJ.A0D;
        List list2 = c102824kJ.A0C;
        List list3 = c102824kJ.A0B;
        C1338862w c1338862w = c102824kJ.A02;
        List list4 = c102824kJ.A0A;
        List list5 = c102824kJ.A06;
        List list6 = c102824kJ.A09;
        C103424lI c103424lI = c102824kJ.A01;
        if (c103424lI != null) {
            str = c103424lI.A00;
        } else {
            str = null;
        }
        return A00(c6fq, c102884kP, c1338862w, str, list, list2, list3, list4, list5, list6, c102824kJ.A0E, map, c102824kJ.A0F, z, z2);
    }
}
