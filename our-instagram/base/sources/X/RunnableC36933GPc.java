package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.GPc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36933GPc implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ EnumC31512Dsw A01;
    public final /* synthetic */ InstagramMainActivity A02;

    public RunnableC36933GPc(Context context, EnumC31512Dsw enumC31512Dsw, InstagramMainActivity instagramMainActivity) {
        this.A02 = instagramMainActivity;
        this.A00 = context;
        this.A01 = enumC31512Dsw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment;
        C60412pP c60412pP;
        InstagramMainActivity instagramMainActivity = this.A02;
        Fragment A01 = InstagramMainActivity.A01(instagramMainActivity);
        Fragment fragment2 = null;
        if ((A01 instanceof C60412pP) && (c60412pP = (C60412pP) A01) != null) {
            fragment = c60412pP.A02();
        } else {
            fragment = null;
        }
        if (fragment instanceof AbstractC59962oe) {
            fragment2 = fragment;
        }
        Context context = this.A00;
        UserSession userSession = instagramMainActivity.A05;
        userSession.getClass();
        C31518Dt2.A01(context, fragment2, this.A01, userSession, C05F.A00);
    }
}
