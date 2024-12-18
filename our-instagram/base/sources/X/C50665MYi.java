package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.MYi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50665MYi implements XC1 {
    public final UserSession A00;
    public final C0JO A01;
    public final InterfaceC11360iu A02;
    public final C19270xB A03;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0JO, java.lang.Object] */
    public C50665MYi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = AbstractC31171DnF.A0D("medialibrary");
        this.A02 = AbstractC11060iN.A00(userSession);
        this.A01 = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.PzK, java.lang.Object] */
    public static XD7 A00(OW6 ow6, UserSession userSession) {
        ow6.A01 = new C50665MYi(userSession);
        ow6.A03 = new Object();
        return AbstractC55147OdA.A00(ow6.A01());
    }

    @Override // X.XC1
    public final void logEvent(String str, Map map) {
        C19280xC A00 = C19280xC.A00(this.A03, str);
        A00.A0F(map);
        this.A02.EHW(A00);
    }

    @Override // X.XC1
    public final long now() {
        return this.A01.now();
    }
}
