package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109144ve {
    public InterfaceC19630xq A00;

    public static C109144ve A00(final UserSession userSession) {
        return (C109144ve) userSession.A01(C109144ve.class, new InterfaceC16820sZ() { // from class: X.4vf
            /* JADX WARN: Type inference failed for: r3v0, types: [X.4ve, java.lang.Object] */
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                UserSession userSession2 = UserSession.this;
                ?? obj = new Object();
                obj.A00 = C1AT.A01(userSession2).A04(C1AV.A1a, obj.getClass());
                return obj;
            }
        });
    }

    public final void A01(String str, boolean z) {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E77(str, z);
        ARD.apply();
    }

    public final boolean A02(C105824pt c105824pt) {
        InterfaceC19630xq interfaceC19630xq = this.A00;
        String str = c105824pt.A0X;
        str.getClass();
        return interfaceC19630xq.getBoolean(str, false);
    }
}
