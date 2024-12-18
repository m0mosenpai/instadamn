package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.34F, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C34F {
    public static final C34J A00(Context context, UserSession userSession, C30W c30w, InterfaceC60442pS interfaceC60442pS, AbstractC61692rW abstractC61692rW, C34E c34e) {
        if (C18U.A06(C06090Tz.A05, userSession, 36326330878408520L) && !C34G.A00) {
            C34H.A00.put(C34I.A00(C05F.A0j), "0");
        }
        C1BX c1bx = AbstractC62712tA.A00(userSession).A00.A00;
        C14360o3.A07(c1bx);
        return new C34J(context, c1bx, userSession, c30w, interfaceC60442pS, abstractC61692rW, c34e);
    }
}
