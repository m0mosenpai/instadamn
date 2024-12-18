package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* loaded from: classes7.dex */
public final class HYI extends HYE {
    public final Context A00;

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.HjI] */
    public final void A01(C1P1 c1p1, C1GL c1gl, C93Z c93z) {
        C14360o3.A0B(c1gl, 3);
        C40955ICc c40955ICc = new C40955ICc(this.A00);
        UserSession userSession = this.A05;
        C47715L4w A00 = A00(userSession, c93z);
        C99074cU c99074cU = ((HYE) this).A00;
        L23 l23 = this.A06;
        if (!AbstractC40786I5o.A00(c99074cU, userSession, l23, A00) && !C41608Iax.A00.A00(userSession, l23, A00) && ((HYE) this).A01 == null) {
            ?? obj = new Object();
            obj.A00 = true;
            AbstractC166987dD.A1Z(new MC0(this, A00, obj, c1p1, c40955ICc, c1gl, null, 8), ((C4A7) this).A01);
        }
    }

    public static final C47715L4w A00(UserSession userSession, C93Z c93z) {
        String str;
        String str2 = c93z.A06;
        String str3 = c93z.A04;
        ExploreTopicCluster exploreTopicCluster = c93z.A02.A00;
        if (exploreTopicCluster != null) {
            str = exploreTopicCluster.A06;
        } else {
            str = null;
        }
        return new C47715L4w(userSession, str2, str3, str, c93z.A07, c93z.A05, c93z.A08, c93z.A0G);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HYI(Context context, UserSession userSession, L23 l23) {
        super(userSession, l23);
        AbstractC167017dG.A1P(userSession, context);
        this.A00 = context;
    }
}
