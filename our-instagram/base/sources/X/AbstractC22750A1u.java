package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.io.File;
import java.io.IOException;

/* renamed from: X.A1u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22750A1u {
    public static final BackgroundGradientColors A00(UserSession userSession, File file, boolean z) {
        String absolutePath;
        BackgroundGradientColors backgroundGradientColors = new BackgroundGradientColors(-16777216, -16777216);
        if (file != null && file.exists() && userSession != null) {
            if (z) {
                return AbstractC209669Pc.A02(file);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                absolutePath = file.getCanonicalPath();
            } catch (IOException unused) {
                absolutePath = file.getAbsolutePath();
            }
            int i = 1;
            while (options.outWidth / i > 200 && options.outHeight / i > 200) {
                i *= 2;
            }
            if (i < 1) {
                i = 1;
            }
            options.inSampleSize = i;
            options.inJustDecodeBounds = false;
            Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
            if (decodeFile == null) {
                return backgroundGradientColors;
            }
            return AbstractC14570oV.A01(decodeFile, C05F.A00);
        }
        return backgroundGradientColors;
    }
}
