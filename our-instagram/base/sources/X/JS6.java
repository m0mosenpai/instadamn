package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* loaded from: classes8.dex */
public final class JS6 {
    public static final JS6 A00 = new Object();

    public static final void A01(UserSession userSession, Capabilities capabilities, C43929Jbe c43929Jbe, InterfaceC50518MRv interfaceC50518MRv, List list, boolean z) {
        if (capabilities.A00(EnumC2054697t.A0E)) {
            if ((z || (C2E7.A02(C08730cb.A00(userSession).A00()) && ((Boolean) c43929Jbe.A05.getValue()).booleanValue())) && !interfaceC50518MRv.CXl() && !interfaceC50518MRv.Cf6()) {
                list.add(4);
            }
        }
    }

    public static final void A02(UserSession userSession, Capabilities capabilities, InterfaceC50518MRv interfaceC50518MRv, List list, boolean z) {
        int i;
        if (capabilities.A00(EnumC2054697t.A17) && !interfaceC50518MRv.CXl() && z) {
            if (!interfaceC50518MRv.CVQ() && !interfaceC50518MRv.CX1() && (C08730cb.A00(userSession).A00().A1u() || (C08730cb.A00(userSession).A00().A1x() && C18U.A06(C06090Tz.A05, userSession, 36316813231133345L)))) {
                i = 34;
            } else {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36322362328688838L) || C18U.A06(c06090Tz, userSession, 36330007370416768L)) {
                    return;
                }
                i = 3;
                if (interfaceC50518MRv.CUy()) {
                    i = 11;
                }
            }
            list.add(Integer.valueOf(i));
        }
    }

    public static final void A00(Context context, UserSession userSession, InterfaceC50518MRv interfaceC50518MRv, List list) {
        if ((interfaceC50518MRv.CCb() instanceof DirectThreadKey) && LockedChatKillSwitch.isLockedChatEnabled(userSession, false) && AbstractC31668DvY.A00(context).A02()) {
            int i = 43;
            if (interfaceC50518MRv.CXo()) {
                i = 44;
            }
            list.add(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (((java.lang.Boolean) r6.A08.getValue()).booleanValue() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (((java.lang.Boolean) r6.A06.getValue()).booleanValue() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(com.instagram.common.session.UserSession r5, X.C43929Jbe r6, X.InterfaceC50518MRv r7, java.util.List r8) {
        /*
            X.0sy r0 = X.C08730cb.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.C2E7.A02(r0)
            r4 = 1
            if (r0 == 0) goto L28
            int r0 = r7.C7g()
            boolean r0 = X.C4GR.A04(r0)
            if (r0 != 0) goto L28
            X.0do r0 = r6.A06
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 != 0) goto L29
        L28:
            r3 = 0
        L29:
            X.0sy r0 = X.C08730cb.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.C2E7.A03(r0)
            if (r0 == 0) goto L50
            int r0 = r7.C7g()
            boolean r0 = X.C4GR.A04(r0)
            if (r0 != 0) goto L50
            X.0do r0 = r6.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != 0) goto L51
        L50:
            r2 = 0
        L51:
            int r1 = r7.C7g()
            r0 = 29
            if (r1 != r0) goto L85
            X.0do r0 = r6.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L85
        L67:
            boolean r0 = r7.CaO()
            if (r0 == 0) goto L84
            if (r3 != 0) goto L73
            if (r2 != 0) goto L73
            if (r4 == 0) goto L84
        L73:
            boolean r1 = r7.CaK()
            r0 = 24
            if (r1 == 0) goto L7d
            r0 = 25
        L7d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.add(r0)
        L84:
            return
        L85:
            r4 = 0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JS6.A03(com.instagram.common.session.UserSession, X.Jbe, X.MRv, java.util.List):void");
    }

    public static final void A04(UserSession userSession, InterfaceC50518MRv interfaceC50518MRv, List list) {
        if (C98Q.A00(userSession).A00(JRE.A05(interfaceC50518MRv.CCb()), 25)) {
            int i = 8;
            if (interfaceC50518MRv.isMuted()) {
                i = 13;
            }
            list.add(Integer.valueOf(i));
        }
    }

    public static final void A05(UserSession userSession, InterfaceC50518MRv interfaceC50518MRv, List list, int i) {
        int i2;
        if (interfaceC50518MRv.C7C() == 3 && C18U.A06(C06090Tz.A05, userSession, 36317908448384680L)) {
            if (i == 3) {
                if (interfaceC50518MRv.CVl()) {
                    i2 = 38;
                    if (C2E7.A03(C08730cb.A00(userSession).A00())) {
                        i2 = 37;
                    }
                } else {
                    return;
                }
            } else {
                i2 = 36;
                if (C2E7.A03(C08730cb.A00(userSession).A00())) {
                    i2 = 35;
                }
            }
            list.add(Integer.valueOf(i2));
        }
    }

    public static final boolean A06(UserSession userSession, InterfaceC50518MRv interfaceC50518MRv) {
        if (interfaceC50518MRv.C7g() == 29 && C14360o3.A0K(interfaceC50518MRv.Asv(), userSession.userId) && C18U.A06(C06090Tz.A05, userSession, 36328581441273494L)) {
            return true;
        }
        return false;
    }
}
