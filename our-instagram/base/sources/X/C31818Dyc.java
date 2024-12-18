package X;

import com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dyc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31818Dyc extends AbstractC52922bZ {
    public C206409Bx A00;
    public final AvatarPrivacySettingsRepository A01;
    public final UserSession A02;
    public final C31371Dqb A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;

    public C31818Dyc(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AbstractC163657Uc.A00(userSession);
        this.A03 = new C31371Dqb(userSession, C21B.A00(userSession));
        this.A05 = C10E.A00(C33141Ejk.A00);
        this.A04 = C10E.A00(C33139Eji.A00);
        this.A06 = C10E.A00(C33142Ejl.A00);
    }
}
