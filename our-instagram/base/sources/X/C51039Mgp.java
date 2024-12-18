package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.archive.data.ArchiveStoryRepository;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mgp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51039Mgp extends AbstractC52922bZ {
    public C38321qM A00;
    public final C55197Oe4 A01;
    public final ArchiveStoryRepository A02;
    public final OMj A03;
    public final C25671My A04;
    public final UserSession A05;
    public final String A06;
    public final java.util.Set A07;
    public final C05A A08;
    public final C0UO A09;
    public final boolean A0A;
    public final boolean A0B;

    public static final void A01(C51039Mgp c51039Mgp, String str, boolean z) {
        Object value;
        C26078Bg7 A00;
        C05A c05a = c51039Mgp.A08;
        Object obj = ((C26078Bg7) c05a.getValue()).A03;
        Integer num = C05F.A01;
        if (obj == num) {
            return;
        }
        do {
            value = c05a.getValue();
            A00 = C26078Bg7.A00((C26078Bg7) value, null, num, null, null, null, null, 0, 254, false);
        } while (!c05a.AIi(value, A00));
        OMj oMj = c51039Mgp.A03;
        if (!oMj.A01) {
            oMj.A03.markerStart(18945137);
            oMj.A01 = true;
            oMj.A00 = AbstractC25226BEj.A1L(new MBq(oMj, null, 3), oMj.A02);
        }
        AbstractC166987dD.A1Z(new PXZ(c51039Mgp, str, null, 0, z), AbstractC141776au.A00(c51039Mgp));
    }

    public /* synthetic */ C51039Mgp(C55197Oe4 c55197Oe4, ArchiveStoryRepository archiveStoryRepository, OMj oMj, UserSession userSession, String str, boolean z, boolean z2) {
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        MSZ.A1O(userSession, str);
        C14360o3.A0B(A00, 8);
        this.A05 = userSession;
        this.A02 = archiveStoryRepository;
        this.A0A = z;
        this.A06 = str;
        this.A0B = z2;
        this.A03 = oMj;
        this.A01 = c55197Oe4;
        this.A04 = A00;
        C008002u A1H = AbstractC25225BEi.A1H(new C26078Bg7(null, null, null, null, null, null, null, 0, 255, 0, false));
        this.A08 = A1H;
        this.A07 = AbstractC31171DnF.A0l();
        MWG mwg = new MWG(10, this, A1H);
        this.A09 = AbstractC208910l.A01(new C26078Bg7(), AbstractC141776au.A00(this), mwg, C10I.A01);
        AbstractC25232BEp.A1J(this, new MC5(this, null, 12), new AnonymousClass625(A00).A00(LYD.class));
    }

    public final void A02(int i) {
        Object value;
        C05A c05a = this.A08;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C26078Bg7.A00((C26078Bg7) value, null, null, null, null, null, null, i, StringTreeSet.MAX_SYMBOL_COUNT, false)));
    }

    public final void A03(C38321qM c38321qM) {
        ArchiveStoryRepository archiveStoryRepository = this.A02;
        AbstractC166987dD.A1Z(new MCH(c38321qM, archiveStoryRepository, (InterfaceC23621Ds) null, 39), ((C4A7) archiveStoryRepository).A01);
    }

    public final void A04(C38321qM c38321qM, boolean z) {
        ArchiveStoryRepository archiveStoryRepository = this.A02;
        AbstractC166987dD.A1Z(new MBa(archiveStoryRepository, c38321qM, "stories_archive", null, 0, z), ((C4A7) archiveStoryRepository).A01);
    }

    public final void A05(Reel reel) {
        Object value;
        C26078Bg7 A00;
        C55197Oe4 c55197Oe4 = this.A01;
        c55197Oe4.A08(reel);
        C05A c05a = this.A08;
        do {
            value = c05a.getValue();
            java.util.Set keySet = c55197Oe4.A05.keySet();
            C14360o3.A07(keySet);
            A00 = C26078Bg7.A00((C26078Bg7) value, null, null, null, null, null, AbstractC001800i.A0k(keySet), 0, 223, false);
        } while (!c05a.AIi(value, A00));
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A02.onUserSessionWillEnd(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.0sl] */
    public static final List A00(UserSession userSession, Map map, boolean z) {
        ?? A0q;
        Collection<C3AY> values = map.values();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (C3AY c3ay : values) {
            C51665Mrw c51665Mrw = (C51665Mrw) c3ay.A00;
            Reel reel = (Reel) c3ay.A01;
            if (reel.A14(userSession)) {
                A0q = C16930sl.A00;
            } else if (!reel.A15(userSession)) {
                List A0O = reel.A0O(userSession);
                ArrayList A10 = AbstractC31174DnI.A10(A0O);
                for (Object obj : A0O) {
                    C41181vS c41181vS = (C41181vS) obj;
                    if (!z || c41181vS.A0B() != EnumC76383bi.A04) {
                        A10.add(obj);
                    }
                }
                ArrayList A0q2 = AbstractC167017dG.A0q(A10);
                int i = 0;
                for (Object obj2 : A10) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    C41181vS c41181vS2 = (C41181vS) obj2;
                    C14360o3.A0A(c41181vS2);
                    long j = c51665Mrw.A01;
                    C14360o3.A0B(c41181vS2, 1);
                    A0q2.add(new OJ8(reel, c41181vS2, i, j));
                    i = i2;
                }
                A0q = AbstractC001800i.A0U(A0q2);
                java.util.Set set = reel.A1A;
                C14360o3.A07(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    A0q.add(new C52100N3a(reel, MSX.A05((Number) it.next()), c51665Mrw.A01));
                }
            } else {
                C17u A0C = C17s.A0C(0, c51665Mrw.A00);
                A0q = AbstractC167017dG.A0q(A0C);
                Iterator it2 = A0C.iterator();
                while (it2.hasNext()) {
                    A0q.add(new N3Z(reel, ((AbstractC16880sg) it2).A00(), c51665Mrw.A01));
                }
            }
            AnonymousClass016.A16(A0q, A1E);
        }
        return A1E;
    }
}
