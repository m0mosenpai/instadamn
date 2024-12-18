package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Ed4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32862Ed4 extends AbstractC35044FcH {
    public final Context A00;
    public final UserSession A01;
    public final User A02;

    public C32862Ed4(Context context, UserSession userSession, C2EY c2ey, User user, int i, int i2) {
        super(c2ey, user, "follow", i, i2);
        this.A02 = user;
        this.A01 = userSession;
        this.A00 = context;
    }

    public static final void A00(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, C64770TTe c64770TTe, C32862Ed4 c32862Ed4) {
        int i;
        int i2;
        C57582kX A00 = C57582kX.A00(c32862Ed4.A01);
        User user = c32862Ed4.A02;
        FollowStatus A0N = A00.A0N(user);
        int ordinal = A0N.ordinal();
        if (ordinal != 4) {
            i = R.drawable.instagram_user_requested_pano_outline_24;
            if (ordinal != 5) {
                i = R.drawable.instagram_user_follow_pano_outline_24;
            }
        } else {
            i = R.drawable.instagram_user_following_pano_outline_24;
        }
        interfaceC74953Yl2.Egh(Integer.valueOf(i));
        if (ordinal != 4) {
            i2 = 2131960446;
            if (ordinal != 5) {
                i2 = 2131960442;
            }
        } else {
            i2 = 2131960443;
        }
        interfaceC74953Yl.Egh(Integer.valueOf(i2));
        if (A0N == FollowStatus.A06 && AbstractC31177DnL.A1b(user.A0J())) {
            Map map = C0YZ.A03;
            String A01 = AbstractC13230m9.A01(C32853Ecv.class);
            if (A01 == null) {
                A01 = "";
            }
            c64770TTe.put(A01, AbstractC166997dE.A0a());
        }
    }
}
