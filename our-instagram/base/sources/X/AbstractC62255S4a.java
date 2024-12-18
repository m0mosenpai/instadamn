package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.S4a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62255S4a {
    public static final void A00(Activity activity, Context context, UserSession userSession, C2Fb c2Fb, User user, String str, String str2) {
        AbstractC37302Gc3.A1U(userSession, str);
        String B4s = user.A03.B4s();
        if (B4s != null && B4s.equals("Eventbrite")) {
            C63397SjR c63397SjR = new C63397SjR(activity, userSession, C2Fb.A2z, str, false);
            c63397SjR.A0E(user.getId());
            c63397SjR.A0O = AbstractC13670mt.A06("%s %s %s", "FBExtensions/0.1", "IGInstantExperience/0.1", "(autofill-enabled)");
            c63397SjR.A0S = str2;
            c63397SjR.A0A();
            return;
        }
        SK7 sk7 = SK7.A00;
        if (sk7 == null) {
            sk7 = new C60895RbA();
            SK7.A00 = sk7;
        }
        Intent instantExperiencesIntent = sk7.getInstantExperiencesIntent(context, user.getId(), userSession, str, "instagram", c2Fb, user.A03.B4q());
        if (instantExperiencesIntent == null) {
            return;
        }
        C12260kU.A08(activity, instantExperiencesIntent, 1001);
    }
}
