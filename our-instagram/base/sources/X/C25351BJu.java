package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.BJu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25351BJu implements InterfaceC30931Dil {
    public final C25352BJv A00;

    @Override // X.InterfaceC30931Dil
    public final void ED3(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C57112jm c57112jm, int i) {
        C14360o3.A0B(c57112jm, 0);
        AbstractC167027dH.A13(view, c120985dq, c37644Ghd);
        if (c120985dq.A01 == EnumC129395t1.A0L) {
            C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, c120985dq.getId());
            A00.A00(this.A00);
            AbstractC25227BEk.A10(view, A00, c57112jm);
        }
    }

    public C25351BJu(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A00 = new C25352BJv(userSession, interfaceC60442pS);
    }
}
