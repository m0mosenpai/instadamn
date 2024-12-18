package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* loaded from: classes6.dex */
public final class FO7 {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final InterfaceC56392iX A04;
    public final InterfaceC56392iX A05;
    public final GradientSpinnerAvatarView A06;
    public final FollowButton A07;

    public FO7(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 1);
        this.A06 = AbstractC31176DnK.A0f(viewGroup, R.id.user_avatar);
        this.A01 = AbstractC167007dF.A0N(viewGroup, R.id.other_user_full_name_or_username);
        this.A02 = AbstractC167007dF.A0N(viewGroup, R.id.network_attribution);
        this.A04 = AbstractC31179DnN.A0M(viewGroup, R.id.thread_context_item_stub_0);
        this.A05 = AbstractC31179DnN.A0M(viewGroup, R.id.thread_context_item_stub_1);
        this.A00 = AbstractC31176DnK.A0C(viewGroup, R.id.null_state_shortcut_container);
        this.A03 = AbstractC167007dF.A0N(viewGroup, R.id.view_profile_button);
        this.A07 = (FollowButton) AbstractC166997dE.A0R(viewGroup, R.id.follow_button);
    }
}
