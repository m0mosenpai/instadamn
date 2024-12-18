package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* renamed from: X.KoQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46883KoQ {
    public static final void A00(Context context, UserSession userSession, C27741Wc c27741Wc, String str, String str2) {
        c27741Wc.A04(userSession, str2, str);
        if (!AbstractC53742Npu.A00()) {
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }
}
