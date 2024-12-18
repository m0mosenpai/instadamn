package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P29 implements C7T2 {
    public final UserSession A00;
    public final C2EC A01;

    @Override // X.C7T2
    public final String C7X() {
        return null;
    }

    @Override // X.C7T2
    public final List Ab0() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return AbstractC81683kd.A04(C17060sy.A01.A01(this.A00), c2ec.BSH());
        }
        return C16930sl.A00;
    }

    @Override // X.C7T2
    public final EnumC53137Neq B06() {
        if (AbstractC47004KqN.A00(this.A00, this.A01)) {
            if (CVQ()) {
                return EnumC53137Neq.A02;
            }
            return EnumC53137Neq.A04;
        }
        return EnumC53137Neq.A03;
    }

    @Override // X.C7T2
    public final Map BJh() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.CRw();
        }
        return null;
    }

    @Override // X.C7T2
    public final List BSD() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.BSD();
        }
        return C16930sl.A00;
    }

    @Override // X.C7T2
    public final List BSF() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.BSF();
        }
        return C16930sl.A00;
    }

    @Override // X.C7T2
    public final List BSH() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.BSH();
        }
        return C16930sl.A00;
    }

    @Override // X.C7T2
    public final User Ba5() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.Ba5();
        }
        return null;
    }

    @Override // X.C7T2
    public final List Bl3() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.BKb().A02;
        }
        return null;
    }

    @Override // X.C7T2
    public final String C7I() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.C7I();
        }
        return null;
    }

    @Override // X.C7T2
    public final int C7g() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.C7g();
        }
        return 0;
    }

    @Override // X.C7T2
    public final String C7m(Context context, UserSession userSession) {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            String A07 = C4GQ.A07(context, userSession, c2ec);
            C14360o3.A0A(A07);
            return A07;
        }
        return "";
    }

    @Override // X.C7T2
    public final String C7q() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.C7q();
        }
        return null;
    }

    @Override // X.C7T2
    public final String CEx() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.CEx();
        }
        return null;
    }

    @Override // X.C7T2
    public final String CEy() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.CEy();
        }
        return null;
    }

    @Override // X.C7T2
    public final boolean CKe() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return ((C81663kb) c2ec).A01.A2K;
        }
        return false;
    }

    @Override // X.C7T2
    public final boolean CKg() {
        C80693iy c80693iy;
        String str;
        C2EC c2ec = this.A01;
        if (c2ec == null || (str = (c80693iy = ((C81663kb) c2ec).A01).A1w) == null || str.length() == 0 || c80693iy.A2K) {
            return false;
        }
        return true;
    }

    @Override // X.C7T2
    public final boolean CLw() {
        return AbstractC167007dF.A1W(this.A01);
    }

    @Override // X.C7T2
    public final boolean CVQ() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.CVQ();
        }
        return false;
    }

    @Override // X.C7T2
    public final boolean CWO() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.CWO();
        }
        return false;
    }

    @Override // X.C7T2
    public final boolean CWf() {
        C2EC c2ec = this.A01;
        if (c2ec == null || c2ec.BI1() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C7T2
    public final boolean CX1() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.CX1();
        }
        return false;
    }

    @Override // X.C7T2
    public final boolean CbK() {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            return c2ec.CbK();
        }
        return false;
    }

    @Override // X.C7T2
    public final boolean CeT(Context context, UserSession userSession) {
        C2EC c2ec = this.A01;
        if (c2ec != null && AbstractC31273Dov.A00(context, userSession).A05(c2ec)) {
            return true;
        }
        return false;
    }

    @Override // X.C7T2
    public final boolean CeU(Context context, UserSession userSession) {
        C2EC c2ec = this.A01;
        if (c2ec != null && AbstractC31273Dov.A00(context, userSession).A06(c2ec)) {
            return true;
        }
        return false;
    }

    @Override // X.C7T2
    public final boolean CeV(Context context, UserSession userSession) {
        C2EC c2ec = this.A01;
        if (c2ec != null && AbstractC31273Dov.A00(context, userSession).A07(c2ec)) {
            return true;
        }
        return false;
    }

    @Override // X.C7T2
    public final boolean CfZ(Context context, UserSession userSession) {
        C2EC c2ec = this.A01;
        if (c2ec != null && AbstractC31273Dov.A00(context, userSession).A08(c2ec)) {
            return true;
        }
        return false;
    }

    public P29(UserSession userSession, C2EC c2ec) {
        this.A01 = c2ec;
        this.A00 = userSession;
    }
}
