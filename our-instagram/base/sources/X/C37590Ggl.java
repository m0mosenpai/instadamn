package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ggl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37590Ggl implements InterfaceC43071ya {
    public Runnable A00;
    public final InterfaceC116925Qy A01;
    public final Handler A02;
    public final UserSession A03;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Runnable runnable;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != 0) {
            if (A01 != A1R && (runnable = this.A00) != null) {
                this.A02.removeCallbacks(runnable);
                return;
            }
            return;
        }
        UserSession userSession = this.A03;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36319209827081299L)) {
            return;
        }
        J54 j54 = new J54(c59062n7, this);
        this.A00 = j54;
        this.A02.postDelayed(j54, C18U.A01(c06090Tz, userSession, 36600684803526632L) * 1000);
    }

    public C37590Ggl(InterfaceC116925Qy interfaceC116925Qy, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC116925Qy);
        this.A03 = userSession;
        this.A01 = interfaceC116925Qy;
        this.A02 = AbstractC167007dF.A0J();
    }
}
