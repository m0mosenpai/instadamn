package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GtS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38333GtS extends AbstractC52922bZ {
    public int A00;
    public final UserSession A01;
    public final C42342Ip4 A02;
    public final String A03;
    public final C05A A04;
    public final C0UO A05;

    public final void A06(UserSession userSession, C38321qM c38321qM) {
        Object value;
        C37838Gks c37838Gks;
        C14360o3.A0B(userSession, 1);
        C05A c05a = this.A04;
        ArrayList A0U = AbstractC001800i.A0U((Collection) ((C37838Gks) c05a.getValue()).A06);
        LinkedHashMap A03 = AbstractC06930Yk.A03((Map) ((C37838Gks) c05a.getValue()).A07);
        if (A0U.contains(c38321qM)) {
            A0U.remove(c38321qM);
            C15500q5.A04(A03).remove(c38321qM.A2u());
        } else {
            if (A0U.size() >= AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36601719889203537L)) {
                return;
            }
            A0U.add(c38321qM);
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                A03.put(A2u, A05());
            }
        }
        do {
            value = c05a.getValue();
            c37838Gks = (C37838Gks) value;
        } while (!c05a.AIi(value, C37838Gks.A00(c37838Gks, null, null, null, AbstractC001800i.A0T(C42560Ise.A00, (Collection) c37838Gks.A02), A0U, null, A03, 57)));
    }

    public static final String A01(C55101ObE c55101ObE, List list, Map map, boolean z) {
        String str;
        EnumC39652Hih enumC39652Hih;
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it = list.iterator();
        while (true) {
            str = null;
            Long l = null;
            str = null;
            if (!it.hasNext()) {
                break;
            }
            String A2u = AbstractC31172DnG.A0i(it).A2u();
            if (A2u != null) {
                l = AbstractC003100w.A0k(10, A2u);
            }
            A0i.add(l);
        }
        List A0X = AbstractC001800i.A0X(A0i);
        if (c55101ObE != null) {
            UserSession userSession = c55101ObE.A07;
            InterfaceC11380iw interfaceC11380iw = c55101ObE.A05;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_open_carousel_tap");
            if (A0f.isSampled()) {
                if (z) {
                    enumC39652Hih = EnumC39652Hih.A0e;
                } else {
                    enumC39652Hih = EnumC39652Hih.A0f;
                }
                AbstractC25225BEi.A1M(enumC39652Hih, A0f);
                AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
                A0f.AAk("media_list", A0X);
                AbstractC25225BEi.A1N(A0f, c55101ObE.A08);
                AbstractC25225BEi.A1P(A0f, c55101ObE.A00);
                A0f.Cht();
            }
            if (z) {
                str = AbstractC167017dG.A0j();
                Iterator it2 = A0X.iterator();
                while (it2.hasNext()) {
                    C55101ObE.A01(C22P.A3l, c55101ObE, Long.valueOf(AbstractC166987dD.A0N(it2.next())), str, map);
                }
            }
        }
        return str;
    }

    public static final LinkedHashMap A02(C38333GtS c38333GtS) {
        Collection values = ((Map) ((C37838Gks) c38333GtS.A04.getValue()).A07).values();
        ArrayList A0q = AbstractC167017dG.A0q(values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            A0q.add(((EnumC46210Kcm) it.next()).A01);
        }
        List A0a = AbstractC001800i.A0a(A0q);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        for (Object obj : A0a) {
            Object obj2 = A1I.get(obj);
            if (obj2 == null && !A1I.containsKey(obj)) {
                obj2 = new Object();
            }
            C15100pQ c15100pQ = (C15100pQ) obj2;
            c15100pQ.A00++;
            A1I.put(obj, c15100pQ);
        }
        Iterator A14 = AbstractC166997dE.A14(A1I);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            C14360o3.A0C(A1K, AbstractC43591JPw.A00(1214));
            C15500q5.A03(A1K).setValue(Integer.valueOf(((C15100pQ) A1K.getValue()).A00));
        }
        Map A04 = C15500q5.A04(A1I);
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC16850sd.A0L(A04.size()));
        Iterator A15 = AbstractC166997dE.A15(A04);
        while (A15.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A15);
            A18.put(A1K2.getKey(), AbstractC25229BEm.A0n((Number) A1K2.getValue()));
        }
        return A18;
    }

    public static final void A03(C38333GtS c38333GtS, Integer num, List list, int i, boolean z) {
        int i2;
        C05A c05a;
        Object value;
        C37838Gks c37838Gks;
        if (num == C05F.A00) {
            i2 = C41754IeU.A00(c38333GtS.A01);
        } else {
            if (z) {
                i2 = c38333GtS.A00 - i;
            }
            c05a = c38333GtS.A04;
            do {
                value = c05a.getValue();
                c37838Gks = (C37838Gks) value;
            } while (!c05a.AIi(value, C37838Gks.A00(c37838Gks, null, null, null, AbstractC001800i.A0T(new C42558Isc(num), (Collection) c37838Gks.A02), null, list, null, 117)));
        }
        c38333GtS.A00 = i2;
        c05a = c38333GtS.A04;
        do {
            value = c05a.getValue();
            c37838Gks = (C37838Gks) value;
        } while (!c05a.AIi(value, C37838Gks.A00(c37838Gks, null, null, null, AbstractC001800i.A0T(new C42558Isc(num), (Collection) c37838Gks.A02), null, list, null, 117)));
    }

    public final int A04() {
        return ((List) ((C37838Gks) this.A04.getValue()).A06).size();
    }

    public final EnumC46210Kcm A05() {
        return (EnumC46210Kcm) ((C37838Gks) this.A04.getValue()).A01;
    }

    public final void A07(L09 l09) {
        Object value;
        C37838Gks c37838Gks;
        C05A c05a = this.A04;
        do {
            value = c05a.getValue();
            c37838Gks = (C37838Gks) value;
        } while (!c05a.AIi(value, C37838Gks.A00(c37838Gks, null, null, C05F.A0C, AbstractC001800i.A0T(new C42559Isd(l09), (Collection) c37838Gks.A02), (List) c37838Gks.A06, null, null, 89)));
    }

    public final boolean A08() {
        if (((C37838Gks) this.A04.getValue()).A04 == C05F.A0C && this.A02.A00 == null) {
            return true;
        }
        return false;
    }

    public final boolean A09(String str) {
        List list = (List) ((C37838Gks) this.A04.getValue()).A06;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(AbstractC37302Gc3.A0g(it), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C38333GtS(UserSession userSession, C42342Ip4 c42342Ip4, String str) {
        Object value;
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = c42342Ip4;
        C008002u A1H = AbstractC25225BEi.A1H(new C37838Gks());
        this.A04 = A1H;
        this.A05 = AbstractC208910l.A02(A1H);
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            this.A00 += AbstractC25227BEk.A06(C41D.A00(A0h), 0);
            do {
                value = A1H.getValue();
            } while (!A1H.AIi(value, C37838Gks.A00((C37838Gks) value, A0h, null, null, null, null, null, null, 126)));
        } else {
            if (str == null) {
                return;
            }
            C1ON A04 = AbstractC2044893h.A04(userSession, str);
            A04.A00 = new HGJ(this);
            C1GJ.A04(A04, 1508969885);
        }
    }

    public static Object A00(InterfaceC09390do interfaceC09390do) {
        return ((C37838Gks) ((C38333GtS) interfaceC09390do.getValue()).A04.getValue()).A04;
    }
}
