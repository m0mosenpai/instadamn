package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6pX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150236pX {
    public final UserSession A00;
    public final C21C A01;
    public final C150246pY A02;

    public final void A00(boolean z, String str) {
        C14360o3.A0B(str, 1);
        InterfaceC19610xo ARD = this.A01.A00.ARD();
        ARD.E77(AnonymousClass001.A0R("KEY_FORCE_CACHE_REQUEST", str), z);
        ARD.apply();
    }

    public /* synthetic */ C150236pX(UserSession userSession) {
        C21C A00 = C21B.A00(userSession);
        C150246pY c150246pY = new C150246pY(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A00, 2);
        this.A00 = userSession;
        this.A01 = A00;
        this.A02 = c150246pY;
    }
}
