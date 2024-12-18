package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P66 implements InterfaceC58197Pr3 {
    public final /* synthetic */ MusicProduct A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C8KD A02;
    public final /* synthetic */ MusicBrowseCategory A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    @Override // X.InterfaceC58197Pr3
    public final C1ON ANK(InterfaceC25601Mq interfaceC25601Mq, Integer num, Long l, Object obj, String str) {
        C14360o3.A0B(num, 1);
        return C50675MYt.A02.A02(this.A00, this.A01, interfaceC25601Mq, this.A03, num, l, str, this.A04, null, this.A05);
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
    public final void Dfr(AbstractC115105If abstractC115105If, int i) {
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

    public P66(MusicProduct musicProduct, UserSession userSession, C8KD c8kd, MusicBrowseCategory musicBrowseCategory, String str, Map map) {
        this.A01 = userSession;
        this.A03 = musicBrowseCategory;
        this.A00 = musicProduct;
        this.A04 = str;
        this.A05 = map;
        this.A02 = c8kd;
    }

    @Override // X.InterfaceC58197Pr3
    public final void DgT(InterfaceC57963Pn9 interfaceC57963Pn9, Object obj, int i, boolean z, boolean z2) {
        Object obj2;
        Object obj3;
        MusicSearchPlaylist musicSearchPlaylist;
        List Bfr;
        List Bfr2;
        if (z) {
            C8KD c8kd = this.A02;
            Iterator it = interfaceC57963Pn9.EqR().A05.iterator();
            while (true) {
                obj2 = null;
                if (it.hasNext()) {
                    obj3 = it.next();
                    MusicSearchPlaylist musicSearchPlaylist2 = ((C38061Goo) obj3).A0E;
                    if (musicSearchPlaylist2 != null && (Bfr2 = musicSearchPlaylist2.Bfr()) != null && AbstractC166987dD.A1b(Bfr2)) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            C38061Goo c38061Goo = (C38061Goo) obj3;
            if (c38061Goo != null && (musicSearchPlaylist = c38061Goo.A0E) != null && (Bfr = musicSearchPlaylist.Bfr()) != null) {
                obj2 = AbstractC001800i.A0J(Bfr);
            }
            c8kd.A01.Egh(obj2);
        }
    }
}
