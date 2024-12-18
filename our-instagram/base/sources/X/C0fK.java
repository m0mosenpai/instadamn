package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import java.io.OutputStream;
import java.util.Random;

/* renamed from: X.0fK, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fK {
    public static boolean A00;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r8 != android.graphics.Bitmap.CompressFormat.WEBP_LOSSLESS) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.graphics.Bitmap.CompressFormat r8, android.graphics.Bitmap r9, int r10) {
        /*
            boolean r0 = X.C0fK.A00
            if (r0 == 0) goto Lc4
            int r5 = r9.getWidth()     // Catch: java.lang.Exception -> Lc0
            int r4 = r9.getHeight()     // Catch: java.lang.Exception -> Lc0
            r0 = 150(0x96, float:2.1E-43)
            if (r5 < r0) goto Lc4
            if (r4 < r0) goto Lc4
            java.lang.String r2 = "IgBitmapDetour"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            r1.<init>()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "Bitmap -  Quality: "
            r1.append(r0)     // Catch: java.lang.Exception -> Lc0
            r1.append(r10)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = " Format: "
            r1.append(r0)     // Catch: java.lang.Exception -> Lc0
            r1.append(r8)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = " Width: "
            r1.append(r0)     // Catch: java.lang.Exception -> Lc0
            r1.append(r5)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = " Height:"
            r1.append(r0)     // Catch: java.lang.Exception -> Lc0
            r1.append(r4)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lc0
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> Lc0
            r0.<init>()     // Catch: java.lang.Exception -> Lc0
            X.C0K8.A0F(r2, r1, r0)     // Catch: java.lang.Exception -> Lc0
            android.graphics.Canvas r6 = new android.graphics.Canvas     // Catch: java.lang.Exception -> Lc0
            r6.<init>(r9)     // Catch: java.lang.Exception -> Lc0
            java.util.Random r3 = new java.util.Random     // Catch: java.lang.Exception -> Lc0
            r3.<init>()     // Catch: java.lang.Exception -> Lc0
            int r2 = r5 / 10
            android.graphics.Paint r7 = new android.graphics.Paint     // Catch: java.lang.Exception -> Lc0
            r7.<init>()     // Catch: java.lang.Exception -> Lc0
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL     // Catch: java.lang.Exception -> Lc0
            r7.setStyle(r0)     // Catch: java.lang.Exception -> Lc0
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> Lc0
            if (r8 != r0) goto L62
            r1 = -65536(0xffffffffffff0000, float:NaN)
            goto L80
        L62:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Exception -> Lc0
            if (r8 != r0) goto L6a
            r1 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            goto L80
        L6a:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lc0
            r0 = 30
            if (r1 < r0) goto L7e
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.WEBP_LOSSY     // Catch: java.lang.Exception -> Lc0
            if (r8 != r0) goto L78
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            goto L80
        L78:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.WEBP_LOSSLESS     // Catch: java.lang.Exception -> Lc0
            r1 = -256(0xffffffffffffff00, float:NaN)
            if (r8 == r0) goto L80
        L7e:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L80:
            r7.setColor(r1)     // Catch: java.lang.Exception -> Lc0
            int r0 = r2 * 2
            int r5 = r5 - r0
            int r1 = r3.nextInt(r5)     // Catch: java.lang.Exception -> Lc0
            int r1 = r1 + r2
            int r4 = r4 - r0
            int r0 = r3.nextInt(r4)     // Catch: java.lang.Exception -> Lc0
            int r0 = r0 + r2
            float r5 = (float) r1     // Catch: java.lang.Exception -> Lc0
            float r4 = (float) r0     // Catch: java.lang.Exception -> Lc0
            float r1 = (float) r2     // Catch: java.lang.Exception -> Lc0
            r6.drawCircle(r5, r4, r1, r7)     // Catch: java.lang.Exception -> Lc0
            r0 = -1
            r7.setColor(r0)     // Catch: java.lang.Exception -> Lc0
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD     // Catch: java.lang.Exception -> Lc0
            r7.setTypeface(r0)     // Catch: java.lang.Exception -> Lc0
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            r7.setTextSize(r1)     // Catch: java.lang.Exception -> Lc0
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER     // Catch: java.lang.Exception -> Lc0
            r7.setTextAlign(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch: java.lang.Exception -> Lc0
            android.graphics.Paint$FontMetrics r0 = r7.getFontMetrics()     // Catch: java.lang.Exception -> Lc0
            float r1 = r0.descent     // Catch: java.lang.Exception -> Lc0
            float r0 = r0.ascent     // Catch: java.lang.Exception -> Lc0
            float r0 = r1 - r0
            float r0 = r0 / r3
            float r0 = r0 - r1
            float r4 = r4 + r0
            r6.drawText(r2, r5, r4, r7)     // Catch: java.lang.Exception -> Lc0
            return
        Lc0:
            r0 = move-exception
            r0.printStackTrace()
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0fK.A01(android.graphics.Bitmap$CompressFormat, android.graphics.Bitmap, int):void");
    }

    public static void A03(Bitmap bitmap) {
        if (bitmap != null && bitmap.isRecycled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bitmap is recycled: ");
            sb.append(bitmap);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static Bitmap A00(Bitmap bitmap, int i, int i2, boolean z) {
        A03(bitmap);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        if (A00 && i > 150 && i2 > 150) {
            StringBuilder sb = new StringBuilder();
            sb.append(bitmap.getWidth());
            sb.append("x");
            sb.append(bitmap.getHeight());
            sb.append(" -> ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            String obj = sb.toString();
            Canvas canvas = new Canvas(createScaledBitmap);
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setTextSize(24.0f);
            paint.setTypeface(Typeface.DEFAULT_BOLD);
            paint.getTextBounds(obj, 0, obj.length(), new Rect());
            canvas.drawText(obj, (createScaledBitmap.getWidth() - r2.width()) / 2, new Random().nextInt(createScaledBitmap.getHeight()), paint);
        }
        return createScaledBitmap;
    }

    public static void A02(Bitmap.CompressFormat compressFormat, Bitmap bitmap, OutputStream outputStream, int i) {
        A01(compressFormat, bitmap, i);
        bitmap.compress(compressFormat, i, outputStream);
    }
}
