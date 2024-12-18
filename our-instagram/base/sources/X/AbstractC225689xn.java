package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.9xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225689xn {
    public static final Object A00(C6FQ c6fq) {
        UserSession userSession;
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (!(A0B instanceof UserSession) || (userSession = (UserSession) A0B) == null) {
            return null;
        }
        CallerContext A01 = CallerContext.A01("BKBloksActionRefreshCreatorLocalCacheImpl");
        C196058lv A00 = C196068lw.A00(userSession);
        C14360o3.A0A(A01);
        A00.A01(A01, null, "bloks");
        new C196188m9(userSession).A06("bloks", false);
        EnumC222416a A012 = AbstractC08690cX.A01(userSession);
        if (A012 == EnumC222416a.A06 || ((A012 == EnumC222416a.A05 && C18U.A06(C06090Tz.A05, userSession, 36326721720432689L)) || (AbstractC196078lx.A01(userSession) && C18U.A06(C06090Tz.A05, userSession, 36326721720432689L)))) {
            new C196348mQ(userSession).A00("bloks");
        }
        return null;
    }
}
