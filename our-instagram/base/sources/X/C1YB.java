package X;

import android.view.ViewStub;
import com.instagram.common.session.UserSession;

/* renamed from: X.1YB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YB {
    public static C1YB A02;
    public A33 A00;
    public C8YD A01;

    public final C8YE A00(ViewStub viewStub, AbstractC59962oe abstractC59962oe, UserSession userSession, C8YD c8yd, C8YA c8ya) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(abstractC59962oe, 1);
        return new C8YE(abstractC59962oe.requireContext(), viewStub, abstractC59962oe, userSession, abstractC59962oe, c8yd, c8ya);
    }

    public final C8YD A01() {
        C8YD c8yd = this.A01;
        if (c8yd == null) {
            C56813PJj c56813PJj = new C56813PJj(null);
            this.A01 = c56813PJj;
            return c56813PJj;
        }
        return c8yd;
    }
}
