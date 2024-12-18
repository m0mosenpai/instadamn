package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* loaded from: classes6.dex */
public final class EKN extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "BroadcastChannelXpostingEducationBottomsheetFragment";
    public String A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "broadcast_channel_xposting_education_bottomsheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewOnClickListenerC35681FpG.A01(view.requireViewById(R.id.primary_button), 24, this);
        ViewOnClickListenerC35681FpG.A01(view.requireViewById(R.id.secondary_button), 25, this);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC31179DnN.A0x(this);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1757815146);
        super.onCreate(bundle);
        String string = requireArguments().getString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        if (string != null) {
            this.A00 = string;
            C0f9.A09(-786584251, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(970524016, A02);
            throw A0g;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(422803264);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.broadcast_channel_xposting_education_bottomsheet_fragment, false);
        C0f9.A09(-561066603, A02);
        return A0R;
    }
}
