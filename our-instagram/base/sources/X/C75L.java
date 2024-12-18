package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

/* renamed from: X.75L, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75L {
    public static final ClipsDraftRepository A00(Activity activity, UserSession userSession) {
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(userSession, 1);
        return (ClipsDraftRepository) userSession.A01(ClipsDraftRepository.class, new C9F5(19, activity, userSession));
    }
}
