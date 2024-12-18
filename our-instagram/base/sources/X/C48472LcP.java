package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.List;

/* renamed from: X.LcP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48472LcP implements InterfaceC1345866i {
    public final /* synthetic */ C7TG A00;
    public final /* synthetic */ C47588Kzy A01;
    public final /* synthetic */ MessageIdentifier A02;
    public final /* synthetic */ C3o9 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public C48472LcP(C7TG c7tg, C47588Kzy c47588Kzy, MessageIdentifier messageIdentifier, C3o9 c3o9, String str, List list, boolean z) {
        this.A03 = c3o9;
        this.A00 = c7tg;
        this.A05 = list;
        this.A02 = messageIdentifier;
        this.A06 = z;
        this.A04 = str;
        this.A01 = c47588Kzy;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        Boolean bool;
        C14360o3.A0B(c1346766r, 0);
        DirectThreadKey A01 = JRE.A01(this.A03);
        C7TG c7tg = this.A00;
        List list = this.A05;
        MessageIdentifier messageIdentifier = this.A02;
        boolean z = this.A06;
        String str = this.A04;
        C47588Kzy c47588Kzy = this.A01;
        String A03 = C7TG.A03(c7tg, false);
        UserSession userSession = c7tg.A03;
        L1W A00 = LCT.A00(userSession, A01);
        if (A00 != null) {
            bool = Boolean.valueOf(AbstractC46831KnQ.A00(A00));
        } else {
            bool = null;
        }
        boolean A012 = AbstractC159387Cy.A02(userSession, A01, bool, C05F.A0A, z).A01();
        JTa A04 = AbstractC31277Doz.A04(userSession, LCT.A00(userSession, A01), C31191eO.class, str, null, z);
        String str2 = A04.A03;
        C7TG.A08(c7tg, A01, str2, A03, null, 15, list.size(), z, A012);
        C31191eO c31191eO = new C31191eO(null, null, A04, c47588Kzy, null, LLY.A04(userSession, A01, ShareType.A0E, C40121td.A0G.A01(c7tg.A02, userSession), AbstractC43593JPy.A0r(str2), list, A012), A01, messageIdentifier, false, LCT.A01(userSession, A01), null, AbstractC31177DnL.A05(), false);
        if (AbstractC166987dD.A1b(list)) {
            String A06 = c31191eO.A06();
            String str3 = A01.A00;
            int i = 2;
            if (((AbstractC47560KzV) list.get(0)).A01) {
                i = 4;
            }
            C7TG.A09(c7tg, null, A03, A06, str3, i, list.size(), 0L, 0L, 0L, z, A012);
        }
        AbstractC31173DnH.A1U(userSession, c31191eO);
        c1346766r.A02(new C48495Lcm(0));
        c1346766r.A00();
    }
}
