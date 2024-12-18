package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.8hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC193608hg {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.8hj, java.lang.Object] */
    public static final ClipsDraftRepository A00(Activity activity, UserSession userSession) {
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(userSession, 1);
        Application application = activity.getApplication();
        C14360o3.A07(application);
        ClipsDraftLocalDataSource A00 = C2OY.A00(application, userSession);
        Context applicationContext = activity.getApplicationContext();
        C14360o3.A0A(applicationContext);
        C14360o3.A0B(applicationContext, 0);
        C49602Pt A002 = C2Ps.A00(applicationContext, userSession);
        PendingMediaStore A003 = C25A.A00(userSession);
        C193618hh A004 = AbstractC50653MXt.A00(applicationContext, userSession);
        C193628hi c193628hi = new C193628hi(C25A.A00(userSession));
        return new ClipsDraftRepository(applicationContext, userSession, new Object(), c193628hi, A004, A00, A003, A002, AbstractC23021Ah.A00(userSession), C18U.A06(C06090Tz.A05, userSession, 36324020186328911L));
    }
}
