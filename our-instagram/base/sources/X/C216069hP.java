package X;

import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.9hP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216069hP extends IgFrameLayout {
    public final void setTitle(String str) {
        if (str != null && str.length() != 0) {
            TextView A0N = AbstractC167007dF.A0N(this, R.id.igds_debug_overlay_textview);
            A0N.setText(str);
            A0N.setVisibility(0);
        }
    }
}
