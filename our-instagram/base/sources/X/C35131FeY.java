package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.FeY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35131FeY {
    public static final EgZ A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (EgZ) userSession.A01(EgZ.class, new J7S(userSession, 13));
    }

    public final void A02(Context context, UserSession userSession, InterfaceC37176GZn interfaceC37176GZn, boolean z, boolean z2) {
        A01(context, userSession, interfaceC37176GZn, true, false, z, z2);
    }

    public static final void A01(Context context, UserSession userSession, InterfaceC37176GZn interfaceC37176GZn, boolean z, boolean z2, boolean z3, boolean z4) {
        EgZ A00 = A00(userSession);
        if (interfaceC37176GZn != null) {
            ((AbstractC36266FzJ) A00).A00 = interfaceC37176GZn;
        }
        A00.A02 = z3;
        A00.A01 = z;
        A00.A00 = z2;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean(AbstractC111324zv.A00(734), z);
        A0b.putBoolean(AbstractC111324zv.A00(733), z2);
        A0b.putBoolean(AbstractC111324zv.A00(735), z4);
        A00.A02(context, A0b);
    }
}
