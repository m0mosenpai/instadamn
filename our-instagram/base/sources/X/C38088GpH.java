package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.GpH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38088GpH {
    public C37931GmT A00;
    public Integer A01;
    public final UserSession A06;
    public final InterfaceC16660sJ A08;
    public final java.util.Set A05 = AbstractC31171DnF.A0l();
    public final Map A07 = AbstractC166987dD.A1I();
    public final Map A04 = AbstractC166987dD.A1I();
    public List A03 = AbstractC166987dD.A1E();
    public List A02 = C16930sl.A00;

    public static final boolean A02(C38088GpH c38088GpH, C128005qU c128005qU, InterfaceC65952yX interfaceC65952yX, java.util.Set set, int i) {
        String str;
        Integer valueOf;
        for (AbstractC127945qN abstractC127945qN : c128005qU.A02) {
            boolean z = !set.add(abstractC127945qN.getKey());
            boolean contains = c38088GpH.A05.contains(abstractC127945qN.getKey());
            if (contains || z || !interfaceC65952yX.EjD(abstractC127945qN)) {
                if (contains) {
                    str = "Section was dropped because of previous page having duplicate";
                } else if (z) {
                    str = "Section was dropped because duplicate within same section";
                } else {
                    if (!interfaceC65952yX.EjD(abstractC127945qN)) {
                        C0w9.A03("FilteredSectionStore", "Section was dropped due to DiscoveryGridItemFilter");
                        return false;
                    }
                    return false;
                }
                C0w9.A03("FilteredSectionStore", str);
                UserSession userSession = c38088GpH.A06;
                if (C18U.A06(C06090Tz.A05, userSession, 36322383803459797L)) {
                    if (contains) {
                        valueOf = (Integer) c38088GpH.A04.get(abstractC127945qN.getKey());
                    } else {
                        valueOf = Integer.valueOf(i);
                    }
                    C3YM.A00(userSession).A07(new C25615BUc(C3YP.A04, C05F.A00, Integer.valueOf(i), valueOf, null, null, null, abstractC127945qN.getKey()));
                }
                return false;
            }
        }
        return true;
    }

    public final C5qT A03(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        C5qT c5qT = (C5qT) this.A07.get(abstractC127945qN.getKey());
        if (c5qT == null) {
            return new C5qT(-1, -1);
        }
        return c5qT;
    }

    public final ArrayList A06(InterfaceC65952yX interfaceC65952yX, List list) {
        C14360o3.A0B(interfaceC65952yX, 1);
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) AbstractC001800i.A0L(this.A02);
        if (abstractC127945qN != null) {
            A03(abstractC127945qN);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C128005qU c128005qU = (C128005qU) obj;
            A0l.clear();
            if (A02(this, c128005qU, interfaceC65952yX, A0l, i + this.A03.size())) {
                this.A03.add(c128005qU);
                this.A05.addAll(A0l);
            } else {
                A01(c128005qU, A1E);
            }
            i = i2;
        }
        A00(this);
        return A1E;
    }

    public static final void A00(C38088GpH c38088GpH) {
        ArrayList A1F = AbstractC166987dD.A1F(c38088GpH.A03);
        c38088GpH.A08.invoke(A1F);
        Map map = c38088GpH.A07;
        map.clear();
        Map map2 = c38088GpH.A04;
        map2.clear();
        c38088GpH.A01 = null;
        c38088GpH.A00 = null;
        int size = A1F.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C128005qU c128005qU = (C128005qU) A1F.get(i2);
            for (AbstractC127945qN abstractC127945qN : c128005qU.A02) {
                C14360o3.A0B(abstractC127945qN, 0);
                Object obj = c128005qU.A03.get(abstractC127945qN);
                C14360o3.A0A(obj);
                C5qT c5qT = (C5qT) obj;
                map.put(abstractC127945qN.getKey(), new C5qT(c5qT.A01 + i, c5qT.A00));
                map2.put(abstractC127945qN.getKey(), Integer.valueOf(i2));
                if (abstractC127945qN instanceof C37931GmT) {
                    C37931GmT c37931GmT = (C37931GmT) abstractC127945qN;
                    c37931GmT.A00.A0D(i2);
                    c38088GpH.A01 = Integer.valueOf(i2);
                    c38088GpH.A00 = c37931GmT;
                }
            }
            i += c128005qU.A00;
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1F);
        Iterator it = A1F.iterator();
        while (it.hasNext()) {
            A0q.add(((C128005qU) it.next()).A02);
        }
        c38088GpH.A02 = AbstractC06950Ym.A1F(A0q);
    }

    public static final void A01(C128005qU c128005qU, List list) {
        for (InterfaceC127955qO interfaceC127955qO : c128005qU.A02) {
            if (interfaceC127955qO instanceof C127935qM) {
                C130535uy c130535uy = ((C127935qM) interfaceC127955qO).A01;
                int i = c130535uy.A00;
                if (i >= 0 && i < c130535uy.A02().size() && (r0 = c130535uy.A00().A02) != null) {
                    list.add(r0);
                }
            } else if (interfaceC127955qO instanceof InterfaceC127975qQ) {
                C38321qM c38321qM = ((InterfaceC127975qQ) interfaceC127955qO).BQN();
                list.add(c38321qM);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC127945qN A04(C38321qM c38321qM) {
        for (AbstractC127945qN abstractC127945qN : this.A02) {
            if ((abstractC127945qN instanceof InterfaceC127975qQ) && C14360o3.A0K(((InterfaceC127975qQ) abstractC127945qN).BQN(), c38321qM)) {
                return abstractC127945qN;
            }
        }
        return null;
    }

    public final ArrayList A05() {
        C38321qM c38321qM;
        String id;
        List list = this.A02;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if ((obj instanceof C127995qS) && (c38321qM = ((C127995qS) obj).A01) != null && (id = c38321qM.getId()) != null) {
                A1E.add(id);
            }
        }
        return A1E;
    }

    public C38088GpH(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        this.A06 = userSession;
        this.A08 = interfaceC16660sJ;
    }
}
