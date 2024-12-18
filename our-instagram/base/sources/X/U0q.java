package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class U0q extends C1P1 {
    public final /* synthetic */ U0p A00;
    public final /* synthetic */ U0H A01;

    public U0q(U0p u0p, U0H u0h) {
        this.A00 = u0p;
        this.A01 = u0h;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1337761154);
        super.onFail(abstractC115105If);
        C0f9.A0A(1287801374, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(451554490);
        this.A01.A00 = false;
        C0f9.A0A(761001149, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-623311337);
        C67829Uz2 c67829Uz2 = (C67829Uz2) obj;
        int A0N = AbstractC167017dG.A0N(c67829Uz2, -1153502894);
        super.onSuccess(c67829Uz2);
        U0p u0p = this.A00;
        List<C71199Wpo> list = c67829Uz2.A01;
        if (list != null) {
            for (C71199Wpo c71199Wpo : list) {
                HashSet hashSet = new HashSet();
                Iterator it = c71199Wpo.iterator();
                while (it.hasNext()) {
                    if (!hashSet.add(((AbstractC65924TwV) it.next()).A01())) {
                        it.remove();
                    }
                }
            }
            U0I u0i = u0p.A00;
            List list2 = c67829Uz2.A00;
            if (list2 == null) {
                list2 = C16930sl.A00;
            }
            u0i.A00 = new ArrayList(list);
            u0i.A01 = list2;
            UserSession userSession = u0i.A02;
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            String A002 = U05.A00(u0i.A00, U16.A00);
            InterfaceC16530ry interfaceC16530ry = A00.A7H;
            C0YR[] c0yrArr = C23031Ai.A8c;
            AbstractC31171DnF.A1S(A00, A002, interfaceC16530ry, c0yrArr, 246);
            C23031Ai A003 = AbstractC23021Ah.A00(userSession);
            AbstractC31171DnF.A1S(A003, U05.A00(u0i.A01, U17.A00), A003.A7I, c0yrArr, 247);
            C23031Ai A004 = AbstractC23021Ah.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo ARD = A004.A01.ARD();
            ARD.E7G("search_null_state_last_sycned_timestamp_ms", currentTimeMillis);
            ARD.apply();
            C0f9.A0A(2107766043, A0N);
            C0f9.A0A(-587954819, A03);
            return;
        }
        C14360o3.A0F("sections");
        throw C00O.createAndThrow();
    }
}
