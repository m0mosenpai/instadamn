package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* renamed from: X.SiH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63359SiH {
    public static final ThreadLocal A02 = new TYE();
    public static final ThreadLocal A03 = new TYF();
    public static final ThreadLocal A04 = new TYG();
    public static final ThreadLocal A00 = new TYH();
    public static final float A01 = (float) (Math.sqrt(2.0d) / 2.0d);

    public static float A01(Matrix matrix) {
        float[] fArr = (float[]) A00.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = A01;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void A03(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) A02.get();
        Path path2 = (Path) A03.get();
        Path path3 = (Path) A04.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if ((f == 1.0f && f2 == 0.0f) || length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float min = Math.min(f4, f5) + f6;
        float max = Math.max(f4, f5) + f6;
        if (min >= length && max >= length) {
            min = AbstractC63251Sg7.A00(min, length);
            max = AbstractC63251Sg7.A00(max, length);
        }
        if (min < 0.0f) {
            min = AbstractC63251Sg7.A00(min, length);
        }
        if (max < 0.0f) {
            max = AbstractC63251Sg7.A00(max, length);
        }
        if (min == max) {
            path.reset();
            return;
        }
        if (min >= max) {
            min -= length;
        }
        path2.reset();
        pathMeasure.getSegment(min, max, path2, true);
        if (max > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, max % length, path3, true);
        } else {
            if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
            }
            path.set(path2);
        }
        path2.addPath(path3);
        path.set(path2);
    }

    public static void A04(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float A00() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap A02(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap A002 = C0fK.A00(bitmap, i, i2, true);
        bitmap.recycle();
        return A002;
    }
}
