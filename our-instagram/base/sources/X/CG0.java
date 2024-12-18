package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class CG0 {
    public static final String A00(Context context, UserSession userSession, int i) {
        String string;
        if (C18U.A06(C06090Tz.A05, userSession, 36329376010486071L)) {
            string = context.getResources().getQuantityString(R.plurals.unified_feedback_replies_on_threads, i, AbstractC43744JWe.A00(context.getResources(), Integer.valueOf(i), null, false));
        } else {
            string = context.getString(2131976115);
        }
        C14360o3.A07(string);
        return string;
    }
}
