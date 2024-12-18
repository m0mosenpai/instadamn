package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class KKq extends C3PD implements InterfaceC55932he, View.OnFocusChangeListener, C88U {
    public final C55982hj A00;
    public final ViewOnTouchListenerC48085LQk A01;
    public final SearchEditText A02;
    public final View A03;
    public final View A04;
    public final View A05;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.C88U
    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
    }

    public final void A00() {
        SearchEditText searchEditText = this.A02;
        if (searchEditText.isFocused()) {
            searchEditText.clearFocus();
            AbstractC13880nE.A0O(searchEditText);
        }
        ViewOnTouchListenerC48085LQk viewOnTouchListenerC48085LQk = this.A01;
        LRD lrd = viewOnTouchListenerC48085LQk.A06;
        lrd.A01 = false;
        lrd.A03.EFx(lrd);
        C150956qv.A08(new View[]{lrd.A02}, true);
        LRD.A00(lrd);
        C150956qv.A09(new View[]{viewOnTouchListenerC48085LQk.A08, viewOnTouchListenerC48085LQk.A0B}, true);
        this.A00.A04();
        searchEditText.setHint(2131972993);
        AbstractC31171DnF.A14(searchEditText);
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f = (float) c55982hj.A09.A00;
        View view = this.A03;
        view.setAlpha(f);
        int i = 0;
        int i2 = 4;
        if (view.getAlpha() > 0.0f) {
            i2 = 0;
        }
        view.setVisibility(i2);
        View view2 = this.A05;
        view2.setAlpha(1.0f - f);
        if (view2.getAlpha() <= 0.0f) {
            i = 4;
        }
        view2.setVisibility(i);
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        if (view == this.A03) {
            A00();
            return true;
        }
        if (view == this.A04) {
            AbstractC31171DnF.A14(this.A02);
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            ViewOnTouchListenerC48085LQk viewOnTouchListenerC48085LQk = this.A01;
            LRD lrd = viewOnTouchListenerC48085LQk.A06;
            lrd.A01 = true;
            lrd.A03.A9e(lrd);
            KEH keh = lrd.A05;
            ArrayList A02 = lrd.A04.A02();
            ArrayList arrayList = keh.A0D;
            arrayList.clear();
            arrayList.addAll(A02);
            KEH.A01(keh);
            C150956qv.A09(new View[]{lrd.A02}, true);
            LRD.A00(lrd);
            viewOnTouchListenerC48085LQk.A0S.A04();
            C150956qv.A08(new View[]{viewOnTouchListenerC48085LQk.A08, viewOnTouchListenerC48085LQk.A0B}, true);
            viewOnTouchListenerC48085LQk.A06.A01("");
            this.A00.A03();
        }
    }

    public KKq(View view, ViewOnTouchListenerC48085LQk viewOnTouchListenerC48085LQk) {
        View A0U = AbstractC167017dG.A0U(view, R.id.asset_search_bar_stub);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        Context context = view.getContext();
        C124385ju c124385ju = new C124385ju(context, AbstractC13880nE.A00(context, 0.5f), R.color.fds_white_alpha80, 80);
        c124385ju.A00(dimensionPixelSize, 0, dimensionPixelSize, 0);
        view.requireViewById(R.id.search_bar_container).setBackground(c124385ju);
        View requireViewById = view.requireViewById(R.id.back_button);
        this.A03 = requireViewById;
        C3P9 A0s = AbstractC166987dD.A0s(requireViewById);
        A0s.A04 = this;
        A0s.A07 = true;
        A0s.A0D = true;
        A0s.A00();
        View requireViewById2 = view.requireViewById(R.id.clear_button);
        this.A04 = requireViewById2;
        C3P9 A0s2 = AbstractC166987dD.A0s(requireViewById2);
        A0s2.A04 = this;
        A0s2.A07 = true;
        A0s2.A0D = true;
        A0s2.A00();
        this.A05 = view.requireViewById(R.id.search_icon);
        this.A01 = viewOnTouchListenerC48085LQk;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = true;
        A0R.A0A(this);
        this.A00 = A0R;
        SearchEditText searchEditText = (SearchEditText) A0U.requireViewById(R.id.search_bar);
        this.A02 = searchEditText;
        searchEditText.setAllowTextSelection(true);
        searchEditText.A0C = this;
        searchEditText.setOnFocusChangeListener(this);
    }

    @Override // X.C88U
    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2 = charSequence.toString();
        this.A01.A06.A01(charSequence2);
        boolean isEmpty = charSequence2.isEmpty();
        View[] viewArr = {this.A04};
        if (isEmpty) {
            C150956qv.A08(viewArr, true);
        } else {
            C150956qv.A09(viewArr, true);
        }
    }
}
