package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class Gi6 implements InterfaceC31166DnA, InterfaceC30983Dje {
    public final UserSession A00;
    public final C37522Gfe A01;
    public final /* synthetic */ C43069J2j A02 = new Object();

    @Override // X.InterfaceC31166DnA
    public final CUJ As5() {
        C9BW c9bw = this.A02.A00;
        if (c9bw == null) {
            C14360o3.A0F("delayedSkipAction");
            throw C00O.createAndThrow();
        }
        return (CUJ) AbstractC25226BEj.A1C(c9bw.A00);
    }

    @Override // X.InterfaceC31166DnA
    public final void CKZ(Context context, C120985dq c120985dq, String str, String str2, String str3) {
        C38321qM c38321qM;
        String A00 = AbstractC111324zv.A00(3127);
        C14360o3.A0B(c120985dq, 1);
        if (c120985dq.A01 != EnumC129395t1.A03 && (c38321qM = c120985dq.A02) != null) {
            UserSession userSession = this.A00;
            String A07 = AbstractC41071vF.A07(userSession, c38321qM);
            String A0F = AbstractC41071vF.A0F(userSession, c38321qM);
            C37522Gfe c37522Gfe = this.A01;
            C82713mZ A01 = C32U.A01(null, c38321qM, c37522Gfe, "waist_button");
            A01.A0J(userSession, c38321qM);
            C32U.A0C(userSession, A01, c38321qM, c37522Gfe, null);
            C37603Ggy c37603Ggy = new C37603Ggy(context, userSession, c37522Gfe);
            MUW muw = new MUW((Float) null, (Float) null, A00, (String) null);
            C9BW c9bw = this.A02.A00;
            if (c9bw == null) {
                C14360o3.A0F("delayedSkipAction");
                throw C00O.createAndThrow();
            }
            if (!ITO.A01(muw, c37603Ggy, c120985dq, AbstractC166987dD.A0H(((InterfaceC16660sJ) c9bw.A01).invoke(c120985dq)))) {
                c37603Ggy.A03(new MUW((Float) null, (Float) null, A00, (String) null), c120985dq, "primary");
            }
            AbstractC41669Ic1.A00(context, userSession, null, A07, A0F, "CLIPS");
        }
    }

    @Override // X.InterfaceC30983Dje
    public final void ET8(C9BW c9bw) {
        this.A02.A00 = c9bw;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.J2j, java.lang.Object] */
    public Gi6(UserSession userSession, C37522Gfe c37522Gfe) {
        this.A00 = userSession;
        this.A01 = c37522Gfe;
    }
}
