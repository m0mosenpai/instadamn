package X;

import android.content.Context;
import com.facebook.avatar.expresso.instagram.ExpressoImpl;
import com.instagram.common.session.UserSession;

/* renamed from: X.KsP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47130KsP {
    public static final ExpressoImpl A00(Context context, UserSession userSession) {
        UserSession userSession2 = AbstractC46489Khn.A01;
        if (userSession2 == null || !userSession.equals(userSession2)) {
            AbstractC46489Khn.A01 = userSession;
            AbstractC46489Khn.A00 = new ExpressoImpl(userSession, context);
        }
        ExpressoImpl expressoImpl = AbstractC46489Khn.A00;
        if (expressoImpl != null) {
            return expressoImpl;
        }
        throw AbstractC166997dE.A0g();
    }
}
