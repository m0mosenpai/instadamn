package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

/* renamed from: X.RbA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60895RbA extends SK7 {
    public SK7 A00;

    @Override // X.SK7
    public final Intent getInstantExperiencesIntent(Context context, String str, UserSession userSession, String str2, String str3, C2Fb c2Fb, String str4) {
        C14360o3.A0B(context, 0);
        JQ0.A1O(str, userSession, str2, str3, c2Fb);
        SK7 sk7 = this.A00;
        if (sk7 != null) {
            return sk7.getInstantExperiencesIntent(context, str, userSession, str2, str3, c2Fb, str4);
        }
        return null;
    }

    public C60895RbA() {
        try {
            Object A0s = AbstractC58320PtC.A0s(Class.forName("com.instagram.business.instantexperiences.InstantExperiencesLibImpl"));
            C14360o3.A0C(A0s, "null cannot be cast to non-null type com.instagram.business.instantexperiences.intf.InstantExperiencesLib");
            this.A00 = (SK7) A0s;
        } catch (Exception e) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to initialize IXLib");
            C14360o3.A0A(formatStrLocaleSafe);
            C0w9.A06("InstantExperiencesWrapper", formatStrLocaleSafe, e);
        }
    }
}
