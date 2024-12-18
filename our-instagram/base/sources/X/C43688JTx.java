package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.JTx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43688JTx implements InterfaceC160517Hl {
    public static final C43688JTx A00 = new Object();

    @Override // X.InterfaceC160517Hl
    public final boolean CPX() {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CPf(UserSession userSession, C7TT c7tt) {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CPg(UserSession userSession, C2EC c2ec) {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CPh(UserSession userSession, E70 e70) {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CPn(UserSession userSession) {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CQO(UserSession userSession, DirectThreadKey directThreadKey) {
        return (directThreadKey == null || AbstractC159387Cy.A04(userSession, directThreadKey, C05F.A09) == EnumC159397Cz.A06) ? false : true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CRU() {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CSE(UserSession userSession) {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CUU(UserSession userSession) {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CVM(UserSession userSession, DirectThreadKey directThreadKey) {
        return (directThreadKey == null || AbstractC159387Cy.A04(userSession, directThreadKey, C05F.A06) == EnumC159397Cz.A06) ? false : true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CXm() {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CYE(UserSession userSession, DirectThreadKey directThreadKey) {
        C14360o3.A0B(userSession, 0);
        if (!AbstractC159387Cy.A08(userSession, directThreadKey, C05F.A0N) && !AbstractC159387Cy.A08(userSession, directThreadKey, C05F.A0Y)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CZ4(UserSession userSession) {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Ccm(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC46749Km6.A00(userSession) && C18U.A06(C06090Tz.A05, userSession, 36323560625220976L)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Ccn() {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CdH() {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cdc(UserSession userSession, DirectThreadKey directThreadKey, int i) {
        C14360o3.A0B(userSession, 0);
        if (CYE(userSession, directThreadKey) && i > 1 && AbstractC159387Cy.A08(userSession, directThreadKey, C05F.A0A)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cdn(UserSession userSession) {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CeN(UserSession userSession, InterfaceC163837Ux interfaceC163837Ux) {
        C14360o3.A0B(userSession, 0);
        C7TT C7W = interfaceC163837Ux.C7W();
        InterfaceC83713oG C7i = interfaceC163837Ux.C7i();
        C14360o3.A07(C7i);
        if (C7i instanceof InterfaceC83703oF) {
            if (C6X6.A0W(C7W.A0b, C7W.A0r, C7W.A0y, C7W.A0o, C7W.A1G) && C6X6.A06(userSession)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cfl(UserSession userSession, DirectThreadKey directThreadKey) {
        C14360o3.A0B(userSession, 0);
        return AbstractC159387Cy.A08(userSession, directThreadKey, C05F.A0Y);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cg6(UserSession userSession, DirectThreadKey directThreadKey) {
        C14360o3.A0B(userSession, 0);
        return AbstractC159387Cy.A08(userSession, directThreadKey, C05F.A1F);
    }

    @Override // X.InterfaceC160517Hl
    public final EnumC92794Ds Ay7() {
        return EnumC92794Ds.A04;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CSm(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36322830480255668L);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CVN(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36321473270523389L);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CYI(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36321473270720000L);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Can(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36320485428437544L);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CfF(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36322830480321205L);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CfG(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36322830480124594L);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cg1(UserSession userSession, DirectThreadKey directThreadKey) {
        if (AbstractC159387Cy.A08(userSession, directThreadKey, C05F.A04) && AbstractC159387Cy.A08(userSession, directThreadKey, C05F.A03)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cg5(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36321473270588926L);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cg7(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36321473270654463L);
    }
}
