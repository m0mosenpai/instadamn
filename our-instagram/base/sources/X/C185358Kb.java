package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.util.Iterator;

/* renamed from: X.8Kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185358Kb {
    public final C8KW A00;
    public final C8KR A01;

    public C185358Kb(C8KW c8kw, C8KR c8kr) {
        C14360o3.A0B(c8kr, 1);
        this.A01 = c8kr;
        this.A00 = c8kw;
    }

    public final void A00(AHC ahc, String str, long j) {
        Bitmap scaledFrameAtTime;
        C14360o3.A0B(str, 0);
        C8KR c8kr = this.A01;
        if (c8kr.A00(str) == null) {
            System.currentTimeMillis();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(str);
                Iterator it = AbstractC001800i.A0b(new C17u(0, Math.min((int) (j / 1000), ahc.A01))).iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    long j2 = intValue * 1000000;
                    if (Build.VERSION.SDK_INT >= 30) {
                        scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j2, 0, 224, 224);
                        if (scaledFrameAtTime != null) {
                            this.A00.CzY(j2, intValue, scaledFrameAtTime);
                            scaledFrameAtTime.recycle();
                        }
                    } else {
                        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j2, 0);
                        if (frameAtTime != null) {
                            Matrix matrix = new Matrix();
                            matrix.postScale(224.0f / frameAtTime.getWidth(), 224.0f / frameAtTime.getHeight());
                            int width = frameAtTime.getWidth();
                            int height = frameAtTime.getHeight();
                            C0fK.A03(frameAtTime);
                            scaledFrameAtTime = Bitmap.createBitmap(frameAtTime, 0, 0, width, height, matrix, false);
                            C14360o3.A07(scaledFrameAtTime);
                            frameAtTime.recycle();
                            this.A00.CzY(j2, intValue, scaledFrameAtTime);
                            scaledFrameAtTime.recycle();
                        }
                    }
                }
            } catch (Exception unused) {
            }
            mediaMetadataRetriever.release();
            this.A00.Dz3(c8kr, str, true, false);
            System.currentTimeMillis();
        }
    }
}
