package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class E3O extends C3OO {
    public final C34439FGd A00;
    public final IgdsButton A01;
    public final StackedAvatarView A02;
    public final UserSession A03;
    public final User A04;

    public E3O(View view, UserSession userSession, C34439FGd c34439FGd, User user) {
        super(view);
        this.A03 = userSession;
        this.A04 = user;
        this.A00 = c34439FGd;
        this.A02 = (StackedAvatarView) AbstractC166997dE.A0R(view, R.id.find_more_card_avatar_view);
        this.A01 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.find_more_card_see_all_button);
    }
}
