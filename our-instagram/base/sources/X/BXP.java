package X;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* loaded from: classes5.dex */
public abstract class BXP {
    public static final void A00(Drawable drawable, TextView textView) {
        if (textView.getTextCursorDrawable() != drawable) {
            textView.setTextCursorDrawable(drawable);
        }
    }
}
