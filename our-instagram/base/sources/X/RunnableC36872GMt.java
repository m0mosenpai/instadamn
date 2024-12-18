package X;

import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.GMt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36872GMt implements Runnable {
    public final /* synthetic */ C31782Dy1 A00;

    public RunnableC36872GMt(C31782Dy1 c31782Dy1) {
        this.A00 = c31782Dy1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C31782Dy1 c31782Dy1 = this.A00;
        Drawable drawable = c31782Dy1.getCompoundDrawablesRelative()[2];
        if (c31782Dy1.A02 && c31782Dy1.isFocused() && drawable == null) {
            c31782Dy1.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.token_delete, 0);
        }
        if (!c31782Dy1.isFocused()) {
            c31782Dy1.A01 = false;
            if (drawable != null) {
                c31782Dy1.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
    }
}
