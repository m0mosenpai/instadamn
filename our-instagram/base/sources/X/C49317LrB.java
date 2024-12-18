package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.LrB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49317LrB implements InterfaceC25195BCs {
    public final L5H A00;
    public final InterfaceC16820sZ A01;

    public C49317LrB(Activity activity, Context context, UserSession userSession, C163997Vo c163997Vo, C159737El c159737El, C7F2 c7f2, Integer num, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        AbstractC167017dG.A1Q(userSession, context);
        AbstractC167017dG.A1T(c7f2, c163997Vo);
        this.A01 = interfaceC16820sZ;
        this.A00 = new L5H(activity, context, userSession, c163997Vo, null, c159737El, c7f2, num, str, z, false, false);
    }

    @Override // X.InterfaceC25195BCs
    public final AbstractC59962oe AMG(C3DN c3dn) {
        L5H l5h = this.A00;
        DirectShareTarget A00 = l5h.A03.A00();
        if (A00 == null) {
            return null;
        }
        this.A01.invoke();
        return C28531Zo.A04.A02.A05(l5h.A02, A00, 0, 0, false, true);
    }

    @Override // X.InterfaceC25195BCs
    public final L5H Acd() {
        return this.A00;
    }
}
