package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collections;

/* renamed from: X.8Dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC183898Dp {
    public static final InterfaceC169517hR A01(Context context, AbstractC018607g abstractC018607g, UserSession userSession, String str, boolean z, boolean z2) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(abstractC018607g, 2);
        return A00(new C61972ry(context, abstractC018607g, null), userSession, str, z, z2);
    }

    public static final C169127gl A00(C61972ry c61972ry, final UserSession userSession, final String str, boolean z, final boolean z2) {
        return AbstractC169097gi.A00(null, userSession, c61972ry, new InterfaceC169327h6() { // from class: X.8Dq
            @Override // X.InterfaceC169327h6
            public final C1ON AN3(String str2) {
                return AbstractC35238FgX.A05(UserSession.this, "users/search/", str2, str, null, null, null, false, false, false, false, z2);
            }
        }, "coefficient_besties_list_ranking", Collections.singletonList(C17060sy.A01.A01(userSession)), z);
    }
}
