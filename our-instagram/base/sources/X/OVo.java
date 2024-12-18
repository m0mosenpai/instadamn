package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.util.List;

/* loaded from: classes9.dex */
public final class OVo {
    public String A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;
    public final AbstractC018607g A04;

    public final void A01(C128175qm c128175qm, InterfaceC50452MPg interfaceC50452MPg) {
        DownloadedTrack downloadedTrack;
        this.A01 = false;
        List list = c128175qm.A0p;
        if (list != null && AbstractC166987dD.A1b(list)) {
            UserSession userSession = this.A03;
            if (AbstractC185298Jv.A07(userSession)) {
                new C55005OVm(this.A02, userSession, new C56306OzR(c128175qm, interfaceC50452MPg, this), Math.min(90000, AnonymousClass827.A00(userSession).A01)).A01(list);
                return;
            }
        }
        AudioOverlayTrack audioOverlayTrack = c128175qm.A0N;
        if (audioOverlayTrack == null || ((downloadedTrack = audioOverlayTrack.A06) != null && MSY.A1Z(downloadedTrack.A02))) {
            A00(c128175qm, interfaceC50452MPg, this);
            return;
        }
        OJI oji = new OJI(this.A02, this.A03, new C56268Oyd(c128175qm, interfaceC50452MPg, this), audioOverlayTrack);
        C8KO c8ko = oji.A04;
        AudioOverlayTrack audioOverlayTrack2 = oji.A03;
        c8ko.A03(audioOverlayTrack2, oji.A00, oji.A01, audioOverlayTrack2.A02, false, true);
    }

    public static final void A00(C128175qm c128175qm, InterfaceC50452MPg interfaceC50452MPg, OVo oVo) {
        C1GJ.A00(oVo.A02, oVo.A04, new KK4(3, interfaceC50452MPg, oVo, c128175qm));
    }

    public OVo(Context context, AbstractC018607g abstractC018607g, UserSession userSession) {
        AbstractC167017dG.A1R(context, userSession);
        this.A04 = abstractC018607g;
        this.A02 = context;
        this.A03 = userSession;
    }
}
