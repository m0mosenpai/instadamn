package X;

import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.IOException;

/* renamed from: X.9xF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225509xF {
    public static BWW parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ClipsCameraCommandAction clipsCameraCommandAction = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsCameraCommandAction = (ClipsCameraCommandAction) ClipsCameraCommandAction.A01.get(A1P);
                    if (clipsCameraCommandAction == null) {
                        clipsCameraCommandAction = ClipsCameraCommandAction.A0B;
                    }
                } else if (ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            if (clipsCameraCommandAction == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("action", c16l, "OpenClipsCameraCommandImpl");
            } else if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c16l, "OpenClipsCameraCommandImpl");
            } else {
                return new BWW(clipsCameraCommandAction, num.intValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
