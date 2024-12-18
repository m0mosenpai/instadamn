package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;

/* renamed from: X.Br4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26723Br4 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SchoolChannelsCreationNuxFragment";
    public InterfaceC16820sZ A00;
    public final String A02 = __redex_internal_original_name;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((ComposeView) view.requireViewById(R.id.school_channel_creation_nux_compose_view)).setContent(C5UA.A03(new C30190DRv(this, 24), -959397580));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2106264444);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_school_channels_creation_nux_fragment, false);
        C0f9.A09(1137079688, A02);
        return A0R;
    }
}
