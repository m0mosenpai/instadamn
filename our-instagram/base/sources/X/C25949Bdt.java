package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Bdt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25949Bdt extends AbstractC58814QAx {
    public final Context A00;

    @Override // X.AbstractC58814QAx
    public final Drawable getBrandingDrawable() {
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.maa_login_gradient_background);
        if (drawable == null) {
            return AbstractC25225BEi.A0G(AbstractC167007dF.A09(context, R.attr.igds_color_secondary_background));
        }
        return drawable;
    }

    @Override // X.AbstractC58814QAx
    public final Drawable getIconDrawable() {
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.caa_central_images_instagram);
        if (context.getDrawable(R.drawable.maa_login_gradient_background) != null && drawable != null) {
            AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_ATOP, drawable, context.getColor(AbstractC53242c7.A0A(context)));
        }
        return drawable;
    }

    public C25949Bdt(Context context) {
        super(context);
        this.A00 = context;
    }
}
