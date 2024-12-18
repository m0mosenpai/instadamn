package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.feed.feeditem.SuggestedChannels;

/* loaded from: classes6.dex */
public final class EJ4 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AllSuggestedChannelsFragment";
    public C65092x7 A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131952903);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AbstractC166987dD.A0c(view, R.id.all_channels_recyler_view);
        AbstractC31178DnM.A0z(this, recyclerView);
        Context requireContext = requireContext();
        C65092x7 c65092x7 = this.A00;
        if (c65092x7 != null) {
            C31872Dze c31872Dze = new C31872Dze(requireContext, c65092x7);
            SuggestedChannels suggestedChannels = (SuggestedChannels) AbstractC153636vY.A00(requireArguments(), SuggestedChannels.class, "suggested_channels_key");
            C14360o3.A0B(suggestedChannels, 0);
            c31872Dze.A00 = suggestedChannels;
            recyclerView.setAdapter(c31872Dze);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(265525747);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.all_channels_fragment, viewGroup, false);
        C0f9.A09(-1681260696, A02);
        return inflate;
    }
}
