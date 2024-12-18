package X;

import android.view.View;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Lz2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49795Lz2 implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;

    public C49795Lz2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C42221xC c42221xC, C41761wQ c41761wQ, Object obj, int i) {
        c41761wQ.A02(c42221xC, new C49795Lz2(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        LLk lLk;
        C125815mW c125815mW;
        InterfaceExecutorC135866Co ASj;
        MailboxFutureImpl A0I;
        int i;
        int i2;
        Object valueOf;
        ViewModelListUpdate viewModelListUpdate;
        C66362zD c66362zD;
        InterfaceC66382zF interfaceC66382zF;
        Integer num;
        switch (this.A00) {
            case 0:
                ((C43920JbV) this.A01).A01.accept(obj);
                return;
            case 1:
                lLk = (LLk) this.A01;
                ArrayList A04 = LLk.A04((C46h) obj, lLk);
                HashMap A1G = AbstractC166987dD.A1G();
                Iterator it = A04.iterator();
                while (it.hasNext()) {
                    InterfaceC50518MRv interfaceC50518MRv = (InterfaceC50518MRv) it.next();
                    A1G.put(interfaceC50518MRv.CCb(), interfaceC50518MRv);
                }
                List list = lLk.A0z;
                list.clear();
                HashMap hashMap = lLk.A0u;
                hashMap.clear();
                List list2 = lLk.A0y;
                list2.clear();
                hashMap.putAll(A1G);
                if (AbstractC43805JYs.A04(lLk.A0h)) {
                    for (InterfaceC50518MRv interfaceC50518MRv2 : hashMap.values()) {
                        if (interfaceC50518MRv2.Aqm()) {
                            list2.add(interfaceC50518MRv2);
                        } else {
                            list.add(interfaceC50518MRv2);
                        }
                    }
                } else {
                    list.addAll(A04);
                }
                LLk.A0K(lLk);
                return;
            case 2:
                lLk = (LLk) this.A01;
                ArrayList A042 = LLk.A04((C46h) obj, lLk);
                HashMap A1G2 = AbstractC166987dD.A1G();
                Iterator it2 = A042.iterator();
                while (it2.hasNext()) {
                    InterfaceC50518MRv interfaceC50518MRv3 = (InterfaceC50518MRv) it2.next();
                    A1G2.put(interfaceC50518MRv3.CCb(), interfaceC50518MRv3);
                }
                List list3 = lLk.A10;
                list3.clear();
                list3.addAll(A042);
                lLk.A0u.putAll(A1G2);
                LLk.A0K(lLk);
                return;
            case 3:
                LLk lLk2 = (LLk) this.A01;
                Map map = (Map) obj;
                if (lLk2.A0N) {
                    return;
                }
                Map map2 = lLk2.A13;
                Iterator A12 = AbstractC43593JPy.A12(map2);
                while (true) {
                    if (A12.hasNext()) {
                        AbstractC46972Dl abstractC46972Dl = (AbstractC46972Dl) A12.next();
                        Object obj2 = map.get(abstractC46972Dl);
                        Object obj3 = map2.get(abstractC46972Dl);
                        if (obj2 != null && obj3 != null && !obj2.equals(obj3)) {
                            if (abstractC46972Dl == C125575m3.A00) {
                                lLk2.A15.clear();
                            } else {
                                lLk2.A15.remove(AbstractC47860LCg.A00(abstractC46972Dl));
                            }
                        }
                    }
                }
                map2.clear();
                Iterator A122 = AbstractC43593JPy.A12(map);
                while (A122.hasNext()) {
                    Object next = A122.next();
                    if (next == C2057398y.A00 && AbstractC1337462f.A03(lLk2.A0h)) {
                        valueOf = map.get(next);
                    } else {
                        List<C2EC> A123 = AbstractC43592JPx.A12(next, lLk2.A14);
                        int i3 = 0;
                        if (A123 != null) {
                            i2 = 0;
                            for (C2EC c2ec : A123) {
                                if (c2ec.Cf8(lLk2.A0h) && LLk.A02(c2ec, lLk2).booleanValue()) {
                                    i2++;
                                }
                            }
                        } else {
                            i2 = 0;
                        }
                        Number A0Q = AbstractC37300Gc1.A0Q(next, map);
                        if (A0Q != null) {
                            i3 = A0Q.intValue() - i2;
                        }
                        valueOf = Integer.valueOf(i3);
                    }
                    map2.put(next, valueOf);
                }
                HashSet A1H = AbstractC166987dD.A1H();
                Iterator A16 = AbstractC166997dE.A16(lLk2.A14);
                while (A16.hasNext()) {
                    Iterator A1J = AbstractC25226BEj.A1J(A16.next());
                    while (A1J.hasNext()) {
                        C2EC c2ec2 = (C2EC) A1J.next();
                        UserSession userSession = lLk2.A0h;
                        if (!AbstractC1337462f.A03(userSession) || (c2ec2.Cf8(userSession) && LLk.A02(c2ec2, lLk2).booleanValue())) {
                            A1H.add(c2ec2.BKb());
                        }
                    }
                }
                if (AbstractC1337462f.A01(lLk2.A0h)) {
                    AbstractC37301Gc2.A1T(C44038JdP.A00, map2, A1H.size());
                }
                C2057398y c2057398y = C2057398y.A00;
                AbstractC37301Gc2.A1T(c2057398y, map2, A1H.size() + ((Number) map2.getOrDefault(c2057398y, Integer.valueOf(lLk2.A0j.A06()))).intValue());
                LLk.A0J(lLk2);
                return;
            case 4:
                viewModelListUpdate = (ViewModelListUpdate) obj;
                C14360o3.A0B(viewModelListUpdate, 0);
                C49372Ls5 c49372Ls5 = (C49372Ls5) this.A01;
                c66362zD = c49372Ls5.A01;
                if (c66362zD == null) {
                    return;
                }
                interfaceC66382zF = c49372Ls5.A0D;
                c66362zD.A06(viewModelListUpdate, interfaceC66382zF);
                return;
            case 5:
                viewModelListUpdate = (ViewModelListUpdate) obj;
                C14360o3.A0B(viewModelListUpdate, 0);
                C49371Ls4 c49371Ls4 = (C49371Ls4) this.A01;
                c66362zD = c49371Ls4.A00;
                if (c66362zD == null) {
                    return;
                }
                interfaceC66382zF = c49371Ls4.A05;
                c66362zD.A06(viewModelListUpdate, interfaceC66382zF);
                return;
            case 6:
                C94054Kp c94054Kp = (C94054Kp) this.A01;
                Object obj4 = ((MailboxNullable) obj).value;
                if (obj4 == null) {
                    return;
                }
                AbstractC1351869s abstractC1351869s = (AbstractC1351869s) obj4;
                HashMap A1G3 = AbstractC166987dD.A1G();
                for (int i4 = 0; i4 < AbstractC43592JPx.A02(abstractC1351869s); i4++) {
                    String string = abstractC1351869s.mResultSet.getString(i4, 1);
                    String A0v = AbstractC43592JPx.A0v(abstractC1351869s, i4, 1);
                    long longValue = abstractC1351869s.mResultSet.getNullableLong(i4, 3).longValue();
                    boolean A1P = AbstractC167007dF.A1P(2, abstractC1351869s.mResultSet.getInteger(i4, 2));
                    A1G3.put(string, new C42321xM(A0v, null, abstractC1351869s.mResultSet.getString(i4, 6), longValue, abstractC1351869s.mResultSet.getNullableLong(i4, 5).longValue(), A1P, false));
                }
                C41981wo c41981wo = c94054Kp.A05;
                Lock lock = c41981wo.A05;
                lock.lock();
                HashSet A1H2 = AbstractC166987dD.A1H();
                try {
                    if (!c41981wo.A01) {
                        Iterator A14 = AbstractC166997dE.A14(A1G3);
                        while (A14.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(A14);
                            if (c41981wo.A00.containsKey(A1K.getKey())) {
                                C42321xM c42321xM = (C42321xM) c41981wo.A00.get(A1K.getKey());
                                C42321xM c42321xM2 = (C42321xM) A1K.getValue();
                                C14360o3.A0B(c42321xM2, 1);
                                if (c42321xM != null && C14360o3.A0K(c42321xM.A04, c42321xM2.A04) && c42321xM.A01 == c42321xM2.A01 && c42321xM.A05 == c42321xM2.A05 && C14360o3.A0K(c42321xM.A02, c42321xM2.A02) && c42321xM.A00 == c42321xM2.A00 && C14360o3.A0K(c42321xM.A03, c42321xM2.A03) && c42321xM.A06 == c42321xM2.A06) {
                                }
                            }
                            A1H2.add(((C42321xM) A1K.getValue()).A04);
                        }
                        c41981wo.A00.putAll(A1G3);
                        c41981wo.A03.accept(new HashMap(c41981wo.A00));
                        lock.unlock();
                        if (A1H2.isEmpty()) {
                            return;
                        }
                        Iterator it3 = A1H2.iterator();
                        while (it3.hasNext()) {
                            C41981wo.A01(c41981wo, AbstractC166987dD.A1B(it3));
                        }
                        return;
                    }
                    return;
                } finally {
                    lock.unlock();
                }
            case 7:
                C125875mc c125875mc = (C125875mc) obj;
                C9GR.A09(((View) this.A01).getContext(), "Restoring from Echo...");
                c125815mW = c125875mc.A07;
                JRS A00 = JRS.A00(c125875mc, 22);
                ASj = c125815mW.mMailboxApiHandleMetaProvider.ASj(0);
                A0I = AbstractC43593JPy.A0I(ASj, A00);
                i = 11;
                AbstractC25231BEo.A1C(ASj, new C44176Jff(i, c125815mW, A0I), A0I);
                return;
            case 8:
                C125875mc c125875mc2 = (C125875mc) obj;
                C9GR.A09(((View) this.A01).getContext(), "Deleting All Echo Files...");
                c125815mW = c125875mc2.A07;
                JRS A002 = JRS.A00(c125875mc2, 23);
                ASj = c125815mW.mMailboxApiHandleMetaProvider.ASj(0);
                A0I = AbstractC43593JPy.A0I(ASj, A002);
                i = 12;
                AbstractC25231BEo.A1C(ASj, new C44176Jff(i, c125815mW, A0I), A0I);
                return;
            case 9:
                C125875mc c125875mc3 = (C125875mc) obj;
                C9GR.A09(((View) this.A01).getContext(), "Backing up to Echo...");
                c125815mW = c125875mc3.A07;
                JRS A003 = JRS.A00(c125875mc3, 21);
                ASj = c125815mW.mMailboxApiHandleMetaProvider.ASj(0);
                A0I = AbstractC43593JPy.A0I(ASj, A003);
                i = 13;
                AbstractC25231BEo.A1C(ASj, new C44176Jff(i, c125815mW, A0I), A0I);
                return;
            default:
                Object obj5 = ((QIy) obj).A04;
                C54801OJv c54801OJv = ((C147716kw) this.A01).A08;
                if (c54801OJv != null) {
                    if (obj5 == EnumC61182Rgi.A09) {
                        num = C05F.A0j;
                    } else {
                        num = C05F.A01;
                    }
                    c54801OJv.A00(num);
                    return;
                }
                return;
        }
    }
}
