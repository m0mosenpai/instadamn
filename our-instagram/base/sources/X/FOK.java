package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class FOK {
    public TouchInterceptorFrameLayout A00;
    public C32716Eah A01;
    public C7QG A02;
    public C32871EdD A03;
    public final int A04;
    public final AbstractC59962oe A05;
    public final UserSession A06;
    public final C36407G4i A07;
    public final G1d A08;
    public final DirectThreadKey A09;

    public FOK(AbstractC59962oe abstractC59962oe, UserSession userSession, DirectThreadKey directThreadKey, int i) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A05 = abstractC59962oe;
        this.A09 = directThreadKey;
        this.A04 = i;
        this.A08 = new G1d(this);
        this.A07 = new C36407G4i();
    }
}
