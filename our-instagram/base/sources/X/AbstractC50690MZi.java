package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.MZi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50690MZi {
    public static final int[] A00(Rect rect, Drawable drawable, Drawable drawable2) {
        int intrinsicHeight;
        int[] iArr = new int[2];
        if (IgdsSwitch.A0O) {
            iArr[0] = drawable.getIntrinsicWidth() + rect.left + rect.right;
            intrinsicHeight = drawable.getIntrinsicHeight();
        } else {
            iArr[0] = drawable.getIntrinsicWidth() + ((drawable2.getIntrinsicWidth() * 2) / IgdsSwitch.A0M) + rect.left + rect.right;
            intrinsicHeight = drawable2.getIntrinsicHeight();
        }
        iArr[1] = intrinsicHeight + rect.top + rect.bottom;
        return iArr;
    }
}
