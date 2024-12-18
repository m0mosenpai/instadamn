package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.5xX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131975xX {
    public static final C131965xW A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C131965xW) userSession.A01(C131965xW.class, new C206959Ea(userSession, 31));
    }

    public final synchronized void A03(UserSession userSession, Context context, String str) {
        String str2;
        String A05;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        C196058lv A00 = C196068lw.A00(userSession);
        CallerContext callerContext = C131965xW.A04;
        C131995xZ A002 = A00.A00(callerContext);
        if (C196068lw.A03(A002) && ((str2 = A002.A04) == null || str2.length() == 0 || (A05 = A00(userSession).A05(context, userSession)) == null || A05.length() == 0)) {
            if (C18U.A06(C06090Tz.A05, userSession, 36326876339255469L)) {
                C196068lw.A00(userSession).A02(callerContext, new P1M(userSession), str, false);
            } else {
                C196068lw.A00(userSession).A01(callerContext, new P1N(userSession), str);
            }
        }
    }

    public static final boolean A02(C130135uJ c130135uJ) {
        EnumC130125uI enumC130125uI = c130135uJ.A01;
        if (enumC130125uI != EnumC130125uI.MATCHED && enumC130125uI != EnumC130125uI.SHRINKING) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        Integer num = C196068lw.A00(userSession).A00(C131965xW.A04).A02;
        if (num != C05F.A01 && num != C05F.A0C) {
            return false;
        }
        return true;
    }
}
