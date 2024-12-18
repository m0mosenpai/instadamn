package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9JC, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9JC {
    public static final long A00() {
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return TimeUnit.MILLISECONDS.toSeconds(calendar.getTimeInMillis() - timeInMillis);
    }

    public static final void A01(UserSession userSession, Context context, boolean z) {
        AbstractC167017dG.A1N(context, userSession);
        AbstractC191798eb.A01(context, new C191778eZ(userSession), "com.bloks.www.ig.pro_dash.entry_point.hypercard", null, AbstractC167017dG.A0r("params", AnonymousClass001.A0S("{\"server_params\":", AnonymousClass001.A0L("{\"is_badged\":", '}', z), '}')));
    }
}
