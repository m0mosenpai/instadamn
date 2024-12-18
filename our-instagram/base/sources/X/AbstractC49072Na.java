package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.2Na, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC49072Na {
    public static final C2NX A00(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        return (C2NX) userSession.A01(C2NX.class, new C9FL(16, context.getApplicationContext(), new WeakReference(context), userSession));
    }
}
