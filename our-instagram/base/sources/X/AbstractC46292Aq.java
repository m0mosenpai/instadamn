package X;

import android.content.Context;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.common.session.UserSession;

/* renamed from: X.2Aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC46292Aq {
    public static final IgSignalsCasper A00(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        if (!C18U.A06(C06090Tz.A06, userSession, 36329711017673207L)) {
            return null;
        }
        return (IgSignalsCasper) userSession.A01(IgSignalsCasper.class, new C9F8(43, context, userSession));
    }
}
