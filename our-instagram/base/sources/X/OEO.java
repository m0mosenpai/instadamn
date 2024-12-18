package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes9.dex */
public final class OEO {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final C55096Ob7 A05;
    public final GradientSpinnerAvatarView A06;

    public OEO(View view, UserSession userSession) {
        this.A00 = view;
        this.A01 = AbstractC31173DnH.A0I(view, R.id.add_to_fb_story_icon);
        this.A06 = (GradientSpinnerAvatarView) view.requireViewById(R.id.add_to_fb_profile_icon);
        this.A02 = AbstractC166997dE.A0T(view, R.id.add_to_fb_story_label);
        this.A03 = AbstractC166997dE.A0T(view, R.id.add_to_fb_story_target_name);
        this.A04 = AbstractC166997dE.A0T(view, R.id.add_to_fb_story_username);
        MSY.A0y(view, R.id.one_tap_button_view_stub);
        this.A05 = new C55096Ob7(view, userSession, C05F.A01);
    }
}
