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
public final class EJR extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ContentLanguageSettingsFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final C19270xB A02 = AbstractC31171DnF.A0D("content_language");

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131956696);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A01);
        C141796aw A00 = AbstractC141776au.A00(A0Z);
        PZL pzl = new PZL((InterfaceC23621Ds) null, A0Z, 31);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, pzl, A00);
        C31864DzW c31864DzW = new C31864DzW(new FHY(this));
        c31864DzW.setHasStableIds(true);
        ColorFilter A09 = AbstractC31174DnI.A09(requireContext(), AbstractC31180DnO.A01(this));
        SearchEditText searchEditText = (SearchEditText) view.findViewById(R.id.search);
        AbstractC167027dH.A0d(A09, searchEditText.getCompoundDrawablesRelative()[0]);
        searchEditText.setClearButtonColorFilter(A09);
        AbstractC31171DnF.A14(searchEditText);
        C31703Dw8.A00(searchEditText, this, 9);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.language_locale_list);
        recyclerView.setAdapter(c31864DzW);
        AbstractC31174DnI.A16(requireContext(), recyclerView, 1, false);
        recyclerView.A0S = true;
        View A0S = AbstractC166997dE.A0S(view, R.id.content_language_error_message);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new PZR(c31864DzW, viewLifecycleOwner, this, c07s, A0S, null, 2), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02.A00;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public EJR() {
        C37061GUv A01 = C37061GUv.A01(this, 26);
        InterfaceC09390do A00 = C37061GUv.A00(C37061GUv.A01(this, 23), EnumC09460dv.A02, 24);
        this.A01 = AbstractC25225BEi.A0a(C37061GUv.A01(A00, 25), A01, new C57252Pba(22, null, A00), AbstractC25225BEi.A1D(C50859Mdq.class));
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1370411230);
        requireArguments();
        super.onCreate(bundle);
        C0f9.A09(1567612148, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(431336243);
        View A0A = AbstractC31176DnK.A0A(LayoutInflater.from(getContext()), viewGroup, R.layout.language_locale_menu);
        C0f9.A09(1739195892, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1674091534);
        super.onPause();
        AbstractC13880nE.A0O(requireView());
        C0f9.A09(-857516506, A02);
    }
}
