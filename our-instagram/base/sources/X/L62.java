package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L62 {
    public final Context A00;

    public final C74P A00(UserSession userSession, int i) {
        int i2;
        C14360o3.A0B(userSession, 0);
        Context context = this.A00;
        String A02 = AbstractC56412ia.A02(context.getResources(), i);
        if (A02 == null) {
            A02 = "";
        }
        String valueOf = String.valueOf(i);
        Resources resources = context.getResources();
        int i3 = 0;
        if (resources != null) {
            i2 = resources.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
        } else {
            i2 = 0;
        }
        int A06 = JQ0.A06(context);
        Resources resources2 = context.getResources();
        if (resources2 != null) {
            i3 = resources2.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
        }
        return new C74P(context, userSession, new C74V(i2, A06, i3), C05F.A00, A02, valueOf, (String) null, 1.0f, context.getColor(R.color.fds_transparent), context.getColor(R.color.fds_transparent), false);
    }

    public L62(Context context) {
        this.A00 = context;
    }
}
