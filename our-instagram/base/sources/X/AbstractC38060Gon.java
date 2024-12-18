package X;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: X.Gon, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38060Gon {
    public static final void A00(Drawable drawable, C38064Gos c38064Gos, String str, boolean z, boolean z2) {
        Drawable drawable2;
        C14360o3.A0B(c38064Gos, 0);
        if (str == null || str.length() == 0) {
            TextView textView = c38064Gos.A01;
            textView.setText((CharSequence) null);
            textView.setCompoundDrawables(null, null, null, null);
            return;
        }
        if (z2) {
            str = AnonymousClass001.A0R(str, " [L]");
        }
        TextView textView2 = c38064Gos.A01;
        textView2.setText(str);
        if (z) {
            drawable2 = c38064Gos.A00;
        } else {
            drawable2 = null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
        if (!z) {
            return;
        }
        textView2.setContentDescription(textView2.getContext().getString(2131968063, str));
    }
}
