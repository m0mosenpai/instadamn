package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KBB extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ImmersiveAvatarEntrypointProfileBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC25225BEi.A0a(C50254MHj.A02(this, 13), C50254MHj.A02(this, 12), new MHV(33, (Object) null, this), AbstractC25225BEi.A1D(C31370Dqa.class));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "immersive_avatar_entrypoint_profile_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.row_icon);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.row_label);
        CompoundButton compoundButton = (CompoundButton) AbstractC166997dE.A0R(view, R.id.coin_flip_switch);
        AbstractC166997dE.A19(requireContext(), A0D, R.drawable.instagram_eye_pano_outline_24);
        AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), A0N, 2131953480);
        compoundButton.setChecked(requireArguments().getBoolean("coin_flip_enabled"));
        compoundButton.setOnCheckedChangeListener(new LRE(this, 4));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(163469071);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_immersive_home_profile_bottom_sheet_item, viewGroup, false);
        C0f9.A09(138718520, A02);
        return inflate;
    }
}
