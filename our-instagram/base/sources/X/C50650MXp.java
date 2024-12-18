package X;

import com.instagram.appreciation.mediasettings.AppreciationMediaSettingsApi;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.MXp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50650MXp {
    public final AppreciationMediaSettingsApi A00;
    public final UserSession A01;
    public final MonetizationRepository A02;

    public /* synthetic */ C50650MXp(UserSession userSession) {
        AppreciationMediaSettingsApi appreciationMediaSettingsApi = new AppreciationMediaSettingsApi(userSession);
        MonetizationRepository A00 = AbstractC63302u8.A00(userSession);
        C14360o3.A0B(A00, 3);
        this.A01 = userSession;
        this.A00 = appreciationMediaSettingsApi;
        this.A02 = A00;
    }
}
