package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.logging.LoggingContext;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class WMj implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public WMj(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj5;
        this.A01 = obj;
        this.A05 = obj3;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        XIGIGBoostDestination xIGIGBoostDestination;
        User user;
        User user2;
        String str;
        InterfaceC71994XEi interfaceC71994XEi;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1497306150);
                Wap wap = C2FP.A01().A04;
                UGL ugl = (UGL) this.A05;
                LoggingContext loggingContext = ugl.A03;
                SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) this.A02;
                wap.A0M(loggingContext, AbstractC25228BEl.A13(selectionShippingAddressItem.A0A), null);
                Context context = (Context) this.A01;
                C14360o3.A0A(context);
                AbstractC65702TsY.A0v(context, AbstractC69850Vwb.A00(new WHP(new ME7(14, selectionShippingAddressItem, ugl, this.A03, this.A04), 18), new WHP(new C57533Pg7(28, selectionShippingAddressItem, ugl), 19), 2131961448, 2131961447, 2131961446, 2131961439, 0, 2), C2FP.A0H());
                i = 1140452697;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(1538765800);
                PromoteData promoteData = (PromoteData) this.A03;
                UserSession userSession = (UserSession) this.A05;
                WGY.A03(promoteData);
                C66359UCf c66359UCf = (C66359UCf) this.A02;
                if (!c66359UCf.isChecked() && !promoteData.A2B && !C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36326412482787183L)) {
                    promoteData.A2B = true;
                } else {
                    PromoteState promoteState = (PromoteState) this.A04;
                    if (PromoteState.A03(promoteData)) {
                        xIGIGBoostDestination = promoteData.A0i;
                        if (xIGIGBoostDestination == null) {
                            IllegalStateException A0g = AbstractC166997dE.A0g();
                            C0f9.A0C(-1698894405, A05);
                            throw A0g;
                        }
                    } else if (promoteData.A1p.contains(XIGIGBoostDestination.A0G) && C97F.A04(promoteData) && !promoteState.A07 && !C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36326412482787183L)) {
                        c66359UCf.setChecked(false);
                    } else {
                        if (!promoteState.A07) {
                            xIGIGBoostDestination = XIGIGBoostDestination.A04;
                        }
                        c66359UCf.setChecked(true);
                        i = -139976435;
                        C0f9.A0C(i, A05);
                        return;
                    }
                    promoteState.A05(xIGIGBoostDestination, promoteData);
                    c66359UCf.setChecked(true);
                    i = -139976435;
                    C0f9.A0C(i, A05);
                    return;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                promoteData.A2n = false;
                AbstractC65702TsY.A0q();
                AbstractC31177DnL.A16(new V0X(), fragmentActivity, promoteData.A0y);
                i = -139976435;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(508448034);
                C69680VtQ c69680VtQ = (C69680VtQ) this.A01;
                UserSession userSession2 = (UserSession) this.A05;
                ReelStore A04 = C1OU.A04(userSession2);
                User user3 = (User) this.A04;
                Reel A0K = A04.A0K(new C1N9(user3), user3.getId(), false);
                C66483UJj c66483UJj = (C66483UJj) this.A02;
                C70994WmA c70994WmA = new C70994WmA(c66483UJj);
                C69727VuM c69727VuM = (C69727VuM) this.A03;
                ME4 me4 = new ME4(27, c66483UJj, userSession2, user3);
                AbstractC67878V0j abstractC67878V0j = c69680VtQ.A00;
                AbstractC67878V0j.A00(c69727VuM, abstractC67878V0j, null);
                UP8 up8 = c69727VuM.A00().A00;
                if (up8 != null && (user2 = up8.A04) != null) {
                    C1571673v.A08(abstractC67878V0j, abstractC67878V0j.getSession(), AbstractC50626MWn.A00(abstractC67878V0j.getSession(), user2.B7L(), user2.A0M(), user2.getId()), "tap_profile_pic", user2.getId(), null, null, AbstractC111324zv.A00(79));
                }
                AbstractC152536tg.A00(abstractC67878V0j.getSession(), (String) c69727VuM.A0A.getValue(), null, 0);
                C66151U1s.A01(new WdQ(abstractC67878V0j, 2), A0K, C3G2.A1l, new Wm5(me4, 2), new C38E(abstractC67878V0j, abstractC67878V0j.getSession(), new C38C(abstractC67878V0j)), c70994WmA, null, abstractC67878V0j.A06().A02());
                C65740TtF A00 = AbstractC65792TuA.A00(abstractC67878V0j.getSession());
                UP8 up82 = c69727VuM.A00().A00;
                if (up82 != null && (user = up82.A04) != null) {
                    A00.A01(user);
                    i = 346314009;
                    C0f9.A0C(i, A05);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 3:
                A05 = C0f9.A05(1649186461);
                VW5.A00((Activity) this.A01, ((C69469Vns) this.A03).A01, (UserSession) this.A05, ((User) this.A04).getId(), ((InterfaceC11380iw) this.A02).getModuleName());
                i = -1826641451;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(1974889785);
                C70792Wh5 c70792Wh5 = (C70792Wh5) this.A04;
                Integer num = c70792Wh5.A00;
                switch (num.intValue()) {
                    case 1:
                    case 4:
                        InterfaceC71994XEi interfaceC71994XEi2 = (InterfaceC71994XEi) this.A02;
                        if (interfaceC71994XEi2 != null) {
                            interfaceC71994XEi2.Df6(c70792Wh5.A01);
                            break;
                        }
                        break;
                    case 2:
                        if (c70792Wh5.A04) {
                            c70792Wh5.A00 = C05F.A15;
                            ((C66485UJn) this.A05).A04((InterfaceC11380iw) this.A01, (GZU) this.A03, (InterfaceC71994XEi) this.A02, c70792Wh5);
                        }
                        InterfaceC71994XEi interfaceC71994XEi3 = (InterfaceC71994XEi) this.A02;
                        if (interfaceC71994XEi3 != null) {
                            interfaceC71994XEi3.D1s(c70792Wh5.A01);
                            break;
                        }
                        break;
                    case 3:
                        break;
                    case 5:
                    case 8:
                    default:
                        C0w9.A03("IgLiveUserRowHolder", AnonymousClass001.A0R("Illegal participant role: ", AbstractC34345FCn.A00(num)));
                        break;
                    case 6:
                        if (c70792Wh5.A03 && (interfaceC71994XEi = (InterfaceC71994XEi) this.A02) != null) {
                            interfaceC71994XEi.CuK(c70792Wh5.A01);
                            break;
                        }
                        break;
                    case 7:
                        if (c70792Wh5.A03) {
                            if (c70792Wh5.A04) {
                                c70792Wh5.A00 = C05F.A0C;
                                ((C66485UJn) this.A05).A04((InterfaceC11380iw) this.A01, (GZU) this.A03, (InterfaceC71994XEi) this.A02, c70792Wh5);
                            }
                            InterfaceC71994XEi interfaceC71994XEi4 = (InterfaceC71994XEi) this.A02;
                            if (interfaceC71994XEi4 != null) {
                                interfaceC71994XEi4.DN5(c70792Wh5.A01, C66485UJn.A00((InterfaceC11380iw) this.A01));
                                break;
                            }
                        }
                        break;
                    case 9:
                        InterfaceC71994XEi interfaceC71994XEi5 = (InterfaceC71994XEi) this.A02;
                        if (interfaceC71994XEi5 != null) {
                            User user4 = c70792Wh5.A01;
                            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                            if (C14360o3.A0K(interfaceC11380iw.getModuleName(), MSV.A00(789))) {
                                str = MSV.A00(1679);
                            } else if (C14360o3.A0K(interfaceC11380iw.getModuleName(), MSV.A00(788))) {
                                str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
                            } else {
                                str = "";
                            }
                            interfaceC71994XEi5.CvT(user4, str);
                            break;
                        }
                        break;
                }
                i = 1631678387;
                C0f9.A0C(i, A05);
                return;
        }
    }
}
