package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.VideoFilter;

/* renamed from: X.9N7, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9N7 {
    public static final VideoFilter A00(Context context, UserSession userSession) {
        C9N2 c9n2 = VideoFilter.A0W;
        return new VideoFilter(context, null, ((C8M5) C8M4.A00(userSession)).A02);
    }
}
