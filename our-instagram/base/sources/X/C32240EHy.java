package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.EHy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32240EHy extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ClipsDraftsAndTrialsBottomSheetFragment";
    public InterfaceC16820sZ A00;
    public InterfaceC16820sZ A01;
    public final String A03 = __redex_internal_original_name;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.drafts);
        if (findViewById != null) {
            ((ImageView) AbstractC166987dD.A0c(findViewById, R.id.menu_option_icon)).setImageResource(R.drawable.instagram_draft_pano_outline_24);
            AbstractC25230BEn.A0Q(findViewById, R.id.menu_option_text).setText(2131961174);
            ViewOnClickListenerC35682FpH.A01(findViewById, 12, this);
        }
        View findViewById2 = view.findViewById(R.id.trials);
        if (findViewById2 != null) {
            ((ImageView) AbstractC166987dD.A0c(findViewById2, R.id.menu_option_icon)).setImageResource(R.drawable.instagram_trial_reel_pano_outline_24);
            AbstractC25230BEn.A0Q(findViewById2, R.id.menu_option_text).setText(2131975748);
            ViewOnClickListenerC35682FpH.A01(findViewById2, 13, this);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1387682561);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_drafts_and_trials_bottomsheet, viewGroup, false);
        C0f9.A09(-495088051, A02);
        return inflate;
    }
}
