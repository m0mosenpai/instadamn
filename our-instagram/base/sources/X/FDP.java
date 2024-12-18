package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FDP {
    public static final void A00(Activity activity, Context context, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        if (C18U.A06(C06090Tz.A06, userSession, 36321443205621192L)) {
            C146106i8 A0K = AbstractC31171DnF.A0K();
            A0K.A0D = AbstractC167007dF.A0f(context, str, 2131972545);
            AbstractC31171DnF.A11(context, A0K, 2131972544);
            A0K.A0L = true;
            AbstractC31175DnJ.A0l(context, A0K, 2131972530);
            A0K.A0A(new C36516G8o(5, activity, context, userSession));
            AbstractC25233BEq.A1F(A0K);
            return;
        }
        C9GR.A07(context, 2131952099);
    }
}
