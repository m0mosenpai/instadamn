package X;

import com.instagram.creator.agent.settings.keyword.KeywordRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BuC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26909BuC extends AbstractC61152qd {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final KeywordRepository A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;

    public C26909BuC(KeywordRepository keywordRepository) {
        this.A04 = keywordRepository;
        C008002u A1H = AbstractC25225BEi.A1H(new C26080Bg9(null, null, null, null, null, null, 63, 2, false));
        this.A06 = A1H;
        this.A08 = AbstractC208910l.A02(A1H);
        C008002u A00 = C10E.A00(C28235Ccf.A00);
        this.A05 = A00;
        this.A07 = AbstractC208910l.A02(A00);
        this.A03 = true;
        this.A02 = true;
    }

    public static final void A00(QJ0 qj0, C26909BuC c26909BuC) {
        Object value;
        C5Hc A00;
        Integer valueOf;
        C5Hc c5Hc;
        C6R c6r;
        Integer num;
        boolean z;
        C05A c05a = c26909BuC.A06;
        do {
            value = c05a.getValue();
            C26080Bg9 c26080Bg9 = (C26080Bg9) value;
            ArrayList A0S = AbstractC001800i.A0S((Iterable) c26080Bg9.A05, AbstractC166987dD.A1J(qj0));
            HashSet A1H = AbstractC166987dD.A1H();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC25231BEo.A1F(((QJ0) next).A02, next, A1H, A1E);
            }
            A00 = AbstractC133095zb.A00(A1E);
            valueOf = Integer.valueOf(AbstractC167017dG.A0K((Number) c26080Bg9.A01) + 1);
            c5Hc = (C5Hc) c26080Bg9.A03;
            c6r = (C6R) c26080Bg9.A04;
            num = (Integer) c26080Bg9.A02;
            z = c26080Bg9.A06;
            AbstractC167027dH.A12(A00, c5Hc, c6r);
        } while (!c05a.AIi(value, new C26080Bg9(c6r, valueOf, num, A00, c5Hc, z)));
    }

    public static final void A01(QJ0 qj0, C26909BuC c26909BuC) {
        Object value;
        C5Hc A00;
        Integer valueOf;
        C5Hc c5Hc;
        C6R c6r;
        Integer num;
        boolean z;
        C05A c05a = c26909BuC.A06;
        do {
            value = c05a.getValue();
            C26080Bg9 c26080Bg9 = (C26080Bg9) value;
            ArrayList A0S = AbstractC001800i.A0S((Iterable) c26080Bg9.A03, AbstractC166987dD.A1J(qj0));
            HashSet A1H = AbstractC166987dD.A1H();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC25231BEo.A1F(((QJ0) next).A02, next, A1H, A1E);
            }
            A00 = AbstractC133095zb.A00(A1E);
            valueOf = Integer.valueOf(AbstractC167017dG.A0K((Number) c26080Bg9.A02) + 1);
            c5Hc = (C5Hc) c26080Bg9.A05;
            c6r = (C6R) c26080Bg9.A04;
            num = (Integer) c26080Bg9.A01;
            z = c26080Bg9.A06;
            AbstractC167027dH.A12(c5Hc, A00, c6r);
        } while (!c05a.AIi(value, new C26080Bg9(c6r, num, valueOf, c5Hc, A00, z)));
    }

    public static final void A02(QJ0 qj0, C26909BuC c26909BuC) {
        Object value;
        C5Hc A00;
        int i;
        Integer valueOf;
        C5Hc c5Hc;
        C6R c6r;
        Integer num;
        boolean z;
        List list = (List) ((C26080Bg9) c26909BuC.A08.getValue()).A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            AbstractC25232BEp.A1Q(((QJ0) obj).A02, qj0.A02, obj, A1E);
        }
        C5Hc A002 = AbstractC133095zb.A00(A1E);
        C05A c05a = c26909BuC.A06;
        do {
            value = c05a.getValue();
            C26080Bg9 c26080Bg9 = (C26080Bg9) value;
            A00 = AbstractC133095zb.A00(A002);
            Number number = (Number) c26080Bg9.A01;
            if (number != null) {
                i = number.intValue() - (((List) c26080Bg9.A05).size() - A002.size());
            } else {
                i = 0;
            }
            valueOf = Integer.valueOf(i);
            c5Hc = (C5Hc) c26080Bg9.A03;
            c6r = (C6R) c26080Bg9.A04;
            num = (Integer) c26080Bg9.A02;
            z = c26080Bg9.A06;
            AbstractC167027dH.A12(A00, c5Hc, c6r);
        } while (!c05a.AIi(value, new C26080Bg9(c6r, valueOf, num, A00, c5Hc, z)));
    }

    public static final void A03(QJ0 qj0, C26909BuC c26909BuC) {
        Object value;
        C5Hc A00;
        Object obj;
        int i;
        Integer valueOf;
        C5Hc c5Hc;
        C6R c6r;
        boolean z;
        List list = (List) ((C26080Bg9) c26909BuC.A08.getValue()).A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj2 : list) {
            AbstractC25232BEp.A1Q(((QJ0) obj2).A02, qj0.A02, obj2, A1E);
        }
        C5Hc A002 = AbstractC133095zb.A00(A1E);
        C05A c05a = c26909BuC.A06;
        do {
            value = c05a.getValue();
            C26080Bg9 c26080Bg9 = (C26080Bg9) value;
            List list2 = (List) c26080Bg9.A03;
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj3 : list2) {
                AbstractC25232BEp.A1Q(((QJ0) obj3).A02, qj0.A02, obj3, A1E2);
            }
            A00 = AbstractC133095zb.A00(A1E2);
            obj = c26080Bg9.A01;
            Number number = (Number) obj;
            if (number != null) {
                i = number.intValue() - (((List) c26080Bg9.A05).size() - A002.size());
            } else {
                i = 0;
            }
            valueOf = Integer.valueOf(i);
            c5Hc = (C5Hc) c26080Bg9.A05;
            c6r = (C6R) c26080Bg9.A04;
            z = c26080Bg9.A06;
            AbstractC167027dH.A12(c5Hc, A00, c6r);
        } while (!c05a.AIi(value, new C26080Bg9(c6r, (Integer) obj, valueOf, c5Hc, A00, z)));
    }
}
