package X;

import com.instagram.api.schemas.TextAppUserFavoriteNotificationPostType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hvm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40399Hvm {
    public static Map A00(InterfaceC43518JKe interfaceC43518JKe) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43518JKe.CbN() != null) {
            A1I.put("is_push_enabled", interfaceC43518JKe.CbN());
        }
        if (interfaceC43518JKe.BXO() != null) {
            TextAppUserFavoriteNotificationPostType BXO = interfaceC43518JKe.BXO();
            if (BXO != null) {
                str = BXO.A00;
            } else {
                str = null;
            }
            A1I.put("notification_post_type", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
