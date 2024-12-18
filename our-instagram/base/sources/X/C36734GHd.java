package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.GHd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36734GHd implements GYR {
    public final /* synthetic */ ENA A00;

    public C36734GHd(ENA ena) {
        this.A00 = ena;
    }

    @Override // X.GYR
    public final void Elo(View view, String str) {
        ENA ena = this.A00;
        FKL fkl = ena.A02;
        if (fkl == null) {
            C14360o3.A0F("threadDetailsTooltip");
            throw C00O.createAndThrow();
        }
        E70 e70 = ena.A0A;
        if (e70 != null) {
            UserSession userSession = fkl.A01;
            if (AbstractC166987dD.A0x(userSession).getBoolean("should_show_tool_tip_new_moderators_in_broadcast_channel", true) && C160857It.A01(userSession, e70)) {
                EfP efP = new EfP(fkl, 5);
                Map map = fkl.A02;
                if (!map.containsKey(str)) {
                    C5SU A0Q = AbstractC31178DnM.A0Q(fkl.A00, view, str);
                    A0Q.A01();
                    A0Q.A0A = true;
                    A0Q.A04 = efP;
                    C5SW A00 = A0Q.A00();
                    AbstractC167007dF.A0J().postDelayed(new GL7(A00), 500L);
                    map.put(str, A00);
                }
            }
        }
    }
}
