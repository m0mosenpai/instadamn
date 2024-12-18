package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.8HR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HR implements InterfaceC184558Gw {
    public boolean A00;
    public final /* synthetic */ C8HI A01;

    @Override // X.InterfaceC184558Gw
    public final void Dak() {
        InterfaceC171997lU interfaceC171997lU;
        this.A00 = true;
        C8HI c8hi = this.A01;
        C174757qB c174757qB = c8hi.A06;
        c174757qB.getClass();
        c174757qB.A0G(c8hi.A0l);
        UserSession userSession = c8hi.A0f;
        AbstractC189688an.A03(userSession, "first_frame_rendered", true);
        if (!C18U.A06(C06090Tz.A05, userSession, 36315662182190571L)) {
            AbstractC208269Jl.A00(userSession).A05(C006802i.A0p.currentMonotonicTimestampNanos());
        }
        if (c8hi.A1P) {
            c8hi.A0Y.A06(0.0d);
        }
        boolean z = C1KM.A08;
        if (C1KT.A05) {
            C1KT.A01(new C1KR(C1KT.A04, "camera", ((C1KP) C1KT.A00()).A01, SystemClock.uptimeMillis()));
        }
        if (C1KM.A08) {
            C1KM.A05(new C1KR(C1KM.A01(), "camera", ((C1KP) C1KM.A00()).A01, SystemClock.uptimeMillis()));
        }
        if (c8hi.A0I && (interfaceC171997lU = c8hi.A0j) != null) {
            interfaceC171997lU.onFirstFrameRendered();
            if (c8hi.A0g.A08.A00 instanceof C128535rM) {
                MYZ A01 = MX1.A01(userSession);
                A01.A01 = A01.A0B.A02(288435480, A01.A01);
            }
        }
    }

    public C8HR(C8HI c8hi) {
        this.A01 = c8hi;
    }
}
