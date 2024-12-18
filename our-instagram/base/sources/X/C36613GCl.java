package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.AbstractMap;

/* renamed from: X.GCl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36613GCl implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        String str;
        C35960FuK c35960FuK = new C35960FuK();
        AbstractMap A1G = AbstractC166987dD.A1G();
        A1G.put("referer", "settings_ad_options");
        UserSession userSession = this.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36311465996648983L)) {
            A1G = AbstractC35275FhA.A01();
            str = AbstractC111324zv.A00(101);
        } else {
            str = "com.instagram.sensitive_topics.sensitive_topics.ad_topic_preferences_view";
        }
        FragmentActivity fragmentActivity = this.A00;
        AbstractC10360h2 A0D = AbstractC31172DnG.A0D(fragmentActivity);
        A0D.A0r(new C55551Oll(2, A0D, this));
        C62862tP A0O = AbstractC31172DnG.A0O(fragmentActivity, c35960FuK, userSession);
        AbstractC192798gL A05 = C192108fB.A05(userSession, str, A1G);
        C32392EOt.A00(A05, A0O, 11);
        C1GJ.A03(A05);
    }

    public C36613GCl(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
