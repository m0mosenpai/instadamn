package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailTabController;
import java.lang.ref.Reference;

/* renamed from: X.DoU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31246DoU extends AbstractC33567Esf {
    public C31359DqO A00;
    public final UserSession A01;
    public final C9JG A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.9JG] */
    public C31246DoU(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = new Object();
    }

    public final void A00(Context context, UserDetailTabController userDetailTabController, boolean z, boolean z2) {
        C5SW c5sw;
        C14360o3.A0B(userDetailTabController, 3);
        this.A02.A00 = false;
        C155666yv c155666yv = userDetailTabController.A0O;
        if (c155666yv.A05 != null) {
            c155666yv.A05 = null;
            if (z) {
                c155666yv.A00();
            }
        }
        C31359DqO c31359DqO = this.A00;
        if (c31359DqO != null) {
            EnumC31378Dqi enumC31378Dqi = EnumC31378Dqi.A02;
            c31359DqO.A01.remove(enumC31378Dqi);
            Reference reference = (Reference) c31359DqO.A03.remove(enumC31378Dqi);
            if (reference != null && (c5sw = (C5SW) reference.get()) != null) {
                c5sw.A08(false);
            }
            if (z2 && context != null) {
                UserSession userSession = this.A01;
                C9JC.A01(userSession, context, false);
                C9JC.A01(userSession, context, true);
                return;
            }
            return;
        }
        C14360o3.A0F("tooltipsController");
        throw C00O.createAndThrow();
    }
}
