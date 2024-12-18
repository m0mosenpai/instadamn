package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class FOO {
    public C34942FaS A00;
    public final View A01;
    public final ViewGroup A02;
    public final ViewGroup A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final C57012jc A07;
    public final C55096Ob7 A08;
    public final C43768JXh A09;
    public final GradientSpinnerAvatarView A0A;

    public FOO(View view, UserSession userSession, Integer num) {
        ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.row_user_container);
        this.A03 = A0F;
        this.A02 = AbstractC31173DnH.A0F(view, R.id.row_user_info_layout);
        this.A06 = AbstractC166997dE.A0T(view, R.id.row_user_username);
        this.A05 = AbstractC166997dE.A0T(view, R.id.row_user_info);
        this.A04 = AbstractC166997dE.A0T(view, R.id.user_social_context);
        this.A0A = (GradientSpinnerAvatarView) view.requireViewById(R.id.selectable_user_row_avatar);
        this.A01 = AbstractC167017dG.A0U(view, R.id.one_tap_button_view_stub);
        this.A08 = new C55096Ob7(A0F, userSession, num);
        this.A07 = new C57012jc((ViewStub) AbstractC31173DnH.A0D(A0F, R.id.shh_mode_indicator_stub));
        this.A09 = new C43768JXh(A0F.getContext());
    }
}
