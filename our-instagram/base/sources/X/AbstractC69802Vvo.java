package X;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: X.Vvo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69802Vvo {
    public static void A01(PopupWindow popupWindow) {
        popupWindow.setIsClippedToScreen(true);
    }

    public static void A00(Rect rect, PopupWindow popupWindow) {
        popupWindow.setEpicenterBounds(rect);
    }
}
