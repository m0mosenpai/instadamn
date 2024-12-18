package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.8t4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC200008t4 {
    public static final String A00(Context context, UserSession userSession, C131995xZ c131995xZ) {
        int i;
        C14360o3.A0B(userSession, 1);
        if (context == null) {
            return null;
        }
        if (!C196068lw.A02(c131995xZ)) {
            String str = AbstractC132005xa.A00(userSession).A00;
            boolean z = AbstractC132005xa.A00(userSession).A01;
            if (str == null) {
                return null;
            }
            int hashCode = str.hashCode();
            if (hashCode != -1924094359) {
                if (hashCode != 117888373) {
                    if (hashCode != 1999208305 || !str.equals("CUSTOM")) {
                        return null;
                    }
                    i = 2131957273;
                } else {
                    if (!str.equals("FRIENDS")) {
                        return null;
                    }
                    i = 2131957274;
                    if (z) {
                        i = 2131957275;
                    }
                }
                return context.getString(i);
            }
            if (!str.equals("PUBLIC")) {
                return null;
            }
        }
        i = 2131957276;
        return context.getString(i);
    }

    public static final boolean A01(Context context, CallerContext callerContext, UserSession userSession) {
        String A00;
        C14360o3.A0B(userSession, 1);
        C131995xZ A002 = C196068lw.A00(userSession).A00(callerContext);
        if (C196068lw.A03(A002)) {
            if (A002.A04.length() == 0 || (A00 = A00(context, userSession, A002)) == null || A00.length() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
