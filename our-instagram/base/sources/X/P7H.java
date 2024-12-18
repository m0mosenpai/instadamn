package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* loaded from: classes9.dex */
public final class P7H implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("media_id");
        if (queryParameter != null && queryParameter.length() != 0) {
            Integer A0Y = MSX.A0Y(C14360o3.A0K(uri.getQueryParameter("media_source"), "ig") ? 1 : 0);
            AbstractC27671Vv A00 = C3ER.A00();
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A01;
            RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments = new RtcStartCoWatchPlaybackArguments(A0Y, C05F.A01, C05F.A00, null, queryParameter, uri.getQueryParameter("preview_video_id"));
            C56139Ovz A01 = MWJ.A01(A00.A00(fragmentActivity, userSession).A06);
            if (A01 != null) {
                C57753Pjg.A01(A01.A09.A0Z, NU0.A00(rtcStartCoWatchPlaybackArguments, null), 15);
            }
        }
    }

    public P7H(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
