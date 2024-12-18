package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.follow.FollowButton;

/* loaded from: classes5.dex */
public final class C5Q extends AbstractC25917BdK {
    public final IgdsPeopleCell A00;
    public final FollowButton A01;
    public final /* synthetic */ C25898Bcz A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5Q(View view, C25898Bcz c25898Bcz) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A02 = c25898Bcz;
        IgdsPeopleCell igdsPeopleCell = (IgdsPeopleCell) view;
        this.A00 = igdsPeopleCell;
        View inflate = AbstractC25228BEl.A0P(this.itemView).inflate(R.layout.follow_button_medium, (ViewGroup) igdsPeopleCell, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(2801));
        FollowButton followButton = (FollowButton) inflate;
        this.A01 = followButton;
        followButton.setBaseStyle(EnumC77553df.A0C);
    }
}
