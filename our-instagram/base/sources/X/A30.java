package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filter.VideoFilter;

/* loaded from: classes4.dex */
public abstract class A30 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.9N3] */
    public static final VideoFilter A00(Context context, Bitmap bitmap, UserSession userSession, BackgroundGradientColors backgroundGradientColors, TransformMatrixConfig transformMatrixConfig, C22853A5w c22853A5w, C915647m c915647m) {
        C14360o3.A0B(c915647m, 2);
        C8M7 A01 = C8M4.A00(userSession).A01(c915647m.A01);
        VideoFilter videoFilter = new VideoFilter(context, AbstractC72893XqS.A00(c22853A5w, A01), A01);
        videoFilter.A03 = c915647m.A00;
        if (backgroundGradientColors != null) {
            int i = backgroundGradientColors.A01;
            int i2 = backgroundGradientColors.A00;
            videoFilter.A0I = VideoFilter.A00(i);
            videoFilter.A0H = VideoFilter.A00(i2);
        }
        if (bitmap != null) {
            videoFilter.A05 = bitmap;
        }
        if (transformMatrixConfig == 0) {
            transformMatrixConfig = new C9N3();
        }
        videoFilter.A02((InterfaceC1122755a) transformMatrixConfig);
        return videoFilter;
    }
}
