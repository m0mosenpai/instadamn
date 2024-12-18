package X;

import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes6.dex */
public final class EJQ extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AppLanguageSettingsFragment";
    public final C19270xB A00 = AbstractC31171DnF.A0D("language");
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131952987);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ColorFilter A09 = AbstractC31174DnI.A09(requireContext(), AbstractC31180DnO.A01(this));
        SearchEditText searchEditText = (SearchEditText) view.findViewById(R.id.search);
        AbstractC167027dH.A0d(A09, searchEditText.getCompoundDrawablesRelative()[0]);
        searchEditText.setClearButtonColorFilter(A09);
        AbstractC31171DnF.A14(searchEditText);
        C31703Dw8.A00(searchEditText, this, 8);
        C31865DzX c31865DzX = new C31865DzX(new GGA(this));
        c31865DzX.setHasStableIds(true);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.language_locale_list);
        recyclerView.setAdapter(c31865DzX);
        AbstractC31174DnI.A16(requireContext(), recyclerView, 1, false);
        recyclerView.A0S = true;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57169PZn(viewLifecycleOwner, c07s, c31865DzX, this, null, 23), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A00.A00;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public EJQ() {
        C37061GUv A01 = C37061GUv.A01(this, 22);
        InterfaceC09390do A00 = C37061GUv.A00(C37061GUv.A01(this, 19), EnumC09460dv.A02, 20);
        this.A02 = AbstractC25225BEi.A0a(C37061GUv.A01(A00, 21), A01, new C57252Pba(21, null, A00), AbstractC25225BEi.A1D(C31790Dy9.class));
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(220689989);
        requireArguments();
        super.onCreate(bundle);
        C0f9.A09(-91974025, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(46268170);
        View A0A = AbstractC31176DnK.A0A(LayoutInflater.from(getContext()), viewGroup, R.layout.language_locale_menu);
        C0f9.A09(-195821257, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(992423658);
        super.onPause();
        AbstractC13880nE.A0O(requireView());
        C0f9.A09(-1918568065, A02);
    }
}
