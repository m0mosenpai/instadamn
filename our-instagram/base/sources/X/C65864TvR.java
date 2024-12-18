package X;

import com.instagram.autoplay.models.AutoplayConfigRoot;
import com.instagram.autoplay.models.AutoplayConfiguration;
import com.instagram.autoplay.models.AutoplayCustomization;
import com.instagram.autoplay.models.AutoplayGlobalConfig;
import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import com.instagram.common.session.UserSession;

/* renamed from: X.TvR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65864TvR implements XCG {
    public final UserSession A00;

    @Override // X.XCG
    public final AutoplayConfigRoot AuL() {
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        int A01 = (int) C18U.A01(c06090Tz, userSession, 36602218102919800L);
        int A012 = (int) C18U.A01(c06090Tz, userSession, 36602218102854263L);
        AutoplayWhichVideos valueOf = AutoplayWhichVideos.Companion.valueOf(C18U.A04(c06090Tz, userSession, 36883693079691804L));
        return new AutoplayConfigRoot(new AutoplayGlobalConfig(0, 1, 3, true, 100, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, 15000, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION), AbstractC166987dD.A1J(new AutoplayConfiguration(AutoplayLayout.UNKNOWN, AbstractC166987dD.A1J(new AutoplayCustomization("override_1", A01, A012, (int) C18U.A01(c06090Tz, userSession, 36602218103050873L), valueOf)), 100, 1000)));
    }

    @Override // X.XCG
    public final boolean BBP() {
        return C18U.A06(C06090Tz.A05, this.A00, 36320743126082413L);
    }

    public C65864TvR(UserSession userSession) {
        this.A00 = userSession;
    }
}
