package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel;

/* loaded from: classes6.dex */
public final class EWW extends AbstractC61132qb {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final C34584FLt A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new BroadcastChannelActivityFeedV2ViewModel(AbstractC166997dE.A0M(this.A01), this.A02, this.A03, this.A00);
    }

    public EWW(Context context, UserSession userSession, C34584FLt c34584FLt, int i) {
        AbstractC167017dG.A1R(userSession, c34584FLt);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = c34584FLt;
        this.A00 = i;
    }
}
