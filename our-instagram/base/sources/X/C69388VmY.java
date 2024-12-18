package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.VmY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69388VmY {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final CircularImageView A05;
    public final FollowButton A06;

    public C69388VmY(View view) {
        this.A00 = view;
        this.A05 = (CircularImageView) view.requireViewById(R.id.row_user_imageview);
        TextView textView = (TextView) view.requireViewById(R.id.row_user_username);
        this.A04 = textView;
        textView.getPaint().setFakeBoldText(true);
        this.A03 = (TextView) view.requireViewById(R.id.row_user_subtitle);
        this.A02 = (TextView) view.requireViewById(R.id.row_user_social_context);
        TextView textView2 = (TextView) view.requireViewById(R.id.row_requested_user_accept);
        this.A01 = textView2;
        AbstractC37300Gc1.A0d(textView2, true);
        this.A06 = (FollowButton) view.requireViewById(R.id.row_requested_user_follow_button_large);
    }
}
