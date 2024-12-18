package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC163367Sz {
    public static final C7T2 A00(final UserSession userSession, final InterfaceC163837Ux interfaceC163837Ux) {
        if (interfaceC163837Ux instanceof C7T0) {
            C7T0 c7t0 = (C7T0) interfaceC163837Ux;
            C14360o3.A0B(c7t0, 0);
            C7TT C7W = c7t0.C7W();
            C14360o3.A07(C7W);
            return new C49338LrW(c7t0, C7W);
        }
        return new C7T2(userSession, interfaceC163837Ux) { // from class: X.7T1
            public final InterfaceC163837Ux A00;
            public final UserSession A01;

            @Override // X.C7T2
            public final String C7X() {
                return null;
            }

            @Override // X.C7T2
            public final List Ab0() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return AbstractC81683kd.A04(C17060sy.A01.A01(this.A01), Co6.BSH());
                }
                return C16930sl.A00;
            }

            @Override // X.C7T2
            public final EnumC53137Neq B06() {
                if (AbstractC47004KqN.A00(this.A01, this.A00.Co6())) {
                    if (CVQ()) {
                        return EnumC53137Neq.A02;
                    }
                    return EnumC53137Neq.A04;
                }
                return EnumC53137Neq.A03;
            }

            @Override // X.C7T2
            public final Map BJh() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.CRw();
                }
                return null;
            }

            @Override // X.C7T2
            public final List BSD() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.BSD();
                }
                return C16930sl.A00;
            }

            @Override // X.C7T2
            public final List BSF() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.BSF();
                }
                return C16930sl.A00;
            }

            @Override // X.C7T2
            public final List BSH() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.BSH();
                }
                return C16930sl.A00;
            }

            @Override // X.C7T2
            public final User Ba5() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.Ba5();
                }
                return null;
            }

            @Override // X.C7T2
            public final List Bl3() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.BKb().A02;
                }
                return null;
            }

            @Override // X.C7T2
            public final String C7I() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.C7I();
                }
                return null;
            }

            @Override // X.C7T2
            public final int C7g() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.C7g();
                }
                return 0;
            }

            @Override // X.C7T2
            public final String C7m(Context context, UserSession userSession2) {
                String A07;
                C2EC Co6 = this.A00.Co6();
                if (Co6 == null || (A07 = C4GQ.A07(context, userSession2, Co6)) == null) {
                    return "";
                }
                return A07;
            }

            @Override // X.C7T2
            public final String C7q() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.C7q();
                }
                return null;
            }

            @Override // X.C7T2
            public final String CEx() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.CEx();
                }
                return null;
            }

            @Override // X.C7T2
            public final String CEy() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.CEy();
                }
                return null;
            }

            @Override // X.C7T2
            public final boolean CKe() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return ((C81663kb) Co6).A01.A2K;
                }
                return false;
            }

            @Override // X.C7T2
            public final boolean CKg() {
                C80693iy c80693iy;
                String str;
                C2EC Co6 = this.A00.Co6();
                if (Co6 == null || (str = (c80693iy = ((C81663kb) Co6).A01).A1w) == null || str.length() == 0 || c80693iy.A2K) {
                    return false;
                }
                return true;
            }

            @Override // X.C7T2
            public final boolean CLw() {
                if (this.A00.Co6() == null) {
                    return false;
                }
                return true;
            }

            @Override // X.C7T2
            public final boolean CVQ() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.CVQ();
                }
                return false;
            }

            @Override // X.C7T2
            public final boolean CWO() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.CWO();
                }
                return false;
            }

            @Override // X.C7T2
            public final boolean CWf() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 == null || Co6.BI1() != 0) {
                    return false;
                }
                return true;
            }

            @Override // X.C7T2
            public final boolean CX1() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.CX1();
                }
                return false;
            }

            @Override // X.C7T2
            public final boolean CbK() {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return Co6.CbK();
                }
                return false;
            }

            @Override // X.C7T2
            public final boolean CeT(Context context, UserSession userSession2) {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return AbstractC31273Dov.A00(context, userSession2).A05(Co6);
                }
                return false;
            }

            @Override // X.C7T2
            public final boolean CeU(Context context, UserSession userSession2) {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return AbstractC31273Dov.A00(context, userSession2).A06(Co6);
                }
                return false;
            }

            @Override // X.C7T2
            public final boolean CeV(Context context, UserSession userSession2) {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return AbstractC31273Dov.A00(context, userSession2).A07(Co6);
                }
                return false;
            }

            @Override // X.C7T2
            public final boolean CfZ(Context context, UserSession userSession2) {
                C2EC Co6 = this.A00.Co6();
                if (Co6 != null) {
                    return AbstractC31273Dov.A00(context, userSession2).A08(Co6);
                }
                return false;
            }

            {
                this.A00 = interfaceC163837Ux;
                this.A01 = userSession;
            }
        };
    }
}
