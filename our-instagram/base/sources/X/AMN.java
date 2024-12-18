package X;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AMN {
    public static final AMN A00 = new Object();

    public static final void A00(UserSession userSession, float f) {
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(userSession));
        A0w.E7G("stories_swipe_up_iab_dwell", f);
        A0w.apply();
    }

    public static final boolean A01(Context context, MotionEvent motionEvent, MotionEvent motionEvent2) {
        double A0A = AbstractC13880nE.A0A(context);
        int i = (int) (0.7d * A0A);
        int i2 = (int) (A0A * 0.3d);
        if (AbstractC166987dD.A01(motionEvent.getRawY(), motionEvent2.getRawY()) > 0.0f && motionEvent.getRawX() > i2 && motionEvent.getRawX() < i) {
            return true;
        }
        return false;
    }

    public static final boolean A02(Context context, MotionEvent motionEvent, MotionEvent motionEvent2) {
        return AbstractC167007dF.A1O((AbstractC166987dD.A01(motionEvent.getRawY(), motionEvent2.getRawY()) > AbstractC13880nE.A04(context, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS) ? 1 : (AbstractC166987dD.A01(motionEvent.getRawY(), motionEvent2.getRawY()) == AbstractC13880nE.A04(context, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS) ? 0 : -1)));
    }

    public final float A03(UserSession userSession) {
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        if (!A0x.getBoolean("has_set_stories_swipe_up_iab_dwell", false)) {
            float A002 = new ABG(userSession).A00("4279");
            A00(userSession, A002);
            AbstractC167007dF.A17(A0x.ARD(), "has_set_stories_swipe_up_iab_dwell");
            return A002;
        }
        return (float) A0x.getLong("stories_swipe_up_iab_dwell", 0L);
    }

    public final float A04(UserSession userSession) {
        float f = (float) AbstractC166987dD.A0x(userSession).getLong("stories_swipe_up_iab_dwell", 0L);
        if (f < 150.0f) {
            float A002 = new ABG(userSession).A00("4279");
            if (A002 >= 150.0f) {
                A00(userSession, A002);
                return A002;
            }
        }
        return f;
    }
}
