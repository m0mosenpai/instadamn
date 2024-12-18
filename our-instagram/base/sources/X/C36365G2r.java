package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.G2r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36365G2r implements InterfaceC37156GYt {
    public final C34422FFm A00;
    public final Context A01;
    public final UserSession A02;
    public final E70 A03;

    public C36365G2r(Context context, UserSession userSession, C34422FFm c34422FFm, E70 e70) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = e70;
        this.A00 = c34422FFm;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        Context context = this.A01;
        String A0p = AbstractC166997dE.A0p(context, 2131959446);
        return AbstractC16960so.A1Q(C31335Dq0.A01(context, 2131959444), new C54737OFo(new ViewOnClickListenerC35680FpF(this, 24), null, null, null, EnumC53237Nga.A04, null, null, null, null, null, null, null, A0p, null, null, true, true), C35246Fgf.A00(context, 2131959445));
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        List list;
        UserSession userSession = this.A02;
        E70 e70 = this.A03;
        boolean z = true;
        if (!e70.A0E(userSession.userId)) {
            String str = userSession.userId;
            C14360o3.A0B(str, 0);
            C81543kP c81543kP = e70.A0E;
            if (c81543kP == null || (list = c81543kP.A0E) == null || !list.contains(str)) {
                z = false;
            }
        }
        if (e70.A09 == 29 && z) {
            return true;
        }
        return false;
    }
}
