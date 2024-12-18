package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.L6o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47746L6o {
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new MHK(this, 30));

    public final void A00(Context context, C41761wQ c41761wQ, Integer num, Integer num2, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        List A1J;
        boolean A1b = AbstractC43593JPy.A1b(c41761wQ);
        boolean A02 = C6CB.A02(AbstractC43593JPy.A0P(this.A01), 36315928477110080L);
        UserSession userSession = this.A00;
        if (A02) {
            A1J = AbstractC16960so.A1Q(new C48680LgA(userSession), new C48681LgB(userSession));
        } else {
            A1J = AbstractC166987dD.A1J(new C48681LgB(userSession));
        }
        LEJ lej = new LEJ(A1J);
        lej.A00.clear();
        LEJ.A00(context, c41761wQ, lej, num, num2, interfaceC16660sJ, A1b ? 1 : 0, z);
    }

    public C47746L6o(UserSession userSession) {
        this.A00 = userSession;
    }
}
