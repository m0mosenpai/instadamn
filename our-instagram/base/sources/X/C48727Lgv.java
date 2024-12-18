package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.List;

/* renamed from: X.Lgv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48727Lgv implements C7FA {
    public final C47663L2w A00;

    @Override // X.C7FA
    public final boolean Ccl(int i) {
        return true;
    }

    @Override // X.C7FA
    public final void Dke(MessageIdentifier messageIdentifier, List list) {
    }

    @Override // X.C7FA
    public final void Dkg(C26086BgF c26086BgF, Long l, List list) {
    }

    @Override // X.C7FA
    public final void Dzc(C26086BgF c26086BgF, C211689Zc c211689Zc, ClipInfo clipInfo, C47Z c47z, Long l, String str, int i, boolean z) {
    }

    @Override // X.C7FA
    public final void DYV(C26086BgF c26086BgF, C211689Zc c211689Zc, C47Z c47z, C183978Ee c183978Ee, Long l, int i, boolean z) {
        boolean z2;
        C47663L2w c47663L2w = this.A00;
        C49299Lqt c49299Lqt = c47663L2w.A01;
        C7FF c7ff = c49299Lqt.A01;
        int i2 = c47663L2w.A00.A05;
        C47Z c47z2 = c47663L2w.A03;
        c7ff.ELx(c183978Ee, c47z2.A35, i2);
        DirectThreadKey directThreadKey = c47663L2w.A02;
        UserSession userSession = c49299Lqt.A00;
        C81663kb B3U = C2JD.A00(userSession).B3U(directThreadKey);
        boolean z3 = false;
        if (B3U != null) {
            z2 = B3U.CWO();
            z3 = B3U.Ay8();
        } else {
            z2 = false;
        }
        EnumC159397Cz A02 = AbstractC159387Cy.A02(userSession, directThreadKey, Boolean.valueOf(z3), C05F.A0N, z2);
        ShareType shareType = ShareType.A0E;
        C40121td c40121td = c49299Lqt.A02;
        C47Z A08 = LLY.A08(c47z2, shareType, c183978Ee, AbstractC43593JPy.A0r(AbstractC43593JPy.A0w()), null, null, A02.A01());
        A08.A5h = true;
        A08.A1Q = new C54968OSz(true);
        PendingMediaStore A00 = C25A.A00(userSession);
        A00.A07.add(A08.A35);
        LLY.A09(userSession, directThreadKey, A08, c183978Ee);
        c40121td.A0C(A08);
        c40121td.A0G(A08, true, true);
        AbstractC47064KrL.A00(A08);
    }

    public C48727Lgv(C47663L2w c47663L2w) {
        this.A00 = c47663L2w;
    }
}
