package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.7Ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC160187Ge {
    public static final void A01(FrameLayout frameLayout, ImageView imageView, C7IK c7ik, int i, boolean z, boolean z2) {
        C14360o3.A0B(imageView, 0);
        Context context = imageView.getContext();
        C14360o3.A0A(context);
        imageView.setBackground(A00(context, frameLayout, c7ik, i, z, false, z2));
        if (imageView.getDrawable() != null && c7ik != null && !z2) {
            imageView.getDrawable().setColorFilter(C3DY.A00(c7ik.A05));
        }
    }

    public static final void A02(ImageView imageView, int i, boolean z) {
        C14360o3.A0B(imageView, 0);
        Context context = imageView.getContext();
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            if (z) {
                drawable.mutate().setColorFilter(new PorterDuffColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon)), PorterDuff.Mode.SRC_IN));
            } else {
                drawable.setColorFilter(context.getColor(R.color.design_dark_default_color_on_background), PorterDuff.Mode.SRC_IN);
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public static final ShapeDrawable A00(Context context, FrameLayout frameLayout, C7IK c7ik, int i, boolean z, boolean z2, boolean z3) {
        Shape ovalShape;
        C7F8 c7f8 = new C7F8(context);
        if (z2) {
            ovalShape = new C7AQ(TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
        } else {
            ovalShape = new OvalShape();
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        if (z3) {
            AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background)));
        } else if (c7ik != null) {
            int[] iArr = c7ik.A0K;
            int length = iArr.length;
            if (length == 0) {
                AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, AbstractC53242c7.A0F(context, R.attr.cyanBubbleBackground));
                return shapeDrawable;
            }
            if (length == 1) {
                AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, iArr[0]);
                return shapeDrawable;
            }
            float A00 = c7f8.A00();
            InterfaceC161477Li A01 = AbstractC148406mA.A01(null, Paint.Cap.BUTT, Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), iArr, A00, 0.0f);
            if (!z) {
                A01.Eg1((c7f8.A00() - frameLayout.getHeight()) - i);
                return shapeDrawable;
            }
        }
        return shapeDrawable;
    }
}
