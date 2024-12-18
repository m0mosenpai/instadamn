package X;

import android.view.View;

/* renamed from: X.VPg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68398VPg {
    public static final void A00(View view, boolean z) {
        int i;
        if (view != null) {
            int visibility = view.getVisibility();
            if (z) {
                if (visibility != 0) {
                    i = 0;
                } else {
                    return;
                }
            } else {
                i = 8;
                if (visibility == 8) {
                    return;
                }
            }
            view.setVisibility(i);
        }
    }
}
