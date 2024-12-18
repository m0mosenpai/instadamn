package X;

import android.R;
import android.content.res.ColorStateList;
import android.widget.ImageView;

/* renamed from: X.2jG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56832jG {
    public static final void A01(ImageView imageView, int i, int i2, int i3, int i4, int i5, int i6) {
        C14360o3.A0B(imageView, 0);
        int A06 = AbstractC56842jH.A06(i, i3);
        imageView.setImageTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, R.attr.state_selected}, new int[]{R.attr.state_enabled, R.attr.state_pressed}, new int[]{-16842910}, new int[0]}, new int[]{AbstractC56842jH.A06(i2, i4), AbstractC56842jH.A06(i2, i5), AbstractC56842jH.A06(i, i6), A06}));
    }

    public static final void A00(ImageView imageView, int i, int i2, int i3) {
        A01(imageView, i, i2, 255, 255, 255, i3);
    }
}
