package X;

import java.util.List;

/* renamed from: X.Hzh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40623Hzh {
    public static final C38321qM A00(C130455uq c130455uq) {
        List list;
        C130505uv c130505uv;
        C14360o3.A0B(c130455uq, 0);
        int ordinal = c130455uq.A02.ordinal();
        Object obj = null;
        if (ordinal != 1 && ordinal != 3) {
            if (ordinal != 12 && ordinal != 13) {
                return null;
            }
            C130485ut c130485ut = c130455uq.A01;
            C14360o3.A0A(c130485ut);
            list = c130485ut.A0D;
        } else {
            C130485ut c130485ut2 = c130455uq.A01;
            C14360o3.A0A(c130485ut2);
            list = c130485ut2.A0E;
        }
        if (list != null && (c130505uv = (C130505uv) AbstractC001800i.A0O(list, 0)) != null) {
            obj = c130505uv.A0F;
            C14360o3.A0A(obj);
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.Media");
        return (C38321qM) obj;
    }
}
