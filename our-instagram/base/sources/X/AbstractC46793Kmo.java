package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.user.model.User;

/* renamed from: X.Kmo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46793Kmo {
    public static final KT7 A00(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, DirectAnimatedMedia directAnimatedMedia) {
        C14360o3.A0B(context, 0);
        AbstractC25233BEq.A0w(1, userSession, directAnimatedMedia, anonymousClass988);
        User user = c160787Im.A0K;
        return new KT7(AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c160787Im.A0e), directAnimatedMedia.A02, AbstractC43593JPy.A0z(user), false);
    }
}
