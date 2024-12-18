package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

/* renamed from: X.GqN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38156GqN {
    public static final C38156GqN A00 = new Object();

    public final void A00(List list, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        EnumC130515uw enumC130515uw;
        C128005qU c128005qU;
        C130505uv c130505uv;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        InterfaceC127955qO abstractC127945qN;
        int i;
        C132835z6 c132835z6;
        AbstractC127945qN abstractC127945qN2;
        C69296Vl4 c69296Vl4;
        C132835z6 c132835z62;
        Object obj;
        C132835z6 c132835z63;
        C132835z6 c132835z64;
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C128005qU c128005qU2 = (C128005qU) obj2;
            if (c128005qU2 != null) {
                List list2 = c128005qU2.A02;
                if (list2.size() == 1 && (list2.get(0) instanceof HKX) && i2 >= 1) {
                    Object obj3 = list.get(i2 - 1);
                    if (obj3 instanceof C128005qU) {
                        List list3 = ((C128005qU) obj3).A02;
                        if (list3.size() == 1 && (list3.get(0) instanceof HKX)) {
                            C14360o3.A0C(c128005qU2, "null cannot be cast to non-null type com.instagram.discovery.recyclerview.model.GridItemSection");
                            Object obj4 = list2.get(0);
                            C14360o3.A0C(obj4, "null cannot be cast to non-null type com.instagram.discovery.recyclerview.model.TriMediaKeywordGridItemViewModel");
                            ((HKX) obj4).A01 = false;
                        }
                    }
                }
            }
            i2 = i3;
        }
        for (Object obj5 : list) {
            C130505uv c130505uv2 = ((C128005qU) obj5).A01;
            Integer num = null;
            if (c130505uv2 != null) {
                enumC130515uw = c130505uv2.A00;
            } else {
                enumC130515uw = null;
            }
            EnumC130515uw enumC130515uw2 = EnumC130515uw.A0B;
            if (enumC130515uw == enumC130515uw2) {
                if (c130505uv2 != null && (c132835z64 = c130505uv2.A06) != null) {
                    num = c132835z64.A02;
                }
                Integer num2 = C05F.A0C;
                if (num == num2) {
                    if (obj5 != null) {
                        ListIterator listIterator = list.listIterator();
                        boolean z2 = false;
                        while (listIterator.hasNext()) {
                            C128005qU c128005qU3 = (C128005qU) listIterator.next();
                            if (z) {
                                if (c128005qU3.A01 != null) {
                                    list.indexOf(c128005qU3);
                                    Iterator it = c128005qU3.A02.iterator();
                                    while (true) {
                                        c132835z62 = null;
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            C130505uv c130505uv3 = ((AbstractC127945qN) obj).A03;
                                            if (c130505uv3 != null && c130505uv3.A00 == enumC130515uw2 && (c132835z63 = c130505uv3.A06) != null && c132835z63.A02 == num2) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    abstractC127945qN2 = (AbstractC127945qN) obj;
                                    if (abstractC127945qN2 != null) {
                                        C130505uv c130505uv4 = abstractC127945qN2.A03;
                                        if (c130505uv4 != null && (c130505uv4.A00 != enumC130515uw2 || (c132835z62 = c130505uv4.A06) == null || c132835z62.A02 != num2)) {
                                            c132835z62 = null;
                                        }
                                        C14360o3.A0A(c132835z62);
                                        c69296Vl4 = new C69296Vl4(c132835z62, c132835z62.A00().A04, true, false);
                                        abstractC127945qN2.A00 = c69296Vl4;
                                    }
                                } else {
                                    abstractC127945qN2 = (AbstractC127945qN) AbstractC001800i.A0J(c128005qU3.A02);
                                    if (abstractC127945qN2 != null) {
                                        c69296Vl4 = (C69296Vl4) interfaceC16820sZ.invoke();
                                        abstractC127945qN2.A00 = c69296Vl4;
                                    }
                                }
                            }
                            if (z2) {
                                listIterator.previous();
                                if (z) {
                                    c130505uv = null;
                                    arrayList = new ArrayList();
                                    linkedHashMap = new LinkedHashMap();
                                    String obj6 = UUID.randomUUID().toString();
                                    C14360o3.A07(obj6);
                                    i = 0;
                                    AbstractC127945qN abstractC127945qN3 = new AbstractC127945qN(AbstractC127905qJ.A01(135.0f, 0, 0), obj6);
                                    C5qT c5qT = new C5qT(0, 0);
                                    arrayList.add(abstractC127945qN3);
                                    linkedHashMap.put(abstractC127945qN3, c5qT);
                                } else {
                                    C130505uv c130505uv5 = c128005qU3.A01;
                                    if (c130505uv5 != null) {
                                        if (c130505uv5.A00 == enumC130515uw2 && (c132835z6 = c130505uv5.A06) != null && c132835z6.A02 == num2) {
                                            c130505uv = null;
                                            arrayList = new ArrayList();
                                            linkedHashMap = new LinkedHashMap();
                                            abstractC127945qN = new HKS(AbstractC127905qJ.A00(), c132835z6);
                                        }
                                    } else {
                                        c130505uv = null;
                                        arrayList = new ArrayList();
                                        linkedHashMap = new LinkedHashMap();
                                        String obj7 = UUID.randomUUID().toString();
                                        C14360o3.A07(obj7);
                                        abstractC127945qN = new AbstractC127945qN(AbstractC127905qJ.A00(), obj7);
                                    }
                                    C5qT c5qT2 = new C5qT(0, 0);
                                    arrayList.add(abstractC127945qN);
                                    linkedHashMap.put(abstractC127945qN, c5qT2);
                                    i = 1;
                                }
                                listIterator.add(new C128005qU(c130505uv, arrayList, linkedHashMap, i));
                            }
                            z2 = true;
                            C130505uv c130505uv6 = null;
                            while (listIterator.hasNext()) {
                                Object next = listIterator.next();
                                c130505uv6 = null;
                                if ((next instanceof C128005qU) && (c128005qU = (C128005qU) next) != null) {
                                    c130505uv6 = c128005qU.A01;
                                }
                                if (!C14360o3.A0K(c128005qU3.A01, c130505uv6)) {
                                    break;
                                }
                            }
                            if (!C14360o3.A0K(c128005qU3.A01, c130505uv6)) {
                                listIterator.previous();
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
