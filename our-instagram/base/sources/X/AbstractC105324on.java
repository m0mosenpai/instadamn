package X;

import com.instagram.api.schemas.IGAdsStoryInteractiveMediaGestureType;
import com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4on, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC105324on {
    public static C38161q3 parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            ArrayList arrayList = null;
            IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum = null;
            Boolean bool = null;
            Float f = null;
            Float f2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("delay_time_in_ms".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("gesture_types".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P2 = null;
                            } else {
                                A1P2 = c16l.A1P();
                            }
                            IGAdsStoryInteractiveMediaGestureType iGAdsStoryInteractiveMediaGestureType = (IGAdsStoryInteractiveMediaGestureType) IGAdsStoryInteractiveMediaGestureType.A01.get(A1P2);
                            if (iGAdsStoryInteractiveMediaGestureType == null) {
                                iGAdsStoryInteractiveMediaGestureType = IGAdsStoryInteractiveMediaGestureType.A05;
                            }
                            arrayList.add(iGAdsStoryInteractiveMediaGestureType);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("interactive_media_design_option".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum = (IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum) IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum.A01.get(A1P);
                    if (iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum == null) {
                        iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum = IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum.A06;
                    }
                } else if ("is_interactive_media_available".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("safezone_left_and_right".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("safezone_top_and_bottom".equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                }
                c16l.A0z();
            }
            return new C38161q3(iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum, bool, f, f2, num, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
