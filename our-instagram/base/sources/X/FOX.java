package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.follow.chaining.FollowChainingButton;
import com.instagram.user.follow.FollowButton;

/* loaded from: classes6.dex */
public final class FOX {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ViewGroup A04;
    public final ViewStub A05;
    public final ViewStub A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final FollowChainingButton A0B;
    public final FollowButton A0C;
    public final View A0D;
    public final ViewStub A0E;

    public FOX(View view) {
        this.A03 = view;
        this.A0D = view.requireViewById(R.id.profile_scoreboard_header);
        this.A02 = view.requireViewById(R.id.row_profile_header_container_photos);
        this.A0A = AbstractC166997dE.A0T(view, R.id.row_profile_header_textview_photos_count);
        this.A00 = view.requireViewById(R.id.row_profile_header_container_followers);
        this.A08 = AbstractC166997dE.A0T(view, R.id.row_profile_header_textview_followers_count);
        this.A01 = view.requireViewById(R.id.row_profile_header_container_following);
        this.A09 = AbstractC166997dE.A0T(view, R.id.row_profile_header_textview_following_count);
        FollowButton followButton = (FollowButton) view.requireViewById(R.id.row_profile_header_button_follow);
        this.A0C = followButton;
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
        viewOnAttachStateChangeListenerC110564yT.A0H = "user_profile_header";
        viewOnAttachStateChangeListenerC110564yT.A0J = null;
        viewOnAttachStateChangeListenerC110564yT.A0I = null;
        viewOnAttachStateChangeListenerC110564yT.A06 = null;
        this.A0B = (FollowChainingButton) view.requireViewById(R.id.row_profile_header_button_chaining);
        this.A07 = AbstractC166997dE.A0T(view, R.id.row_profile_header_edit_profile);
        this.A05 = AbstractC31173DnH.A0G(view, R.id.row_profile_header_direct_message_stub);
        ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.similar_accounts_container);
        this.A04 = A0F;
        A0F.setVisibility(8);
        this.A06 = AbstractC31173DnH.A0G(view, R.id.row_profile_header_no_user_stub);
        this.A0E = AbstractC31173DnH.A0G(view, R.id.row_profile_header_promote_stub);
    }
}
