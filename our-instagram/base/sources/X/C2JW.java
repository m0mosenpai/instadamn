package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2JW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2JW {
    public static final C107224sT A00(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C2JV c2jv = (C2JV) userSession.A01(C2JV.class, new C57251PbZ(49, context, userSession));
        Object value = c2jv.A06.getValue();
        C14360o3.A07(value);
        if (!((Boolean) value).booleanValue()) {
            return null;
        }
        return (C107224sT) userSession.A01(C107224sT.class, new C9FM(23, context, userSession, c2jv));
    }
}
