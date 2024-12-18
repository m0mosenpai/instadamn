package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.Inu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42270Inu implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C42270Inu(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC41501vz
    public final void onEvent(Object obj) {
        int A03;
        int i;
        View A00;
        switch (this.A00) {
            case 0:
                Product product = (Product) this.A01;
                View view = (View) this.A02;
                UserSession userSession = (UserSession) this.A03;
                if (!((C3HW) obj).A00.BqK().equals(product.A0H)) {
                    return;
                }
                view.setSelected(AbstractC1563570f.A00(userSession).A03(product));
                return;
            case 1:
                A03 = C0f9.A03(-1371898882);
                int A032 = C0f9.A03(-964963544);
                Integer num = ((C42253Ind) obj).A01;
                Integer num2 = C05F.A00;
                C102884kP c102884kP = (C102884kP) this.A03;
                int i2 = 70;
                if (num == num2) {
                    i2 = 71;
                }
                InterfaceC103384lE A0B = c102884kP.A0B(i2);
                C6FG c6fg = (C6FG) this.A02;
                if (A0B != null) {
                    AbstractC37304Gc5.A1O(c6fg, c102884kP, A0B);
                }
                C0f9.A0A(1260765466, A032);
                i = 1546277798;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(-499540564);
                LYK lyk = (LYK) obj;
                int A0N = AbstractC167017dG.A0N(lyk, -211173577);
                String str = lyk.A00;
                C37991Gnc c37991Gnc = (C37991Gnc) this.A01;
                if (C14360o3.A0K(str, c37991Gnc.A00)) {
                    TextView textView = c37991Gnc.A05;
                    C37993Gne c37993Gne = (C37993Gne) this.A03;
                    textView.setText(AbstractC75103Za.A06(c37993Gne.A01, c37993Gne.A02, (C38321qM) this.A02, lyk.A01));
                }
                C0f9.A0A(-985850112, A0N);
                i = 1364522033;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = C0f9.A03(1822373797);
                int A033 = C0f9.A03(1395879222);
                C35790FrS c35790FrS = (C35790FrS) this.A03;
                if (C35790FrS.A00((Context) this.A01, c35790FrS, (EnumC33445EqI) this.A02)) {
                    c35790FrS.A01();
                }
                C0f9.A0A(1046729482, A033);
                i = 1302238090;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(-1613304107);
                int A034 = C0f9.A03(1044391528);
                C37711Gim c37711Gim = (C37711Gim) this.A03;
                C120985dq c120985dq = (C120985dq) this.A01;
                View view2 = (View) this.A02;
                UserSession userSession2 = c37711Gim.A07;
                if (C76493bt.A09(c37711Gim.A05, c120985dq, userSession2) && (A00 = C37711Gim.A00(view2)) != null) {
                    C37711Gim.A02(A00, EnumC58132lV.A05, null, c37711Gim, 2131960450);
                    AbstractC73317Y7a.A0C(c37711Gim.A06, userSession2, c120985dq.getId(), AbstractC25231BEo.A0t(c120985dq.A09(userSession2)), "clips_action_sheet");
                }
                AbstractC25651Mw.A00(userSession2).A02(this, C42230InG.class);
                C0f9.A0A(1921528589, A034);
                i = 1044695704;
                C0f9.A0A(i, A03);
                return;
        }
    }
}
