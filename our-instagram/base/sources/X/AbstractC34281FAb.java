package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;

/* renamed from: X.FAb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34281FAb {
    public static final String A00(Context context, UserSession userSession, C66645URj c66645URj) {
        Resources resources;
        int i;
        C14360o3.A0B(context, 0);
        StoryJoinChatStatus storyJoinChatStatus = c66645URj.A02;
        if (storyJoinChatStatus != null) {
            String str = c66645URj.A0K;
            if (str != null && AbstractC34105F3h.A00(userSession).A00.contains(str)) {
                String string = context.getResources().getString(2131955126);
                C14360o3.A0A(string);
                return string;
            }
            int ordinal = storyJoinChatStatus.ordinal();
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 1) {
                        return "";
                    }
                    resources = context.getResources();
                    i = 2131955120;
                } else {
                    resources = context.getResources();
                    i = 2131955126;
                }
            } else {
                resources = context.getResources();
                i = 2131955127;
            }
            return AbstractC166997dE.A0q(resources, i);
        }
        throw AbstractC166997dE.A0g();
    }
}
