package X;

import android.util.SparseIntArray;
import android.util.SparseLongArray;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.logginginfra.falco.Checksum;
import com.facebook.logginginfra.falco.Identity;
import com.facebook.logginginfra.falco.PrincipalSubject;
import com.facebook.logginginfra.falco.QPLCrashResiliency;
import com.facebook.logginginfra.falco.QPLEventConfig;
import com.facebook.logginginfra.falco.QPLSamplingMethod;
import com.facebook.logginginfra.falco.SetQPLConfigDirective;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0ZN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ZN {
    public final C0R9 A00;

    public static C0ZH A00(List list, List list2) {
        C05690Rt c05690Rt = new C05690Rt();
        if (list != null) {
            List A00 = AbstractC72526Xff.A00(list);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                HyperThriftBase hyperThriftBase = (HyperThriftBase) it.next();
                Number number = (Number) hyperThriftBase.A00(0);
                number.getClass();
                int intValue = number.intValue();
                Number number2 = (Number) hyperThriftBase.A00(5);
                if (number2 != null) {
                    long longValue = number2.longValue();
                    if (longValue >= 0 && longValue < A00.size()) {
                        c05690Rt.put(intValue, A00.get((int) longValue));
                    }
                }
            }
        }
        return new C0ZH(c05690Rt);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.util.SparseIntArray, X.0aR] */
    public static C0ZI A01(List list) {
        ?? sparseIntArray = new SparseIntArray();
        C05690Rt c05690Rt = new C05690Rt();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            QPLEventConfig qPLEventConfig = (QPLEventConfig) it.next();
            Number number = (Number) qPLEventConfig.A00(0);
            number.getClass();
            int intValue = number.intValue();
            Number number2 = (Number) qPLEventConfig.A00(1);
            number2.getClass();
            int intValue2 = number2.intValue();
            QPLSamplingMethod A04 = qPLEventConfig.A04();
            sparseIntArray.put(intValue, intValue2);
            c05690Rt.put(intValue, A04);
        }
        return new C0ZI(sparseIntArray, c05690Rt);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0eF] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.0ZR] */
    public static C0eF A02(List list) {
        String[] strArr;
        LinkedHashMap linkedHashMap;
        final C05690Rt c05690Rt = new C05690Rt();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            QPLEventConfig qPLEventConfig = (QPLEventConfig) it.next();
            Number number = (Number) qPLEventConfig.A00(0);
            number.getClass();
            int intValue = number.intValue();
            QPLCrashResiliency A03 = qPLEventConfig.A03();
            if (A03 != null) {
                List list2 = (List) A03.A00(0);
                if (list2 != null) {
                    strArr = (String[]) list2.toArray(new String[0]);
                } else {
                    strArr = null;
                }
                ?? obj = new Object();
                if (strArr == null) {
                    linkedHashMap = null;
                } else {
                    linkedHashMap = new LinkedHashMap();
                    for (int i = 0; i < strArr.length; i++) {
                        linkedHashMap.put(strArr[i], Integer.valueOf(i));
                    }
                }
                obj.A00 = linkedHashMap;
                c05690Rt.put(intValue, obj);
            }
        }
        c05690Rt.A00 = true;
        c05690Rt.size();
        return new C0XN(c05690Rt) { // from class: X.0eF
            public final InterfaceC07540aT A00;

            @Override // X.C0XN
            public final int AVP(int i2, String str) {
                LinkedHashMap linkedHashMap2;
                Number number2;
                C0ZR c0zr = (C0ZR) this.A00.get(i2);
                if (c0zr == null || (linkedHashMap2 = c0zr.A00) == null || (number2 = (Number) linkedHashMap2.get(str)) == null) {
                    return -1;
                }
                return number2.intValue();
            }

            @Override // X.C0XN
            public final boolean CY2(int i2) {
                if (this.A00.get(i2) == null) {
                    return false;
                }
                return true;
            }

            {
                this.A00 = c05690Rt;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ZK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0aS, android.util.SparseLongArray] */
    public final C0ZL A03(SetQPLConfigDirective setQPLConfigDirective) {
        Identity identity;
        PrincipalSubject A04 = setQPLConfigDirective.A04();
        List<HyperThriftBase> list = (List) setQPLConfigDirective.A00(1);
        if (list == null) {
            list = Collections.emptyList();
        }
        List list2 = (List) setQPLConfigDirective.A00(2);
        try {
            C0ZI A01 = A01(list);
            ?? sparseLongArray = new SparseLongArray();
            Iterator it = list.iterator();
            while (true) {
                long j = 0;
                if (!it.hasNext()) {
                    break;
                }
                HyperThriftBase hyperThriftBase = (HyperThriftBase) it.next();
                Number number = (Number) hyperThriftBase.A00(0);
                number.getClass();
                int intValue = number.intValue();
                List list3 = (List) hyperThriftBase.A00(3);
                if (list3 != null) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        j |= ((Number) it2.next()).longValue();
                    }
                    sparseLongArray.put(intValue, j);
                }
            }
            C0eH c0eH = new C0eH(sparseLongArray);
            ?? obj = new Object();
            obj.A00 = new C05690Rt();
            for (HyperThriftBase hyperThriftBase2 : list) {
                Number number2 = (Number) hyperThriftBase2.A00(0);
                number2.getClass();
                int intValue2 = number2.intValue();
                HashMap hashMap = new HashMap();
                obj.A00.put(intValue2, hashMap);
                Map map = (Map) hyperThriftBase2.A00(6);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            C0eF A02 = A02(list);
            C0ZH A00 = A00(list2, list);
            Checksum A03 = setQPLConfigDirective.A03();
            A03.getClass();
            if (A04 == null) {
                identity = null;
            } else {
                identity = A04.A03();
            }
            return new C0ZL(A03, identity, A00, c0eH, A01, obj, A02);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public C0ZN(C0R9 c0r9) {
        this.A00 = c0r9;
    }
}
