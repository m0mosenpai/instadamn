package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Gke, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37824Gke {
    public int A00;
    public long A01;
    public final UserSession A02;
    public final InterfaceC19630xq A03;
    public final List A04;
    public final java.util.Set A05;
    public final C13920nI A06;
    public final C37695GiW A07;
    public final java.util.Set A08;

    public C37824Gke(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A2j, getClass());
        this.A03 = A04;
        java.util.Set synchronizedSet = Collections.synchronizedSet(AbstractC166987dD.A1H());
        C14360o3.A07(synchronizedSet);
        this.A08 = synchronizedSet;
        java.util.Set synchronizedSet2 = Collections.synchronizedSet(AbstractC166987dD.A1H());
        C14360o3.A07(synchronizedSet2);
        this.A05 = synchronizedSet2;
        List synchronizedList = Collections.synchronizedList(AbstractC166987dD.A1E());
        C14360o3.A07(synchronizedList);
        this.A04 = synchronizedList;
        this.A01 = -1L;
        this.A06 = C13920nI.A00;
        this.A07 = AbstractC37654Ghn.A01(userSession);
        this.A00 = -1;
        if (A04.getString("latest_headload_items", null) != null) {
            try {
                C73803Sk c73803Sk = AbstractC73763Sg.A03.A02;
                C0YZ A1D = AbstractC25225BEi.A1D(C37853Gl7.class);
                c73803Sk.A00.get(A1D);
                AbstractC192728gE.A01(A1D);
                throw C00O.createAndThrow();
            } catch (Exception e) {
                C0K8.A0F("ClipsViewerCacheStateManager", "Failed to decode ClipsItemCacheData", e);
            }
        }
        java.util.Set stringSet = this.A03.getStringSet("latest_headload_ids", null);
        if (stringSet != null) {
            this.A05.addAll(stringSet);
            this.A08.addAll(stringSet);
        }
        if (C1LE.A05(this.A02) || C1LE.A04(this.A02)) {
            this.A01 = this.A03.getLong("latest_headload_timestamp", -1L);
            this.A00 = this.A03.getInt("cached_ad_previous_page_size", -1);
        }
    }

    public final List A00(String str, List list, int i, boolean z) {
        String str2;
        C38321qM c38321qM;
        UserSession userSession = this.A02;
        C37824Gke A00 = AbstractC37696GiX.A00(userSession);
        ArrayList A1F = AbstractC166987dD.A1F(list);
        if (i != -1 && i < A1F.size()) {
            int i2 = i + 1;
            ArrayList A0U = AbstractC001800i.A0U(A1F.subList(i2, A1F.size()));
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36325845548545477L) && !AbstractC37301Gc2.A1U(c06090Tz, userSession)) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A0U.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C120985dq c120985dq = (C120985dq) next;
                    C14360o3.A0B(c120985dq, 0);
                    if (A00.A05.contains(c120985dq.getId())) {
                        A1E.add(next);
                    }
                }
                if (z && AbstractC166987dD.A1b(A1E)) {
                    A1F.removeAll(A0U);
                    return A1F;
                }
            } else if (str != null && str.equals(((C120985dq) list.get(i)).getId()) && i <= 0) {
                List<C120985dq> subList = list.subList(i2, list.size());
                C28091Xn A0Q = AbstractC37302Gc3.A0Q(userSession);
                C14360o3.A07(A0Q);
                C57782kr A002 = C57782kr.A00(userSession);
                for (C120985dq c120985dq2 : subList) {
                    C38321qM c38321qM2 = c120985dq2.A02;
                    String str3 = null;
                    if (c38321qM2 != null) {
                        str2 = c38321qM2.getId();
                    } else {
                        str2 = null;
                    }
                    if (!A0Q.A03(str2) && ((c38321qM = c120985dq2.A02) == null || !c38321qM.A66())) {
                        C38321qM c38321qM3 = c120985dq2.A02;
                        if (c38321qM3 != null) {
                            str3 = c38321qM3.A2u();
                        }
                        String valueOf = String.valueOf(str3);
                        if (!A002.A0L().contains(valueOf) && !A002.A04.contains(valueOf)) {
                        }
                    }
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator it2 = A0U.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (((C120985dq) next2).A01 != EnumC129395t1.A08) {
                            A1E2.add(next2);
                        }
                    }
                    A1F.removeAll(A1E2);
                }
            }
            return A1F;
        }
        return list;
    }

    public final void A01(int i, boolean z, List list) {
        InterfaceC19630xq interfaceC19630xq;
        InterfaceC19610xo ARD;
        Long l;
        java.util.Set set = this.A05;
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0i.add(((C120985dq) it.next()).getId());
        }
        set.addAll(A0i);
        java.util.Set set2 = this.A08;
        ArrayList A0i2 = AbstractC167007dF.A0i(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            A0i2.add(((C120985dq) it2.next()).getId());
        }
        set2.addAll(A0i2);
        List list2 = this.A04;
        ArrayList A0i3 = AbstractC167007dF.A0i(list);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C120985dq c120985dq = (C120985dq) it3.next();
            String id = c120985dq.getId();
            C38321qM c38321qM = c120985dq.A02;
            Integer num = null;
            if (c38321qM != null) {
                l = Long.valueOf(c38321qM.A1A());
            } else {
                l = null;
            }
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null) {
                num = c38321qM2.CFr();
            }
            A0i3.add(new C37853Gl7(num, l, id));
        }
        list2.addAll(A0i3);
        if (i != -1) {
            this.A00 = i;
            interfaceC19630xq = this.A03;
            ARD = interfaceC19630xq.ARD();
            ARD.E7L("latest_headload_ids", AbstractC001800i.A0k(set));
            ARD.E7D("cached_ad_previous_page_size", i);
        } else {
            interfaceC19630xq = this.A03;
            ARD = interfaceC19630xq.ARD();
            ARD.E7L("latest_headload_ids", AbstractC001800i.A0k(set));
        }
        ARD.apply();
        if (!z) {
            try {
                interfaceC19630xq.ARD();
                C73803Sk c73803Sk = AbstractC73763Sg.A03.A02;
                C0YZ A1D = AbstractC25225BEi.A1D(C37853Gl7.class);
                c73803Sk.A00.get(A1D);
                AbstractC192728gE.A01(A1D);
                throw C00O.createAndThrow();
            } catch (Exception e) {
                C0K8.A0F("ClipsViewerCacheStateManager", "Failed to encode ClipsItemCacheData", e);
            }
        }
        C37695GiW c37695GiW = this.A07;
        if (c37695GiW != null) {
            List A0a = AbstractC001800i.A0a(set);
            int i2 = this.A00;
            if (!c37695GiW.A00) {
                C37695GiW.A04(c37695GiW);
                C0XJ c0xj = new C0XJ();
                c0xj.A00("cache_list_id", A0a.toString(), 4);
                c0xj.A00("previous_page_size", String.valueOf(i), 2);
                C37695GiW.A00(c0xj, c37695GiW, "cached_ad_previous_page_size", String.valueOf(i2), 2).markerPoint(976032351, 0, 7, "cache_list_update", c0xj, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
            }
        }
    }
}
