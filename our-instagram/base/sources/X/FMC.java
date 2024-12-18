package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FMC {
    public final Activity A00;
    public final UserSession A01;
    public final C3BL A02;
    public final Integer A03;

    public FMC(Activity activity, UserSession userSession, Integer num) {
        AbstractC167017dG.A1P(userSession, activity);
        this.A01 = userSession;
        this.A00 = activity;
        this.A03 = num;
        this.A02 = new C3BL(userSession);
    }
}
