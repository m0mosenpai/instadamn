package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.CIz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27680CIz {
    public static final String A00(Context context, UserSession userSession, C38321qM c38321qM) {
        int size;
        List Ab8 = c38321qM.A0C.Ab8();
        if (Ab8 != null && (size = Ab8.size()) > 0 && C41754IeU.A03(userSession)) {
            return AbstractC07900bA.A02(context.getResources(), new String[]{String.valueOf(size)}, R.plurals.open_carousel_media_user_name_header_v2_subtitle, size).toString();
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36320244911775932L)) {
            return c38321qM.A2v();
        }
        return null;
    }
}
