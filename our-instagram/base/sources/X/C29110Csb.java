package X;

import com.instagram.api.schemas.PivotPageInsightsTip;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Csb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29110Csb implements InterfaceC116905Qw {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.InterfaceC116905Qw
    public final void D5F() {
    }

    public C29110Csb(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public static void A00(C29110Csb c29110Csb, C37818GkY c37818GkY) {
        List list = (List) c29110Csb.A02;
        list.addAll(c37818GkY.A09);
        InterfaceC24741Ir interfaceC24741Ir = (InterfaceC24741Ir) c29110Csb.A01;
        if (!interfaceC24741Ir.CRR()) {
            interfaceC24741Ir.F8s(list);
        }
    }

    @Override // X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        List list;
        switch (this.A00) {
            case 0:
                list = (List) this.A02;
                list.clear();
                ((C27940CSz) this.A03).A01.Egh("0");
                break;
            case 1:
                list = (List) this.A02;
                list.clear();
                break;
            default:
                C14360o3.A0B(c38971HDz, 0);
                ((CTD) this.A03).A00.A0S(c38971HDz.A01);
                return;
        }
        InterfaceC24741Ir interfaceC24741Ir = (InterfaceC24741Ir) this.A01;
        if (interfaceC24741Ir.CRR()) {
            return;
        }
        interfaceC24741Ir.F8s(list);
    }

    @Override // X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        ImageUrl imageUrl;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c37818GkY, 0);
                C27940CSz c27940CSz = (C27940CSz) this.A03;
                C05A c05a = c27940CSz.A01;
                InterfaceC124295jj interfaceC124295jj = c37818GkY.A01;
                c05a.Egh(((C38953HDf) interfaceC124295jj).A02);
                AbstractC166997dE.A1Y(c27940CSz.A02, ((C124275jh) interfaceC124295jj).BbA().BUt());
                A00(this, c37818GkY);
                return;
            case 1:
                C14360o3.A0B(c37818GkY, 0);
                boolean z = c37818GkY.A0D;
                if (z) {
                    CTC ctc = (CTC) this.A03;
                    C05A c05a2 = ctc.A03;
                    EPD epd = (EPD) c37818GkY.A01;
                    c05a2.Egh(epd.A01);
                    ctc.A01.Egh(epd.A00);
                }
                CTC ctc2 = (CTC) this.A03;
                AbstractC166997dE.A1Y(ctc2.A02, ((C124275jh) c37818GkY.A01).BbA().BUt());
                AbstractC166997dE.A1Y(ctc2.A04, z);
                A00(this, c37818GkY);
                return;
            default:
                C14360o3.A0B(c37818GkY, 0);
                boolean z2 = c37818GkY.A0D;
                if (z2) {
                    C38956HDi c38956HDi = (C38956HDi) c37818GkY.A01;
                    String str = c38956HDi.A01;
                    if (str == null) {
                        str = "";
                    }
                    boolean z3 = c38956HDi.A02;
                    PivotPageInsightsTip pivotPageInsightsTip = c38956HDi.A00;
                    Object obj = c37818GkY.A09.get(0);
                    CTD ctd = (CTD) this.A03;
                    C120985dq c120985dq = (C120985dq) obj;
                    UserSession userSession = ctd.A02;
                    String Ayl = c120985dq.Ayl(userSession);
                    User A09 = c120985dq.A09(userSession);
                    if (A09 != null) {
                        imageUrl = A09.A0C();
                    } else {
                        imageUrl = null;
                    }
                    if (Ayl != null && imageUrl != null) {
                        ctd.A05.Egh(new C26029BfI(pivotPageInsightsTip, null, null, null, imageUrl, false, ctd.A03, Ayl, str, z3));
                    }
                }
                CTD ctd2 = (CTD) this.A03;
                AbstractC166997dE.A1Y(ctd2.A04, ((C124275jh) c37818GkY.A01).BbA().BUt());
                AbstractC166997dE.A1Y(ctd2.A06, z2);
                A00(this, c37818GkY);
                return;
        }
    }

    @Override // X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
    }
}
