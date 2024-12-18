package X;

import com.facebookpay.logging.LoggingContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Vwa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69849Vwa {
    public static final void A00(C67726Uws c67726Uws) {
        boolean z;
        boolean z2;
        Boolean bool;
        boolean z3 = false;
        C14360o3.A0B(c67726Uws, 0);
        if (!c67726Uws.A0R) {
            List A06 = c67726Uws.A08().A06();
            if (!(A06 instanceof Collection) || !A06.isEmpty()) {
                for (Object obj : A06) {
                    if (c67726Uws.A08().A0T.get(obj) != null) {
                        UFU A08 = c67726Uws.A08();
                        C14360o3.A0B(obj, 0);
                        WDM wdm = (WDM) A08.A0T.get(obj);
                        if (wdm == null || wdm.A00 == null) {
                            z = false;
                            break;
                        }
                    }
                }
            }
            z = true;
            if (C2FP.A0D().A04() && (AbstractC166997dE.A1Z(c67726Uws.A08().A08.A02(), true) || !c67726Uws.A0S)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && !z2) {
                c67726Uws.A0R = true;
                Iterator it = c67726Uws.A08().A06().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        UFU A082 = c67726Uws.A08();
                        C14360o3.A0B(next, 0);
                        WDM wdm2 = (WDM) A082.A0T.get(next);
                        if (wdm2 != null) {
                            bool = wdm2.A00;
                        } else {
                            bool = null;
                        }
                        if (AbstractC166997dE.A1Z(bool, false)) {
                            break;
                        }
                    } else {
                        z3 = true;
                        break;
                    }
                }
                UFU A083 = c67726Uws.A08();
                Wap wap = C2FP.A01().A04;
                LoggingContext loggingContext = A083.A0R;
                C70073W1q A05 = A083.A0S.A05();
                if (z3) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C70199WGm.A08(A05, linkedHashMap);
                    Wap.A02(new C25531Mh(MSY.A0H(wap.A00, "client_load_ecpcheckout_success"), 57), loggingContext, linkedHashMap, "nux_checkout", 26);
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    C70199WGm.A08(A05, linkedHashMap2);
                    wap.A0Z(loggingContext, "nux_checkout", linkedHashMap2);
                }
            }
        }
    }

    public static final boolean A01(InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                interfaceC16620sF.invoke(true, null);
                return true;
            }
        } else if (!z2) {
            return true;
        }
        if (z && !z2) {
            interfaceC16620sF.invoke(false, new RuntimeException("Required component failed to load"));
            return false;
        }
        interfaceC16620sF.invoke(false, new RuntimeException("Component was loaded but is not required"));
        return false;
    }
}
