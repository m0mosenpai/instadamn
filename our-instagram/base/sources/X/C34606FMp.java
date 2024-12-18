package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.FMp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34606FMp {
    public final TextView A00;
    public final IgFrameLayout A01;
    public final GradientSpinnerAvatarView A02;
    public final View A03;
    public final View A04;

    public C34606FMp(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.frame_layout_wrapper);
        this.A04 = AbstractC166997dE.A0S(view, R.id.floating_send_container);
        this.A03 = AbstractC166997dE.A0S(view, R.id.send_button_pill_container);
        this.A00 = AbstractC167007dF.A0N(view, R.id.send_label);
        this.A02 = AbstractC31176DnK.A0f(view, R.id.avatar_image_view);
    }
}
