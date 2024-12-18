package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139646Tt {
    public final C129975u2 A00;
    public final InterfaceC56392iX A01;

    public C139646Tt(ViewStub viewStub, UserSession userSession, ComponentCallbacks2C142736cZ componentCallbacks2C142736cZ) {
        InterfaceC56392iX A01;
        C14360o3.A0B(viewStub, 2);
        View view = (View) componentCallbacks2C142736cZ.A07.poll();
        if (view != null) {
            ViewGroup A012 = AbstractC124845kp.A01(viewStub);
            A012.addView(view, A012.indexOfChild(viewStub), viewStub.getLayoutParams());
            A01 = AbstractC56372iV.A01(view, false, false);
        } else {
            A01 = AbstractC56372iV.A01(viewStub, false, false);
        }
        this.A01 = A01;
        this.A00 = C18U.A06(C06090Tz.A05, userSession, 36310770216075546L) ? new C129975u2() : null;
    }
}
