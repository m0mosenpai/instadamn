package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.user.model.User;

/* renamed from: X.Kmq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46795Kmq {
    public static final C163167Sb A00(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, DirectAnimatedMedia directAnimatedMedia) {
        GifUrlImpl gifUrlImpl;
        boolean z;
        boolean z2;
        Boolean bool;
        Boolean bool2;
        C14360o3.A0B(context, 0);
        AbstractC25233BEq.A0x(1, userSession, c7im, anonymousClass988);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        User user = c160787Im.A0K;
        String str = null;
        if (directAnimatedMedia != null) {
            gifUrlImpl = directAnimatedMedia.A02;
        } else {
            gifUrlImpl = null;
        }
        DirectMessageIdentifier A0V = c83403nh.A0V();
        if (user != null) {
            str = user.getUsername();
        }
        if (directAnimatedMedia != null && (bool2 = directAnimatedMedia.A04) != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        C7QL A0Y = AbstractC43594JPz.A0Y(userSession, anonymousClass988, c160787Im, c7im, c83403nh);
        C7QX A0d = AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c83403nh);
        if (directAnimatedMedia != null && (bool = directAnimatedMedia.A03) != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        return new C163167Sb(A0d, A0Y, A0V, gifUrlImpl, str, z, false, z2);
    }
}
