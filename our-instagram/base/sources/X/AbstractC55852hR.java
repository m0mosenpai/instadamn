package X;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.forker.Process;

/* renamed from: X.2hR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC55852hR {
    public static final int[] A01 = {R.attr.state_checked};
    public static final int[] A02 = new int[0];
    public static final Rect A00 = new Rect();

    public static PorterDuff.Mode A00(PorterDuff.Mode mode, int i) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case Process.SIGTERM /* 15 */:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static Rect A01(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets A002 = AbstractC66257U6b.A00(drawable);
            return new Rect(A002.left, A002.top, A002.right, A002.bottom);
        }
        return W1C.A00(drawable);
    }

    public static void A02(Drawable drawable) {
        int[] iArr;
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                iArr = A02;
            } else {
                iArr = A01;
            }
            drawable.setState(iArr);
            drawable.setState(state);
        }
    }
}
