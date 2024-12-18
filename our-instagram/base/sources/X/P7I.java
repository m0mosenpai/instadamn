package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P7I implements GYB {
    public final Context A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C25621Ms A0c = AbstractC167017dG.A0c(this.A01);
        A0c.A0B("users/set_message_settings_v2/");
        A0c.A9s("ig_followers", "primary");
        A0c.A9s("others_on_ig", "primary");
        C1ON A0e = AbstractC25227BEk.A0e(A0c, C52097N2x.class, OQ7.class);
        C50689MZh.A00(A0e, this, 17);
        C1GJ.A03(A0e);
    }

    public P7I(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
