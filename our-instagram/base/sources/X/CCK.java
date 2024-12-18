package X;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public abstract class CCK {
    public static Drawable A00(C2XE c2xe, int i) {
        TypedArray A02 = c2xe.A02(i, COC.A03);
        int indexCount = A02.getIndexCount();
        Drawable drawable = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = A02.getIndex(i2);
            if (index == 0) {
                drawable = c2xe.A0C.getDrawable(A02.getResourceId(index, 0));
            }
        }
        A02.recycle();
        return drawable;
    }
}
