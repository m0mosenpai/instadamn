package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.FbM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34990FbM {
    public static final C34990FbM A00 = new Object();

    public final C1FE A00(UserSession userSession) {
        Context context = C1L4.A00;
        String A0R = AnonymousClass001.A0R(userSession.userId, "_multiple_account_info");
        Map map = C1FE.A09;
        return new C1FF(context, A0R).A00();
    }
}
