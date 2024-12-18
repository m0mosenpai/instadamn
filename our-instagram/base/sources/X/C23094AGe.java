package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.AGe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23094AGe {
    public static final C23094AGe A00 = new Object();

    public final Drawable A00(Context context, UserSession userSession, User user, int i) {
        Object obj;
        AbstractC167017dG.A1P(userSession, context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.asset_search_icon_width);
        int A0A = AbstractC13880nE.A0A(context);
        String A0D = AnonymousClass001.A0D(AbstractC166997dE.A10(Locale.ROOT, user.getUsername()), '@');
        if (A0D.length() > i) {
            A0D = AnonymousClass001.A0R(C00Q.A03(A0D, i - 2), "...");
        }
        Iterator it = AbstractC202818xz.A03(context, userSession, new C217889kL(null, user, A0D, dimensionPixelSize, A0A)).A05().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Drawable drawable = (Drawable) obj;
                if ((drawable instanceof C202328xC) && C14360o3.A0K(((C202328xC) drawable).A01, "mention_sticker_hero")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Drawable) obj;
    }
}
