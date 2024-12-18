package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.L6t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47749L6t {
    public final Resources A00;
    public final Context A01;

    public final void A00(ImageView imageView) {
        Drawable drawable;
        C14360o3.A0B(imageView, 0);
        boolean z = this instanceof KVI;
        if (z) {
            drawable = ((KVI) this).A00;
        } else {
            drawable = ((KVJ) this).A00;
        }
        if (drawable != null) {
            Context context = this.A01;
            if (Build.VERSION.SDK_INT < 29) {
                drawable.setColorFilter(AbstractC31174DnI.A03(context), PorterDuff.Mode.SRC_ATOP);
            } else {
                drawable.setColorFilter(new BlendModeColorFilter(AbstractC31174DnI.A03(context), BlendMode.SRC_ATOP));
            }
        }
        if (z) {
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.getLayoutParams().height = -2;
            AbstractC43592JPx.A1G(imageView, -2);
        } else {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Resources resources = this.A00;
            layoutParams.width = resources.getDimensionPixelSize(R.dimen.action_button_settings_height);
            AbstractC31172DnG.A1F(resources, imageView.getLayoutParams(), R.dimen.abc_star_medium);
        }
        imageView.requestLayout();
        imageView.setImageDrawable(drawable);
    }

    public AbstractC47749L6t(Context context) {
        this.A01 = context;
        this.A00 = AbstractC166997dE.A0M(context);
    }
}
