package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.JrK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44737JrK extends C3OO {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;
    public final RoundedCornerConstraintLayout A03;
    public final FollowButton A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44737JrK(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A03 = (RoundedCornerConstraintLayout) AbstractC166997dE.A0R(view, R.id.card);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.title_text);
        this.A00 = AbstractC25231BEo.A0d(view, R.id.subtitle_text);
        this.A02 = AbstractC31176DnK.A0U(view, R.id.profile_picture);
        this.A04 = (FollowButton) AbstractC166997dE.A0R(view, R.id.follow_button);
    }
}
