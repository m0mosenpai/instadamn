package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.KsN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47128KsN {
    public static final C85973sR A00(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.right_caret);
        C14360o3.A0A(drawable);
        Drawable mutate = drawable.mutate();
        C14360o3.A07(mutate);
        AbstractC25231BEo.A0x(context, mutate, R.color.design_dark_default_color_on_background);
        AbstractC43594JPz.A15(mutate);
        return new C85973sR(mutate);
    }
}
