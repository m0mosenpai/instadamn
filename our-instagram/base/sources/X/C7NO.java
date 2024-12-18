package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7NO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7NO {
    public final UserSession A00;

    public static C7NO A00(final UserSession userSession) {
        return (C7NO) userSession.A01(C7NO.class, new InterfaceC16820sZ() { // from class: X.7NP
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C7NO(UserSession.this);
            }
        });
    }

    public C7NO(UserSession userSession) {
        this.A00 = userSession;
    }
}
