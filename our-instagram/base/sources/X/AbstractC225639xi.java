package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.9xi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225639xi {
    public static final Object A00(C6FQ c6fq) {
        UserSession userSession;
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (!(A0B instanceof UserSession) || (userSession = (UserSession) A0B) == null || !C180377zR.A05(userSession)) {
            return null;
        }
        CallerContext A01 = CallerContext.A01("BKBloksActionIgCrosspostingUpdateAutoCrosspostingDestinationImpl");
        C196058lv A00 = C196068lw.A00(userSession);
        C14360o3.A0A(A01);
        A00.A01(A01, null, "bloks");
        new C196188m9(userSession).A06("bloks", true);
        return null;
    }
}
