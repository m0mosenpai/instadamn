package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.WGf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70197WGf {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(X.C65888Tvs r10, int r11) {
        /*
            r3 = 7
            r4 = r11
            X.Tvu r0 = r10.A01
            if (r0 == 0) goto L8
            int r4 = r0.A05
        L8:
            int r5 = r10.A00(r11)
            r6 = r11
            X.Tw7 r0 = X.C65902Tw7.A06
            java.util.Map r1 = r10.A04
            java.lang.Object r0 = r1.get(r0)
            X.Tvu r0 = (X.C65890Tvu) r0
            if (r0 == 0) goto L1b
            int r6 = r0.A05
        L1b:
            r7 = r11
            X.Tw7 r0 = X.C65902Tw7.A04
            java.lang.Object r0 = r1.get(r0)
            X.Tvu r0 = (X.C65890Tvu) r0
            if (r0 == 0) goto L28
            int r7 = r0.A05
        L28:
            r8 = r11
            X.Tw7 r0 = X.C65902Tw7.A05
            java.lang.Object r0 = r1.get(r0)
            X.Tvu r0 = (X.C65890Tvu) r0
            if (r0 == 0) goto L35
            int r8 = r0.A05
        L35:
            r9 = r11
            X.Tw7 r0 = X.C65902Tw7.A07
            java.lang.Object r0 = r1.get(r0)
            X.Tvu r0 = (X.C65890Tvu) r0
            if (r0 == 0) goto L42
            int r9 = r0.A05
        L42:
            r10 = r11
            X.Tw7 r0 = X.C65902Tw7.A03
            java.lang.Object r0 = r1.get(r0)
            X.Tvu r0 = (X.C65890Tvu) r0
            if (r0 == 0) goto L4f
            int r10 = r0.A05
        L4f:
            int[] r2 = new int[]{r4, r5, r6, r7, r8, r9, r10}
            r0 = 0
        L54:
            r1 = r2[r0]
            if (r1 == r11) goto L5f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L64
            return r1
        L5f:
            int r0 = r0 + 1
            if (r0 >= r3) goto L64
            goto L54
        L64:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70197WGf.A00(X.Tvs, int):int");
    }

    public static final Bitmap A01(Context context, Bitmap bitmap, int i, int i2, int i3, boolean z) {
        int[] A0A;
        C14360o3.A0B(context, 0);
        if (bitmap != null) {
            if (z) {
                int A01 = C1H4.A01(bitmap.getHeight() * 0.1f);
                C65887Tvr c65887Tvr = new C65887Tvr(bitmap);
                c65887Tvr.A01(0, bitmap.getWidth(), A01);
                int A00 = A00(c65887Tvr.A00(), i3);
                c65887Tvr.A01 = null;
                c65887Tvr.A01(bitmap.getHeight() - A01, bitmap.getWidth(), bitmap.getHeight());
                A0A = new int[]{A00, A00(c65887Tvr.A00(), i3)};
            } else {
                A0A = A0A(new C65887Tvr(bitmap).A00(), i3);
            }
            return A02(context, new LinearGradient(0.0f, 0.0f, 0.0f, i2, A0A[0], A0A[1], Shader.TileMode.CLAMP), 0.2f, i, i2);
        }
        Bitmap A0F = AbstractC167007dF.A0F(i, i2);
        new Canvas(A0F).drawColor(i3);
        return A0F;
    }

    public static final void A09(ImageUrl imageUrl, XCU xcu, String str) {
        C14360o3.A0B(imageUrl, 0);
        A09(imageUrl, xcu, str);
        throw null;
    }

    public static final int[] A0A(C65888Tvs c65888Tvs, int i) {
        int i2 = i;
        C65890Tvu c65890Tvu = c65888Tvs.A01;
        if (c65890Tvu != null) {
            i2 = c65890Tvu.A05;
        }
        int i3 = i;
        C65890Tvu c65890Tvu2 = (C65890Tvu) c65888Tvs.A04.get(C65902Tw7.A06);
        if (c65890Tvu2 != null) {
            i3 = c65890Tvu2.A05;
        }
        int A00 = c65888Tvs.A00(i);
        if (A00 != i && i3 != i) {
            return new int[]{i3, A00};
        }
        return new int[]{i2, i2};
    }

    public static final File A03(String str) {
        new File(str).mkdirs();
        return new File(str, AnonymousClass001.A0e("media_sticker_background_", ".jpg", System.currentTimeMillis()));
    }

    public static final void A08(Bitmap bitmap, XCU xcu, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                C0fK.A02(Bitmap.CompressFormat.JPEG, bitmap, fileOutputStream, 90);
                C11T.A02(new WwN(bitmap, xcu, file));
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            C0w9.A07("unable to create background input file", e);
            C11T.A02(new RunnableC71488Wuo(xcu, e));
        }
    }

    public static final Bitmap A02(Context context, Shader shader, float f, int i, int i2) {
        Bitmap A0F = AbstractC167007dF.A0F(i, i2);
        Canvas canvas = new Canvas(A0F);
        Paint paint = new Paint(5);
        paint.setShader(shader);
        Paint paint2 = new Paint();
        AbstractC166987dD.A1N(context, paint2, R.color.sticker_background);
        paint2.setAlpha((int) (f * 255.0f));
        canvas.drawPaint(paint);
        canvas.drawPaint(paint2);
        return A0F;
    }

    public static final void A04(Context context, Bitmap bitmap, XCU xcu, String str, int i) {
        C14120nc.A00().ATO(new C68016V6i(context, bitmap, xcu, str, i));
    }

    public static final void A05(Context context, ImageUrl imageUrl, XCU xcu, String str, int i, boolean z) {
        C14120nc.A00().ATO(new C68018V6k(context, imageUrl, xcu, str, i, z));
    }

    public static final void A06(Context context, XCU xcu, String str, float f, int i, int i2, boolean z) {
        int[] iArr = {i, i2};
        int[] iArr2 = {0, 0, 0, 1};
        if (z) {
            // fill-array-data instruction
            iArr2[0] = 1;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 1;
        }
        A07(context, xcu, str, iArr, iArr2, f);
    }

    public static final void A07(Context context, XCU xcu, String str, int[] iArr, int[] iArr2, float f) {
        C14120nc.A00().ATO(new C68019V6l(context, xcu, str, iArr, iArr2, f));
    }
}
