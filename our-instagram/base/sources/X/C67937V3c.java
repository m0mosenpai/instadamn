package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.V3c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67937V3c extends C1P1 {
    public final /* synthetic */ UserSession A00;

    public C67937V3c(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(209919986);
        super.onFinish();
        U0F.A00 = false;
        C0f9.A0A(39715651, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1047971754);
        C67829Uz2 c67829Uz2 = (C67829Uz2) obj;
        int A0N = AbstractC167017dG.A0N(c67829Uz2, 334784764);
        super.onSuccess(c67829Uz2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<C71199Wpo> list = c67829Uz2.A01;
        if (list != null) {
            for (C71199Wpo c71199Wpo : list) {
                if (C14360o3.A0K(c71199Wpo.A02, AbstractC58317Pt9.A00(129))) {
                    for (AbstractC65924TwV abstractC65924TwV : c71199Wpo.A03) {
                        int i = abstractC65924TwV.A01;
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 6) {
                                    arrayList3.add(abstractC65924TwV);
                                }
                            } else {
                                arrayList.add(abstractC65924TwV);
                            }
                        } else {
                            arrayList2.add(abstractC65924TwV);
                        }
                    }
                }
            }
            UserSession userSession = this.A00;
            W61 A00 = VWR.A00(userSession);
            synchronized (A00) {
                A00.A02.A06(arrayList);
                A00.A00.A06(arrayList2);
                A00.A01.A06(arrayList3);
            }
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            A002.A6U.Egi(A002, Long.valueOf(currentTimeMillis), C23031Ai.A8c[7]);
            SystemClock.currentThreadTimeMillis();
            C0f9.A0A(-1286968856, A0N);
            C0f9.A0A(1904033196, A03);
            return;
        }
        C14360o3.A0F("sections");
        throw C00O.createAndThrow();
    }
}
