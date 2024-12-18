package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L3U {
    public final FragmentActivity A00;
    public final C140966Yy A01;
    public final BrandedContentSettingsRepository A02;
    public final UserSession A03;
    public final InterfaceC09390do A04;

    public L3U(FragmentActivity fragmentActivity, UserSession userSession) {
        C140966Yy A0r;
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A02 = AbstractC46657Kka.A00(userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 36324612892209430L)) {
            A0r = null;
        } else {
            A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        }
        this.A01 = A0r;
        this.A04 = C37059GUt.A01(this, 29);
    }
}
