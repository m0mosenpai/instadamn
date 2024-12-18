package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Exx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33895Exx {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        UserSession userSession;
        EnumC31512Dsw enumC31512Dsw;
        Object obj = c6fw.A00.get(0);
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            AbstractC12990ll A0A = C6BQ.A0A(C6BQ.A09(c6fq));
            if (!(A0A instanceof UserSession) || (userSession = (UserSession) A0A) == null) {
                return null;
            }
            if (str != null && str.equals("permissions_accept_invite")) {
                enumC31512Dsw = EnumC31512Dsw.A08;
            } else {
                enumC31512Dsw = EnumC31512Dsw.A0E;
            }
            C31518Dt2.A02(context, enumC31512Dsw, userSession, null);
        }
        return null;
    }
}
