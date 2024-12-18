package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandlers.followermilestone.IgFollowerShareToStoryUrlHandlerActivity;

/* loaded from: classes6.dex */
public final class G0L implements C3Se {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ IgFollowerShareToStoryUrlHandlerActivity A02;

    public G0L(Bundle bundle, UserSession userSession, IgFollowerShareToStoryUrlHandlerActivity igFollowerShareToStoryUrlHandlerActivity) {
        this.A02 = igFollowerShareToStoryUrlHandlerActivity;
        this.A01 = userSession;
        this.A00 = bundle;
    }

    @Override // X.C3Se
    public final void CzZ(Bitmap bitmap) {
        IgFollowerShareToStoryUrlHandlerActivity igFollowerShareToStoryUrlHandlerActivity = this.A02;
        UserSession userSession = this.A01;
        Bundle bundle = this.A00;
        C14360o3.A0A(bitmap);
        IgFollowerShareToStoryUrlHandlerActivity.A00(bitmap, bundle, userSession, igFollowerShareToStoryUrlHandlerActivity);
    }
}
