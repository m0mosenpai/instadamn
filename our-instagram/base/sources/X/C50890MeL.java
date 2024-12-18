package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MeL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50890MeL extends AbstractC52922bZ {
    public final C2GT A00;
    public final UserSession A01;
    public final C54642OBs A02;

    public C50890MeL(UserSession userSession, String str) {
        AbstractC167007dF.A1D(userSession, 1, str);
        this.A01 = userSession;
        C54642OBs c54642OBs = new C54642OBs(userSession, str);
        this.A02 = c54642OBs;
        this.A00 = MSZ.A0L(new C57184PaK(this, null, 1), c54642OBs.A01, c54642OBs.A02, c54642OBs.A00);
    }
}
