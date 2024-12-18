package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.NwR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54129NwR {
    public static final void A00(Context context, UserSession userSession, C105814ps c105814ps, Reel reel) {
        String str;
        OMa A00 = AbstractC54126NwO.A00(userSession);
        C47Z c47z = c105814ps.A00;
        C14360o3.A07(c47z);
        C40121td A01 = C40121td.A0G.A01(context, userSession);
        if (C18U.A06(C06090Tz.A06, userSession, 36318913470077711L)) {
            str = "user_action_user_initiated_story_upload_cancel";
        } else {
            str = null;
        }
        if (c47z.A4w) {
            if (reel == null) {
                C0w9.A03("ReelOptimisticStateDeletionHelper#deleteOptimisticState", "Param reel is null for deletion of multiconfig pending media upload.");
            }
            C55804OqF c55804OqF = C55804OqF.A00;
            C14360o3.A0B(c55804OqF, 0);
            synchronized (c47z.A6H) {
                c47z.A0S(c55804OqF, InterfaceC40171tl.class);
            }
            if (!c47z.A0r()) {
                A01.A0K(c47z.A35, str, false, false, false);
            }
            C25A.A00(userSession).A0A();
        } else {
            A01.A0K(c47z.A35, str, false, true, false);
        }
        A00.A01.flowEndSuccess(A00.A00);
    }
}
