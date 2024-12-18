package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;

/* renamed from: X.G2t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36367G2t implements InterfaceC37156GYt {
    public final UserSession A00;
    public final E70 A01;
    public final Capabilities A02;
    public final C23031Ai A03;

    public C36367G2t(UserSession userSession, Capabilities capabilities, E70 e70, C23031Ai c23031Ai) {
        AbstractC167007dF.A1F(userSession, 1, c23031Ai);
        this.A00 = userSession;
        this.A01 = e70;
        this.A02 = capabilities;
        this.A03 = c23031Ai;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        String valueOf;
        E70 e70 = this.A01;
        C3o9 A08 = e70.A08();
        if (JRE.A02(A08) != null) {
            valueOf = AbstractC31172DnG.A15(A08);
        } else {
            if (A08 instanceof MsysThreadId) {
                valueOf = String.valueOf(((MsysThreadId) A08).A00);
            }
            throw AbstractC166987dD.A14("Expected threadId");
        }
        if (valueOf != null) {
            return AbstractC166987dD.A1J(C36731GHa.A02(new C35731FqE(valueOf, this, 1), 2131959958, e70.A0l));
        }
        throw AbstractC166987dD.A14("Expected threadId");
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        boolean z;
        String valueOf;
        E70 e70 = this.A01;
        C81543kP c81543kP = e70.A0E;
        if (c81543kP != null) {
            z = c81543kP.A0Q;
        } else {
            z = false;
        }
        if (!e70.A0v || E70.A05(e70) || e70.A0n || e70.A0B()) {
            return false;
        }
        C23031Ai c23031Ai = this.A03;
        if (!c23031Ai.A22() || !AbstractC167017dG.A1b(c23031Ai, c23031Ai.A63, C23031Ai.A8c, 200) || !this.A02.A00(EnumC2054697t.A0V)) {
            return false;
        }
        C3o9 A08 = e70.A08();
        if (JRE.A02(A08) != null) {
            valueOf = AbstractC31172DnG.A15(A08);
        } else {
            if (!(A08 instanceof MsysThreadId)) {
                return false;
            }
            valueOf = String.valueOf(((MsysThreadId) A08).A00);
        }
        if (valueOf == null) {
            return false;
        }
        UserSession userSession = this.A00;
        if (!C18U.A06(C06090Tz.A06, userSession, 36314485358594687L)) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36310314945413132L) || z || C18U.A06(c06090Tz, userSession, 36314485360364163L) || C18U.A06(c06090Tz, userSession, 36314485361805959L)) {
            return false;
        }
        return true;
    }
}
