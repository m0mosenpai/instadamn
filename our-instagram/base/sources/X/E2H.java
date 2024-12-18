package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* loaded from: classes6.dex */
public final class E2H extends C3OO {
    public final View A00;
    public final UserSession A01;
    public final IgdsBanner A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2H(View view, UserSession userSession) {
        super(view);
        C14360o3.A0B(userSession, 2);
        this.A00 = view;
        this.A01 = userSession;
        this.A02 = (IgdsBanner) AbstractC166997dE.A0R(view, R.id.direct_inbox_ads_event_sharing_notice_view_igds_banner);
    }
}
