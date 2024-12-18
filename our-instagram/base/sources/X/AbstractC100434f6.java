package X;

import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import java.io.IOException;

/* renamed from: X.4f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC100434f6 {
    public static C100444f8 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f = null;
            IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("ig_ads_feed_video_watch_and_browse_viewer_min_screen_threshold".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("ig_ads_feed_video_watch_and_browse_viewer_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGAdsFeedVideoWBViewerTypeEnum = (IGAdsFeedVideoWBViewerTypeEnum) IGAdsFeedVideoWBViewerTypeEnum.A01.get(A1P);
                    if (iGAdsFeedVideoWBViewerTypeEnum == null) {
                        iGAdsFeedVideoWBViewerTypeEnum = IGAdsFeedVideoWBViewerTypeEnum.A0B;
                    }
                } else if ("is_tall_video".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return new C100444f8(iGAdsFeedVideoWBViewerTypeEnum, bool, f);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
