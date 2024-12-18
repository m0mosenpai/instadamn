package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public abstract class AHW {
    public static AbstractC24481Hr A01(Context context, Bitmap bitmap, UserSession userSession, boolean z) {
        return LH2.A00(C14120nc.A00(), new B1Q(context, bitmap, userSession, z), 205);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(android.graphics.Bitmap r7, java.io.File r8, boolean r9) {
        /*
            java.lang.String r6 = "Failed while trying to save decor image"
            java.lang.String r5 = "Failed to close outputStream"
            java.lang.String r4 = "ImageOverlayUtil"
            r3 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Exception -> L1e java.lang.Throwable -> L3a
            r0 = 100
            X.C0fK.A02(r1, r7, r2, r0)     // Catch: java.lang.Exception -> L1e java.lang.Throwable -> L3a
            if (r9 == 0) goto L31
            r7.recycle()
            goto L31
        L1e:
            r0 = move-exception
            goto L24
        L20:
            r1 = move-exception
            goto L3c
        L22:
            r0 = move-exception
            r2 = r3
        L24:
            X.AbstractC12120kG.A07(r4, r6, r0)     // Catch: java.lang.Throwable -> L3a
            X.C0K8.A0F(r4, r6, r0)     // Catch: java.lang.Throwable -> L3a
            if (r9 == 0) goto L2f
            r7.recycle()
        L2f:
            if (r2 == 0) goto L39
        L31:
            r2.close()     // Catch: java.io.IOException -> L35
            return
        L35:
            r0 = move-exception
            X.C0K8.A0F(r4, r5, r0)
        L39:
            return
        L3a:
            r1 = move-exception
            r3 = r2
        L3c:
            if (r9 == 0) goto L41
            r7.recycle()
        L41:
            if (r3 == 0) goto L4b
            r3.close()     // Catch: java.io.IOException -> L47
            throw r1
        L47:
            r0 = move-exception
            X.C0K8.A0F(r4, r5, r0)
        L4b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHW.A02(android.graphics.Bitmap, java.io.File, boolean):void");
    }

    public static Bitmap A00(Bitmap bitmap, float f) {
        float width = bitmap.getWidth() / bitmap.getHeight();
        if (AbstractC166987dD.A01(1.0f, f / width) > 0.001f) {
            int width2 = (int) (bitmap.getWidth() / f);
            int height = (bitmap.getHeight() / 2) - (width2 / 2);
            if (height < 0) {
                Throwable th = new Throwable(AnonymousClass001.A0O("croppedTop: ", height));
                AbstractC12120kG.A07("ImageOverlayUtil", "Failed while trying to cropDecorBitmap", th);
                C0K8.A0F("ImageOverlayUtil", "Failed while trying to cropDecorBitmap", th);
            } else {
                if (height + width2 > bitmap.getHeight()) {
                    Throwable th2 = new Throwable(AnonymousClass001.A0a("bitmapAspectRatio: ", ", videoAspectRatio: ", width, f));
                    AbstractC12120kG.A07("ImageOverlayUtil", "Failed while trying to cropDecorBitmap", th2);
                    C0K8.A0F("ImageOverlayUtil", "Failed while trying to cropDecorBitmap", th2);
                    return bitmap;
                }
                int width3 = bitmap.getWidth();
                C0fK.A03(bitmap);
                return Bitmap.createBitmap(bitmap, 0, height, width3, width2);
            }
        }
        return bitmap;
    }
}
