package X;

import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.Destination;
import com.instagram.wonderwall.model.WallLaunchConfig;

/* renamed from: X.FDd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34361FDd {
    public static final WallLaunchConfig A00(android.net.Uri uri, UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 1);
        if (uri == null || (str = uri.getQueryParameter("wall_owner_id")) == null) {
            str = userSession.userId;
        }
        Destination destination = null;
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("post_id");
            String queryParameter2 = uri.getQueryParameter("media_id");
            String queryParameter3 = uri.getQueryParameter("destination");
            if (queryParameter3 != null && queryParameter3.hashCode() == -1352294148 && queryParameter3.equals("create")) {
                destination = new Destination.Composer(queryParameter2);
            } else if (queryParameter != null) {
                destination = new Destination.Preview(queryParameter);
            }
        }
        C14360o3.A0B(str, 1);
        return new WallLaunchConfig(destination, str);
    }
}
