package X;

import com.instagram.common.session.UserSession;
import com.instagram.rtc.activity.RtcCallActivity;

/* renamed from: X.PFh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56715PFh implements C0JG {
    public final int A00;
    public final Object A01;

    public C56715PFh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        Object obj;
        int i = this.A00;
        AbstractC167017dG.A1N(userSession, interfaceC03960Jm);
        switch (i) {
            case 0:
                RtcCallActivity rtcCallActivity = (RtcCallActivity) this.A01;
                rtcCallActivity.A01 = userSession;
                obj = null;
                if (C18U.A06(C06090Tz.A05, userSession, 36323603574631835L)) {
                    rtcCallActivity.A03 = interfaceC03960Jm;
                    return;
                }
                break;
            case 1:
                AbstractC25225BEi.A1U(this.A01, userSession);
                obj = null;
                break;
            default:
                ((InterfaceC16620sF) this.A01).invoke(userSession, C57548PgM.A01(interfaceC03960Jm, 13));
                return;
        }
        interfaceC03960Jm.AIn(obj);
    }
}
