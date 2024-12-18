package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.EditText;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.FcN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35050FcN {
    public static final void A00(Context context, EditText editText, int i, boolean z) {
        String str;
        int i2;
        C14360o3.A0B(editText, 1);
        if (i == 0) {
            i2 = 2131969717;
        } else if (i == 1) {
            i2 = 2131969718;
        } else if (!z) {
            i2 = 2131969720;
        } else {
            str = null;
            editText.setHint(str);
        }
        str = context.getString(i2);
        editText.setHint(str);
    }

    public static final void A01(Context context, CircularImageView circularImageView, int i) {
        int A0C;
        C14360o3.A0B(circularImageView, 2);
        circularImageView.setVisibility(0);
        Drawable background = circularImageView.getBackground();
        C14360o3.A0C(background, AbstractC111324zv.A00(27));
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.mutate();
        try {
            A0C = AbstractC167017dG.A07(context);
        } catch (Resources.NotFoundException unused) {
            AbstractC166987dD.A1T(C18950wb.A01, "Resource.NotFoundException when getting R.dimen.color_stroke_size", 817896325);
            A0C = AbstractC166987dD.A0C(context, 2);
        }
        gradientDrawable.setStroke(A0C, context.getColor(i));
    }

    public static final boolean A02(EditText editText) {
        C14360o3.A0B(editText, 0);
        return AbstractC167007dF.A1N(AbstractC25228BEl.A1A(AbstractC167007dF.A0g(editText)).length());
    }
}
