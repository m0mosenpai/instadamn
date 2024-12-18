package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Looper;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.AKb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23117AKb {
    public static Bitmap A00(Bitmap bitmap, C176877tj c176877tj, int i, boolean z) {
        C176877tj A01;
        int i2;
        int i3;
        Bitmap bitmap2;
        if (!A03()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (c176877tj == null) {
                A01 = null;
            } else {
                A01 = AD7.A01(new C176877tj(width, height), c176877tj);
            }
            if (!z && A01 == null && i == 0) {
                return bitmap;
            }
            Matrix A0Q = AbstractC166987dD.A0Q();
            if (A01 != null) {
                i2 = A01.A02;
                i3 = A01.A01;
            } else {
                i2 = width;
                i3 = height;
            }
            if (i != 0) {
                A0Q.postRotate(i);
            }
            if (z) {
                A0Q.preScale(-1.0f, 1.0f);
            }
            int i4 = (width - i2) / 2;
            int i5 = (height - i3) / 2;
            try {
                C0fK.A03(bitmap);
                bitmap2 = Bitmap.createBitmap(bitmap, i4, i5, i2, i3, A0Q, false);
            } catch (Throwable unused) {
                bitmap2 = null;
            }
            if (bitmap != bitmap2) {
                bitmap.recycle();
            }
            return bitmap2;
        }
        throw AbstractC166987dD.A18("Method processBitmap must be invoked on a background thread");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r2 != 270) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap A01(X.C176877tj r9, X.C176877tj r10, byte[] r11, boolean r12) {
        /*
            boolean r0 = A03()
            if (r0 != 0) goto L6b
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r0 = 1
            r1.inJustDecodeBounds = r0
            int r7 = r11.length
            r6 = 0
            X.C0fL.A00(r11, r6, r7, r1)
            int r2 = r1.outWidth
            int r1 = r1.outHeight
            X.7tj r0 = new X.7tj
            r0.<init>(r2, r1)
            if (r9 != 0) goto L1f
            r9 = r0
        L1f:
            int r5 = r9.A02
            r8 = r5
            int r4 = r9.A01
            int r3 = r0.A02
            int r2 = r0.A01
            int r1 = r3 - r2
            int r0 = r5 - r4
            int r1 = r1 * r0
            r0 = 0
            if (r1 < 0) goto L31
            r0 = 1
        L31:
            if (r0 != 0) goto L35
            r5 = r4
            r4 = r8
        L35:
            r1 = r3
        L36:
            int r0 = r1 / 2
            if (r0 < r5) goto L40
            int r2 = r2 / 2
            if (r2 < r4) goto L40
            r1 = r0
            goto L36
        L40:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            int r3 = r3 / r1
            r0.inSampleSize = r3
            r0.inJustDecodeBounds = r6
            android.graphics.Bitmap r3 = X.C0fL.A00(r11, r6, r7, r0)     // Catch: java.lang.Throwable -> L4f
            goto L50
        L4f:
            r3 = 0
        L50:
            if (r3 != 0) goto L54
            r0 = 0
            return r0
        L54:
            int r2 = X.AbstractC196718n1.A00(r11)
            if (r12 == 0) goto L62
            r1 = 270(0x10e, float:3.78E-43)
            r0 = 90
            if (r2 == r0) goto L68
            if (r2 == r1) goto L63
        L62:
            r0 = r2
        L63:
            android.graphics.Bitmap r0 = A00(r3, r10, r0, r12)
            return r0
        L68:
            r0 = 270(0x10e, float:3.78E-43)
            goto L63
        L6b:
            java.lang.String r0 = "Method generateBitmap must be invoked on a background thread"
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23117AKb.A01(X.7tj, X.7tj, byte[], boolean):android.graphics.Bitmap");
    }

    public static IOException A02(Bitmap bitmap, File file) {
        if (!A03()) {
            IOException e = null;
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    C0fK.A02(Bitmap.CompressFormat.JPEG, bitmap, bufferedOutputStream, 90);
                    bufferedOutputStream.flush();
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th) {
                    try {
                        bufferedOutputStream.close();
                        throw th;
                    } catch (IOException unused) {
                        throw th;
                    }
                }
                try {
                    bufferedOutputStream.close();
                    return e;
                } catch (IOException unused2) {
                    return e;
                }
            } catch (IOException e3) {
                return e3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        throw AbstractC166987dD.A18("Method processBitmapToBitmapFile must be invoked on a background thread");
    }

    public static boolean A03() {
        return AbstractC167007dF.A1X(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
