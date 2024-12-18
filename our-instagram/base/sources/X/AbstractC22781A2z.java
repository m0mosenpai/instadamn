package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.model.filterkit.TextureAsset;
import java.util.ArrayList;

/* renamed from: X.A2z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22781A2z {
    /* JADX WARN: Type inference failed for: r9v0, types: [X.A5w, java.lang.Object] */
    public static final C22892A7m A00(Context context, UserSession userSession, C47Z c47z) {
        Bitmap bitmap;
        String str = c47z.A2Q;
        VideoFilter videoFilter = null;
        if (str != null) {
            bitmap = BitmapFactory.decodeFile(str);
        } else {
            bitmap = null;
        }
        C915647m c915647m = c47z.A1i;
        BackgroundGradientColors backgroundGradientColors = c47z.A14;
        TransformMatrixConfig transformMatrixConfig = c47z.A16;
        ?? obj = new Object();
        obj.A00 = C14360o3.A0K(c47z.A2W, "front");
        VideoFilter A00 = A30.A00(context, bitmap, userSession, backgroundGradientColors, transformMatrixConfig, obj, c915647m);
        String str2 = c47z.A2k;
        if (str2 != null && str2.length() != 0) {
            TextureAsset textureAsset = new TextureAsset("image_overlay", str2);
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add(textureAsset);
            videoFilter = new VideoFilter(context, A1E);
        }
        return new C22892A7m(A00, videoFilter);
    }
}
