package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.7Cy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC159387Cy {
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0163, code lost:
    
        if (((X.C33731iZ) r13).A08().A05() != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x024f, code lost:
    
        if (r2.Ar9() != X.C2EY.A1r) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        if (r0.A05() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:
    
        if (((X.C29721bn) r13).A08 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b3, code lost:
    
        if (((X.C31191eO) r13).A04.A05() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (X.C18U.A06(r2, r12, r0) != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC159397Cz A00(com.instagram.common.session.UserSession r12, X.C1OW r13, com.instagram.model.direct.DirectThreadKey r14) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC159387Cy.A00(com.instagram.common.session.UserSession, X.1OW, com.instagram.model.direct.DirectThreadKey):X.7Cz");
    }

    public static final EnumC159397Cz A01(UserSession userSession, AbstractC29011ae abstractC29011ae) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(abstractC29011ae, 1);
        List C7R = abstractC29011ae.C7R();
        C14360o3.A07(C7R);
        DirectThreadKey directThreadKey = (DirectThreadKey) AbstractC001800i.A0J(C7R);
        if (directThreadKey == null) {
            return EnumC159397Cz.A06;
        }
        return A00(userSession, abstractC29011ae, directThreadKey);
    }

    public static final EnumC159397Cz A02(UserSession userSession, DirectThreadKey directThreadKey, Boolean bool, Integer num, boolean z) {
        return A03(userSession, directThreadKey, bool, num, z, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e9, code lost:
    
        if (((java.util.Set) r7.A01.getValue()).contains(r1) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0201, code lost:
    
        if ((r1.A04.A01 & 42) == 42) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0258, code lost:
    
        if (X.C18U.A06(r2, r8, r0) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0104, code lost:
    
        if (X.C18U.A06(r3, r8, 36320871975166935L) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x028e, code lost:
    
        if (r0 == false) goto L67;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x0179. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC159397Cz A03(com.instagram.common.session.UserSession r8, com.instagram.model.direct.DirectThreadKey r9, java.lang.Boolean r10, java.lang.Integer r11, boolean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC159387Cy.A03(com.instagram.common.session.UserSession, com.instagram.model.direct.DirectThreadKey, java.lang.Boolean, java.lang.Integer, boolean, boolean, boolean):X.7Cz");
    }

    public static final EnumC159397Cz A04(UserSession userSession, DirectThreadKey directThreadKey, Integer num) {
        return A03(userSession, directThreadKey, null, num, false, false, false);
    }

    public static final EnumC159397Cz A05(UserSession userSession, DirectThreadKey directThreadKey, Integer num, boolean z) {
        boolean z2;
        Boolean bool;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(directThreadKey, 1);
        C14360o3.A0B(num, 2);
        C81663kb A03 = C2DU.A03((C2DU) C2JD.A00(userSession), directThreadKey);
        if (A03 != null) {
            z2 = A03.CWO();
            L1W B2W = A03.B2W();
            if (B2W != null) {
                bool = Boolean.valueOf(AbstractC46831KnQ.A00(B2W));
                return A03(userSession, directThreadKey, bool, num, z2, z, false);
            }
        } else {
            z2 = false;
        }
        bool = null;
        return A03(userSession, directThreadKey, bool, num, z2, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A07(UserSession userSession, AbstractC29011ae abstractC29011ae, DirectThreadKey directThreadKey) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(directThreadKey, 1);
        C14360o3.A0B(abstractC29011ae, 2);
        if (A00(userSession, abstractC29011ae, directThreadKey).A00()) {
            if (abstractC29011ae instanceof C29721bn) {
                C29721bn c29721bn = (C29721bn) abstractC29011ae;
                if (c29721bn.A0D == null && c29721bn.A0F == null) {
                    return true;
                }
                return false;
            }
            if (!(abstractC29011ae instanceof InterfaceC29491bQ) || ((InterfaceC29491bQ) abstractC29011ae).ACZ() != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A08(UserSession userSession, DirectThreadKey directThreadKey, Integer num) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(num, 2);
        if (directThreadKey == null || A03(userSession, directThreadKey, null, num, false, false, false) == EnumC159397Cz.A06) {
            return false;
        }
        return true;
    }

    public static final boolean A06(UserSession userSession, C31481er c31481er) {
        C83403nh BSh = C2JD.A00(userSession).BSh(new DirectThreadKey(c31481er.A03().A07, null), c31481er.A03().A06);
        if (BSh == null || BSh.A0W() != EnumC40111tc.A0a) {
            return false;
        }
        return true;
    }
}
