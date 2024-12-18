package X;

import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.follow.FollowButton;

/* loaded from: classes6.dex */
public final class E3I extends C3OO {
    public final View A00;
    public final IgdsPeopleCell A01;
    public final FollowButton A02;
    public final View A03;
    public final View A04;

    public E3I(View view) {
        super(view);
        this.A04 = view;
        IgdsPeopleCell igdsPeopleCell = (IgdsPeopleCell) AbstractC166997dE.A0R(view, R.id.people_cell);
        this.A01 = igdsPeopleCell;
        View A0A = AbstractC31176DnK.A0A(AbstractC25228BEl.A0P(this.itemView), igdsPeopleCell, R.layout.follow_button_medium);
        this.A03 = A0A;
        this.A02 = (FollowButton) AbstractC166997dE.A0R(A0A, R.id.row_follow_button);
        this.A00 = AbstractC166997dE.A0S(view, R.id.hide_button);
        igdsPeopleCell.setPadding(igdsPeopleCell.getPaddingLeft(), igdsPeopleCell.getPaddingTop(), igdsPeopleCell.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material), igdsPeopleCell.getPaddingBottom());
    }
}
