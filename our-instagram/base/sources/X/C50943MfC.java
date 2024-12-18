package X;

import com.instagram.common.session.UserSession;
import com.instagram.igtv.live.model.IGTVLiveChannelRepository;
import java.util.List;

/* renamed from: X.MfC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50943MfC extends AbstractC52922bZ {
    public String A00;
    public List A01;
    public boolean A02;
    public final C2GS A03;
    public final UserSession A04;
    public final O39 A05;
    public final IGTVLiveChannelRepository A06;
    public final C38900HAw A07;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.2GT, X.2GS] */
    public /* synthetic */ C50943MfC(UserSession userSession, O39 o39, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        IGTVLiveChannelRepository iGTVLiveChannelRepository = (IGTVLiveChannelRepository) userSession.A01(IGTVLiveChannelRepository.class, C57538PgC.A01(userSession, 0));
        AbstractC25234BEr.A0j(2, str, str2, o39, iGTVLiveChannelRepository);
        this.A04 = userSession;
        this.A05 = o39;
        this.A06 = iGTVLiveChannelRepository;
        this.A07 = new C38900HAw(EnumC39587Hdx.A0A, str, str2);
        this.A01 = AbstractC166987dD.A1E();
        this.A03 = new C2GT(NMR.A00);
        this.A02 = true;
    }
}
