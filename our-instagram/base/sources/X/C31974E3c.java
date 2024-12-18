package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.E3c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31974E3c extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgSimpleImageView A03;
    public final IgdsButton A04;
    public final GradientSpinnerAvatarView A05;
    public final View A06;

    public C31974E3c(View view) {
        super(view);
        this.A06 = view;
        this.A00 = view;
        this.A05 = (GradientSpinnerAvatarView) AbstractC166987dD.A0c(view, R.id.row_user_imageview);
        this.A03 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.row_avatar_placeholder);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.row_user_primary_name);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.row_user_secondary_name);
        this.A04 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.row_direct_action_button);
    }
}
