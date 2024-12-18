package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7cU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166587cU {
    public C166047bW A00;
    public List A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final C57112jm A04;
    public final InterfaceC60442pS A05;

    public C166587cU(C166047bW c166047bW, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 2);
        this.A05 = interfaceC60442pS;
        this.A03 = userSession;
        this.A00 = c166047bW;
        this.A01 = C16930sl.A00;
        this.A02 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        this.A04 = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
    }

    public final void A00(View view, C71163Hc c71163Hc) {
        C14360o3.A0B(view, 1);
        this.A04.A08(view, c71163Hc, new InterfaceC57142jp[0]);
    }
}
