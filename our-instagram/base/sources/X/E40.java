package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class E40 extends C3OO {
    public final View A00;
    public final ViewGroup A01;
    public final CheckBox A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final ImageView A05;
    public final LinearLayout A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final InterfaceC56392iX A0B;
    public final GradientSpinnerAvatarView A0C;

    public E40(Context context, FrameLayout frameLayout) {
        super(frameLayout);
        this.A03 = frameLayout;
        this.A06 = AbstractC31172DnG.A0B(frameLayout, R.id.user_row_background);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) frameLayout.requireViewById(R.id.row_user_imageview);
        this.A0C = gradientSpinnerAvatarView;
        this.A0B = AbstractC166997dE.A0X(frameLayout, R.id.row_users_faceswarm_stub);
        this.A01 = AbstractC31173DnH.A0F(frameLayout, R.id.row_user_info_layout);
        this.A09 = AbstractC166997dE.A0T(frameLayout, R.id.row_user_primary_name);
        this.A0A = AbstractC166997dE.A0T(frameLayout, R.id.row_user_secondary_name);
        this.A07 = AbstractC166997dE.A0T(frameLayout, R.id.row_user_context_line);
        CheckBox checkBox = (CheckBox) frameLayout.requireViewById(R.id.recipient_toggle);
        this.A02 = checkBox;
        checkBox.setBackground(C3LQ.A07(context, R.color.badge_color));
        AbstractC56952jT.A04(checkBox, C05F.A0C);
        this.A00 = frameLayout.requireViewById(R.id.shh_mode_indicator_placeholder);
        gradientSpinnerAvatarView.A02 = -0.03f;
        this.A05 = AbstractC31173DnH.A0I(frameLayout, R.id.recipient_typeahead_add);
        this.A04 = AbstractC31173DnH.A0I(frameLayout, R.id.recipient_chevron);
        this.A08 = AbstractC166997dE.A0T(frameLayout, R.id.row_search_debug_info);
    }
}
