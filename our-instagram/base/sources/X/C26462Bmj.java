package X;

import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bmj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26462Bmj extends AbstractC51572Yf {
    public final C37669Gi2 A00;
    public final UserSession A01;
    public final InterfaceC31159Dn3 A02;
    public final InterfaceC31019DkI A03;
    public final long A04;
    public final long A05;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        UserSession userSession = this.A01;
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        int intValue = AbstractC40906IAe.A00(C18U.A04(A0j, userSession, 36885252152951397L)).intValue();
        if (intValue != 1 && intValue != 0) {
            throw B4Z.A00();
        }
        AbstractC25555BRr.A00(C18U.A04(A0j, userSession, 36885252152623715L)).intValue();
        C75933ay c75933ay = C51722Yv.A02;
        long j = this.A04;
        Integer num = C05F.A00;
        C51722Yv A00 = C9CU.A00(null, num, 0, j);
        Integer num2 = C05F.A01;
        C51722Yv A002 = C9CV.A00(AbstractC25233BEq.A0d(AbstractC25234BEr.A0H(C9CU.A00(C9CU.A00(A00, num2, 0, j), C05F.A0A, 0, this.A05), AbstractC25231BEo.A0b(c76223bS, 2131964509, 0), num), DRP.A00(this, 38)), num2, "android.widget.Button", 0);
        return new C78133ef(AbstractC77623dm.A0E(c76223bS, R.drawable.instagram_this_or_that_outline_44), ImageView.ScaleType.FIT_CENTER, null, A002, AbstractC25232BEp.A02(c76223bS.A05.A0C, c76223bS), 0);
    }

    public C26462Bmj(C37669Gi2 c37669Gi2, UserSession userSession, InterfaceC31159Dn3 interfaceC31159Dn3, InterfaceC31019DkI interfaceC31019DkI, long j, long j2) {
        AbstractC167017dG.A1P(userSession, c37669Gi2);
        AbstractC167017dG.A1T(interfaceC31159Dn3, interfaceC31019DkI);
        this.A01 = userSession;
        this.A00 = c37669Gi2;
        this.A04 = j;
        this.A05 = j2;
        this.A02 = interfaceC31159Dn3;
        this.A03 = interfaceC31019DkI;
    }
}
