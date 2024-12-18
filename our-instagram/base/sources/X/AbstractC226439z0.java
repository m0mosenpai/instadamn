package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9z0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226439z0 {
    public static final Bitmap A00(Bitmap bitmap, TargetViewSizeProvider targetViewSizeProvider) {
        C14360o3.A0B(targetViewSizeProvider, 1);
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        int width = interfaceC1812882f.getWidth();
        int height = interfaceC1812882f.getHeight();
        RectF A0X = AbstractC166987dD.A0X();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float f = width;
        float f2 = height;
        float max = Math.max(Math.abs(f / width2), Math.abs(f2 / height2));
        float abs = Math.abs(width2 * max);
        float abs2 = Math.abs(height2 * max);
        float f3 = (int) ((f - abs) * 0.5f);
        float f4 = (int) ((f2 - abs2) * 0.5f);
        A0X.set(f3, f4, abs + f3, abs2 + f4);
        Rect A0U = AbstractC166987dD.A0U();
        A0X.roundOut(A0U);
        Bitmap A00 = C0fK.A00(bitmap, A0U.width(), A0U.height(), true);
        C14360o3.A07(A00);
        return A00;
    }
}
