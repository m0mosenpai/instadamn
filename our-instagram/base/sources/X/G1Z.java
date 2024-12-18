package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class G1Z implements InterfaceC160517Hl {
    public static final G1Z A00 = new Object();

    public static final boolean A00(UserSession userSession, C81613kW c81613kW) {
        return c81613kW != null && (c81613kW.A04.A01 & 4096) > 0 && C18U.A06(C06090Tz.A05, userSession, 2342168601358841020L);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CPX() {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CPf(UserSession userSession, C7TT c7tt) {
        C14360o3.A0B(userSession, 0);
        return A00(userSession, c7tt.A0G);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CPg(UserSession userSession, C2EC c2ec) {
        C14360o3.A0B(userSession, 0);
        return A00(userSession, c2ec.Aic());
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CPh(UserSession userSession, E70 e70) {
        C14360o3.A0B(userSession, 0);
        return A00(userSession, e70.A0D);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CQO(UserSession userSession, DirectThreadKey directThreadKey) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CRU() {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CSm(UserSession userSession) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CVM(UserSession userSession, DirectThreadKey directThreadKey) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CVN(UserSession userSession) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CXm() {
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CYE(UserSession userSession, DirectThreadKey directThreadKey) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CYI(UserSession userSession) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Can(UserSession userSession) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Ccm(UserSession userSession) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Ccn() {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CdH() {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cdc(UserSession userSession, DirectThreadKey directThreadKey, int i) {
        return true;
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
            if (C6X6.A0W(C7W.A0b, C7W.A0r, C7W.A0y, C7W.A0o, C7W.A1G) && C18U.A06(C06090Tz.A05, userSession, 2342168601357857974L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CfF(UserSession userSession) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CfG(UserSession userSession) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cfl(UserSession userSession, DirectThreadKey directThreadKey) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cg1(UserSession userSession, DirectThreadKey directThreadKey) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cg5(UserSession userSession) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cg6(UserSession userSession, DirectThreadKey directThreadKey) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean Cg7(UserSession userSession) {
        return true;
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CPn(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36331154126881985L);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CSE(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36331154126685374L);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CUU(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36331154126750911L);
    }

    @Override // X.InterfaceC160517Hl
    public final boolean CZ4(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36331154126947522L);
    }

    @Override // X.InterfaceC160517Hl
    public final EnumC92794Ds Ay7() {
        return EnumC92794Ds.A05;
    }
}
