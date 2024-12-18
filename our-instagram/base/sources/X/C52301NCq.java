package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveBroadcastSettingsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveShareRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.NCq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52301NCq extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        NZZ A02 = OYB.A02(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A01;
        NYV A01 = OQX.A01(interfaceC11380iw, userSession);
        IgLiveModerationRepository A0W = MSX.A0W(A02);
        MTU A03 = A02.A03();
        IgLiveCommentsRepository igLiveCommentsRepository = (IgLiveCommentsRepository) A02.A06.getValue();
        IgLiveJoinRequestsRepository igLiveJoinRequestsRepository = (IgLiveJoinRequestsRepository) A02.A02.getValue();
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository = (IgLiveQuestionSubmissionsRepository) A02.A0C.getValue();
        return new C51027Mga(interfaceC11380iw, userSession, A01.A01(this.A00), (C54810OKj) A01.A05.getValue(), (IgLiveBroadcastSettingsRepository) A02.A00.getValue(), igLiveCommentsRepository, igLiveJoinRequestsRepository, A0W, igLiveQuestionSubmissionsRepository, (IgLiveShareRepository) A02.A0E.getValue(), (IgLiveBroadcastInfoManager) A02.A05.getValue(), A02.A04, A02.A02(), A03, AbstractC109224vo.A04(userSession), AbstractC109224vo.A03(userSession), C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 2342166213356039244L));
    }

    public C52301NCq(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
    }
}
