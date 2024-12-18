package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* loaded from: classes9.dex */
public final class NM8 extends IgdsMediaButton {
    public NM8(Context context) {
        super(context, null, 0);
    }

    @Override // com.instagram.igds.components.mediabutton.IgdsMediaButton, android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        if (getBackground() != null && !isEnabled()) {
            Drawable background = getBackground();
            int i = 255;
            if (!z) {
                i = 77;
            }
            background.setAlpha(i);
        }
    }
}
