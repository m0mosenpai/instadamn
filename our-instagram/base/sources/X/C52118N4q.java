package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.N4q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52118N4q extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PromoteEditCaptionGuidanceBottomSheet";
    public boolean A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_edit_caption_guidance_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.promote_edit_caption_guidance_bottom_sheet);
        AbstractC25227BEk.A12(AbstractC167007dF.A0N(A0S, R.id.bottom_sheet_title), this, 2131970849);
        boolean z = this.A00;
        int i = 2131970848;
        int i2 = 2131970847;
        int i3 = R.drawable.instagram_users_pano_outline_24;
        if (z) {
            i = 2131970846;
            i2 = 2131970845;
            i3 = R.drawable.instagram_app_imessage_pano_outline_24;
        }
        A00(A0S, R.id.ask_to_take_action_tip, i, i2, i3);
        A00(A0S, R.id.include_key_info_tip, 2131970854, 2131970853, R.drawable.instagram_key_pano_outline_24);
        A00(A0S, R.id.keep_it_simple_tip, 2131970856, 2131970855, R.drawable.instagram_circle_check_pano_outline_24);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public static final void A00(View view, int i, int i2, int i3, int i4) {
        View A0S = AbstractC166997dE.A0S(view, i);
        AbstractC166987dD.A0e(A0S, R.id.primary_text).setText(i2);
        AbstractC166987dD.A0e(A0S, R.id.secondary_text).setText(i3);
        AbstractC31171DnF.A08(A0S, R.id.row_icon).setImageResource(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1984459809);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        boolean z = true;
        if (bundle2 == null || !bundle2.getBoolean("ARGUMENT_IS_MESSAGING_ADS_SELECTED", false)) {
            z = false;
        }
        this.A00 = z;
        C0f9.A09(-536325345, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2006960844);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_edit_caption_guidance_bottom_sheet, viewGroup, false);
        C0f9.A09(923442750, A02);
        return inflate;
    }
}
