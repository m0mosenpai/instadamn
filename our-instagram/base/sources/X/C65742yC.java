package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.SuggestedUsersStyle;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.2yC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65742yC {
    public View A00;
    public SuggestedUsersStyle A01;
    public final Context A02;
    public final UserSession A03;
    public final Map A05 = new HashMap();
    public final Queue A04 = new LinkedList();

    public static final C13270mD A00(SuggestedUsersStyle suggestedUsersStyle, C65742yC c65742yC) {
        Context context;
        int i;
        Context contextThemeWrapper;
        Map map = c65742yC.A05;
        C13270mD c13270mD = (C13270mD) map.get(suggestedUsersStyle);
        if (c13270mD == null) {
            int ordinal = suggestedUsersStyle.ordinal();
            if (ordinal != 1) {
                if (ordinal != 3) {
                    contextThemeWrapper = c65742yC.A02;
                    C13270mD c13270mD2 = new C13270mD(contextThemeWrapper, 0);
                    map.put(suggestedUsersStyle, c13270mD2);
                    return c13270mD2;
                }
                context = c65742yC.A02;
                i = R.style.SuggestedUsers_WithContentThumbnail;
            } else {
                context = c65742yC.A02;
                i = R.style.SuggestedUsers_EmbeddedWithContentThumbnail;
            }
            contextThemeWrapper = new ContextThemeWrapper(context, i);
            C13270mD c13270mD22 = new C13270mD(contextThemeWrapper, 0);
            map.put(suggestedUsersStyle, c13270mD22);
            return c13270mD22;
        }
        return c13270mD;
    }

    public C65742yC(Context context, UserSession userSession) {
        this.A02 = context;
        this.A03 = userSession;
    }
}
