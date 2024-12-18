package X;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LRC implements AbsListView.OnScrollListener {
    public boolean A00;
    public final View A01;
    public final KEH A02;
    public final KQL A03;
    public final View A04;
    public final ListView A05;

    public LRC(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1GL c1gl, InterfaceC150196pR interfaceC150196pR, MOQ moq) {
        AbstractC167007dF.A1G(userSession, 1, interfaceC150196pR);
        KEH keh = new KEH(AbstractC166997dE.A0L(view), interfaceC11380iw, userSession, null, interfaceC150196pR, moq, null, false, false);
        this.A02 = keh;
        this.A03 = new KQL(c1gl, this, new C48731Lgz(GiphyRequestSurface.A08, null, userSession, AbstractC166987dD.A1J(EnumC46201Kcd.EMOJI), false));
        this.A01 = AbstractC166997dE.A0S(view, R.id.assets_search_results);
        this.A04 = AbstractC166997dE.A0S(view, R.id.loading_spinner);
        ListView listView = (ListView) AbstractC166997dE.A0R(view, R.id.assets_search_results_list);
        this.A05 = listView;
        listView.setAdapter((ListAdapter) keh);
        listView.setOnScrollListener(this);
    }

    public static final void A00(LRC lrc, boolean z) {
        int i = 8;
        lrc.A04.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        ListView listView = lrc.A05;
        if (!z) {
            i = 0;
        }
        listView.setVisibility(i);
        KEH keh = lrc.A02;
        if (keh.A00) {
            keh.A00 = false;
            KEH.A01(keh);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C0f9.A0A(1627270534, C0f9.A03(45222080));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, 117646688);
        if (i == 1) {
            AbstractC13880nE.A0O(absListView);
        }
        C0f9.A0A(710209632, A0N);
    }
}
