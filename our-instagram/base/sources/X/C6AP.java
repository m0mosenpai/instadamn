package X;

import android.util.SparseArray;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.6AP, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6AP {
    public static C102884kP A00(C136376Fq c136376Fq, final C102884kP c102884kP, C102884kP c102884kP2, Object obj, List list, Map map) {
        C6AQ c6aq;
        C102884kP c102884kP3;
        C1338462s c1338462s;
        C102884kP A00;
        SparseArray sparseArray;
        C1338462s c1338462s2 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list2 = (List) obj;
            c6aq = new C6AQ(list2.get(0), (String) list2.get(2), list, (Map) list2.get(1));
        } else {
            if (obj instanceof C6AQ) {
                c6aq = (C6AQ) obj;
            }
            return null;
        }
        Object obj2 = c6aq.A00;
        if (obj2 instanceof Number) {
            int intValue = ((Number) obj2).intValue();
            List A0N = c102884kP.A0N(143);
            if (intValue >= 0 && intValue < A0N.size()) {
                c102884kP3 = (C102884kP) A0N.get(intValue);
            } else {
                AbstractC62260S4f.A00(c102884kP);
                String str = c6aq.A01;
                StringBuilder sb = new StringBuilder("[");
                Iterator it = A0N.iterator();
                while (it.hasNext()) {
                    sb.append(((C102884kP) it.next()).A05);
                    sb.append(", ");
                }
                sb.append("]");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("BloksCrash: children-binding index ");
                sb2.append(intValue);
                sb2.append(" scopeKey: ");
                sb2.append(str);
                sb2.append(" out of bounds for array of size ");
                sb2.append(A0N.size());
                sb2.append(" ");
                sb2.append(sb.toString());
                throw new IndexOutOfBoundsException(sb2.toString());
            }
        } else {
            if (obj2 instanceof String) {
                C62516SEs c62516SEs = (C62516SEs) c136376Fq.A00.A04.get(obj2);
                if (c62516SEs != null) {
                    C102824kJ c102824kJ = c62516SEs.A00.A00.A00;
                    if (c102824kJ != null) {
                        c1338462s = C1338462s.A03(null, c102824kJ, null);
                        c102884kP3 = c102824kJ.A00;
                    }
                    return null;
                }
                c102884kP3 = (C102884kP) c136376Fq.A00.A05.get(obj2);
                c1338462s = null;
                if (c102884kP3 != null) {
                    c1338462s2 = c1338462s;
                }
                return null;
            }
            if (obj2 instanceof C1338462s) {
                c1338462s2 = (C1338462s) obj2;
                c102884kP3 = c1338462s2.A02;
            }
            return null;
        }
        final C6FD c6fd = c136376Fq.A02;
        final String str2 = c6aq.A01;
        int A002 = c6fd.A00(c102884kP, c102884kP3, str2);
        final LinkedList linkedList = new LinkedList(c6aq.A02);
        linkedList.add(Integer.valueOf(A002));
        String A003 = C6AS.A00(C05F.A01, linkedList);
        for (Map.Entry entry : c6aq.A03.entrySet()) {
            String A01 = C6AS.A01((String) entry.getKey(), A003);
            Object value = entry.getValue();
            c136376Fq.A09.put(A01, value);
            java.util.Set set = c136376Fq.A0D;
            if (set != null && !C6AO.A00(c136376Fq.A0B.get(A01), value)) {
                set.add(A01);
            }
            map.put(A01, entry.getValue());
        }
        C136386Fr c136386Fr = c136376Fq.A03;
        if (c102884kP2 == null || (sparseArray = (SparseArray) c136386Fr.A01.get(c102884kP2.A04)) == null || (A00 = (C102884kP) sparseArray.get(A002)) == null || A00.A08 != c102884kP3) {
            A00 = C6AU.A00(null, new InterfaceC139976Vb() { // from class: X.6AT
                @Override // X.InterfaceC139976Vb
                public final void DxH(C102884kP c102884kP4) {
                }

                @Override // X.InterfaceC139976Vb
                public final C102884kP AC0(InterfaceC102974kY interfaceC102974kY, C102884kP c102884kP4) {
                    InterfaceC102974kY interfaceC102974kY2;
                    C6FD c6fd2 = C6FD.this;
                    C102884kP c102884kP5 = c102884kP;
                    List list3 = linkedList;
                    String str3 = str2;
                    InterfaceC102974kY interfaceC102974kY3 = c102884kP4.A01;
                    if (interfaceC102974kY3 != null) {
                        if (interfaceC102974kY == null) {
                            interfaceC102974kY = c102884kP5.A01;
                        }
                        interfaceC102974kY2 = interfaceC102974kY3.Cme(interfaceC102974kY);
                    } else {
                        interfaceC102974kY2 = null;
                    }
                    return new C102884kP(interfaceC102974kY2, null, c102884kP4, c102884kP4, list3, c6fd2.A00(c102884kP5, c102884kP4, str3));
                }
            }, c102884kP3);
            if (c1338462s2 != null) {
                C1338962x c1338962x = c1338462s2.A01;
                c136376Fq.A00 = c136376Fq.A00.A04(c1338962x.A06).A00(c1338962x.A00).A01(c1338962x.A03).A05(c1338962x.A07).A02(c1338962x.A04);
                c136376Fq.A08.add(c1338962x);
                List<InterfaceC102844kL> list3 = c1338962x.A05;
                if (list3 != null) {
                    List list4 = A00.A0A;
                    list4.getClass();
                    String A004 = C6AS.A00(C05F.A00, list4);
                    for (InterfaceC102844kL interfaceC102844kL : list3) {
                        C102834kK c102834kK = (C102834kK) interfaceC102844kL;
                        String A012 = C6AS.A01(c102834kK.A00, A004);
                        if (!c136376Fq.A00.A08.containsKey(A012)) {
                            String str3 = c102834kK.A01;
                            InterfaceC136226Ez interfaceC136226Ez = (InterfaceC136226Ez) c136376Fq.A0A.get(str3);
                            if (interfaceC136226Ez != null) {
                                C6DU BHe = interfaceC136226Ez.BHe(c136376Fq.A00(A00, null, null), interfaceC102844kL, c136376Fq.A00.A01.get(str3));
                                c136376Fq.A00 = c136376Fq.A00.A06(Collections.singletonMap(A012, BHe.BHk()));
                                c136376Fq.A06.put(A012, BHe);
                            } else {
                                throw new RuntimeException(AnonymousClass001.A0R("Missing variable module with type: ", str3));
                            }
                        }
                    }
                }
            }
        }
        return A00;
    }
}
