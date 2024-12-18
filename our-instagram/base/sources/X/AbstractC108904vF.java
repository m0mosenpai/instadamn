package X;

import java.io.IOException;

/* renamed from: X.4vF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC108904vF {
    public static C108914vG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("aspect_ratio_change_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("comment_redesign_combined_test_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_aspect_ratio_16_9".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("viewer_redesign_combined_test_enabled".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("viewer_redesign_v2_combined_test_enabled".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("aspect_ratio_change_enabled", "IGLiveViewerRedesignBroadcasterImpl");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (bool3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_aspect_ratio_16_9", "IGLiveViewerRedesignBroadcasterImpl");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("viewer_redesign_combined_test_enabled", "IGLiveViewerRedesignBroadcasterImpl");
                } else if (bool5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("viewer_redesign_v2_combined_test_enabled", "IGLiveViewerRedesignBroadcasterImpl");
                } else {
                    return new C108914vG(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("comment_redesign_combined_test_enabled", "IGLiveViewerRedesignBroadcasterImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
