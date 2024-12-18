package X;

import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes9.dex */
public final class OFL {
    public final LinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final InterfaceC56392iX A04;
    public final InterfaceC56392iX A05;
    public final InterfaceC56392iX A06;
    public final InterfaceC56392iX A07;
    public final IgdsButton A08;
    public final GradientSpinnerAvatarView A09;

    public OFL(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = (LinearLayout) view;
        this.A05 = AbstractC166997dE.A0X(view, R.id.icon);
        this.A09 = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(view, R.id.fb_profile_avatar);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.title);
        InterfaceC56392iX A0X = AbstractC166997dE.A0X(view, R.id.subtitle);
        this.A07 = A0X;
        this.A02 = AbstractC25231BEo.A0d(A0X.getView(), R.id.subtitle);
        this.A06 = AbstractC166997dE.A0X(view, R.id.share_button_group);
        this.A04 = AbstractC166997dE.A0X(view, R.id.auto_share_buttons);
        this.A08 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.share_button_evergreen);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.shared_button_evergreen);
    }
}
