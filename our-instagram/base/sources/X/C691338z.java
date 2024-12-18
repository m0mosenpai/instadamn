package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

/* renamed from: X.38z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C691338z {
    public final UserSession A00;
    public final C65192xH A01;
    public final InterfaceC670430v A02;

    public final boolean A02(C38321qM c38321qM, Integer num) {
        InterfaceC670430v interfaceC670430v;
        UserSession userSession = this.A00;
        if ((C18U.A06(C06090Tz.A05, userSession, 36326163374683864L) && !AbstractC129385t0.A03(userSession)) || (interfaceC670430v = this.A02) == null) {
            return false;
        }
        return interfaceC670430v.Eiv(AFI_TYPE.A0D, c38321qM, num);
    }

    public final void A00(C38321qM c38321qM, Integer num) {
        InterfaceC670430v interfaceC670430v;
        String A2W;
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((C18U.A06(c06090Tz, userSession, 36326163374683864L) && !AbstractC129385t0.A03(userSession)) || (interfaceC670430v = this.A02) == null) {
            return;
        }
        C65192xH c65192xH = this.A01;
        C75113Zb BRZ = c65192xH.BRZ(c38321qM);
        if (!C18U.A06(c06090Tz, userSession, 36312866155922778L) && !AbstractC61652rS.A08(userSession, AbstractC23021Ah.A00(userSession))) {
            A2W = c38321qM.getId();
        } else {
            A2W = c38321qM.A2W();
        }
        if (A2W != null) {
            interfaceC670430v.Cw2(AFI_TYPE.A0D, c38321qM, BRZ, num, c65192xH.BK6(A2W));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean A01(C38321qM c38321qM) {
        Boolean Caf;
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null && (Caf = injected.Caf()) != null && Caf.booleanValue()) {
            if (C18U.A06(C06090Tz.A06, this.A00, 36314652862515965L)) {
                return true;
            }
        }
        return false;
    }

    public C691338z(UserSession userSession, C65192xH c65192xH, InterfaceC670430v interfaceC670430v) {
        this.A00 = userSession;
        this.A02 = interfaceC670430v;
        this.A01 = c65192xH;
    }
}
