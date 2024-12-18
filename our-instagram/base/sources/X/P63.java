package X;

import android.content.Context;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel;

/* loaded from: classes9.dex */
public final class P63 implements InterfaceC58053Poe {
    public final /* synthetic */ NQI A00;

    public P63(NQI nqi) {
        this.A00 = nqi;
    }

    @Override // X.InterfaceC58053Poe
    public final void DjH(String str) {
        NQI nqi = this.A00;
        if (nqi.isResumed()) {
            nqi.A03(str, true);
        }
    }

    @Override // X.InterfaceC58053Poe
    public final void Dxf() {
        MusicSearchQueryViewModel musicSearchQueryViewModel = this.A00.A04;
        if (musicSearchQueryViewModel == null) {
            C14360o3.A0F("musicSearchQueryViewModel");
            throw C00O.createAndThrow();
        }
        MSX.A1A(musicSearchQueryViewModel.A0A, AbstractC166997dE.A0b());
        ODE ode = musicSearchQueryViewModel.A0I;
        OFB ofb = ode.A04;
        MusicProduct musicProduct = ode.A02;
        Context context = ofb.A00;
        AbstractC018607g abstractC018607g = ofb.A05;
        UserSession userSession = ofb.A06;
        String str = ofb.A07;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("music/clear_recent_searches/");
        String A00 = AbstractC65993Txo.A00(musicProduct);
        if (A00 == null) {
            A00 = "";
        }
        MSX.A1J(A0c, A00, str);
        A0c.A9s("should_clear_all", "true");
        C1ON A0e = AbstractC25227BEk.A0e(A0c, N2F.class, ONM.class);
        C50689MZh.A00(A0e, ofb, 15);
        C1GJ.A00(context, abstractC018607g, A0e);
    }
}
