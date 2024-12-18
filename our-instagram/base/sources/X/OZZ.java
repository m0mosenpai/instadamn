package X;

import com.facebook.stash.core.Stash;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OZZ {
    public final Stash A00;
    public final UserSession A01;
    public final C0f6 A02;

    public OZZ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = C1M7.A01().A04(1804488505);
        this.A02 = C18950wb.A01;
    }

    public static final void A00(OZZ ozz, String str, Throwable th) {
        C0f5 AEp = ozz.A02.AEp(str, 817892378);
        AEp.ERI(th);
        AEp.report();
    }

    public static final byte[] A01(String[] strArr) {
        C73773Sh c73773Sh = AbstractC73763Sg.A03;
        C3RD c3rd = C3RD.A01;
        C14360o3.A0B(c3rd, 0);
        return MSY.A1a(c73773Sh.A02(AbstractC009903n.A0J(strArr), new C3SG(c3rd)));
    }
}
