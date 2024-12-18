package X;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.Cdb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28289Cdb {
    @Deprecated(message = "Converting Rect to android.graphics.Rect is lossy, and requires rounding. The behavior of toAndroidRect() truncates to an integral Rect, but you should choose the method of rounding most suitable for your use case.", replaceWith = @ReplaceWith(expression = "android.graphics.Rect(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())", imports = {}))
    public static final Rect A00(C114205Dh c114205Dh) {
        return new Rect((int) c114205Dh.A01, (int) c114205Dh.A03, (int) c114205Dh.A02, (int) c114205Dh.A00);
    }

    public static final RectF A01(C114205Dh c114205Dh) {
        return new RectF(c114205Dh.A01, c114205Dh.A03, c114205Dh.A02, c114205Dh.A00);
    }

    public static final C114205Dh A02(RectF rectF) {
        return new C114205Dh(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
