package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Brh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26760Brh extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "StoryHighlightsToReelsFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final String A02 = "story_highlights_to_reels_fragment";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        C3LO c3lo = new C3LO();
        c3lo.A00();
        interfaceC56362iU.Ehd(ViewOnClickListenerC28667ClF.A00(c3lo, this, 17));
        interfaceC56362iU.Efu(2131974633);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C38365Gu1 c38365Gu1 = new C38365Gu1(requireActivity(), this, AbstractC166987dD.A0r(this.A00));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2);
        gridLayoutManager.A01 = new C25890Bcr(c38365Gu1, 0);
        View requireViewById = view.requireViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(c38365Gu1);
        C14360o3.A07(requireViewById);
        BY8.A00(getViewLifecycleOwner(), (C2GT) ((C25815BbW) this.A01.getValue()).A01.getValue(), new C30172DRc(7, c38365Gu1, view, this), 3);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public C26760Brh() {
        X2y x2y = new X2y(this, 42);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2y(new X2y(this, 39), 40));
        this.A01 = AbstractC25225BEi.A0a(new X2y(A00, 41), x2y, new C57253Pbb(17, null, A00), AbstractC25225BEi.A1D(C25815BbW.class));
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-832530684);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.story_highlights_to_reels_layout, false);
        C0f9.A09(1044676425, A02);
        return A0R;
    }
}
