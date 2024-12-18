package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cx2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29369Cx2 implements GYK {
    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167017dG.A1N(context, userSession);
        C63208SfC A00 = C63208SfC.A00(context);
        AbstractC166987dD.A1Z(new PYs(A00, null, 24), AbstractC167017dG.A0w(C12L.A00, 535));
        C66277U6x A01 = C66277U6x.A01("com.instagram.settings.about", AbstractC167017dG.A0r("is_managed", String.valueOf(A00.A03())));
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0U = context.getString(2131951987);
        A01.A04(context, igBloksScreenConfig);
    }
}
