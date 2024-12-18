package X;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class LRD implements AbsListView.OnScrollListener, InterfaceC60152ox, MOP {
    public String A00;
    public boolean A01;
    public final View A02;
    public final C3I9 A03;
    public final KNI A04;
    public final KEH A05;
    public final C44421JkH A06;
    public final View A07;
    public final ListView A08;

    public LRD(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3I9 c3i9, InterfaceC150196pR interfaceC150196pR, KNI kni, MOQ moq) {
        C14360o3.A0B(userSession, 1);
        AbstractC25234BEr.A1R(interfaceC11380iw, view, kni, c3i9, interfaceC150196pR);
        Context context = view.getContext();
        this.A04 = kni;
        this.A03 = c3i9;
        C14360o3.A0A(context);
        KEH keh = new KEH(context, interfaceC11380iw, userSession, null, interfaceC150196pR, moq, null, false, false);
        this.A05 = keh;
        this.A06 = new C44421JkH(userSession, this);
        this.A02 = AbstractC166997dE.A0S(view, R.id.assets_search_results);
        this.A07 = AbstractC166997dE.A0S(view, R.id.loading_spinner);
        View A0U = AbstractC167017dG.A0U(view, R.id.assets_search_results_list);
        C14360o3.A0C(A0U, "null cannot be cast to non-null type android.widget.ListView");
        ListView listView = (ListView) A0U;
        this.A08 = listView;
        listView.setAdapter((ListAdapter) keh);
        listView.setOnScrollListener(this);
    }

    @Override // X.MOP
    public final void Dh9(String str, List list) {
        C14360o3.A0B(str, 0);
        if (str.equals(this.A00)) {
            KEH keh = this.A05;
            if (list == null) {
                list = AbstractC166987dD.A1E();
            }
            keh.A05(list);
        }
    }

    public static final void A00(LRD lrd) {
        lrd.A07.setVisibility(8);
        lrd.A08.setVisibility(0);
        KEH keh = lrd.A05;
        if (keh.A00) {
            keh.A00 = false;
            KEH.A01(keh);
        }
    }

    public final void A01(String str) {
        if (this.A01) {
            if (str != null) {
                this.A00 = str;
                if (str.length() == 0) {
                    this.A05.A03();
                }
                A00(this);
                String str2 = this.A00;
                if (str2 != null) {
                    if (str2.length() != 0) {
                        this.A06.filter(str2);
                        return;
                    }
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        this.A07.setTranslationY(i / (-2.0f));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C0f9.A0A(-642568233, C0f9.A03(1008882793));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, -526113291);
        if (i == 1) {
            AbstractC13880nE.A0O(absListView);
        }
        C0f9.A0A(1617433122, A0N);
    }
}
