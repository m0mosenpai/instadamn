package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.KrN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47066KrN {
    public static final C45026JwH A00(GifUrlImpl gifUrlImpl, String str, String str2) {
        DirectAnimatedMediaUser directAnimatedMediaUser;
        if (str2 != null) {
            directAnimatedMediaUser = new DirectAnimatedMediaUser(str2, true);
        } else {
            directAnimatedMediaUser = null;
        }
        return new C45026JwH(new DirectAnimatedMedia(directAnimatedMediaUser, gifUrlImpl, false, false, str, false), new DirectAnimatedMedia(directAnimatedMediaUser, gifUrlImpl, false, false, str, false), false);
    }
}
