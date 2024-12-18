package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class FQ7 {
    public final UserSession A00;
    public final C40701ud A01;
    public final ConcurrentHashMap A02;
    public final InterfaceC09390do A03;

    public FQ7(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC40691uc.A01(userSession);
        this.A03 = AbstractC09440dt.A01(new C37057GUn(this, 43));
        this.A02 = new ConcurrentHashMap(3);
    }

    public final void A00(EnumC31556Dtg enumC31556Dtg, String str, int i, boolean z) {
        PandoGraphQLRequest A01;
        C14360o3.A0B(str, 1);
        C38687GzS c38687GzS = new C38687GzS(enumC31556Dtg, str);
        ConcurrentHashMap concurrentHashMap = this.A02;
        if (!concurrentHashMap.containsKey(c38687GzS)) {
            concurrentHashMap.put(new C38687GzS(enumC31556Dtg, str), new Object());
            if (enumC31556Dtg == EnumC31556Dtg.A04) {
                A01 = FEM.A00.A00(this.A00, ((User) this.A03.getValue()).A03.B7X(), Integer.valueOf(i), "", null, c38687GzS.A01, "");
            } else {
                if (enumC31556Dtg != EnumC31556Dtg.A05) {
                    return;
                }
                A01 = FEM.A00.A01(this.A00, ((User) this.A03.getValue()).A03.B7X(), Integer.valueOf(i), "", null, null, c38687GzS.A01, "");
            }
            C1ON A00 = AnonymousClass963.A00(this.A01.A03(A01));
            A00.A00 = new C32530EUg(7, c38687GzS, this);
            int i2 = 2;
            if (z) {
                i2 = 3;
            }
            C1GJ.A06(A00, 1592315407, i2, true, false);
        }
    }
}
