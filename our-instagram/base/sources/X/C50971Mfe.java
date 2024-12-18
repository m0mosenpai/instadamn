package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.Mfe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C50971Mfe extends AbstractC52922bZ {
    public final C2GT A00;
    public final UserSession A01;
    public final EnumC142806cg A02;
    public final C54817OKs A03;
    public final MTU A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final String getPrimaryText(String str, User user, java.util.Set set) {
        if (str == null) {
            return AbstractC54268Nyo.A00(user, set);
        }
        return str;
    }

    public C50971Mfe(UserSession userSession, EnumC142806cg enumC142806cg, C54817OKs c54817OKs, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu, boolean z, boolean z2, boolean z3) {
        AbstractC25234BEr.A1R(enumC142806cg, igLiveBroadcastInfoManager, igLiveHeartbeatManager, olc, c54817OKs);
        C14360o3.A0B(mtu, 7);
        this.A01 = userSession;
        this.A02 = enumC142806cg;
        this.A03 = c54817OKs;
        this.A04 = mtu;
        this.A06 = z;
        this.A05 = z2;
        this.A07 = z3;
        this.A00 = MSZ.A0L(new C57184PaK(this, null, 7), igLiveBroadcastInfoManager.A06, igLiveHeartbeatManager.A08, olc.A0V);
    }
}
