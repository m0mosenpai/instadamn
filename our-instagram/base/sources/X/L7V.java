package X;

import android.content.Context;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L7V {
    public final Context A00;
    public final AnonymousClass760 A01;
    public final boolean A02;
    public final UserSession A03;

    public L7V(Context context, UserSession userSession, AnonymousClass760 anonymousClass760) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = anonymousClass760;
        this.A02 = AbstractC167007dF.A1P(context.getResources().getConfiguration().uiMode & 48, 32);
    }

    public final void A00(String str) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("theme_id", str);
        PandoGraphQLRequest A00 = LTF.A00(A0b, A0b2);
        C40701ud A01 = AbstractC40691uc.A01(this.A03);
        C14360o3.A0A(A00);
        C48146LSv.A00(new WW0(this, 11), A00, A01, this, 24);
    }
}
