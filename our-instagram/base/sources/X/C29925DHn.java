package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.DHn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29925DHn extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29925DHn(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        Long A0j;
        switch (this.A00) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                C14840oy c14840oy = (C14840oy) this.A03;
                double d = c14840oy.A00;
                if (d > 0.0d) {
                    C26612Bp9 c26612Bp9 = (C26612Bp9) this.A04;
                    UserSession userSession = c26612Bp9.A01;
                    C19270xB c19270xB = (C19270xB) this.A01;
                    C26269Bjc c26269Bjc = c26612Bp9.A03;
                    int i = c26269Bjc.A01;
                    String str = c26269Bjc.A03;
                    String str2 = c26269Bjc.A05;
                    double d2 = currentTimeMillis - d;
                    Boolean bool = (Boolean) ((C51762Yz) this.A02).A03;
                    AbstractC167007dF.A1K(userSession, c19270xB);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c19270xB, userSession), "ig_threads_in_reels_unit_tray_vpvd_imp");
                    if (A0f.isSampled()) {
                        A0f.AAP("container_module", c19270xB.getModuleName());
                        AbstractC25225BEi.A1N(A0f, AbstractC25234BEr.A0f(A0f, i, 0));
                        if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                            j = A0j.longValue();
                        } else {
                            j = 0;
                        }
                        A0f.A9K("netego_id", Long.valueOf(j));
                        A0f.A8I(AbstractC111324zv.A00(136), Double.valueOf(d2));
                        A0f.A7v(AbstractC111324zv.A00(459), bool);
                        A0f.A9K("quick_promotion_id", AbstractC25233BEq.A0n(str2));
                        A0f.Cht();
                    }
                }
                c14840oy.A00 = -1.0d;
                ((C51762Yz) this.A02).A00();
                return C0eB.A00;
            case 1:
                MU2 mu2 = new MU2(this.A04, 6);
                C07X c07x = (C07X) this.A02;
                c07x.getLifecycle().A09(mu2);
                return new BWA(mu2, c07x, (C25660BVw) this.A01, (InterfaceC16660sJ) this.A03);
            case 2:
                View view = AbstractC25235BEs.A0Z(obj).A00;
                C37616GhB c37616GhB = (C37616GhB) this.A02;
                C14360o3.A0A(view);
                c37616GhB.A06(view, (EnumC71343Hv) this.A04, (Integer) this.A01);
                AbstractC25225BEi.A1U(this.A03, view);
                return C0eB.A00;
            case 3:
                ((InterfaceC31159Dn3) this.A03).DnF(((C25437BNc) this.A02).A01, (C38321qM) this.A04, ((C37644Ghd) this.A01).A06());
                return C0eB.A00;
            default:
                C07X c07x2 = (C07X) obj;
                C14360o3.A0B(c07x2, 0);
                UserSession userSession2 = (UserSession) this.A03;
                InterfaceC018407e interfaceC018407e = (InterfaceC018407e) this.A02;
                View view2 = (View) this.A01;
                if (AbstractC144976gH.A01(userSession2)) {
                    new OUU(view2, c07x2, interfaceC018407e, userSession2);
                }
                return C0eB.A00;
        }
    }
}
