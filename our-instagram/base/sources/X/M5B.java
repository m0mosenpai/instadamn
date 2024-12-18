package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class M5B implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ MOT A02;

    public M5B(Activity activity, UserSession userSession, MOT mot) {
        this.A02 = mot;
        this.A00 = activity;
        this.A01 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.DsR(AbstractC58002lE.A00(this.A00, this.A01));
    }
}
