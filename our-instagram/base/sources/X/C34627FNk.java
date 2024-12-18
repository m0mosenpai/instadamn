package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.FNk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34627FNk {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final GradientSpinnerAvatarView A04;
    public final StackedAvatarView A05;

    public C34627FNk(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC31176DnK.A0C(view, R.id.container);
        this.A02 = AbstractC31178DnM.A0C(view);
        this.A01 = AbstractC167007dF.A0N(view, R.id.subtitle);
        this.A03 = AbstractC31176DnK.A0U(view, R.id.follower_group_icon);
        this.A05 = (StackedAvatarView) AbstractC166997dE.A0R(view, R.id.stacked_avatar_view);
        this.A04 = AbstractC31176DnK.A0f(view, R.id.single_avatar_view);
    }
}
