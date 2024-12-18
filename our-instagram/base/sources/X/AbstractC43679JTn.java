package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JTn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43679JTn {
    public static final Drawable A01(Context context, UserSession userSession, ImageUrl imageUrl) {
        if (imageUrl == null) {
            return null;
        }
        int A02 = AbstractC31171DnF.A02(context.getResources(), R.dimen.account_group_management_clickable_width);
        return C74N.A01(context, userSession, null, AbstractC43592JPx.A0w(imageUrl), null, null, null, A02, A02, false, true, AbstractC47041Kqy.A00(userSession), false, false);
    }

    public static final Drawable A00(Context context, C45115Jxk c45115Jxk, UserSession userSession) {
        return C74N.A01(context, userSession, null, c45115Jxk.A05, null, null, null, c45115Jxk.A01, c45115Jxk.A02, false, false, AbstractC47041Kqy.A00(userSession), false, false);
    }
}
