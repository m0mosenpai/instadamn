package X;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: X.AzB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24850AzB implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ XGG A02;
    public final /* synthetic */ C84823qW A03;

    public RunnableC24850AzB(Rect rect, ViewGroup viewGroup, XGG xgg, C84823qW c84823qW) {
        this.A00 = rect;
        this.A02 = xgg;
        this.A01 = viewGroup;
        this.A03 = c84823qW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect = this.A00;
        float width = rect.width();
        XGG xgg = this.A02;
        Float Bav = xgg.Bav();
        if (Bav != null) {
            float floatValue = width * (1.0f - (Bav.floatValue() * 2.0f));
            ViewGroup viewGroup = this.A01;
            float A07 = (floatValue / AbstractC166987dD.A07(viewGroup)) * 0.95f;
            viewGroup.setScaleX(A07);
            viewGroup.setScaleY(A07);
            int centerX = rect.centerX();
            float f = rect.bottom;
            float height = rect.height();
            Float Aj2 = xgg.Aj2();
            if (Aj2 != null) {
                float floatValue2 = f - ((height * Aj2.floatValue()) / 2.0f);
                float height2 = rect.height();
                Float Bav2 = xgg.Bav();
                if (Bav2 != null) {
                    float floatValue3 = floatValue2 - ((height2 * Bav2.floatValue()) / 2.0f);
                    C84823qW c84823qW = this.A03;
                    float f2 = c84823qW.A01 * 2.0f * 3.1415927f;
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    float f3 = centerX - exactCenterX;
                    double d = f2;
                    float cos = (float) Math.cos(d);
                    float f4 = floatValue3 - exactCenterY;
                    float sin = (float) Math.sin(d);
                    viewGroup.setX((((cos * f3) - (sin * f4)) + exactCenterX) - (viewGroup.getWidth() / 2));
                    viewGroup.setY((((f3 * sin) + (f4 * cos)) + exactCenterY) - (viewGroup.getHeight() / 2));
                    viewGroup.setRotation(c84823qW.A01 * 360.0f);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
