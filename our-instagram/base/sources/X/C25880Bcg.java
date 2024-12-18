package X;

import com.instagram.api.schemas.Achievement;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Bcg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25880Bcg extends AbstractC52922bZ implements InterfaceC30941Div {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final CUN A03;
    public final InterfaceC06180Ui A04;
    public final InterfaceC06180Ui A05;
    public final InterfaceC15070pN A06;
    public final InterfaceC15070pN A07;

    public C25880Bcg(InterfaceC11380iw interfaceC11380iw, UserSession userSession, CUN cun) {
        AbstractC167007dF.A1D(userSession, 1, interfaceC11380iw);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = cun;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 1, 0);
        this.A05 = A00;
        this.A07 = new C06160Ug(null, A00);
        AnonymousClass057 A002 = C10M.A00(num, 0, 0);
        this.A04 = A002;
        this.A06 = new C06160Ug(null, A002);
    }

    public final void A00(C26118Bh2 c26118Bh2) {
        C14360o3.A0B(c26118Bh2, 0);
        if (!this.A00) {
            List A00 = C29137Ct4.A00(c26118Bh2.A00);
            UserSession userSession = this.A02;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(2558));
            if (A0f.isSampled()) {
                AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
                AbstractC25229BEm.A19(A0f, 0);
                AbstractC25225BEi.A1P(A0f, "");
                A0f.AAP(AbstractC111324zv.A00(2002), "clips_achievement_combined_list");
                A0f.AAk("achievements", A00);
                A0f.Cht();
            }
            this.A00 = true;
        }
    }

    @Override // X.InterfaceC30941Div
    public final void CuR(Achievement achievement) {
        BQL bql;
        boolean A1W = AbstractC167007dF.A1W(achievement.A05);
        C29137Ct4.A00(AbstractC166987dD.A1J(achievement));
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        EnumC120795dP enumC120795dP = EnumC120795dP.A08;
        if (Boolean.valueOf(A1W) == null) {
            bql = BQL.A0S;
        } else if (A1W) {
            bql = BQL.A0V;
        } else {
            bql = BQL.A0W;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_clips_viewer_link_tap");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC25236BEt.A0m(A0f, 0, 0L);
            A0f.A8R(bql, "action");
            AbstractC25225BEi.A1M(enumC120795dP, A0f);
            A0f.Cht();
        }
        D53.A03(achievement, this, AbstractC141776au.A00(this), 6);
    }
}
