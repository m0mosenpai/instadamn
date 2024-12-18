package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.List;

/* loaded from: classes5.dex */
public final class C5D extends AbstractC25398BLp {
    public final InterfaceC31012DkB A00;
    public final InterfaceC31137Dmc A01;

    @Override // X.AbstractC25398BLp
    public final void A0B(ReboundViewPager reboundViewPager) {
        C38321qM c38321qM;
        super.A0B(reboundViewPager);
        if (reboundViewPager.getCurrentDataIndex() == 0) {
            C120985dq c120985dq = this.A0D;
            List list = c120985dq.A0R;
            if (list != null && (c38321qM = (C38321qM) AbstractC001800i.A0O(list, 0)) != null) {
                if (c38321qM.BRp() == EnumC40111tc.A0a) {
                    InterfaceC31077DlK interfaceC31077DlK = this.A0F;
                    if (interfaceC31077DlK != null) {
                        interfaceC31077DlK.ERE(c120985dq, 0);
                    }
                    this.A01.E0P();
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5D(Context context, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC31077DlK interfaceC31077DlK, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C75113Zb c75113Zb, InterfaceC31137Dmc interfaceC31137Dmc, InterfaceC30855DhU interfaceC30855DhU) {
        super(context, c120985dq, c37644Ghd, interfaceC31077DlK, interfaceC11380iw, userSession, c75113Zb, interfaceC30855DhU);
        C14360o3.A0B(userSession, 3);
        AbstractC25234BEr.A0k(4, interfaceC11380iw, c37644Ghd, c75113Zb, interfaceC31077DlK);
        AbstractC167007dF.A1J(interfaceC30855DhU, 8, interfaceC31137Dmc);
        this.A01 = interfaceC31137Dmc;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C1DW.A00(userSession).A03(c38321qM);
        }
        this.A00 = new C43063J2d(c120985dq, userSession, (InterfaceC60442pS) interfaceC11380iw);
    }

    @Override // X.AbstractC25399BLq, X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        C38321qM A0x;
        super.DXP(i, i2);
        C120985dq c120985dq = this.A0D;
        List list = c120985dq.A0R;
        if (list != null && (A0x = AbstractC25225BEi.A0x(list, i)) != null) {
            if (A0x.BRp() == EnumC40111tc.A0a) {
                InterfaceC31077DlK interfaceC31077DlK = this.A0F;
                if (interfaceC31077DlK != null) {
                    interfaceC31077DlK.ERE(c120985dq, Integer.valueOf(i));
                }
            } else {
                InterfaceC31077DlK interfaceC31077DlK2 = this.A0F;
                if (interfaceC31077DlK2 != null) {
                    interfaceC31077DlK2.ERE(c120985dq, null);
                }
            }
            this.A01.E0P();
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
