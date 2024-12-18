package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.JVl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43726JVl implements MQ0 {
    public final /* synthetic */ C43731JVq A00;

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "message is from creator ai";
    }

    public C43726JVl(C43731JVq c43731JVq) {
        this.A00 = c43731JVq;
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        C2ED c2ed;
        User CDl;
        C43732JVr c43732JVr = (C43732JVr) obj;
        AbstractC167017dG.A1N(c43732JVr, userSession);
        String str = c43732JVr.A06;
        if (str == null || (c2ed = (C2ED) this.A00.A02.invoke(userSession, str)) == null || (CDl = c2ed.CDl(c43732JVr.A05)) == null || CDl.A03.Aah() != IGAIAgentType.A04) {
            return true;
        }
        return false;
    }
}
