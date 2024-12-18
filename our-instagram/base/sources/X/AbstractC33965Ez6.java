package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;

/* renamed from: X.Ez6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33965Ez6 {
    public static final Object A00(C6FQ c6fq) {
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, A0S, 36312509673637016L) && !C18U.A06(c06090Tz, A0S, 36313501812983859L)) {
            if (C2TN.A00(A0S)) {
                DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(A04, C6BQ.A05(c6fq), A04, A0S);
            }
            return null;
        }
        C140966Yy A0P = AbstractC31173DnH.A0P(A04, A0S);
        A0P.A0B(null, new AbstractC60672pq());
        A0P.A04();
        return null;
    }
}
