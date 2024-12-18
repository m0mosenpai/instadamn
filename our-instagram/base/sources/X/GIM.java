package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIM implements C7K9 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C1P1 A01;
    public final /* synthetic */ UserSession A02;

    @Override // X.C7K9
    public final void onFail(AbstractC115105If abstractC115105If) {
    }

    public GIM(Activity activity, C1P1 c1p1, UserSession userSession) {
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = c1p1;
    }

    @Override // X.C7K9
    public final void onSuccess(User user) {
        AbstractC35271Fh6.A00(this.A00, null, this.A01, this.A02, null, null, user);
    }
}
