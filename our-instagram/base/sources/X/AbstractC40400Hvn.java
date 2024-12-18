package X;

import com.instagram.api.schemas.TextAppUserFavoriteNotificationPostType;
import java.io.IOException;

/* renamed from: X.Hvn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40400Hvn {
    public static C38793H6i parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            TextAppUserFavoriteNotificationPostType textAppUserFavoriteNotificationPostType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_push_enabled".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("notification_post_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    textAppUserFavoriteNotificationPostType = (TextAppUserFavoriteNotificationPostType) TextAppUserFavoriteNotificationPostType.A01.get(A1P);
                    if (textAppUserFavoriteNotificationPostType == null) {
                        textAppUserFavoriteNotificationPostType = TextAppUserFavoriteNotificationPostType.A07;
                    }
                }
                c16l.A0z();
            }
            return new C38793H6i(textAppUserFavoriteNotificationPostType, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
