package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.W0s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70058W0s {
    public static final int[] A00 = AbstractC209259Nh.A02(EnumC209229Ne.A0A);

    public static final void A00(Activity activity, Fragment fragment, C22P c22p, UserSession userSession, UpcomingEvent upcomingEvent) {
        AbstractC167017dG.A1R(userSession, upcomingEvent);
        LBX.A01(activity, new C70856WiM(activity, fragment, c22p, userSession, upcomingEvent), C05F.A01, A00);
    }
}
