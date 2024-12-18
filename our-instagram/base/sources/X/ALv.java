package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class ALv {
    public static final ALv A00 = new Object();

    public static final Bitmap A00(Context context, UserSession userSession, C47Z c47z) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        String str = c47z.A3V;
        if (str != null) {
            mediaMetadataRetriever.setDataSource(str);
            Bitmap A01 = A01(mediaMetadataRetriever);
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                new C09540e5(th);
            }
            if (A01 == null) {
                return null;
            }
            Point A02 = ALe.A02(context, userSession, c47z.A02, c47z.A1N.A09);
            Bitmap A002 = C0fK.A00(A01, A02.x, A02.y, true);
            C14360o3.A07(A002);
            if (A002.equals(A01)) {
                return A002;
            }
            A01.recycle();
            return A002;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final Bitmap A01(MediaMetadataRetriever mediaMetadataRetriever) {
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L, 2);
        if (frameAtTime == null) {
            Bitmap frameAtTime2 = mediaMetadataRetriever.getFrameAtTime(1L, 2);
            if (frameAtTime2 == null) {
                Bitmap frameAtTime3 = mediaMetadataRetriever.getFrameAtTime();
                if (frameAtTime3 == null) {
                    return mediaMetadataRetriever.getFrameAtTime(1000L);
                }
                return frameAtTime3;
            }
            return frameAtTime2;
        }
        return frameAtTime;
    }

    public final Bitmap A02(MediaMetadataRetriever mediaMetadataRetriever, int i, int i2) {
        if (Build.VERSION.SDK_INT < 30) {
            Bitmap A01 = A01(mediaMetadataRetriever);
            if (A01 != null) {
                Matrix A0Q = AbstractC166987dD.A0Q();
                A0Q.postScale(i / A01.getWidth(), i2 / A01.getHeight());
                int width = A01.getWidth();
                int height = A01.getHeight();
                C0fK.A03(A01);
                Bitmap createBitmap = Bitmap.createBitmap(A01, 0, 0, width, height, A0Q, false);
                C14360o3.A07(createBitmap);
                A01.recycle();
                return createBitmap;
            }
            return null;
        }
        MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
        bitmapParams.setPreferredConfig(Bitmap.Config.RGB_565);
        Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(0L, 2, i, i2, bitmapParams);
        if (scaledFrameAtTime != null) {
            return scaledFrameAtTime;
        }
        return mediaMetadataRetriever.getScaledFrameAtTime(1L, 2, i, i2, bitmapParams);
    }
}
