package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.LzB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49804LzB implements C6D4 {
    public final C47281Kus A00;

    @Override // X.C6D4
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        boolean z;
        int i;
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 6) {
            C47281Kus c47281Kus = this.A00;
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            Object obj5 = objArr[4];
            Object obj6 = objArr[5];
            KwE kwE = c47281Kus.A00;
            List<C50092Rx> list = (List) obj2;
            int A0H = AbstractC166987dD.A0H(obj3);
            boolean A1a = AbstractC166987dD.A1a(obj4);
            boolean A1a2 = AbstractC166987dD.A1a(obj5);
            AbstractC46972Dl abstractC46972Dl = (AbstractC46972Dl) obj6;
            C14360o3.A0B(list, 1);
            C14360o3.A0B(abstractC46972Dl, 5);
            C43947Jbw c43947Jbw = kwE.A00;
            ArrayList A0q = AbstractC25230BEn.A0q(list);
            UserSession userSession = c43947Jbw.A02;
            Map map = C2KW.A00(userSession).A02;
            for (C50092Rx c50092Rx : list) {
                String A00 = JUR.A00(c43947Jbw.A00, userSession, c50092Rx.A00());
                if (C14360o3.A0K(c50092Rx.A00(), C2057498z.A00)) {
                    i = A0H;
                    z = A1a;
                } else {
                    Number A0Q = AbstractC37300Gc1.A0Q(c50092Rx.A00(), map);
                    z = false;
                    if (A0Q != null) {
                        i = A0Q.intValue();
                        if (i > 20) {
                            z = true;
                        }
                    } else {
                        i = 0;
                    }
                }
                A0q.add(new C25313BIi(c50092Rx.A00(), A00, i, z));
            }
            return new JUS(abstractC46972Dl, A0q, A1a2);
        }
        throw AbstractC25230BEn.A0n("Array of size 6 expected but got ", length);
    }

    public C49804LzB(C47281Kus c47281Kus) {
        this.A00 = c47281Kus;
    }
}
