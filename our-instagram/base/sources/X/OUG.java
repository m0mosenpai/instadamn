package X;

import android.content.Context;
import com.facebook.rsys.mediasync.gen.MediaSyncState;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* loaded from: classes9.dex */
public final class OUG {
    public O4X A00;
    public String A01;
    public final Context A02;
    public final UserSession A03;
    public final OKT A04;
    public final Object A05;

    public /* synthetic */ OUG(Context context, UserSession userSession) {
        OKT okt = new OKT(context, userSession);
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = okt;
        this.A05 = new Object();
    }

    public static final void A00(OUG oug, String str) {
        O4X o4x;
        NU0 nu0;
        MediaSyncState mediaSyncState;
        synchronized (oug.A05) {
            if (str.equals(oug.A01)) {
                o4x = oug.A00;
            } else {
                o4x = null;
            }
        }
        if (o4x != null && (mediaSyncState = (nu0 = o4x.A00).A00) != null) {
            C55221Oek c55221Oek = nu0.A0A;
            InterfaceC58104PpT interfaceC58104PpT = c55221Oek.A0B(mediaSyncState).A00;
            nu0.A01 = interfaceC58104PpT;
            C05A c05a = nu0.A0F;
            MediaSyncState mediaSyncState2 = nu0.A00;
            MSY.A1N(new C26087BgG(mediaSyncState2, c55221Oek.A0C(mediaSyncState2, interfaceC58104PpT), (RtcStartCoWatchPlaybackArguments) null, nu0.A03), c05a);
        }
    }
}
