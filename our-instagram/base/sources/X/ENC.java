package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ENC extends AbstractC59962oe implements InterfaceC37139GYa {
    public static final String __redex_internal_original_name = "FollowListSortingOptionsFragment";
    public InterfaceC37139GYa A00;
    public EnumC33389EpM A01;
    public E07 A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "follow_list_sorting_selection";
    }

    @Override // X.InterfaceC37139GYa
    public final void DnL(EnumC33389EpM enumC33389EpM) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0M(this, this.A03), "follow_list_did_select_sorting_option");
        if (enumC33389EpM != EnumC33389EpM.A05) {
            A0f.AAP("order", enumC33389EpM.A00);
        }
        A0f.Cht();
        InterfaceC37139GYa interfaceC37139GYa = this.A00;
        if (interfaceC37139GYa != null) {
            interfaceC37139GYa.DnL(enumC33389EpM);
        }
        AbstractC25233BEq.A14(this);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(650541067);
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("FollowListSortingOptionsFragment.SortingType");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.user.userlist.model.SortingType");
        this.A01 = (EnumC33389EpM) serializable;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (EnumC33389EpM enumC33389EpM : EnumC33389EpM.values()) {
            String A00 = FCW.A00(requireContext(), enumC33389EpM);
            EnumC33389EpM enumC33389EpM2 = this.A01;
            if (enumC33389EpM2 == null) {
                C14360o3.A0F("sortingTypeSelected");
                throw C00O.createAndThrow();
            }
            A1E.add(new FLX(enumC33389EpM, A00, AbstractC167007dF.A1X(enumC33389EpM, enumC33389EpM2)));
        }
        this.A02 = new E07(this, A1E);
        C0f9.A09(-654152053, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-124025906);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.follow_list_sorting_options_fragment, false);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(A0R, R.id.follow_list_sorting_options_recycler_view);
        AbstractC31178DnM.A0z(this, recyclerView);
        E07 e07 = this.A02;
        if (e07 == null) {
            C14360o3.A0F("followListSortingOptionsListAdapter");
            throw C00O.createAndThrow();
        }
        recyclerView.setAdapter(e07);
        C0f9.A09(1828178741, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(756779747);
        super.onResume();
        AbstractC56932jR.A06(AbstractC166997dE.A0S(requireView(), R.id.follow_list_sorting_options_fragment_title), 500L);
        C0f9.A09(1081064923, A02);
    }
}
