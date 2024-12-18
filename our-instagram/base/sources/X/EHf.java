package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class EHf extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AiAgentAccessRequestedFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC33519Ers enumC33519Ers;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Resources A0N = AbstractC166997dE.A0N(this);
        C64P c64p = (C64P) view.findViewById(R.id.access_requested_bottom_button_layout);
        Serializable serializable = requireArguments().getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (!(serializable instanceof EnumC33519Ers) || (enumC33519Ers = (EnumC33519Ers) serializable) == null) {
            enumC33519Ers = EnumC33519Ers.A0J;
        }
        c64p.setPrimaryAction(A0N.getString(2131968948), new ViewOnClickListenerC35683FpI(enumC33519Ers, this, 38));
        c64p.setSecondaryAction(A0N.getString(2131965052), new ViewOnClickListenerC35683FpI(enumC33519Ers, this, 39));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1360958276);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_ai_agent_access_requested, false);
        C0f9.A09(-316584025, A02);
        return A0R;
    }
}
