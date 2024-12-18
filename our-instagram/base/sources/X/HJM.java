package X;

import android.content.Context;
import com.instagram.api.schemas.ClipsPrefetchTriggerType;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HJM extends AbstractRunnableC14200nk {
    public final /* synthetic */ C14R A00;
    public final /* synthetic */ UserSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJM(C14R c14r, UserSession userSession) {
        super(201, 2, true, true);
        this.A00 = c14r;
        this.A01 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00.A00;
        UserSession userSession = this.A01;
        AbstractC41221vX.A01(context, userSession);
        C41321vh.A01(userSession);
        C77453dV.A05.A09(userSession, context, ClipsPrefetchTriggerType.A05.A00);
    }
}
