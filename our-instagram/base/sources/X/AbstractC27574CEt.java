package X;

import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.session.UserSession;

/* renamed from: X.CEt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27574CEt {
    public static final void A00(C5Tl c5Tl, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, int i) {
        int i2;
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(interfaceC60442pS, str, interfaceC16660sJ);
        AbstractC25234BEr.A0k(4, interfaceC16820sZ, interfaceC16660sJ2, interfaceC16820sZ2, interfaceC16660sJ3);
        AbstractC167007dF.A1J(interfaceC16820sZ3, 8, interfaceC16820sZ4);
        c5Tl.Enr(1839373428);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, userSession) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC60442pS);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16660sJ2);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ2);
        }
        if ((12582912 & i) == 0) {
            i2 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16660sJ3);
        }
        if ((100663296 & i) == 0) {
            i2 |= AbstractC25232BEp.A0P(c5Tl, interfaceC16820sZ3);
        }
        if ((805306368 & i) == 0) {
            i2 |= AbstractC25232BEp.A0Q(c5Tl, interfaceC16820sZ4);
        }
        if ((306783379 & i2) == 306783378 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(795728733, "com.instagram.barcelonaig.fragment.BarcelonaIgScreen (BarcelonaIgScreen.kt:44)");
            }
            AbstractC25638BVa.A00(c5Tl, userSession, interfaceC60442pS.getModuleName(), C5UA.A01(c5Tl, new C30323DWy(userSession, interfaceC16660sJ, interfaceC16820sZ, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC60442pS, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, str, 0), 2131696089), ((i2 << 3) & 112) | 3072, 4, false);
            if (C0fH.A02()) {
                C0fH.A00(1467849085);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30302DWd(userSession, interfaceC60442pS, str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ3, i);
        }
    }
}
