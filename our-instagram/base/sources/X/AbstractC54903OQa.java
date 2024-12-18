package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.OQa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54903OQa {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final int A00(UserSession userSession, EnumC142806cg enumC142806cg, C3PO c3po, Boolean bool, boolean z) {
        boolean A06;
        if (c3po != null) {
            switch (c3po.ordinal()) {
                case -1:
                case 0:
                case 4:
                case 5:
                    break;
                case 1:
                    return R.drawable.live_practice_label_background;
                case 2:
                    return R.drawable.live_subscribers_label_background;
                case 3:
                    AbstractC109224vo.A06(userSession, enumC142806cg, false, z);
                    if (bool != null) {
                        A06 = bool.booleanValue();
                    } else {
                        A06 = AbstractC109224vo.A06(userSession, enumC142806cg, false, z);
                    }
                    if (!A06) {
                        return R.drawable.live_close_friends_label_background;
                    }
                    break;
                case 6:
                    return R.drawable.live_internal_label_background;
                default:
                    throw B4Z.A00();
            }
        }
        return R.drawable.live_label_background;
    }

    public static final int A01(C3PO c3po) {
        if (c3po != null) {
            switch (c3po.ordinal()) {
                case -1:
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                    return 2131965425;
                case 1:
                    return 2131965460;
                case 6:
                    return 2131965410;
                default:
                    throw B4Z.A00();
            }
        }
        return 2131965425;
    }
}
