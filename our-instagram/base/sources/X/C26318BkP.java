package X;

import android.graphics.Typeface;
import com.instagram.common.session.UserSession;

/* renamed from: X.BkP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26318BkP extends AbstractC51572Yf {
    public final UserSession A00;
    public final InterfaceC16820sZ A01;

    public C26318BkP(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 2);
        this.A01 = interfaceC16820sZ;
        this.A00 = userSession;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String str;
        C14360o3.A0B(c76223bS, 0);
        C41551w4 c41551w4 = (C41551w4) this.A01.invoke();
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv A00 = C9CU.A00(AbstractC25234BEr.A0C(null, AbstractC25225BEi.A0m(num, 100.0f, 0), 0), C05F.A15, 0, Double.doubleToRawLongBits(300.0d));
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        String id = c41551w4.A0H.getId();
        C14360o3.A07(id);
        long A0r = AbstractC25232BEp.A0r(14.0f);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        C2XE c2xe = A12.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, id, 0);
        AbstractC25233BEq.A1B(A12, A0a, -1, A0r);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(typeface, A12, A0a, A0D);
        AbstractC25234BEr.A1I(A0a, num, false);
        A0a.A0E();
        AbstractC25234BEr.A15(A12, A0a, false);
        C41181vS A08 = c41551w4.A08(this.A00);
        int ordinal = A08.A0e.ordinal();
        if (ordinal != 0) {
            str = null;
            if (ordinal == 1 || ordinal == 9) {
                C38321qM c38321qM = A08.A0b;
                c38321qM.getClass();
                if (c38321qM.A1V() != null) {
                    str = c38321qM.A1V().A0e;
                }
            }
        } else {
            C105814ps c105814ps = A08.A0d;
            c105814ps.getClass();
            str = c105814ps.A00.A2Z;
        }
        C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, str, 0);
        AbstractC25233BEq.A1B(A12, A0a2, -1, A0r);
        A0a2.A0S(0);
        AbstractC25234BEr.A0o(typeface, A12, A0a2, A0D);
        A0a2.A0X(num);
        AbstractC25234BEr.A1J(A0a2, num, false, true);
        AbstractC25227BEk.A1J(A12, A0a2);
        return AbstractC76963ci.A01(A12, c76223bS, A00);
    }
}
