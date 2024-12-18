package X;

import com.facebook.rsys.mediasync.gen.MediaSyncState;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* loaded from: classes9.dex */
public final class PSI implements Runnable {
    public final /* synthetic */ InterfaceC58104PpT A00;
    public final /* synthetic */ OUG A01;
    public final /* synthetic */ String A02;

    public PSI(InterfaceC58104PpT interfaceC58104PpT, OUG oug, String str) {
        this.A01 = oug;
        this.A02 = str;
        this.A00 = interfaceC58104PpT;
    }

    @Override // java.lang.Runnable
    public final void run() {
        O4X o4x;
        OUG oug = this.A01;
        String str = this.A02;
        InterfaceC58104PpT interfaceC58104PpT = this.A00;
        synchronized (oug.A05) {
            if (C14360o3.A0K(str, oug.A01)) {
                o4x = oug.A00;
            } else {
                o4x = null;
            }
        }
        if (o4x != null) {
            C14360o3.A0B(interfaceC58104PpT, 0);
            NU0 nu0 = o4x.A00;
            nu0.A01 = interfaceC58104PpT;
            C05A c05a = nu0.A0F;
            MediaSyncState mediaSyncState = nu0.A00;
            C26087BgG c26087BgG = new C26087BgG(mediaSyncState, nu0.A0A.A0C(mediaSyncState, interfaceC58104PpT), (RtcStartCoWatchPlaybackArguments) null, nu0.A03);
            C14360o3.A0B(c05a, 0);
            c05a.F8m(c26087BgG);
        }
    }
}
