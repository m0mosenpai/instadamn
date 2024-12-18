package X;

import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Jn0 extends AbstractC52922bZ {
    public long A00;
    public C4FL A01;
    public String A02;
    public ArrayList A03;
    public Map A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final UserSession A08;
    public final NotesRepository A09;
    public final C92904Eg A0A;
    public final C48760LhS A0B;
    public final LLB A0C;
    public final String A0D;
    public final InterfaceC24731Iq A0E;
    public final InterfaceC24751Is A0F;
    public final C05A A0G;
    public final C0UO A0H;
    public final String A0I;
    public final String A0J;

    public Jn0(UserSession userSession, NotesRepository notesRepository, C92904Eg c92904Eg, LLB llb, String str, String str2, String str3) {
        AbstractC167027dH.A0a(1, userSession, c92904Eg, notesRepository, str);
        C14360o3.A0B(str2, 5);
        this.A08 = userSession;
        this.A0A = c92904Eg;
        this.A09 = notesRepository;
        this.A0D = str;
        this.A0I = str2;
        this.A0J = str3;
        this.A0C = llb;
        C008002u A00 = C10E.A00(C45835KQq.A00);
        this.A0G = A00;
        this.A0H = AbstractC208910l.A02(A00);
        C71533It c71533It = new C71533It(1, C05F.A01);
        this.A0E = c71533It;
        this.A0F = c71533It;
        this.A05 = true;
        this.A04 = AbstractC166987dD.A1I();
        this.A0B = new C48760LhS(this);
        AbstractC25232BEp.A1J(this, new MC6(this, null, 15), notesRepository.A0r);
        AbstractC25232BEp.A1J(this, new MC6(this, null, 16), notesRepository.A0k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0199, code lost:
    
        if (r1 == X.C1JX.A02) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C45052Jwh r19, X.Jn0 r20, X.InterfaceC23621Ds r21) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jn0.A01(X.Jwh, X.Jn0, X.1Ds):java.lang.Object");
    }

    public static final C45052Jwh A00(Jn0 jn0, Map map) {
        C45052Jwh c45052Jwh = (C45052Jwh) map.get(jn0.A0D);
        if (c45052Jwh != null) {
            List list = c45052Jwh.A05;
            String str = jn0.A0J;
            if (str != null && str.length() != 0 && jn0.A05) {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (AbstractC43592JPx.A1Z(it.next(), str)) {
                            return c45052Jwh;
                        }
                    }
                }
            } else {
                return c45052Jwh;
            }
        }
        return null;
    }

    public static final void A02(Jn0 jn0) {
        java.util.Set keySet = jn0.A04.keySet();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : keySet) {
            if (AbstractC31177DnL.A1b(jn0.A04.get(obj))) {
                A1E.add(obj);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), A0q);
        }
        AbstractC46433Kgt abstractC46433Kgt = (AbstractC46433Kgt) jn0.A0H.getValue();
        if (abstractC46433Kgt instanceof C45833KQo) {
            C05A c05a = jn0.A0G;
            C45833KQo c45833KQo = (C45833KQo) abstractC46433Kgt;
            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
            C4FL c4fl = jn0.A01;
            if (c4fl != null) {
                A0E.A00(c4fl);
            }
            ArrayList arrayList = jn0.A03;
            if (arrayList != null) {
                A0E.A01(arrayList);
            }
            String str = c45833KQo.A03;
            User user = c45833KQo.A01;
            String str2 = c45833KQo.A02;
            C14360o3.A0B(str, 0);
            c05a.Egh(new C45833KQo(A0E, user, str, str2, A0q));
        }
    }

    public final void A03() {
        int i;
        ArrayList arrayList;
        A04();
        ArrayList A1F = AbstractC166987dD.A1F(this.A03);
        Iterator A12 = AbstractC43593JPy.A12(this.A04);
        while (true) {
            i = 0;
            if (!A12.hasNext()) {
                break;
            } else {
                AbstractC43592JPx.A1W(A12.next(), this.A04, false);
            }
        }
        Iterator it = A1F.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            C4F5 c4f5 = (C4F5) it.next();
            if (c4f5.A0U && (arrayList = this.A03) != null) {
                User user = c4f5.A0A;
                boolean z = c4f5.A0P;
                List list = c4f5.A0J;
                Integer num = c4f5.A02;
                String str = c4f5.A03;
                Integer num2 = c4f5.A01;
                boolean z2 = c4f5.A0W;
                boolean z3 = c4f5.A04;
                boolean z4 = c4f5.A0S;
                boolean z5 = c4f5.A0O;
                boolean z6 = c4f5.A0T;
                String str2 = c4f5.A0G;
                Integer num3 = c4f5.A0D;
                Integer num4 = c4f5.A0C;
                List list2 = c4f5.A0M;
                String str3 = c4f5.A0H;
                boolean z7 = c4f5.A0R;
                int i3 = c4f5.A05;
                NotePogVideoDict notePogVideoDict = c4f5.A08;
                NotePogImageDict notePogImageDict = c4f5.A07;
                String str4 = c4f5.A0E;
                NoteAudience noteAudience = c4f5.A09;
                boolean z8 = c4f5.A0X;
                boolean z9 = c4f5.A0Q;
                List list3 = c4f5.A0L;
                Boolean bool = c4f5.A0B;
                List list4 = c4f5.A0N;
                boolean z10 = c4f5.A0Y;
                boolean z11 = c4f5.A0V;
                NoteCustomTheme noteCustomTheme = c4f5.A06;
                List list5 = c4f5.A0I;
                List list6 = c4f5.A0K;
                AbstractC167007dF.A1D(user, 0, list);
                arrayList.set(i, new C4F5(noteCustomTheme, notePogImageDict, notePogVideoDict, noteAudience, user, bool, num, num2, num3, num4, str, str2, str3, str4, list, list2, list3, list4, list5, list6, i3, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, false));
            }
            i = i2;
        }
        A02(this);
    }

    public final void A04() {
        Long l;
        Long l2;
        UserSession userSession = this.A08;
        if (C4AC.A0A(userSession) && !C18U.A06(C06090Tz.A05, userSession, 36328933628788612L)) {
            java.util.Set keySet = this.A04.keySet();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : keySet) {
                AbstractC43593JPy.A1R(this.A04.get(obj), true, obj, A1E);
            }
            ArrayList A0q = AbstractC167017dG.A0q(A1E);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), A0q);
            }
            if (AbstractC25226BEj.A1b(A0q)) {
                C135976Dc A01 = AbstractC135966Db.A01(userSession);
                String str = this.A0I;
                double A06 = AbstractC43593JPy.A06() - this.A00;
                long A0N = AbstractC166987dD.A0N(A0q.get(0));
                LLB llb = this.A0C;
                if (llb != null && (l2 = llb.A0E) != null) {
                    l = Long.valueOf(l2.longValue() - this.A00);
                } else {
                    l = null;
                }
                A01.A0S(l, str, A06, A0N, false);
            }
        }
    }
}
