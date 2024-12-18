package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.NCi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52293NCi extends AbstractC61132qb {
    public final Context A00;
    public final UserSession A01;
    public final EnumC142806cg A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        O95 o95;
        AbstractC55106ObM abstractC55106ObM;
        C147846l9 c147846l9;
        NZZ nzz;
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A01;
        EnumC142806cg enumC142806cg = this.A02;
        AbstractC147826l7 A00 = c147836l8.A00(userSession, enumC142806cg);
        IgLiveBroadcastInfoManager A01 = A00.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A00.A04;
        OLC A02 = A00.A02();
        IgLiveModerationRepository A0W = MSX.A0W(A00);
        C147856lA c147856lA = A00.A03;
        O97 o97 = null;
        if ((A00 instanceof NZZ) && (nzz = (NZZ) A00) != null) {
            o95 = (O95) nzz.A01.getValue();
        } else {
            o95 = null;
        }
        if (enumC142806cg == EnumC142806cg.A03) {
            abstractC55106ObM = C190298bn.A03.A00(this.A00, userSession).A00();
        } else {
            abstractC55106ObM = null;
        }
        if ((A00 instanceof C147846l9) && (c147846l9 = (C147846l9) A00) != null) {
            o97 = (O97) c147846l9.A03.getValue();
        }
        MTU A03 = A00.A03();
        boolean A032 = AbstractC109224vo.A03(userSession);
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        return new C50980Mfn(abstractC55106ObM, enumC142806cg, o95, A0W, o97, A01, c147856lA, igLiveHeartbeatManager, A02, A03, A032, C18U.A06(A0U, userSession, 36325274316780498L), C18U.A06(A0U, userSession, 36325274316846035L));
    }

    public C52293NCi(Context context, UserSession userSession, EnumC142806cg enumC142806cg) {
        AbstractC167017dG.A1R(userSession, enumC142806cg);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = enumC142806cg;
    }
}
