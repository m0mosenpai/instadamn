package X;

import android.content.Context;
import com.facebook.iabadscontext.IABAdsContext;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class QEV extends AbstractC58879QEp {
    public final Context A00;
    public final QER A01;
    public final IABAdsContext A02;
    public final UserSession A03;

    public QEV(Context context, QER qer, IABAdsContext iABAdsContext, UserSession userSession, String str) {
        super(iABAdsContext, str);
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = iABAdsContext;
        this.A01 = qer;
    }
}
