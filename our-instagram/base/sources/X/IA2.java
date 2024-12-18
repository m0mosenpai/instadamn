package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes7.dex */
public abstract class IA2 {
    public static final void A00(IgdsButton igdsButton, int i) {
        C14360o3.A0B(igdsButton, 0);
        Context context = igdsButton.getContext();
        Drawable drawable = context.getDrawable(i);
        int A04 = (int) AbstractC13880nE.A04(context, 16);
        if (drawable != null) {
            drawable.setBounds(0, 0, A04, A04);
        }
        igdsButton.setIcon(drawable, EnumC99774dy.A03);
        igdsButton.setIconPadding(AbstractC167017dG.A04(context));
    }
}
