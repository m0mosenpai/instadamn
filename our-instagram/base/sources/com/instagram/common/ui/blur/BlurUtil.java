package com.instagram.common.ui.blur;

import X.AbstractC09440dt;
import X.C0fK;
import X.C14360o3;
import X.C1H4;
import X.C903940z;
import X.InterfaceC09390do;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;

/* loaded from: classes2.dex */
public final class BlurUtil {
    public static final BlurUtil INSTANCE = new Object();
    public static final InterfaceC09390do A00 = AbstractC09440dt.A01(C903940z.A00);

    public static final Bitmap blur(Bitmap bitmap, float f, int i) {
        C14360o3.A0B(bitmap, 0);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int A01 = C1H4.A01(width * f);
        if (A01 == 0) {
            A01 = width;
        }
        int A012 = C1H4.A01(height * f);
        if (A012 == 0) {
            A012 = height;
        }
        Bitmap A002 = C0fK.A00(bitmap, A01, A012, false);
        C14360o3.A07(A002);
        blurInPlace(A002, i);
        Bitmap A003 = C0fK.A00(A002, width, height, false);
        C14360o3.A07(A003);
        return A003;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36326270748866352L)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void blurInPlace(android.graphics.Bitmap r8, int r9) {
        /*
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            android.graphics.Bitmap$Config r1 = r8.getConfig()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r1 != r0) goto L8e
            boolean r0 = X.C1JN.A00
            if (r0 == 0) goto L20
            r0 = 36326270748866352(0x810e8d00003730, double:3.036218123510051E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L21
        L20:
            r0 = 0
        L21:
            long r1 = java.lang.System.nanoTime()
            long r3 = X.C84303pN.A00
            long r1 = r1 - r3
            if (r0 == 0) goto L72
            android.content.Context r0 = X.AbstractC12290kX.A00     // Catch: java.lang.Exception -> L69
            android.renderscript.RenderScript r7 = android.renderscript.RenderScript.create(r0)     // Catch: java.lang.Exception -> L69
            android.renderscript.Allocation r6 = android.renderscript.Allocation.createFromBitmap(r7, r8)     // Catch: java.lang.Exception -> L69
            android.renderscript.Type r0 = r6.getType()     // Catch: java.lang.Exception -> L69
            android.renderscript.Allocation r5 = android.renderscript.Allocation.createTyped(r7, r0)     // Catch: java.lang.Exception -> L69
            android.renderscript.Element r0 = android.renderscript.Element.U8_4(r7)     // Catch: java.lang.Exception -> L69
            android.renderscript.ScriptIntrinsicBlur r4 = android.renderscript.ScriptIntrinsicBlur.create(r7, r0)     // Catch: java.lang.Exception -> L69
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = (float) r9     // Catch: java.lang.Exception -> L69
            float r3 = r3 * r0
            r0 = 1103626240(0x41c80000, float:25.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L50
            r3 = 1103626240(0x41c80000, float:25.0)
        L50:
            r4.setRadius(r3)     // Catch: java.lang.Exception -> L69
            r4.setInput(r6)     // Catch: java.lang.Exception -> L69
            r4.forEach(r5)     // Catch: java.lang.Exception -> L69
            r5.copyTo(r8)     // Catch: java.lang.Exception -> L69
            r7.destroy()     // Catch: java.lang.Exception -> L69
            r6.destroy()     // Catch: java.lang.Exception -> L69
            r5.destroy()     // Catch: java.lang.Exception -> L69
            r4.destroy()     // Catch: java.lang.Exception -> L69
            goto L7e
        L69:
            r4 = move-exception
            java.lang.String r3 = "BlurUtil"
            java.lang.String r0 = "RenderScript blur failed"
            X.C0K8.A0F(r3, r0, r4)
            goto L7e
        L72:
            X.0do r0 = com.instagram.common.ui.blur.BlurUtil.A00
            java.lang.Object r3 = r0.getValue()
            com.instagram.jni.igblur.IgBlur r3 = (com.instagram.jni.igblur.IgBlur) r3
            r0 = 2
            r3.iterativeBoxBlur(r8, r0, r9)
        L7e:
            X.3pN r0 = X.C84303pN.A01
            long r0 = r0.A00(r1)
            r8.isMutable()
            r8.getWidth()
            X.C36J.A03(r0)
            return
        L8e:
            X.0do r0 = com.instagram.common.ui.blur.BlurUtil.A00
            java.lang.Object r1 = r0.getValue()
            com.instagram.jni.igblur.IgBlur r1 = (com.instagram.jni.igblur.IgBlur) r1
            X.0qk r0 = X.C15900qk.A01()
            int r0 = r0.A04()
            r1.functionToBlur(r8, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.blur.BlurUtil.blurInPlace(android.graphics.Bitmap, int):void");
    }

    public static final Bitmap blurRadial(Bitmap bitmap, float f, float f2, int i) {
        C14360o3.A0B(bitmap, 0);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int A01 = C1H4.A01(width * f);
        if (A01 == 0) {
            A01 = width;
        }
        int A012 = C1H4.A01(height * f);
        if (A012 == 0) {
            A012 = height;
        }
        float f3 = ((i - 1) * f2) + 1.0f;
        int i2 = (int) (A01 / f3);
        int i3 = (int) (A012 / f3);
        float f4 = (A01 - i2) / 2.0f;
        float f5 = (A012 - i3) / 2.0f;
        Bitmap A002 = C0fK.A00(bitmap, i2, i3, false);
        C14360o3.A07(A002);
        Bitmap createBitmap = Bitmap.createBitmap(A01, A012, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Paint paint = new Paint();
        matrix.setTranslate(f4, f5);
        canvas.drawBitmap(A002, matrix, paint);
        paint.setAlpha(51);
        for (int i4 = 0; i4 < i; i4++) {
            float f6 = (i4 * f2) + 1.0f;
            matrix.setScale(f6, f6, i2 / 2.0f, i3 / 2.0f);
            matrix.postTranslate(f4, f5);
            canvas.drawBitmap(A002, matrix, paint);
        }
        return createBitmap;
    }

    public static final Bitmap blurTranslation(Bitmap bitmap, float f, int i, int i2, int i3, int i4) {
        C14360o3.A0B(bitmap, 0);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int A01 = C1H4.A01(width * f);
        if (A01 == 0) {
            A01 = width;
        }
        int A012 = C1H4.A01(height * f);
        if (A012 == 0) {
            A012 = height;
        }
        Bitmap A002 = C0fK.A00(bitmap, A01, A012, false);
        C14360o3.A07(A002);
        Bitmap createBitmap = Bitmap.createBitmap(A002.getWidth(), A002.getHeight(), Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Paint paint = new Paint();
        float f2 = i3 / 2;
        float f3 = i;
        float f4 = i2;
        matrix.setTranslate(f2 * f3, f2 * f4);
        canvas.drawBitmap(A002, matrix, paint);
        int i5 = i3 / i4;
        paint.setAlpha(255 / i5);
        for (int i6 = 0; i6 < i5; i6++) {
            float f5 = i6 * i4;
            matrix.setTranslate(f5 * f3, f5 * f4);
            canvas.drawBitmap(A002, matrix, paint);
        }
        return createBitmap;
    }

    public static final Bitmap blurWithAlpha(Bitmap bitmap, float f, int i, int i2) {
        C14360o3.A0B(bitmap, 0);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int A01 = C1H4.A01(width * f);
        if (A01 == 0) {
            A01 = width;
        }
        int A012 = C1H4.A01(height * f);
        if (A012 == 0) {
            A012 = height;
        }
        Bitmap A002 = C0fK.A00(bitmap, A01, A012, false);
        C14360o3.A07(A002);
        blurInPlace(A002, i);
        if (!A002.isMutable()) {
            A002 = A002.copy(Bitmap.Config.ARGB_8888, true);
        }
        new Canvas(A002).drawColor((i2 & 255) << 24, PorterDuff.Mode.DST_IN);
        Bitmap A003 = C0fK.A00(A002, width, height, false);
        C14360o3.A07(A003);
        return A003;
    }

    public static /* synthetic */ Bitmap blurRadial$default(Bitmap bitmap, float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 10;
        }
        return blurRadial(bitmap, f, f2, i);
    }

    public static /* synthetic */ Bitmap blurTranslation$default(Bitmap bitmap, float f, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            i3 = 10;
        }
        if ((i5 & 32) != 0) {
            i4 = 1;
        }
        return blurTranslation(bitmap, f, i, i2, i3, i4);
    }
}
