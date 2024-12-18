package X;

import com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl;
import com.instagram.user.model.User;

/* renamed from: X.OdU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55166OdU {
    public static final C55166OdU A00 = new Object();

    public final C51943MxQ A03(C147236jz c147236jz, InterfaceC57873Pld interfaceC57873Pld, OUT out, C54479O5h c54479O5h, OIA oia, String str) {
        Integer num;
        C51932MxF c51932MxF;
        C14360o3.A0B(interfaceC57873Pld, 0);
        AbstractC25233BEq.A0w(1, c54479O5h, oia, out);
        boolean A01 = A01(interfaceC57873Pld);
        boolean z = interfaceC57873Pld instanceof C51932MxF;
        if (!z) {
            num = C05F.A00;
        } else if (A02(out, c54479O5h, AbstractC54229NyA.A00((C51932MxF) interfaceC57873Pld))) {
            num = C05F.A0C;
        } else if (C18U.A06(C06090Tz.A05, oia.A00, 36320691586343732L)) {
            num = C05F.A0N;
        } else {
            num = C05F.A01;
        }
        User user = null;
        if (z && (c51932MxF = (C51932MxF) interfaceC57873Pld) != null) {
            user = AbstractC54229NyA.A00(c51932MxF);
        }
        return new C51943MxQ(A00(c147236jz, c54479O5h, user, str, oia.A00(), false), num, A01);
    }

    public static final boolean A01(InterfaceC57873Pld interfaceC57873Pld) {
        if (interfaceC57873Pld instanceof C51932MxF) {
            C51932MxF c51932MxF = (C51932MxF) interfaceC57873Pld;
            if (c51932MxF.A00.A1B) {
                C38321qM c38321qM = c51932MxF.A01.A0b;
                if (c38321qM != null) {
                    Boolean Aki = c38321qM.A0C.Aki();
                    if (Aki != null && Aki.booleanValue()) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static final InterfaceC57875Plf A00(C147236jz c147236jz, C54479O5h c54479O5h, User user, String str, boolean z, boolean z2) {
        InterfaceC57875Plf interfaceC57875Plf;
        boolean A1V = AbstractC167007dF.A1V(c54479O5h);
        Integer num = null;
        if (user != null) {
            OCL ocl = c54479O5h.A00;
            num = null;
            if (ocl.A01.A0H(ocl.A00, AbstractC140386Ws.A00(user, false)) && DisappearingModePluginImpl.A01 != null) {
                num = 2131961071;
            }
        }
        if (z && str != null) {
            interfaceC57875Plf = new C51937MxK(str, 0);
        } else {
            if (user != null) {
                user.getUsername();
                if (c147236jz.A00 == C3G2.A0a) {
                    interfaceC57875Plf = new C51937MxK(user.getUsername(), A1V ? 1 : 0);
                }
            }
            if (num != null) {
                interfaceC57875Plf = new C51936MxJ(num.intValue());
            } else if (z2) {
                interfaceC57875Plf = C56750PGs.A00;
            } else {
                interfaceC57875Plf = C56749PGr.A00;
            }
        }
        return interfaceC57875Plf;
    }

    public static final boolean A02(OUT out, C54479O5h c54479O5h, User user) {
        AbstractC167017dG.A1P(c54479O5h, out);
        if (user != null) {
            OCL ocl = c54479O5h.A00;
            if (!ocl.A01.A0H(ocl.A00, AbstractC140386Ws.A00(user, false))) {
                if (out.A01.A0I(out.A00, AbstractC140386Ws.A00(user, false))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
