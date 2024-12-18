package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6Xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140716Xz {
    public static final InterfaceC671131c A00(Context context, UserSession userSession, InterfaceC114805Gn interfaceC114805Gn, ReelViewerFragment reelViewerFragment) {
        InterfaceC671131c c140456Wz;
        if (C1P9.A00(userSession).booleanValue()) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36323715244305934L)) {
                c140456Wz = new C140786Yg(context, userSession, interfaceC114805Gn, reelViewerFragment, C18U.A06(c06090Tz, userSession, 36310538287841446L), C18U.A06(c06090Tz, userSession, 36317457476162739L));
                return c140456Wz;
            }
        }
        C06090Tz c06090Tz2 = C06090Tz.A05;
        c140456Wz = new C140456Wz(context, userSession, interfaceC114805Gn, reelViewerFragment, C18U.A06(c06090Tz2, userSession, 36310538287841446L), C18U.A06(c06090Tz2, userSession, 36317457476162739L));
        return c140456Wz;
    }
}
