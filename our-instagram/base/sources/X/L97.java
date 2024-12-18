package X;

import android.app.Activity;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.appreciation.graphql.QueryAppreciationPacksResponseImpl;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class L97 {
    public final Activity A00;
    public final C47931LFa A01;
    public final C41761wQ A02;
    public final UserSession A03;
    public final C40701ud A04;
    public final C56138Ovy A05;
    public final String A06;

    public final InterfaceC19390xP A01(C45125Jxu c45125Jxu) {
        List list;
        C14360o3.A0B(c45125Jxu, 0);
        C45125Jxu A00 = this.A01.A00();
        if (A00 != null && (list = (List) c45125Jxu.A04) != null && !list.isEmpty()) {
            return new C16440rp(new C45156Jyw((C45127Jxw) A00.A01, (Integer) A00.A00, (List) A00.A04, A00.A02, true));
        }
        return C0JE.A00(new MCQ((InterfaceC23621Ds) null, this, c45125Jxu, 12));
    }

    public final InterfaceC19390xP A00() {
        List<C45063Jws> list;
        C45125Jxu A00 = this.A01.A00();
        if (A00 != null && (list = (List) A00.A04) != null && !list.isEmpty()) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (C45063Jws c45063Jws : list) {
                A0q.add(new C45048Jwd(c45063Jws.A07, c45063Jws.A06, c45063Jws.A08, c45063Jws.A01, c45063Jws.A02, c45063Jws.A03));
            }
            return new C16440rp(new MU9(new C45125Jxu((C45127Jxw) A00.A01, (Integer) A00.A00, A0q, A00.A02), 1));
        }
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04(AbstractC50529MSi.A01(), this.A06);
        return JX4.A01(new MBr(this, null, 44), C0JE.A00(new MCQ(new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "QueryAppreciationPacks", A0b.getParamsCopy(), A0b2.getParamsCopy(), QueryAppreciationPacksResponseImpl.class, false, null, 0, null, "viewer", AbstractC166987dD.A1E()), this.A04, (InterfaceC23621Ds) null, 4)));
    }

    public /* synthetic */ L97(UserSession userSession, Activity activity, String str) {
        C56138Ovy A00 = AbstractC54071NvV.A00().A00(activity, userSession);
        C41761wQ A0S = AbstractC31173DnH.A0S();
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C47931LFa c47931LFa = C47931LFa.A02;
        C14360o3.A0B(userSession, 1);
        AbstractC25234BEr.A1R(activity, str, A00, A0S, A01);
        C14360o3.A0B(c47931LFa, 7);
        this.A03 = userSession;
        this.A00 = activity;
        this.A06 = str;
        this.A05 = A00;
        this.A02 = A0S;
        this.A04 = A01;
        this.A01 = c47931LFa;
    }
}
