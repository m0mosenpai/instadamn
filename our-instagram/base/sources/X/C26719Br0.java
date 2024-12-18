package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* renamed from: X.Br0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26719Br0 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ClipsLeadAdLoadingFragment";
    public LithoView A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_lead_ad_loading";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-229103297);
        C75713ac c75713ac = new C75713ac(new C2XE(requireContext()));
        c75713ac.A07 = AbstractC166997dE.A0a();
        c75713ac.A03 = new C89273yT(this);
        ComponentTree A00 = c75713ac.A00();
        this.A00 = LithoView.A01(requireContext(), A00);
        A00.A0N(new AbstractC51572Yf());
        LithoView lithoView = this.A00;
        C0f9.A09(-1415636892, A02);
        return lithoView;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1279387580);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(282938675, A02);
    }
}
