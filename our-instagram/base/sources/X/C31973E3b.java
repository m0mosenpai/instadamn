package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.E3b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31973E3b extends C3OO {
    public final View A00;
    public final ViewStub A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final CircularImageView A05;
    public final GradientSpinnerAvatarView A06;

    public C31973E3b(View view) {
        super(view);
        this.A00 = AbstractC166997dE.A0S(view, R.id.row_container);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.row_title);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.row_subtitle);
        this.A02 = AbstractC31176DnK.A0T(view, R.id.cta_icon);
        this.A01 = AbstractC167007dF.A0M(view, R.id.one_tap_button_view_stub);
        this.A05 = AbstractC31176DnK.A0U(view, R.id.avatar_image_view);
        this.A06 = AbstractC31176DnK.A0f(view, R.id.avatar_fb_profile_image_view);
    }
}
