package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;

/* renamed from: X.8Q2, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8Q2 {
    public static final void A00(Matrix matrix, Drawable drawable, C202278x7 c202278x7, LinkedHashMap linkedHashMap, int i, int i2, int i3, boolean z, boolean z2) {
        if (drawable != null && c202278x7 != null) {
            if (z2 || z || AbstractC209069Mo.A04(drawable)) {
                C210399Se A01 = AbstractC209069Mo.A01(drawable);
                TreeSet treeSet = new TreeSet();
                RectF rectF = new RectF(drawable.getBounds());
                matrix.reset();
                float f = c202278x7.A06;
                matrix.preScale(f, f, c202278x7.A03, c202278x7.A04);
                matrix.preTranslate(c202278x7.A01, c202278x7.A02);
                matrix.mapRect(rectF);
                treeSet.add(new C5NO(rectF, c202278x7.A05, i, i2, i3));
                linkedHashMap.put(drawable, treeSet);
                if (A01 != null && A01 != drawable) {
                    int height = drawable.getBounds().height() - A01.getBounds().height();
                    float f2 = c202278x7.A06;
                    float f3 = f2 * height;
                    float exactCenterY = f2 * (A01.getBounds().exactCenterY() - drawable.getBounds().exactCenterY());
                    double radians = Math.toRadians(c202278x7.A05);
                    C5NO c5no = new C5NO(rectF.centerX() + ((float) ((-exactCenterY) * Math.sin(radians))), rectF.centerY() + ((float) (exactCenterY * Math.cos(radians))), rectF.width(), rectF.height() - f3, c202278x7.A05, i, i2, i3);
                    TreeSet treeSet2 = new TreeSet();
                    treeSet2.add(c5no);
                    linkedHashMap.put(A01, treeSet2);
                }
            }
        }
    }

    public static final boolean A01(InteractiveDrawableContainer interactiveDrawableContainer) {
        List<Drawable> allDrawables = interactiveDrawableContainer.getAllDrawables();
        if (!(allDrawables instanceof Collection) || !allDrawables.isEmpty()) {
            for (Drawable drawable : allDrawables) {
                if (!(drawable instanceof C210499So) && !(drawable instanceof C210489Sn)) {
                    if (!AbstractC209069Mo.A04(drawable) && AbstractC209069Mo.A01(drawable) == null) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
