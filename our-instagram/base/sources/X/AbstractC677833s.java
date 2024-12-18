package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.33s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC677833s {
    public static final InterfaceC678133v A00(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C677733r c677733r, String str, boolean z) {
        return A01(context, userSession, interfaceC60442pS, c677733r, str, false, z, false, false);
    }

    public static final InterfaceC678133v A01(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C677733r c677733r, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        if (z2) {
            return new C678033u(context, userSession, interfaceC60442pS, c677733r, new C677933t(interfaceC60442pS, userSession, "MusicPlayerV2", str, z), z3, z4);
        }
        return new C150296pd(context, userSession, interfaceC60442pS, c677733r, new C677933t(interfaceC60442pS, userSession, "MusicPlayer", str, z), z3);
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36325123992597231L);
    }
}
