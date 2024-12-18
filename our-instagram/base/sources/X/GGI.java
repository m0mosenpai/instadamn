package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;

/* loaded from: classes6.dex */
public final class GGI implements GYK {
    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167027dH.A12(context, userSession, fragmentActivity);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36312509673637016L) && !C18U.A06(c06090Tz, userSession, 36313501812983859L)) {
            if (C2TN.A00(userSession)) {
                DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(context, fragmentActivity.getSupportFragmentManager(), fragmentActivity, userSession);
                return;
            }
            C146106i8 A0Y = AbstractC31174DnI.A0Y();
            A0Y.A0H = "internal_settings_access_fail";
            A0Y.A0D = "Internal Settings are only accessible to employees and test accounts.";
            AbstractC25233BEq.A1F(A0Y);
            return;
        }
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        A0P.A0D(new AbstractC60672pq());
        A0P.A04();
    }
}
