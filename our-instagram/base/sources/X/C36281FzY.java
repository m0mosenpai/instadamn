package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.FzY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36281FzY implements InterfaceC13000lm {
    public boolean A00;
    public final UserSession A01;

    public C36281FzY(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A00() {
        UserSession userSession = this.A01;
        if (!C18U.A06(C06090Tz.A06, userSession, 2342157455917648446L) && C18U.A06(C06090Tz.A05, userSession, 36314446703888957L)) {
            CallerContext callerContext = AbstractC173237nb.A00;
            C173247nc c173247nc = new C173247nc();
            C173257nd c173257nd = c173247nc.A01;
            c173257nd.A00.A02("ig_discover_people_upsell", AbstractC166997dE.A0b());
            ArrayList arrayList = c173247nc.A02;
            arrayList.add("IG_DISCOVER_PEOPLE_HOME_UPSELL");
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            boolean z = c173247nc.A00;
            C14360o3.A0B(strArr, 2);
            AbstractC173237nb.A00(userSession, new C36489G7n(this, 0), c173247nc, strArr, z);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C36281FzY.class);
    }
}
