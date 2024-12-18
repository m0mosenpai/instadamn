package X;

import android.content.Context;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel;

/* loaded from: classes9.dex */
public final class P69 implements InterfaceC58056Poh {
    public final /* synthetic */ MusicSearchQueryViewModel A00;

    @Override // X.InterfaceC58056Poh
    public final void DVe(OKv oKv) {
        MusicSearchQueryViewModel musicSearchQueryViewModel = this.A00;
        C54428O3i c54428O3i = musicSearchQueryViewModel.A0D;
        String str = oKv.A01;
        C14360o3.A0B(str, 0);
        MSZ.A0V(c54428O3i.A00.A0A).A0C(str);
        if (AbstractC54064NvO.A00(oKv)) {
            C54693ODt c54693ODt = musicSearchQueryViewModel.A0G;
            MWM mwm = new MWM(8, oKv, c54693ODt);
            Integer num = C05F.A0C;
            UserSession userSession = c54693ODt.A02;
            int i = oKv.A00;
            MusicProduct musicProduct = c54693ODt.A01;
            String str2 = c54693ODt.A04;
            C1ON A01 = C50675MYt.A01(musicProduct, userSession, num, str, str2, i);
            A01.A00 = mwm;
            C1GK A012 = C1GJ.A01();
            C14360o3.A0B(A012, 0);
            A012.schedule(A01);
            C1ON A013 = C50675MYt.A01(musicProduct, userSession, C05F.A0Y, str, str2, i);
            A013.A00 = mwm;
            C1GK A014 = C1GJ.A01();
            C14360o3.A0B(A014, 0);
            A014.schedule(A013);
        }
        musicSearchQueryViewModel.A0H.A00(oKv, MSZ.A0V(musicSearchQueryViewModel.A0E.A00.A0A).A07);
    }

    public P69(MusicSearchQueryViewModel musicSearchQueryViewModel) {
        this.A00 = musicSearchQueryViewModel;
    }

    @Override // X.InterfaceC58056Poh
    public final void DDP() {
        MusicSearchQueryViewModel musicSearchQueryViewModel = this.A00;
        musicSearchQueryViewModel.A09.A0B(new O8H(0, null));
        musicSearchQueryViewModel.A07.A0B(C193588hd.A00);
        if (musicSearchQueryViewModel.A0K) {
            ODE ode = musicSearchQueryViewModel.A0I;
            OAX oax = ode.A03;
            MusicProduct musicProduct = ode.A02;
            Object A02 = oax.A02.A02(musicProduct);
            if (A02 != null) {
                oax.A01.A0A(new C8ZT(A02));
            }
            OFB ofb = ode.A04;
            Context context = ofb.A00;
            AbstractC018607g abstractC018607g = ofb.A05;
            UserSession userSession = ofb.A06;
            String str = ofb.A07;
            C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
            A0M.A0B("music/recent_searches/");
            String A00 = AbstractC65993Txo.A00(musicProduct);
            if (A00 == null) {
                A00 = "";
            }
            MSX.A1J(A0M, A00, str);
            A0M.A9s("search_session_id", "");
            A0M.A0P(null, C38902HAz.class, IRR.class, false);
            String A0n = AbstractC167017dG.A0n(musicProduct, "music/recent_searches/", AbstractC166987dD.A1C());
            A0M.A07 = C05F.A0Y;
            A0M.A0A = A0n;
            ((AbstractC23721Ec) A0M).A01 = 86400000L;
            ((AbstractC23721Ec) A0M).A00 = 4000L;
            C1ON A0N = A0M.A0N();
            C50689MZh.A00(A0N, ofb, 16);
            C1GJ.A00(context, abstractC018607g, A0N);
        }
    }
}
