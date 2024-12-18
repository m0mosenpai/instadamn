package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.Nch, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53009Nch extends AbstractC50987Mfu {
    public final C2GT A00;
    public final boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53009Nch(IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, OLC olc, MTU mtu, boolean z) {
        super(null, igLiveBroadcastInfoManager, olc, mtu);
        JQ0.A1O(igLiveHeartbeatManager, mtu, igLiveQuestionSubmissionsRepository, igLiveBroadcastInfoManager, olc);
        this.A01 = z;
        this.A00 = MSZ.A0L(new C57185PaM(this, null, 7), igLiveHeartbeatManager.A08, igLiveQuestionSubmissionsRepository.A06, igLiveBroadcastInfoManager.A06);
    }
}
