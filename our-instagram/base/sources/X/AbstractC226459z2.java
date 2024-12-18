package X;

import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import java.io.IOException;

/* renamed from: X.9z2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226459z2 {
    public static ReelsVisualRepliesModel parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ReelsVisualRepliesModel reelsVisualRepliesModel = new ReelsVisualRepliesModel();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_vcr_tappable_data".equals(A0s)) {
                    reelsVisualRepliesModel.A00 = AbstractC2042191r.parseFromJson(c16l);
                } else {
                    ADU.A01(c16l, reelsVisualRepliesModel, A0s);
                }
                c16l.A0z();
            }
            return reelsVisualRepliesModel;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
