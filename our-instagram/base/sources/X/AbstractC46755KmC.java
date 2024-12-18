package X;

import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KmC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46755KmC {
    public static final int A00(Resources resources, UserSession userSession) {
        double A00 = C18U.A00(C06090Tz.A05, userSession, 37174037164589676L);
        if (A00 > 1.0d) {
            A00 = 1.0d;
        }
        return (int) (A00 * resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material));
    }
}
