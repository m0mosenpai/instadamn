package X;

import android.app.Activity;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;

/* renamed from: X.PSz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57060PSz implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public RunnableC57060PSz(UserSession userSession, Activity activity, String str) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.A00;
        Resources resources = activity.getResources();
        UserSession userSession = this.A01;
        EI0 A00 = FXP.A00(userSession, this.A02);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC31172DnG.A1G(resources, A0y, 2131975091);
        AbstractC31173DnH.A0w(activity, A00, A0y);
    }
}
