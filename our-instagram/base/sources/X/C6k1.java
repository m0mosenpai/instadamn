package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

/* renamed from: X.6k1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6k1 extends AbstractC52922bZ {
    public UserSession A00;
    public final C142246bh A01;
    public final FanClubApi A02;

    public /* synthetic */ C6k1(Context context, UserSession userSession) {
        C142246bh A00 = AbstractC149796oY.A00(context, userSession);
        FanClubApi fanClubApi = new FanClubApi(userSession);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(A00, 3);
        this.A00 = userSession;
        this.A01 = A00;
        this.A02 = fanClubApi;
    }
}
