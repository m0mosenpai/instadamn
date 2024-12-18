package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes7.dex */
public abstract class I27 {
    public static final void A00(Context context, C38394GuV c38394GuV, int i, int i2) {
        C41L c41l = c38394GuV.A00;
        if (c41l != null) {
            c41l.setVisibility(0);
            c41l.A01(i2, i);
            c41l.setCurrentPage(i2);
            c41l.setActiveColor(context.getColor(R.color.badge_color));
            c41l.setInactiveColor(context.getColor(R.color.grey_2));
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
