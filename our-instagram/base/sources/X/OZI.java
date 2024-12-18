package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class OZI {
    public static final OZI A00 = new Object();

    public static final void A00(Canvas canvas, ViewGroup viewGroup, OZI ozi) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            int[] iArr = new int[2];
            childAt.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof ViewGroup) {
                    canvas.save();
                    canvas.translate(i2, i3);
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    viewGroup2.draw(canvas);
                    canvas.restore();
                    A00(canvas, viewGroup2, ozi);
                } else if (childAt instanceof TextureView) {
                    Bitmap bitmap = ((TextureView) childAt).getBitmap();
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, i2, i3, (Paint) null);
                    } else {
                        throw AbstractC166987dD.A12("Texture view returned null bitmap");
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
