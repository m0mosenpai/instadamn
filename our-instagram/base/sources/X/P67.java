package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P67 implements InterfaceC58197Pr3 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass841 A01;
    public final /* synthetic */ MusicBrowseCategory A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;

    @Override // X.InterfaceC58197Pr3
    public final C1ON ANK(InterfaceC25601Mq interfaceC25601Mq, Integer num, Long l, Object obj, String str) {
        C14360o3.A0B(num, 1);
        return C50675MYt.A02.A02(MusicProduct.A0G, this.A00, interfaceC25601Mq, this.A02, num, l, str, String.valueOf(((MX5) this.A01).A01.A07), null, this.A03);
    }

    @Override // X.InterfaceC58197Pr3
    public final Object BoC() {
        return null;
    }

    @Override // X.InterfaceC58197Pr3
    public final boolean CLl() {
        return false;
    }

    @Override // X.InterfaceC58197Pr3
    public final /* synthetic */ void DVK(String str, Object obj, int i) {
    }

    @Override // X.InterfaceC58197Pr3
    public final /* synthetic */ void DVL(int i, Object obj, boolean z) {
    }

    @Override // X.InterfaceC58197Pr3
    public final void Dg2(Object obj, int i) {
    }

    @Override // X.InterfaceC58197Pr3
    public final void DgI(Object obj, int i) {
    }

    @Override // X.InterfaceC58197Pr3
    public final boolean EjU() {
        return false;
    }

    @Override // X.InterfaceC58197Pr3
    public final boolean EjZ() {
        return false;
    }

    public P67(UserSession userSession, AnonymousClass841 anonymousClass841, MusicBrowseCategory musicBrowseCategory, Map map, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = userSession;
        this.A02 = musicBrowseCategory;
        this.A01 = anonymousClass841;
        this.A03 = map;
        this.A05 = interfaceC16660sJ;
        this.A04 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC58197Pr3
    public final void Dfr(AbstractC115105If abstractC115105If, int i) {
        this.A04.invoke();
    }

    @Override // X.InterfaceC58197Pr3
    public final void DgT(InterfaceC57963Pn9 interfaceC57963Pn9, Object obj, int i, boolean z, boolean z2) {
        Object obj2;
        MusicSearchPlaylist musicSearchPlaylist;
        List Bfr;
        String str;
        List list = interfaceC57963Pn9.EqR().A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj3 : list) {
            MusicSearchPlaylist musicSearchPlaylist2 = ((C38061Goo) obj3).A0E;
            if (musicSearchPlaylist2 != null) {
                str = musicSearchPlaylist2.getId();
            } else {
                str = null;
            }
            AbstractC43593JPy.A1R(str, "2282005535164995", obj3, A1E);
        }
        C38061Goo c38061Goo = (C38061Goo) AbstractC001800i.A0J(A1E);
        if (c38061Goo != null && (musicSearchPlaylist = c38061Goo.A0E) != null && (Bfr = musicSearchPlaylist.Bfr()) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(Bfr);
            Iterator it = Bfr.iterator();
            while (it.hasNext()) {
                JIN A00 = ((C38061Goo) it.next()).A00();
                C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.music.common.model.MusicSearchTrack");
                A0q.add(A00);
            }
            obj2 = AbstractC001800i.A0X(A0q);
        } else {
            obj2 = C16930sl.A00;
        }
        this.A05.invoke(obj2);
    }
}
