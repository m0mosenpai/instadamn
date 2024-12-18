package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NX1 extends AbstractC55106ObM {
    public final Context A00;
    public final C55141Ocj A01;
    public final UserSession A02;
    public final C23031Ai A03;
    public final OWe A04;
    public final InterfaceC09390do A05;

    public /* synthetic */ NX1(Context context, UserSession userSession) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C14360o3.A0B(A00, 3);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = A00;
        this.A05 = AbstractC09440dt.A01(new J8V(this, 47));
        C55141Ocj c55141Ocj = new C55141Ocj(new J8V(this, 48), new J8V(this, 49), new C57239PbN(this, 0), new C57746PjZ(this, 20), new C57746PjZ(this, 21));
        this.A01 = c55141Ocj;
        this.A04 = new OWe(context, (C54786OJd) this.A05.getValue(), c55141Ocj, userSession, A00);
    }
}
