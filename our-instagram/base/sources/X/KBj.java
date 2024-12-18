package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* loaded from: classes8.dex */
public final class KBj extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteAdToolsCreateAdFragment";
    public C67920V2k A00;
    public String A01;
    public W6I A02;
    public final List A04 = AbstractC166987dD.A1E();
    public final List A03 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970880);
        AbstractC31176DnK.A1C(new ViewOnClickListenerC48064LPp(this, 33), AbstractC31174DnI.A0K(), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_ad_tools_create_ad_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(C33L.A00(view, AbstractC43594JPz.A0P(this.A05), C05F.A0u), R.id.ad_tools_recycler_view);
        C67920V2k c67920V2k = this.A00;
        if (c67920V2k == null) {
            C14360o3.A0F("promoteAdToolsAdapter");
            throw C00O.createAndThrow();
        }
        recyclerView.setAdapter(c67920V2k);
        AbstractC31178DnM.A0z(this, recyclerView);
        AbstractC166987dD.A1Z(new MC3(this, (InterfaceC23621Ds) null, 47), AbstractC25229BEm.A0a(this));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1929378844);
        this.A00 = new C67920V2k(requireContext(), this);
        this.A02 = VRC.A00(AbstractC166987dD.A0r(this.A05));
        String string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string != null) {
            this.A01 = string;
        }
        super.onCreate(bundle);
        C0f9.A09(1823725451, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1577812047);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_ads_manager_view, false);
        C0f9.A09(-213492963, A02);
        return A0R;
    }
}
