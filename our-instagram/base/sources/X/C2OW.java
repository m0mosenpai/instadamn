package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;

/* renamed from: X.2OW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2OW {
    public final ClipsDraftPreviewItemRepository A00(Application application, UserSession userSession) {
        C14360o3.A0B(application, 0);
        C14360o3.A0B(userSession, 1);
        Context applicationContext = application.getApplicationContext();
        C14360o3.A07(applicationContext);
        return (ClipsDraftPreviewItemRepository) userSession.A01(ClipsDraftPreviewItemRepository.class, new C9F5(21, applicationContext, userSession));
    }

    public final ClipsDraftPreviewItemRepository A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Context applicationContext = userSession.deviceSession.A06().getApplicationContext();
        C14360o3.A07(applicationContext);
        return (ClipsDraftPreviewItemRepository) userSession.A01(ClipsDraftPreviewItemRepository.class, new C9F5(21, applicationContext, userSession));
    }
}
