package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7TJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7TJ {
    public final Context A00;
    public final UserSession A01;
    public final C7TK A02;
    public final C40121td A03;

    public /* synthetic */ C7TJ(UserSession userSession) {
        C7TK c7tk = new C7TK(userSession);
        Context context = AbstractC12290kX.A00;
        C40121td A01 = C40121td.A0G.A01(context, userSession);
        C14360o3.A0B(context, 3);
        C14360o3.A0B(A01, 4);
        this.A01 = userSession;
        this.A02 = c7tk;
        this.A00 = context;
        this.A03 = A01;
    }
}
