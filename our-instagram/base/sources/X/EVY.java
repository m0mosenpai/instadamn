package X;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.widget.search.SearchController;

/* loaded from: classes6.dex */
public final class EVY extends AbstractC60592pi implements InterfaceC71990XEd {
    public boolean A00;
    public final View A01;
    public final CategorySearchFragment A02;
    public final SearchController A03;
    public final Activity A04;
    public final ViewGroup A05;

    public final void A00() {
        String searchString;
        SearchController searchController = this.A03;
        if (searchController.A03 == C05F.A0C) {
            C69476Vnz c69476Vnz = searchController.mViewHolder;
            if (c69476Vnz == null) {
                searchString = "";
            } else {
                searchString = c69476Vnz.A0F.getSearchString();
            }
            if (searchString == null) {
                searchString = "";
            }
            searchController.A01(C05F.A00, 0.0f, this.A01.getHeight(), true);
            CategorySearchFragment categorySearchFragment = this.A02;
            ViewGroup viewGroup = categorySearchFragment.container;
            if (viewGroup != null) {
                viewGroup.setPadding(0, categorySearchFragment.A00, 0, 0);
            }
            IgdsInlineSearchBox igdsInlineSearchBox = categorySearchFragment.searchBox;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.A0E.setText(searchString);
            }
            CategorySearchFragment.A07(categorySearchFragment);
            ViewGroup viewGroup2 = categorySearchFragment.mainScreenContainer;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutTransition(new LayoutTransition());
            }
        }
    }

    @Override // X.InterfaceC71990XEd
    public final void DTR() {
    }

    @Override // X.InterfaceC71990XEd
    public final void DTT() {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjB(SearchController searchController, boolean z) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjP(String str, boolean z) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjS(String str, String str2) {
        C14360o3.A0B(str, 0);
        if (this.A03.A03 != C05F.A01) {
            this.A02.A0d(str);
        }
    }

    @Override // X.InterfaceC71990XEd
    public final void DoO(SearchController searchController, Integer num, Integer num2) {
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A03.onViewCreated(view, bundle);
    }

    public EVY(Activity activity, View view, ViewGroup viewGroup, ViewGroup viewGroup2, C32404EPf c32404EPf, CategorySearchFragment categorySearchFragment, UserSession userSession, IgdsInlineSearchBox igdsInlineSearchBox) {
        boolean A1a = AbstractC31175DnJ.A1a(c32404EPf);
        AbstractC167017dG.A1T(viewGroup, viewGroup2);
        C14360o3.A0B(igdsInlineSearchBox, 8);
        this.A04 = activity;
        this.A02 = categorySearchFragment;
        this.A05 = viewGroup;
        this.A01 = view;
        this.A00 = A1a;
        this.A03 = new SearchController(activity, viewGroup2, c32404EPf, userSession, new Eg4(this), this, 0, 0, false);
        igdsInlineSearchBox.A02();
        ViewOnClickListenerC35690FpP.A01(igdsInlineSearchBox, 58, this);
    }

    @Override // X.InterfaceC71990XEd
    public final float Aby(SearchController searchController, Integer num) {
        return this.A01.getHeight();
    }

    @Override // X.InterfaceC71990XEd
    public final void Cwf(SearchController searchController, Integer num, float f, float f2) {
        Activity activity;
        ViewGroup viewGroup;
        if (this.A01 != null && (activity = this.A04) != null && (viewGroup = this.A05) != null) {
            float height = f2 - r0.getHeight();
            C56352iT.A0t.A03(activity).A0P.setTranslationY(height);
            viewGroup.setTranslationY(height);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A03.onDestroyView();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A03.onPause();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        SearchController searchController = this.A03;
        searchController.onResume();
        if (searchController.A03 == C05F.A0C) {
            this.A02.A0b();
        }
    }

    @Override // X.InterfaceC71990XEd
    public final void DEw() {
        A00();
    }
}
