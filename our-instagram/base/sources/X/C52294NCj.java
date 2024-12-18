package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.NCj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52294NCj extends AbstractC61132qb {
    public final Context A00;
    public final UserSession A01;
    public final C56804PIv A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C52817NZa A00 = AbstractC54266Nym.A00(userSession, EnumC142806cg.A04);
        IgLiveCobroadcastRepository A002 = A00.A00(this.A00, userSession);
        ODQ odq = A00.A00;
        IgLiveBroadcastInfoManager A01 = A00.A01();
        MTU A03 = A00.A03();
        return new C50988Mfv(userSession, C08730cb.A00(userSession), this.A02, A002, A01, odq, A03);
    }

    public C52294NCj(Context context, UserSession userSession, C56804PIv c56804PIv) {
        AbstractC167017dG.A1R(context, c56804PIv);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = c56804PIv;
    }
}
