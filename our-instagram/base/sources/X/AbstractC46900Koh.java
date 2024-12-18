package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.R;

/* renamed from: X.Koh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46900Koh {
    public static final void A00(ViewGroup viewGroup) {
        while (viewGroup != null) {
            int id = viewGroup.getId();
            viewGroup.setClipChildren(false);
            if (id != R.id.message_actions_container) {
                viewGroup.setClipToPadding(false);
                ViewParent parent = viewGroup.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    return;
                }
            } else {
                viewGroup.setClipToPadding(false);
                return;
            }
        }
    }
}
