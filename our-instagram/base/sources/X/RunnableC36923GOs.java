package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GOs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36923GOs implements Runnable {
    public final /* synthetic */ C35042FcF A00;
    public final /* synthetic */ boolean A01;

    public RunnableC36923GOs(C35042FcF c35042FcF, boolean z) {
        this.A00 = c35042FcF;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35042FcF c35042FcF = this.A00;
        EnumC33500ErZ enumC33500ErZ = EnumC33500ErZ.EMAIL;
        boolean z = this.A01;
        UserSession userSession = c35042FcF.A04;
        EnumC33510Erj enumC33510Erj = EnumC33510Erj.SETTINGS_AND_PRIVACY;
        AbstractC35249Fgi.A03(enumC33510Erj, enumC33500ErZ, userSession, z);
        FYI.A01(c35042FcF.A02, enumC33510Erj, enumC33500ErZ, userSession, C05F.A0j, null);
    }
}
