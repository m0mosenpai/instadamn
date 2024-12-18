package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.MfT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50960MfT extends AbstractC52922bZ {
    public final UserSession A00;
    public final C23031Ai A01;
    public final C56805PIw A02;
    public final IgLiveExploreRepository A03;
    public final IgLiveBroadcastInfoManager A04;
    public final C147856lA A05;
    public final MTU A06;
    public final String A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;
    public final C05A A0A;
    public final C0UO A0B;
    public final boolean A0C;

    public /* synthetic */ C50960MfT(UserSession userSession, C23031Ai c23031Ai, C56805PIw c56805PIw, IgLiveExploreRepository igLiveExploreRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, MTU mtu, boolean z) {
        Integer valueOf;
        Integer valueOf2;
        String A0x = AbstractC43593JPy.A0x();
        AbstractC25233BEq.A0w(2, igLiveBroadcastInfoManager, c147856lA, mtu);
        AbstractC25229BEm.A1J(c23031Ai, 7, A0x);
        this.A00 = userSession;
        this.A04 = igLiveBroadcastInfoManager;
        this.A05 = c147856lA;
        this.A06 = mtu;
        this.A03 = igLiveExploreRepository;
        this.A02 = c56805PIw;
        this.A01 = c23031Ai;
        this.A0C = z;
        this.A07 = A0x;
        Integer num = null;
        C24721Ip A0s = MSY.A0s();
        this.A08 = A0s;
        this.A09 = AbstractC07080Za.A03(A0s);
        if (z) {
            valueOf = null;
            valueOf2 = null;
            num = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        } else {
            valueOf = Integer.valueOf(R.attr.igds_color_primary_background);
            valueOf2 = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        }
        C008002u A1H = AbstractC25225BEi.A1H(new C45125Jxu(valueOf, valueOf2, num, z));
        this.A0A = A1H;
        this.A0B = AbstractC208910l.A02(A1H);
    }
}
