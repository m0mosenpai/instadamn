package X;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;

/* renamed from: X.CaU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28121CaU {
    public static final int A00 = Color.argb(128, 0, 0, 0);

    public static final Bitmap A00(Bitmap bitmap, Rect rect, Integer num, float[] fArr, boolean z) {
        Bitmap A01;
        if (bitmap == null || fArr == null || bitmap.getWidth() * bitmap.getHeight() != fArr.length) {
            return null;
        }
        UserSession userSession = C09Y.A00().A05.A00;
        boolean z2 = true;
        boolean A1X = AbstractC167007dF.A1X(num, C05F.A15);
        if (!AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36328783304736549L).booleanValue() || !A1X) {
            z2 = false;
        }
        C73312Y3i c73312Y3i = C73312Y3i.A00;
        if (z) {
            A01 = c73312Y3i.A02(bitmap, fArr);
        } else {
            A01 = c73312Y3i.A01(bitmap, rect, fArr);
        }
        if (z2) {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap copy = A01.copy(config, true);
            C14360o3.A07(copy);
            Bitmap copy2 = copy.copy(config, true);
            C14360o3.A0A(copy2);
            C30533DcG c30533DcG = new C30533DcG(copy2, 0, -1, 0);
            int width = copy2.getWidth();
            for (int i = 0; i < width; i++) {
                int height = copy2.getHeight();
                for (int i2 = 0; i2 < height; i2++) {
                    c30533DcG.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(copy2.getPixel(i, i2)));
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(A01.getWidth() + 6, A01.getHeight() + 6, config);
            C14360o3.A07(createBitmap);
            Canvas canvas = new Canvas(createBitmap);
            Paint A0R = AbstractC166987dD.A0R();
            A0R.setColor(-1);
            A0R.setAntiAlias(true);
            int i3 = -3;
            while (true) {
                int i4 = -3;
                while (true) {
                    if ((i3 * i3) + (i4 * i4) <= 9) {
                        canvas.drawBitmap(copy2, i3 + 3, i4 + 3, A0R);
                    }
                    if (i4 == 3) {
                        break;
                    }
                    i4++;
                }
                if (i3 != 3) {
                    i3++;
                } else {
                    canvas.drawBitmap(A01, 3.0f, 3.0f, (Paint) null);
                    int i5 = A00;
                    int width2 = createBitmap.getWidth();
                    int height2 = createBitmap.getHeight();
                    int i6 = (int) (2.0f * 2.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(width2 + i6, i6 + height2, config);
                    C14360o3.A07(createBitmap2);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    Paint A0S = AbstractC166987dD.A0S(1);
                    Bitmap createBitmap3 = Bitmap.createBitmap(width2, height2, Bitmap.Config.ALPHA_8);
                    C14360o3.A07(createBitmap3);
                    Canvas canvas3 = new Canvas(createBitmap3);
                    A0S.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
                    canvas3.drawBitmap(createBitmap, 0.0f, 0.0f, A0S);
                    A0S.reset();
                    A0S.setMaskFilter(new BlurMaskFilter(2.0f, BlurMaskFilter.Blur.NORMAL));
                    A0S.setAlpha(Color.alpha(i5));
                    float f = 1.0f + 2.0f;
                    canvas2.drawBitmap(createBitmap3, f, f, A0S);
                    A0S.reset();
                    canvas2.drawBitmap(createBitmap, 2.0f, 2.0f, A0S);
                    createBitmap.recycle();
                    createBitmap3.recycle();
                    return createBitmap2;
                }
            }
        } else {
            return A01;
        }
    }
}
