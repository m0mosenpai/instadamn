package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.model.FBReelsAudienceType;

/* loaded from: classes9.dex */
public final class OGZ {
    public final C82H A00(Context context, C82G c82g, UserSession userSession, boolean z) {
        String str;
        Integer A00 = AbstractC197848ov.A00(c82g);
        if (z) {
            if (context != null) {
                C196058lv A002 = C196068lw.A00(userSession);
                CallerContext callerContext = NVm.A01;
                C131995xZ A003 = A002.A00(callerContext);
                C131975xX c131975xX = C131965xW.A05;
                String A05 = C131975xX.A00(userSession).A05(context, userSession);
                String A004 = AbstractC200008t4.A00(context, userSession, A003);
                C51624MrH A01 = C200108tF.A01(callerContext, userSession);
                if (C196068lw.A02(A003) && C18U.A06(C06090Tz.A05, userSession, 36330587191002022L)) {
                    str = context.getString(2131973765);
                } else if (A01 != null) {
                    str = A01.A02;
                } else {
                    str = null;
                }
                boolean z2 = true;
                if (A05 == null || A004 == null || str == null || A01 == null || A01.A01 == FBReelsAudienceType.A07) {
                    z2 = false;
                }
                if (C18U.A06(C06090Tz.A05, userSession, 36321743853332267L)) {
                    if (!z2) {
                        C82H c82h = C82H.A0P;
                        EnumC201098ur enumC201098ur = EnumC201098ur.SUPPRESS;
                        C82I A0H = MSW.A0H();
                        A0H.A06("suppress_reason", "invalid_fb_audiences");
                        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
                    } else {
                        return C82H.A0P;
                    }
                }
            }
        } else {
            if (A00 == C05F.A00) {
                return C82H.A0M;
            }
            if (A00 == C05F.A01) {
                return C82H.A09;
            }
        }
        return C82H.A0O;
    }
}
