package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.facebook.R;

/* renamed from: X.Kmc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46781Kmc {
    public static final SpannableString A00(Context context) {
        C85973sR c85973sR;
        Drawable drawable = context.getDrawable(R.drawable.instagram_app_messenger_pano_filled_24);
        if (drawable != null) {
            drawable.mutate().setColorFilter(AbstractC167007dF.A09(context, R.attr.glyphColorPrimary), PorterDuff.Mode.SRC_IN);
            drawable.setBounds(0, 0, AbstractC13690mv.A01(context, 9), AbstractC13690mv.A01(context, 9));
        }
        SpannableString A07 = AbstractC43592JPx.A07(AnonymousClass001.A0D(context.getResources().getString(2131968706), ' '));
        if (drawable != null) {
            c85973sR = new C85973sR(drawable);
            c85973sR.A01 = (int) AbstractC13690mv.A00(context, 2.0f);
        } else {
            c85973sR = null;
        }
        A07.setSpan(c85973sR, 0, 1, 33);
        return A07;
    }
}
