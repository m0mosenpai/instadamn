package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KG1 extends AbstractC61132qb {
    public final AbstractC59962oe A00;
    public final UserSession A01;

    public KG1(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = abstractC59962oe;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        AbstractC59962oe abstractC59962oe = this.A00;
        Context requireContext = abstractC59962oe.requireContext();
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        return new C44505JmB(requireContext, userSession, new KZT(abstractC59962oe, userSession));
    }
}
