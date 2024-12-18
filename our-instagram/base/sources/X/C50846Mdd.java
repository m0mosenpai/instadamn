package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.leadads.repository.LeadFormRepository;

/* renamed from: X.Mdd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50846Mdd extends C9U7 {
    public final UserSession A00;
    public final P4V A01;

    @Override // X.C9U7
    public final AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str) {
        C14360o3.A0B(c152406tQ, 2);
        UserSession userSession = this.A00;
        return new NOb(c152406tQ, userSession, this.A01, new LeadFormRepository(userSession));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50846Mdd(Bundle bundle, InterfaceC08430c6 interfaceC08430c6, UserSession userSession, P4V p4v) {
        super(bundle, interfaceC08430c6);
        MSZ.A1O(userSession, p4v);
        this.A00 = userSession;
        this.A01 = p4v;
    }
}
