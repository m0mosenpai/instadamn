package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.facebook.R;

/* renamed from: X.7IL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7IL {
    public final int A00;
    public final Context A01;
    public final C7F8 A02;

    public final Drawable A00(int[] iArr, int i) {
        Drawable drawable = this.A01.getDrawable(i);
        if (drawable != null) {
            int length = iArr.length;
            if (length != 0) {
                if (length != 1) {
                    ShapeDrawable shapeDrawable = new ShapeDrawable();
                    RectShape rectShape = new RectShape();
                    int A00 = this.A02.A00();
                    AbstractC148406mA.A01(AbstractC50572MUd.A00(drawable), Paint.Cap.BUTT, Paint.Style.FILL, shapeDrawable, rectShape, iArr, A00, 0.0f).Eg1(0);
                    return shapeDrawable;
                }
                drawable.setColorFilter(iArr[0], PorterDuff.Mode.SRC_IN);
                return drawable;
            }
            drawable.setColorFilter(this.A00, PorterDuff.Mode.SRC_IN);
            return drawable;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C7IL(Context context) {
        this.A01 = context;
        this.A02 = new C7F8(context);
        this.A00 = AbstractC53242c7.A0F(context, R.attr.cyanBubbleBackground);
    }
}
