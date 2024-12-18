package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NQ0 extends N6E {
    public static final String __redex_internal_original_name = "UserPayBadgesMilestonesIntroFragment";

    @Override // X.N6E, X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2113250597);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.onboarding_intro_info_needed_layout, viewGroup, false);
        A04("impression", "what_you_need", __redex_internal_original_name, null);
        C14360o3.A0B(inflate, 0);
        ImageView A08 = AbstractC31171DnF.A08(inflate, R.id.header_icon);
        if (A08 != null) {
            A08.setImageResource(R.drawable.instagram_creator_experience_assets_badges_onboarding_qp_illustration_android);
        }
        View findViewById = inflate.findViewById(R.id.header_icon);
        if (findViewById != null) {
            AbstractC43592JPx.A1F(findViewById, 200);
            AbstractC43592JPx.A1G(findViewById, 200);
        }
        AbstractC166987dD.A0e(inflate, R.id.title).setText(AbstractC25227BEk.A0v(this, 2131976477));
        inflate.findViewById(R.id.description).setVisibility(8);
        N6E.A01(inflate.findViewById(R.id.item1), AbstractC25227BEk.A0v(this, 2131976472), getString(2131976471), R.drawable.instagram_badge_pano_outline_24);
        N6E.A01(inflate.findViewById(R.id.item2), AbstractC25227BEk.A0v(this, 2131976474), getString(2131976473), R.drawable.instagram_money_pano_outline_24);
        N6E.A01(inflate.findViewById(R.id.item3), AbstractC25227BEk.A0v(this, 2131976476), getString(2131976475), R.drawable.instagram_app_instagram_pano_outline_24);
        String A0v = AbstractC25227BEk.A0v(this, 2131969333);
        ((C64P) inflate.requireViewById(R.id.bottom_button_layout)).setPrimaryAction(A0v, new Ok6(A0v, this, 11));
        C0f9.A09(2049057113, A02);
        return inflate;
    }
}
