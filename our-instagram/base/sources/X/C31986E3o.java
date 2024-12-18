package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.E3o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31986E3o extends C3OO {
    public final IgImageView A00;
    public final IgImageView A01;
    public final IgImageView A02;
    public final IgdsPeopleCell A03;
    public final GradientSpinnerAvatarView A04;
    public final FollowButton A05;
    public final View A06;
    public final View A07;

    public C31986E3o(View view) {
        super(view);
        this.A07 = view;
        IgdsPeopleCell igdsPeopleCell = (IgdsPeopleCell) AbstractC166997dE.A0R(view, R.id.business_cell);
        this.A03 = igdsPeopleCell;
        this.A04 = AbstractC31176DnK.A0f(view, R.id.imageview);
        View A0A = AbstractC31176DnK.A0A(AbstractC25228BEl.A0P(this.itemView), igdsPeopleCell, R.layout.layout_follow_button_event);
        this.A06 = A0A;
        this.A05 = (FollowButton) AbstractC166997dE.A0R(A0A, R.id.row_follow_button);
        this.A00 = AbstractC167007dF.A0T(view, R.id.business_media_preview_1);
        this.A01 = AbstractC167007dF.A0T(view, R.id.business_media_preview_2);
        this.A02 = AbstractC167007dF.A0T(view, R.id.business_media_preview_3);
    }
}
