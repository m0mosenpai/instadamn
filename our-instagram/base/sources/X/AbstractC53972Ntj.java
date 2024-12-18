package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ntj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53972Ntj {
    public static final JIG A00(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, long j, boolean z, boolean z2) {
        JIG p2j;
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A13(userSession, interfaceC60442pS, str);
        if (z) {
            p2j = new MZ4(context, userSession, interfaceC60442pS, str, j, z2);
        } else {
            p2j = new P2J(context, userSession, interfaceC60442pS, str, j);
        }
        return p2j;
    }
}
