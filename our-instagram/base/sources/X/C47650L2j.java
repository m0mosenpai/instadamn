package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.L2j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47650L2j {
    public final Activity A00;
    public final View A01;
    public final UserSession A02;
    public final LGr A03;

    public C47650L2j(Activity activity, View view, UserSession userSession) {
        this.A01 = view;
        this.A02 = userSession;
        this.A00 = activity;
        this.A03 = new LGr(view, userSession);
    }
}
