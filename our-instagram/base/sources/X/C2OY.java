package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;

/* renamed from: X.2OY, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2OY {
    public static final ClipsDraftLocalDataSource A00(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        return (ClipsDraftLocalDataSource) userSession.A01(ClipsDraftLocalDataSource.class, new C9F5(22, context, userSession));
    }
}
