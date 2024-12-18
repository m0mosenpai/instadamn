package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EJT extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FanClubSettingsRecommendationsFragment";
    public final InterfaceC09390do A00 = C1XM.A00(new J7K(this, 15));
    public final InterfaceC09390do A03 = C1XM.A00(new J7K(this, 17));
    public final InterfaceC09390do A01 = AbstractC25225BEi.A0a(new J7K(this, 18), new J7K(this, 16), new C50171MDy(44, null, this), AbstractC25225BEi.A1D(C31813DyX.class));
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fan_club_settings_recommendations";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC09390do interfaceC09390do = this.A02;
        FR4 fr4 = new FR4(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do));
        new C35024Fbx(this, requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), fr4, AbstractC25225BEi.A15(this.A00), 32).A01(requireContext(), null, i, i2);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (AbstractC167007dF.A1Z(this.A03)) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A01);
            boolean A02 = AbstractC63292u7.A02(AbstractC166987dD.A0r(this.A02));
            AbstractC166987dD.A1Z(new PZW(A0Z, (InterfaceC23621Ds) null, 25, A02), AbstractC141776au.A00(A0Z));
        }
        InterfaceC09390do interfaceC09390do = this.A02;
        C51157Mj0 c51157Mj0 = new C51157Mj0(AbstractC166987dD.A0r(interfaceC09390do));
        c51157Mj0.A00 = this;
        ((RecyclerView) view.findViewById(R.id.product_settings_recycle_view)).setAdapter(c51157Mj0);
        C99694dm A00 = AbstractC99684dl.A00(AbstractC166987dD.A0r(interfaceC09390do));
        String A15 = AbstractC25225BEi.A15(this.A00);
        C14360o3.A0B(A15, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00.A00, "ig_fan_club_settings_recommendations_full_screen_impression");
        AbstractC31171DnF.A1I(A0f, "creator_management_settings");
        AbstractC31178DnM.A17(A0f, A00.A01.userId);
        AbstractC31180DnO.A1I(A0f, A15);
        C57312k6 A002 = C07Y.A00(this);
        MCG mcg = new MCG(c51157Mj0, this, (InterfaceC23621Ds) null, 21);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mcg, A002);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new MCL(viewLifecycleOwner, c07s, this, null, 32), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131962184);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1380565510);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.monetization_product_settings_layout, viewGroup, false);
        C0f9.A09(-451251995, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(338053213);
        super.onResume();
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A01);
        boolean A022 = AbstractC63292u7.A02(AbstractC166987dD.A0r(this.A02));
        AbstractC166987dD.A1Z(new PZW(A0Z, (InterfaceC23621Ds) null, 25, A022), AbstractC141776au.A00(A0Z));
        C0f9.A09(-762315130, A02);
    }
}
