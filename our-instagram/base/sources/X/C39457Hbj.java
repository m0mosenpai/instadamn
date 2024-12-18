package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;

/* renamed from: X.Hbj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39457Hbj extends PJX {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public static void A00(C41582IaV c41582IaV, C38321qM c38321qM, EnumC75193Zm enumC75193Zm, C75113Zb c75113Zb) {
        C14360o3.A0B(enumC75193Zm, 0);
        c75113Zb.A0m = enumC75193Zm;
        C3YS.A00(c41582IaV.A01).A02(c38321qM, true);
    }

    public C39457Hbj(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj3;
        this.A04 = obj4;
    }

    @Override // X.PJX, X.MRA
    public final void Czw(boolean z) {
        if (2 - this.A00 == 0) {
            ((ILW) this.A04).A00();
        }
    }

    @Override // X.PJX, X.MRA
    public final void Dfe() {
        switch (this.A00) {
            case 0:
                A00((C41582IaV) this.A02, (C38321qM) this.A03, (EnumC75193Zm) this.A01, (C75113Zb) this.A04);
                return;
            case 1:
                C9GR.A0E(((C50674MYs) this.A03).A00, "product_report_failed_to_load");
                return;
            default:
                return;
        }
    }

    @Override // X.PJX, X.MRA
    public final void DpY(String str, String str2, String str3) {
        if (this.A00 == 0) {
            C41582IaV c41582IaV = (C41582IaV) this.A02;
            C38321qM c38321qM = (C38321qM) this.A03;
            C75113Zb c75113Zb = (C75113Zb) this.A04;
            EnumC75193Zm enumC75193Zm = (EnumC75193Zm) this.A01;
            A00(c41582IaV, c38321qM, enumC75193Zm, c75113Zb);
            C41582IaV.A00(c41582IaV, c38321qM, enumC75193Zm, c75113Zb, str);
        }
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        EnumC75193Zm enumC75193Zm;
        switch (this.A00) {
            case 0:
                C41582IaV c41582IaV = (C41582IaV) this.A02;
                C38321qM c38321qM = (C38321qM) this.A03;
                C75113Zb c75113Zb = (C75113Zb) this.A04;
                EnumC75193Zm enumC75193Zm2 = (EnumC75193Zm) this.A01;
                A00(c41582IaV, c38321qM, enumC75193Zm2, c75113Zb);
                C41582IaV.A00(c41582IaV, c38321qM, enumC75193Zm2, c75113Zb, str);
                return;
            case 1:
                UserSession userSession = ((IK3) this.A04).A02;
                C3YS.A00(userSession).A04(AbstractC16960so.A1O(AbstractC25231BEo.A0s(((ProductTile) this.A02).A05)));
                AbstractC25651Mw.A00(userSession).E4s(new C42247InX((Product) this.A01));
                return;
            default:
                if (!AbstractC111324zv.A00(996).equals(str) && !"ig_its_inappropriate".equals(str)) {
                    enumC75193Zm = EnumC75193Zm.A08;
                } else {
                    enumC75193Zm = EnumC75193Zm.A07;
                }
                InterfaceC31077DlK interfaceC31077DlK = (InterfaceC31077DlK) this.A02;
                C120985dq c120985dq = (C120985dq) this.A01;
                interfaceC31077DlK.Ecj(c120985dq, enumC75193Zm);
                ((C37540Gfw) this.A03).A0M(c120985dq, "report", true, false);
                return;
        }
    }
}
