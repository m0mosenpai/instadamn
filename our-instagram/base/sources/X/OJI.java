package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;

/* loaded from: classes9.dex */
public final class OJI {
    public final InterfaceC58033PoJ A02;
    public final AudioOverlayTrack A03;
    public final C8KO A04;
    public final C56484P5y A01 = new C56484P5y(this, 1);
    public final C56481P5v A00 = new C56481P5v(this, 0);

    public final void A00() {
        C8KO c8ko = this.A04;
        AudioOverlayTrack audioOverlayTrack = this.A03;
        C56481P5v c56481P5v = this.A00;
        C56484P5y c56484P5y = this.A01;
        AbstractC167017dG.A1P(c56481P5v, c56484P5y);
        c8ko.A03(audioOverlayTrack, c56481P5v, c56484P5y, audioOverlayTrack.A02, false, false);
    }

    public OJI(Context context, UserSession userSession, InterfaceC58033PoJ interfaceC58033PoJ, AudioOverlayTrack audioOverlayTrack) {
        this.A03 = audioOverlayTrack;
        this.A02 = interfaceC58033PoJ;
        this.A04 = new C8KO(context, userSession, new C189848b3(), 0);
    }
}
