package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.32I, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C32I extends C32J {
    public final boolean A00;

    @Override // X.C32J
    public void A09(List list, List list2, int i) {
        if (this.A00) {
            C671831j A0H = A0H(list.get(0));
            A0H.getClass();
            if (A0H.A0A && i < list.size() - 1 && !list.isEmpty()) {
                int size = list.size() - 1;
                while (size > i) {
                    C671831j A0H2 = A0H(list.get(size));
                    A0H2.getClass();
                    size--;
                    C671831j A0H3 = A0H(list.get(size));
                    A0H3.getClass();
                    A0H2.A0B(A0H3.A09());
                }
                return;
            }
        }
        while (i < list.size()) {
            C671831j A0H4 = A0H(list.get(i));
            A0H4.getClass();
            A0H4.A0B(A0H4.A09() - 1);
            i++;
        }
    }

    public C671831j A0H(Object obj) {
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        return c82373m0.A03;
    }

    public C32I(UserSession userSession, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C31F c31f, C1PY c1py, C1PK c1pk, boolean z) {
        super(userSession, interfaceC62242sP, interfaceC671231d, c31f, c1py, c1pk);
        this.A00 = z;
    }
}
