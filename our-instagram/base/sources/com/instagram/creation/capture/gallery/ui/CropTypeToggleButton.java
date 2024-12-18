package com.instagram.creation.capture.gallery.ui;

import X.AbstractC010103p;
import X.AbstractC46530KiV;
import X.AbstractC53242c7;
import X.AbstractC56952jT;
import X.C05F;
import X.C14360o3;
import X.C5L6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes8.dex */
public final class CropTypeToggleButton extends IgSimpleImageView {
    public C5L6 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropTypeToggleButton(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A00 = C5L6.A0E;
        AbstractC56952jT.A04(this, C05F.A06);
    }

    public final void setCropType(C5L6 c5l6) {
        C14360o3.A0B(c5l6, 0);
        C5L6 c5l62 = this.A00;
        C5L6 c5l63 = C5L6.A0B;
        int i = R.drawable.instagram_fit_pano_outline_24;
        if (c5l62 == c5l63) {
            i = R.drawable.instagram_fill_pano_outline_24;
        }
        Context context = getContext();
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            drawable.setColorFilter(AbstractC46530KiV.A00(C05F.A0j, context.getColor(AbstractC53242c7.A0E(context))));
        } else {
            drawable = null;
        }
        setImageDrawable(drawable);
        AbstractC010103p.A0G(this, getResources().getString(c5l6.A02));
        this.A00 = c5l6;
    }

    public final C5L6 getCropType() {
        return this.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropTypeToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = C5L6.A0E;
        AbstractC56952jT.A04(this, C05F.A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropTypeToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = C5L6.A0E;
        AbstractC56952jT.A04(this, C05F.A06);
    }
}
