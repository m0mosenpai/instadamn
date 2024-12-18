package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.54d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1121154d {
    public static final DirectAnimatedMedia A00(DirectAnimatedMedia directAnimatedMedia) {
        C14360o3.A0B(directAnimatedMedia, 0);
        String str = directAnimatedMedia.A05;
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        boolean z = directAnimatedMedia.A06;
        DirectAnimatedMediaUser directAnimatedMediaUser = directAnimatedMedia.A01;
        Boolean bool = directAnimatedMedia.A03;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(gifUrlImpl, 1);
        return new DirectAnimatedMedia(directAnimatedMediaUser, gifUrlImpl, true, bool, str, z);
    }

    public static final DirectAnimatedMedia A01(C1120954b c1120954b) {
        C9BH c9bh;
        GifUrlImpl gifUrlImpl;
        if (c1120954b == null || (c9bh = c1120954b.A00) == null || (gifUrlImpl = (GifUrlImpl) c9bh.A00) == null) {
            return null;
        }
        return new DirectAnimatedMedia(c1120954b.A01, gifUrlImpl, c1120954b.A03, c1120954b.A02, c1120954b.A04, c1120954b.A05);
    }
}
