package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LrZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49341LrZ implements MQ6 {
    @Override // X.MQ6
    public final void ADY(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C45093JxN c45093JxN, C49574LvT c49574LvT, C47424KxF c47424KxF) {
        C14360o3.A0B(context, 0);
        AbstractC25234BEr.A1P(c47424KxF, c45093JxN, interfaceC11380iw);
        LGL.A00.A00(context, interfaceC11380iw, c45093JxN, c47424KxF.A00.A0H);
    }

    @Override // X.MQ6
    public final boolean AFU(Context context, UserSession userSession, C45093JxN c45093JxN) {
        C14360o3.A0B(c45093JxN, 1);
        L4E l4e = c45093JxN.A05;
        if (l4e != null && l4e.A03 != null && l4e.A04 != null) {
            return true;
        }
        return false;
    }
}
