package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6C {
    public static C29931c8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29931c8 c29931c8 = new C29931c8();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("share_target".equals(A0s)) {
                    c29931c8.A01 = C7NS.parseFromJson(c16l);
                } else if ("reel_id".equals(A0s)) {
                    c29931c8.A03 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(4841).equals(A0s)) {
                    c29931c8.A00 = FUW.parseFromJson(c16l);
                } else if (ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY.equals(A0s)) {
                    c29931c8.A02 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c29931c8, A0s);
                }
                c16l.A0z();
            }
            return c29931c8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
