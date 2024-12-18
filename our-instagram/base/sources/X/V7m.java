package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V7m extends V8M {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C69592Vrv A02;
    public final C69139ViU A03;
    public final C69535Vqz A04;
    public final C38E A05;
    public final String A06;
    public final C68818VcZ A07;

    public V7m(Fragment fragment, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, InterfaceC65252xN interfaceC65252xN, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C69139ViU c69139ViU, C69535Vqz c69535Vqz, InterfaceC60682pr interfaceC60682pr) {
        super(fragment, viewOnTouchListenerC60632pm, interfaceC65252xN, interfaceC11380iw, userSession, interfaceC60682pr, C3G2.A1K);
        this.A03 = c69139ViU;
        C69592Vrv c69592Vrv = super.A04;
        this.A02 = c69592Vrv;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A05 = new C38E(interfaceC11380iw, userSession, new C38C(fragment));
        this.A06 = AbstractC166997dE.A0n();
        this.A07 = new C68818VcZ(c69592Vrv);
        this.A04 = c69535Vqz;
    }
}
