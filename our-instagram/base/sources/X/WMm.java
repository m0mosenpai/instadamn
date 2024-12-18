package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class WMm implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public WMm(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A02 = obj5;
        this.A05 = obj3;
        this.A03 = obj6;
        this.A06 = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        int A052;
        int i2;
        switch (this.A00) {
            case 0:
                A052 = C0f9.A05(-1136173242);
                C3N0.A00((AbstractC12990ll) this.A01).EWt(null);
                Object obj = this.A04;
                if (obj != null) {
                    ((InterfaceC16620sF) this.A02).invoke(obj, this.A05);
                } else {
                    ((InterfaceC16600sD) this.A03).invoke(this.A06, AbstractC111324zv.A00(2163), null, AbstractC166997dE.A0a());
                }
                i2 = -673394758;
                C0f9.A0C(i2, A052);
                return;
            case 1:
                A052 = C0f9.A05(597363609);
                XLU xlu = (XLU) this.A01;
                C65741TtG c65741TtG = (C65741TtG) this.A05;
                ReelStore A04 = C1OU.A04((UserSession) this.A06);
                User user = (User) this.A04;
                xlu.D3d(A04.A0K(new C1N9(user), user.getId(), false), (C66171U2m) this.A02, (Tx0) this.A03, c65741TtG, false);
                i2 = -299389953;
                C0f9.A0C(i2, A052);
                return;
            case 2:
                A05 = C0f9.A05(1346337771);
                XLU xlu2 = (XLU) this.A01;
                C65741TtG c65741TtG2 = (C65741TtG) this.A05;
                ReelStore A042 = C1OU.A04((UserSession) this.A06);
                User user2 = (User) this.A04;
                String BNu = user2.A03.BNu();
                if (BNu != null) {
                    xlu2.D3d(A042.A0K(new C1N9(user2), BNu, false), (C66171U2m) this.A02, (Tx0) this.A03, c65741TtG2, true);
                    i = -500260160;
                    break;
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0C(1197849374, A05);
                    throw A0g;
                }
            case 3:
                A05 = C0f9.A05(905602295);
                U26 u26 = (U26) this.A01;
                C65741TtG c65741TtG3 = (C65741TtG) this.A05;
                ReelStore A043 = C1OU.A04((UserSession) this.A06);
                User user3 = (User) this.A04;
                u26.A01.D3d(A043.A0K(new C1N9(user3), user3.getId(), false), (WmE) this.A02, (Tx0) this.A03, c65741TtG3, false);
                i = -1588438800;
                break;
            default:
                A052 = C0f9.A05(-1423481095);
                U26 u262 = (U26) this.A01;
                C65741TtG c65741TtG4 = (C65741TtG) this.A05;
                ReelStore A044 = C1OU.A04((UserSession) this.A06);
                User user4 = (User) this.A04;
                String BNu2 = user4.A03.BNu();
                if (BNu2 != null) {
                    u262.A01.D3d(A044.A0K(new C1N9(user4), BNu2, false), (WmE) this.A02, (Tx0) this.A03, c65741TtG4, true);
                    i2 = -1777864643;
                    C0f9.A0C(i2, A052);
                    return;
                }
                IllegalStateException A0g2 = AbstractC166997dE.A0g();
                C0f9.A0C(1046545421, A052);
                throw A0g2;
        }
        C0f9.A0C(i, A05);
    }
}
