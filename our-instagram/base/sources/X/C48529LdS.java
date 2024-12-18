package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.LdS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48529LdS implements InterfaceC25601Mq {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C48529LdS(C48518LdG c48518LdG, String str, int i) {
        this.A00 = i;
        this.A01 = c48518LdG;
        this.A02 = str;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        String str;
        String str2;
        String str3;
        AbstractC24481Hr abstractC24481Hr = (AbstractC24481Hr) obj;
        if (this.A00 != 0) {
            C14360o3.A0B(abstractC24481Hr, 0);
            if (!abstractC24481Hr.A0B() && !abstractC24481Hr.A0D()) {
                Object A07 = abstractC24481Hr.A07();
                if (A07 != null) {
                    List list = (List) A07;
                    LAB lab = ((C48518LdG) this.A01).A07;
                    String str4 = this.A02;
                    C14360o3.A0B(list, 1);
                    LJA lja = lab.A01;
                    lja.A03(str4, "render_end");
                    ArrayList A0i = AbstractC167007dF.A0i(list);
                    for (Object obj2 : list) {
                        if (obj2 instanceof C45984KWy) {
                            str3 = "replace_message";
                        } else if (obj2 instanceof C45985KWz) {
                            str3 = "remove_message";
                        } else if (obj2 instanceof KX0) {
                            str3 = "noop";
                        } else {
                            throw B4Z.A00();
                        }
                        A0i.add(str3);
                    }
                    String[] A1b = AbstractC31173DnH.A1b(A0i, 0);
                    C14360o3.A0B(A1b, 2);
                    if (LJA.A01(lja, str4)) {
                        lja.A00.markerAnnotate(724174487, LJA.A00(str4), "render_results", A1b);
                    }
                    ArrayList<KX1> A1E = AbstractC166987dD.A1E();
                    for (Object obj3 : list) {
                        if (obj3 instanceof KX1) {
                            A1E.add(obj3);
                        }
                    }
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    for (Object obj4 : list) {
                        if (obj4 instanceof KX0) {
                            A1E2.add(obj4);
                        }
                    }
                    if ((list.size() - A1E.size()) - A1E2.size() == 0) {
                        for (KX1 kx1 : A1E) {
                            L7J l7j = lab.A03;
                            boolean z = kx1 instanceof C45985KWz;
                            if (z) {
                                str = ((C45985KWz) kx1).A02;
                            } else {
                                str = kx1.A01;
                            }
                            if (z) {
                                str2 = ((C45985KWz) kx1).A01;
                            } else {
                                str2 = kx1.A00;
                            }
                            synchronized (l7j) {
                                C14360o3.A0B(str2, 2);
                                if (str != null) {
                                    Map map = l7j.A01;
                                    Object obj5 = map.get(str);
                                    if (obj5 == null) {
                                        obj5 = AbstractC31171DnF.A0l();
                                        map.put(str, obj5);
                                    }
                                    ((java.util.Set) obj5).add(str4);
                                }
                                Map map2 = l7j.A00;
                                Object obj6 = map2.get(str2);
                                if (obj6 == null) {
                                    obj6 = AbstractC31171DnF.A0l();
                                    map2.put(str2, obj6);
                                }
                                ((java.util.Set) obj6).add(str4);
                                Map map3 = l7j.A02;
                                Object obj7 = map3.get(str4);
                                if (obj7 == null) {
                                    obj7 = new AtomicInteger(0);
                                    map3.put(str4, obj7);
                                }
                                ((AtomicInteger) obj7).incrementAndGet();
                            }
                        }
                        ArrayList A0i2 = AbstractC167007dF.A0i(A1E2);
                        Iterator it = A1E2.iterator();
                        while (it.hasNext()) {
                            A0i2.add(((KX0) it.next()).A00);
                        }
                        String[] A1b2 = AbstractC31173DnH.A1b(A0i2, 0);
                        C14360o3.A0B(A1b2, 2);
                        if (LJA.A01(lja, str4)) {
                            lja.A00.markerAnnotate(724174487, LJA.A00(str4), "render_noop_reasons", A1b2);
                        }
                        List A1Q = AbstractC16960so.A1Q(false, true);
                        if (!(A1Q instanceof Collection) || !A1Q.isEmpty()) {
                            Iterator it2 = A1Q.iterator();
                            while (it2.hasNext()) {
                                if (!AbstractC166987dD.A1a(it2.next())) {
                                    return list;
                                }
                            }
                        }
                        lja.A07(str4, (short) 2);
                        return list;
                    }
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Encountered unexpected operation types: ");
                    throw AbstractC166987dD.A14(AbstractC166997dE.A0v(AbstractC001800i.A0e(AbstractC001800i.A0e(list, AbstractC001800i.A0k(A1E)), AbstractC001800i.A0k(A1E2)), A1C));
                }
                throw AbstractC166997dE.A0g();
            }
            Exception A06 = abstractC24481Hr.A06();
            if (A06 == null) {
                A06 = new Exception("Render cancelled");
            }
            LAB lab2 = ((C48518LdG) this.A01).A07;
            String str5 = this.A02;
            lab2.A02.A00(str5);
            LJA lja2 = lab2.A01;
            lja2.A05(str5, "render_failure_reason", A06.getMessage());
            lja2.A07(str5, (short) 3);
            throw A06;
        }
        C14360o3.A0B(abstractC24481Hr, 0);
        if (!abstractC24481Hr.A0B() && !abstractC24481Hr.A0D()) {
            Object A072 = abstractC24481Hr.A07();
            if (A072 != null) {
                C48518LdG.A02((C48518LdG) this.A01, this.A02, (List) A072, 0L);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return C0eB.A00;
    }
}
