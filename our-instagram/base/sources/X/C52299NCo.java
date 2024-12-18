package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.NCo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52299NCo extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C52299NCo(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C190298bn A01;
        UserSession userSession = this.A02;
        NZZ A02 = OYB.A02(userSession);
        NYV A012 = OQX.A01(this.A01, userSession);
        IgLiveBroadcastInfoManager A013 = A02.A01();
        C147856lA c147856lA = A02.A03;
        IgLiveHeartbeatManager igLiveHeartbeatManager = A02.A04;
        OLC A022 = A02.A02();
        MTU A03 = A02.A03();
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        Context context = this.A00;
        C56805PIw A014 = A012.A01(context);
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        boolean A06 = C18U.A06(A0U, userSession, 36320889154839524L);
        long A015 = C18U.A01(A0U, userSession, 36602364131611273L);
        AbstractC55106ObM abstractC55106ObM = null;
        if (MSY.A1T(context, userSession) && (A01 = C190298bn.A03.A01(userSession)) != null) {
            abstractC55106ObM = A01.A00();
        }
        return new C50981Mfo(A00, abstractC55106ObM, A014, A013, c147856lA, igLiveHeartbeatManager, A022, A03, A015, A06, C18U.A06(A0U, userSession, 36325274316452813L));
    }
}
