package X;

import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes11.dex */
public final class UCF extends LinearLayout.LayoutParams {
    @Override // android.view.ViewGroup.LayoutParams
    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        if (typedArray.hasValue(i)) {
            ((ViewGroup.LayoutParams) this).width = typedArray.getLayoutDimension(i, "layout_width");
        } else {
            ((ViewGroup.LayoutParams) this).width = -2;
        }
        if (typedArray.hasValue(i2)) {
            ((ViewGroup.LayoutParams) this).height = typedArray.getLayoutDimension(i2, "layout_height");
        } else {
            ((ViewGroup.LayoutParams) this).height = -2;
        }
    }
}
