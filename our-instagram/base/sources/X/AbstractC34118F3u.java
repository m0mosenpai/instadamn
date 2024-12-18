package X;

import android.graphics.Rect;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.F3u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34118F3u {
    public static final void A00(IgTextView igTextView) {
        C14360o3.A0B(igTextView, 0);
        if (igTextView.isLaidOut() && !igTextView.isLayoutRequested()) {
            AbstractC31179DnN.A0l(new Rect(), igTextView);
        } else {
            igTextView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC35699FpZ(igTextView, 1));
        }
    }
}
