package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* loaded from: classes9.dex */
public final class NDH extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final EnumC142806cg A03;

    public NDH(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(enumC142806cg, 4);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = enumC142806cg;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C147846l9 c147846l9;
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A02;
        EnumC142806cg enumC142806cg = this.A03;
        AbstractC147826l7 A00 = c147836l8.A00(userSession, enumC142806cg);
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C147766l1 A002 = AbstractC147736ky.A00(interfaceC11380iw, userSession);
        Context context = this.A00;
        C147856lA c147856lA = A00.A03;
        OLC A02 = A00.A02();
        IgLiveCommentsRepository igLiveCommentsRepository = (IgLiveCommentsRepository) A00.A06.getValue();
        IgLiveBroadcastInfoManager A01 = A00.A01();
        OJ4 oj4 = null;
        if ((A00 instanceof C147846l9) && (c147846l9 = (C147846l9) A00) != null) {
            oj4 = (OJ4) c147846l9.A00.getValue();
        }
        return new C51026MgZ(context, AbstractC12220kQ.A01(interfaceC11380iw, userSession), userSession, A002.A00, enumC142806cg, (OT2) A002.A08.getValue(), igLiveCommentsRepository, oj4, A01, c147856lA, A02, A00.A03(), AbstractC109224vo.A04(userSession));
    }
}
