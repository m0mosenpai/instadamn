package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KLZ extends AbstractRunnableC14200nk {
    public final /* synthetic */ L5E A00;

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        Boolean valueOf;
        L5E l5e = this.A00;
        List list = l5e.A09;
        list.size();
        ArrayList<C45985KWz> A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (obj instanceof C45985KWz) {
                A1E.add(obj);
            }
        }
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        for (C45985KWz c45985KWz : A1E) {
            ((List) JQ0.A0h(c45985KWz.A00.BKb(), A1I)).add(c45985KWz.A01);
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj2 : list) {
            if (obj2 instanceof C45984KWy) {
                A1E2.add(obj2);
            }
        }
        ArrayList<C45984KWy> A1E3 = AbstractC166987dD.A1E();
        for (Object obj3 : A1E2) {
            C45984KWy c45984KWy = (C45984KWy) obj3;
            Iterable iterable = (Iterable) A1I.get(c45984KWy.A01.BKb());
            if (iterable == null || !AbstractC001800i.A0u(iterable, c45984KWy.A00.A0g())) {
                A1E3.add(obj3);
            }
        }
        LinkedHashMap A1I2 = AbstractC166987dD.A1I();
        for (C45984KWy c45984KWy2 : A1E3) {
            ((List) JQ0.A0h(c45984KWy2.A01.BKb(), A1I2)).add(c45984KWy2.A00);
        }
        ArrayList<C45984KWy> A1E4 = AbstractC166987dD.A1E();
        for (Object obj4 : A1E3) {
            if (((C45984KWy) obj4).A00.A01 > 0) {
                A1E4.add(obj4);
            }
        }
        LinkedHashMap A1I3 = AbstractC166987dD.A1I();
        for (C45984KWy c45984KWy3 : A1E4) {
            C2EC c2ec = c45984KWy3.A01;
            ((List) JQ0.A0h(c2ec.BKb(), A1I3)).add(l5e.A05.Bn1(c2ec.BKb(), c45984KWy3.A00.A0g()));
        }
        LinkedHashMap A0y = AbstractC43594JPz.A0y(A1I3);
        Iterator A14 = AbstractC166997dE.A14(A1I3);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            A0y.put(A1K.getKey(), AbstractC06950Ym.A1F((Iterable) A1K.getValue()));
        }
        C2DS c2ds = l5e.A05;
        C2DU c2du = (C2DU) c2ds;
        synchronized (c2du) {
            HashSet A1H = AbstractC166987dD.A1H();
            A1H.addAll(A1I2.keySet());
            A1H.addAll(A1I.keySet());
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A1G2 = AbstractC166987dD.A1G();
            Iterator it = A1H.iterator();
            while (it.hasNext()) {
                DirectThreadKey directThreadKey = (DirectThreadKey) it.next();
                C4GV A0P = c2du.A0P(directThreadKey);
                if (A0P != null) {
                    ArrayList A1E5 = AbstractC166987dD.A1E();
                    ArrayList A1E6 = AbstractC166987dD.A1E();
                    List list2 = (List) A1I2.get(directThreadKey);
                    if (list2 != null) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            C83403nh A0e = AbstractC43592JPx.A0e(it2);
                            C2EW c2ew = c2du.A0G;
                            C81663kb c81663kb = A0P.A0I;
                            C14360o3.A07(c81663kb);
                            if (!c2ew.A00(A0e, c81663kb)) {
                                C83403nh A0F = A0P.A0F(A0e, true);
                                C14360o3.A07(A0F);
                                if (A0F == A0e) {
                                    A1E5.add(A0F);
                                } else {
                                    A1E6.add(A0F);
                                }
                            }
                        }
                    }
                    ArrayList A1E7 = AbstractC166987dD.A1E();
                    List list3 = (List) A1I.get(directThreadKey);
                    if (list3 != null) {
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            String A1B = AbstractC166987dD.A1B(it3);
                            C83403nh A0J = A0P.A0J(A1B);
                            C2EY c2ey = null;
                            if (A0J == null) {
                                valueOf = null;
                            } else {
                                valueOf = Boolean.valueOf(AbstractC167007dF.A1N(A0J.A1j(C17060sy.A01.A01(c2du.A0A)) ? 1 : 0));
                                c2ey = A0J.A10;
                            }
                            A1E7.add(new C9Q7(c2ey, valueOf, C05F.A00, A1B));
                            A0P.A0U(A1B);
                        }
                    }
                    if (AbstractC25226BEj.A1b(A1E6)) {
                        C2DU.A0H(c2du, AbstractC83823oR.A00(directThreadKey), A1E6, A0P.A0I.C7g());
                    }
                    UserSession userSession = c2du.A0A;
                    String str = directThreadKey.A00;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC161587Lt.A02(userSession, directThreadKey, str, A1E5);
                    if (A1E5.isEmpty()) {
                        num = C05F.A0C;
                    } else {
                        num = C05F.A01;
                    }
                    C2Io c2Io = new C2Io(directThreadKey, num, A1E5, A1E7, A1E6, true);
                    c2du.A06.E4s(c2Io);
                    c2du.A09.accept(c2Io);
                    ArrayList A1E8 = AbstractC166987dD.A1E();
                    ArrayList A1E9 = AbstractC166987dD.A1E();
                    A1E8.addAll(A1E5);
                    A1E8.addAll(A1E6);
                    if (list3 != null) {
                        A1E9.addAll(list3);
                    }
                    if (C18U.A06(C06090Tz.A05, userSession, 36318861938531026L) && A0P.A0W()) {
                        c2du.ELu(directThreadKey);
                    } else {
                        A1G.put(directThreadKey, A1E8);
                        A1G2.put(directThreadKey, A1E9);
                    }
                }
            }
            if (!A1G.isEmpty() || !A1G2.isEmpty()) {
                c2du.A0C.A0R(EnumC46982Dm.A05);
                c2du.A0H.A0I(A1G, A1G2);
            }
        }
        Iterator A142 = AbstractC166997dE.A14(A0y);
        while (A142.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A142);
            Object key = A1K2.getKey();
            C14360o3.A07(key);
            C81663kb B3U = c2ds.B3U((DirectThreadKey) key);
            if (B3U != null) {
                AbstractC162277Op.A00(l5e.A01, B3U, c2ds, (Collection) A1K2.getValue());
            }
        }
        list.clear();
        l5e.A00 = false;
        list.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLZ(L5E l5e) {
        super(1623504567, 4, false, true);
        this.A00 = l5e;
    }
}
