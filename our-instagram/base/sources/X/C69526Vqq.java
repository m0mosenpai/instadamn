package X;

import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vqq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69526Vqq {
    public final /* synthetic */ V0O A00;

    public final void A00(AudienceInterest audienceInterest) {
        V0O v0o = this.A00;
        C66419UGo c66419UGo = v0o.A06;
        if (c66419UGo == null) {
            C14360o3.A0F("selectedAndSuggestedInterestsAdapter");
            throw C00O.createAndThrow();
        }
        List list = c66419UGo.A08;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (C14360o3.A0K(((AudienceInterest) it.next()).A00(), audienceInterest.A00())) {
                it.remove();
                c66419UGo.A00();
                C68955Vet c68955Vet = c66419UGo.A01;
                UserSession userSession = c66419UGo.A03;
                String str = c66419UGo.A04;
                List A02 = AbstractC92144Au.A02(new C70557Wcn(6, C71815X5t.A00), list);
                String str2 = c66419UGo.A05;
                C1P1 c1p1 = (C1P1) c66419UGo.A09.getValue();
                C1ON A05 = AbstractC70178WFd.A05(userSession, str, str2, A02, false);
                A05.A00 = c1p1;
                c68955Vet.A00.schedule(A05);
                break;
            }
        }
        V0O.A01(v0o);
    }

    public C69526Vqq(V0O v0o) {
        this.A00 = v0o;
    }
}
