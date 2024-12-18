package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class DIE extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIE(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A07 = obj;
        this.A05 = obj2;
        this.A01 = i;
        this.A04 = obj3;
        this.A06 = obj4;
        this.A02 = obj5;
        this.A03 = obj6;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Integer num;
        C206289Bl c206289Bl;
        C51755Mte c51755Mte;
        C51755Mte c51755Mte2;
        int i;
        C64042vP c64042vP;
        HBC hbc;
        IntentAwareAdPivotState intentAwareAdPivotState;
        Integer num2;
        switch (this.A00) {
            case 0:
                C6Nu c6Nu = (C6Nu) obj;
                C14360o3.A0B(c6Nu, 0);
                C26045BfY c26045BfY = (C26045BfY) this.A07;
                if (c26045BfY.A07) {
                    AbstractC25227BEk.A14(c6Nu, new C30542DcP((InterfaceC74953Yl) this.A06, (InterfaceC74953Yl) this.A02, c26045BfY, (InterfaceC16620sF) this.A04, this.A01), null, -666838915);
                }
                AbstractC25227BEk.A14(c6Nu, new C30567Dco(this.A01, 0, c26045BfY, this.A02, this.A06, this.A03, this.A04), null, -1645033886);
                C26084BgD c26084BgD = (C26084BgD) this.A05;
                CI6.A00(c6Nu, (InterfaceC30819Dgu) c26084BgD.A03, (C6R) c26084BgD.A02, c26084BgD.A01);
                return C0eB.A00;
            case 1:
            case 4:
            default:
                C60662pp c60662pp = (C60662pp) this.A04;
                C38321qM c38321qM = (C38321qM) this.A02;
                C75113Zb c75113Zb = (C75113Zb) this.A07;
                i = this.A01;
                c60662pp.A0K(c38321qM, c75113Zb, i);
                c64042vP = (C64042vP) this.A05;
                hbc = (HBC) this.A03;
                intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
                num2 = C05F.A0N;
                break;
            case 2:
            case 3:
                C60662pp c60662pp2 = (C60662pp) this.A04;
                C38321qM c38321qM2 = (C38321qM) this.A02;
                C75113Zb c75113Zb2 = (C75113Zb) this.A07;
                i = this.A01;
                c60662pp2.A0L(c38321qM2, c75113Zb2, i);
                c64042vP = (C64042vP) this.A05;
                hbc = (HBC) this.A03;
                intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
                num2 = C05F.A0C;
                break;
            case 5:
                C25306BIb c25306BIb = (C25306BIb) obj;
                C14360o3.A0B(c25306BIb, 0);
                List<C47O> list = c25306BIb.A0J;
                User user = (User) this.A06;
                FollowStatus followStatus = (FollowStatus) this.A03;
                ArrayList A0i = AbstractC167007dF.A0i(list);
                for (C47O c47o : list) {
                    if (C14360o3.A0K(c47o.getId(), user.getId())) {
                        c47o.A03.A0k(followStatus);
                    }
                    A0i.add(c47o);
                }
                List<C5HW> list2 = c25306BIb.A0F;
                ActivityFeedViewModel activityFeedViewModel = (ActivityFeedViewModel) this.A07;
                int i2 = this.A01;
                FollowStatus followStatus2 = (FollowStatus) this.A04;
                MUD mud = (MUD) this.A02;
                Object obj2 = this.A05;
                ArrayList A0i2 = AbstractC167007dF.A0i(list2);
                for (C5HW c5hw : list2) {
                    if (C14360o3.A0K(AbstractC25228BEl.A18(c5hw.A04()), user.getId())) {
                        EnumC33370Ep3 enumC33370Ep3 = EnumC33370Ep3.A08;
                        if (user.CQf()) {
                            num = C05F.A0Y;
                        } else {
                            if (followStatus2 != null) {
                                int ordinal = followStatus2.ordinal();
                                if (ordinal != 4) {
                                    if (ordinal != 3) {
                                        if (ordinal == 5) {
                                            num = C05F.A0N;
                                        }
                                    } else {
                                        num = C05F.A00;
                                    }
                                } else {
                                    num = C05F.A01;
                                }
                            }
                            num = null;
                        }
                        AbstractC166987dD.A1Z(new MCB(activityFeedViewModel, c5hw, new C51693MsO(mud, enumC33370Ep3, num, i2), null, null, i2, 6), AbstractC141776au.A00(activityFeedViewModel));
                        User A04 = c5hw.A04();
                        if (A04 != null) {
                            A04.A0k(followStatus);
                        }
                        if (followStatus == FollowStatus.A05 && obj2 == C05F.A00 && (c206289Bl = c5hw.A04.A08) != null && (c51755Mte = (C51755Mte) c206289Bl.A04) != null && (c51755Mte2 = (C51755Mte) c51755Mte.A00) != null && Boolean.TRUE.equals(c51755Mte2.A00)) {
                            InterfaceC09390do interfaceC09390do = activityFeedViewModel.A0C;
                            CSH csh = (CSH) interfaceC09390do.getValue();
                            if (csh != null && !C14360o3.A0K(csh.A01, user)) {
                                csh.A01 = user;
                                C1ON A00 = AbstractC31484DsT.A00(csh.A02, C05F.A0C, user.getId(), null, false);
                                A00.A00 = new MWM(9, user, csh);
                                csh.A00 = A00;
                                C1GJ.A04(A00, 359266386);
                            }
                            CSH csh2 = (CSH) interfaceC09390do.getValue();
                            if (csh2 != null) {
                                AbstractC25232BEp.A1J(activityFeedViewModel, new PZX(activityFeedViewModel, null, 6), csh2.A03);
                            }
                        }
                    }
                    A0i2.add(c5hw);
                }
                return C25306BIb.A00(null, null, null, null, c25306BIb, null, A0i2, A0i, null, 131065);
            case 6:
                C6Nu A0T = AbstractC25228BEl.A0T(obj);
                List list3 = (List) this.A03;
                C30104DOm c30104DOm = C30104DOm.A00;
                C30105DOn c30105DOn = C30105DOn.A00;
                int i3 = this.A01;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A05;
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A04;
                InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A02;
                UserSession userSession = (UserSession) this.A07;
                AbstractC25227BEk.A15(A0T, new C30728DfQ(interfaceC74953Yl, userSession, list3, interfaceC16660sJ, interfaceC16660sJ2, i3), new C50362MLo(46, list3, (InterfaceC16660sJ) c30104DOm), new C50362MLo(47, list3, (InterfaceC16660sJ) c30105DOn), list3.size());
                if (this.A06 == C74.A05) {
                    A0T.CgG("loadingindicator", null, AbstractC27778CMt.A00);
                }
                return C0eB.A00;
        }
        c64042vP.A0F(intentAwareAdPivotState, hbc, num2, i);
        return C0eB.A00;
    }
}
