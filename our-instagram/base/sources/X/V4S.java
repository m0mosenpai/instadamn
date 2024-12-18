package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;

/* loaded from: classes11.dex */
public final class V4S extends AbstractC65806TuP {
    public final /* synthetic */ C69339Vll A00;
    public final /* synthetic */ UserSession A01;

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        FollowButton followButton = new FollowButton(context, null, R.attr.updatableButtonStyle);
        followButton.setBaseStyle(EnumC77553df.A0C);
        return followButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V4S(C69339Vll c69339Vll, C6FG c6fg, C102884kP c102884kP, UserSession userSession) {
        super(c6fg, c102884kP);
        this.A00 = c69339Vll;
        this.A01 = userSession;
    }
}
