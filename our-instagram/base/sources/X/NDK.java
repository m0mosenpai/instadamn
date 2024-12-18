package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveFollowStatusApi;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;

/* loaded from: classes9.dex */
public final class NDK extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final EnumC142806cg A03;

    public NDK(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(enumC142806cg, 2);
        this.A02 = userSession;
        this.A03 = enumC142806cg;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C56805PIw c56805PIw;
        C147766l1 c147766l1;
        NYV nyv;
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A02;
        EnumC142806cg enumC142806cg = this.A03;
        AbstractC147826l7 A00 = c147836l8.A00(userSession, enumC142806cg);
        C147756l0 c147756l0 = AbstractC147746kz.A0A;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        AbstractC147746kz A002 = c147756l0.A00(interfaceC11380iw, userSession, enumC142806cg);
        IgLiveCommentsRepository igLiveCommentsRepository = (IgLiveCommentsRepository) A00.A06.getValue();
        IgLiveBroadcastInfoManager A01 = A00.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A00.A04;
        MTU A03 = A00.A03();
        IgLiveModerationRepository A0W = MSX.A0W(A00);
        OLC A02 = A00.A02();
        C147856lA c147856lA = A00.A03;
        IgLiveFollowStatusApi igLiveFollowStatusApi = new IgLiveFollowStatusApi(userSession);
        C147776l2 c147776l2 = null;
        if ((A002 instanceof NYV) && (nyv = (NYV) A002) != null) {
            c56805PIw = nyv.A01(this.A00);
        } else {
            c56805PIw = null;
        }
        if ((A002 instanceof C147766l1) && (c147766l1 = (C147766l1) A002) != null) {
            c147776l2 = (C147776l2) c147766l1.A05.getValue();
        }
        return new IgLiveOptionsDialogViewModel(interfaceC11380iw, userSession, igLiveFollowStatusApi, enumC142806cg, (OBA) A002.A03.getValue(), c56805PIw, (C54810OKj) A002.A05.getValue(), c147776l2, igLiveCommentsRepository, A0W, A01, c147856lA, igLiveHeartbeatManager, A02, A03);
    }
}
