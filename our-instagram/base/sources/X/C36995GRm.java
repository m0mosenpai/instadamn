package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GRm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36995GRm implements InterfaceC16660sJ {
    public boolean A00;
    public final UserSession A01;

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        if (context == null) {
            return "";
        }
        if (!this.A00) {
            this.A00 = true;
            C1XJ.A00.A0f(context, this.A01, null);
        }
        String A0p = AbstractC166997dE.A0p(context, 2131973957);
        Integer A0Y = C1XJ.A00.A0Y(this.A01);
        if (A0Y == null || A0Y.intValue() == 0) {
            return A0p;
        }
        String A0g = AnonymousClass001.A0g(A0p, " · ", AbstractC13670mt.A06("%d", A0Y));
        C14360o3.A0A(A0g);
        return A0g;
    }

    public C36995GRm(UserSession userSession) {
        this.A01 = userSession;
    }
}
