package X;

import android.app.Activity;
import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.6xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154926xh {
    public final Activity A00;
    public final Handler A01;
    public final UserSession A02;

    public C154926xh(Activity activity, Handler handler, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(handler, 3);
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = handler;
    }
}
