package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6Z1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Z1 {
    public UserSession A00;
    public InterfaceC19630xq A01;

    public final void A01(Reel reel) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77(reel.getId(), true);
        ARD.apply();
        reel.A0R(this.A00);
    }

    public static C6Z1 A00(final UserSession userSession) {
        return (C6Z1) userSession.A01(C6Z1.class, new InterfaceC16820sZ() { // from class: X.6Z2
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.6Z1] */
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                UserSession userSession2 = UserSession.this;
                ?? obj = new Object();
                obj.A00 = userSession2;
                obj.A01 = C1AT.A01(userSession2).A04(C1AV.A1e, obj.getClass());
                return obj;
            }
        });
    }
}
