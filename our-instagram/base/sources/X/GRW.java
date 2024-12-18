package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GRW implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public GRW(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = i;
        this.A04 = obj;
    }

    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        int i = this.A00;
        C31338Dq3 c31338Dq3 = (C31338Dq3) this.A02;
        if (i != 0) {
            C5HW c5hw = (C5HW) this.A03;
            int i2 = this.A01;
            Activity activity = (Activity) this.A04;
            C31338Dq3.A04(c31338Dq3, c5hw, "delete_notification_failed", i2);
            if (C31338Dq3.A05(c31338Dq3)) {
                C193328hC A0H = AbstractC31171DnF.A0H(activity);
                A0H.A09(2131968507);
                A0H.A04();
                AbstractC166987dD.A1W(A0H);
            }
            c31338Dq3.A06.COe(c5hw, i2);
        } else {
            C5HW c5hw2 = (C5HW) this.A03;
            int i3 = this.A01;
            MUD mud = (MUD) this.A04;
            C31338Dq3.A04(c31338Dq3, c5hw2, "delete_notification_success", i3);
            UserSession userSession = c31338Dq3.A03;
            JTE A01 = MUK.A01(userSession);
            String str = userSession.userId;
            InterfaceC11380iw interfaceC11380iw = c31338Dq3.A01;
            GZI gzi = c31338Dq3.A04;
            A01.A0G(mud, interfaceC11380iw, c5hw2, str, gzi.AbS(), gzi.BdC(), i3);
        }
        return C0eB.A00;
    }
}
