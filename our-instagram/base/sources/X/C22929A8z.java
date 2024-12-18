package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.A8z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22929A8z {
    public final Context A00;
    public final View A01;
    public final UserSession A02;
    public final A9X A03;

    public C22929A8z(Context context, View view, UserSession userSession) {
        C14360o3.A0B(view, 3);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = view;
        A9X a9x = new A9X(view);
        this.A03 = a9x;
        View view2 = a9x.A04;
        a9x.A03 = (FollowButton) view2.requireViewById(R.id.reachability_follow_button);
        a9x.A01 = (IgView) view2.requireViewById(R.id.reachability_follow_button_divider);
        a9x.A00 = (IgTextView) view2.requireViewById(R.id.reachability_footer_text);
        a9x.A02 = (IgdsBottomButtonLayout) view2.requireViewById(R.id.reachability_incoming_request_layout);
    }
}
