package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.SgP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63265SgP {
    public static final Paint A00;
    public static final Lock A02;
    public static final java.util.Set A04;
    public static final Paint A03 = new Paint(6);
    public static final Paint A01 = new Paint(7);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.locks.Lock] */
    static {
        ?? r0;
        String[] strArr = new String[29];
        System.arraycopy(new String[]{"XT1078", "XT1079"}, AbstractC31175DnJ.A1b(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077"}, strArr) ? 1 : 0, strArr, 27, 2);
        HashSet A13 = AbstractC58319PtB.A13(strArr);
        A04 = A13;
        if (A13.contains(Build.MODEL)) {
            r0 = new ReentrantLock();
        } else {
            r0 = new Object();
        }
        A02 = r0;
        Paint paint = new Paint(7);
        A00 = paint;
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.SRC_IN);
    }

    public static Bitmap A00(Bitmap bitmap, InterfaceC65571Tn4 interfaceC65571Tn4) {
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap AXA = interfaceC65571Tn4.AXA(bitmap.getWidth(), bitmap.getHeight(), config);
        new Canvas(AXA).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return AXA;
    }

    public static void A02(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = A02;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, A03);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap A01(Bitmap bitmap, InterfaceC65571Tn4 interfaceC65571Tn4, int i, int i2) {
        Bitmap.Config config;
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
            int A0A = AbstractC166987dD.A0A(bitmap.getWidth(), min);
            int A0A2 = AbstractC166987dD.A0A(bitmap.getHeight(), min);
            if (bitmap.getWidth() != A0A || bitmap.getHeight() != A0A2) {
                int width = (int) (bitmap.getWidth() * min);
                int height = (int) (bitmap.getHeight() * min);
                if (bitmap.getConfig() != null) {
                    config = bitmap.getConfig();
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap AXA = interfaceC65571Tn4.AXA(width, height, config);
                AXA.setHasAlpha(bitmap.hasAlpha());
                if (android.util.Log.isLoggable("TransformationUtils", 2)) {
                    bitmap.getWidth();
                    bitmap.getHeight();
                    AXA.getWidth();
                    AXA.getHeight();
                }
                Matrix A0Q = AbstractC166987dD.A0Q();
                A0Q.setScale(min, min);
                A02(bitmap, AXA, A0Q);
                return AXA;
            }
        }
        android.util.Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }
}
