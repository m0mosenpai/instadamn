package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.FPo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34679FPo {
    public boolean A00;
    public final UserSession A01;
    public final boolean A02;

    public C34679FPo(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = C196218mC.A00(userSession);
    }

    public final void A00() {
        CallerContext callerContext = AbstractC173237nb.A00;
        C173247nc c173247nc = new C173247nc();
        C2JM c2jm = c173247nc.A01.A00;
        c2jm.A02("ig_feed_xpost_upsell", true);
        ArrayList arrayList = c173247nc.A02;
        arrayList.add("IG_FEED_CROSS_POSTING_UPSELL");
        c173247nc.A00();
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 2342156944816539974L) || C18U.A06(C06090Tz.A05, userSession, 36314395164281377L)) {
            c2jm.A01(AbstractC111324zv.A00(2524));
        }
        if (!C18U.A06(c06090Tz, userSession, 2342156944816605511L) || C18U.A06(C06090Tz.A05, userSession, 36314395164281377L)) {
            c2jm.A01(AbstractC111324zv.A00(2953));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        boolean z = c173247nc.A00;
        C14360o3.A0B(strArr, 2);
        AbstractC173237nb.A00(userSession, new C36489G7n(this, 1), c173247nc, strArr, z);
    }
}
