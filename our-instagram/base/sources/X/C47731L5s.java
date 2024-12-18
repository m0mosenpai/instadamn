package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.ImageView;
import com.facebook.R;
import java.util.WeakHashMap;

/* renamed from: X.L5s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47731L5s {
    public final LKJ A00(ImageView imageView) {
        C14360o3.A0B(imageView, 0);
        WeakHashMap weakHashMap = LKJ.A0D;
        LKJ lkj = (LKJ) weakHashMap.get(imageView.getDrawable());
        if (lkj == null) {
            Context A0L = AbstractC166997dE.A0L(imageView);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new C44377JjG(0.0f));
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C44377JjG(1.0f));
            ShapeDrawable shapeDrawable3 = new ShapeDrawable(new C44377JjG(1.0f));
            int A0C = AbstractC167017dG.A0C(A0L);
            int A03 = AbstractC167017dG.A03(A0L);
            float dimension = A0L.getResources().getDimension(R.dimen.afi_indicator_arrow_margin_top);
            int A04 = AbstractC43594JPz.A04(A0L);
            int i = (A0C - A03) / 2;
            int A0F = AbstractC53242c7.A0F(A0L, R.attr.textColorPrimary);
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(A0F, PorterDuff.Mode.SRC_IN);
            shapeDrawable2.setIntrinsicWidth(A0C);
            shapeDrawable2.setIntrinsicHeight(A0C);
            shapeDrawable3.setIntrinsicWidth(A0C);
            shapeDrawable3.setIntrinsicHeight(A0C);
            shapeDrawable3.setAlpha(0);
            Paint.Style style = Paint.Style.STROKE;
            Paint.Cap cap = Paint.Cap.ROUND;
            AbstractC148406mA.A02(style, shapeDrawable2, shapeDrawable2.getShape(), dimension, A0F);
            AbstractC148406mA.A01(null, cap, style, shapeDrawable3, shapeDrawable3.getShape(), new int[]{AbstractC53242c7.A0F(A0L, R.attr.textColorTertiary), AbstractC53242c7.A0F(A0L, R.attr.textColorSecondary)}, shapeDrawable3.getIntrinsicHeight(), dimension);
            Drawable drawable = A0L.getDrawable(R.drawable.instagram_play_filled_16);
            if (drawable != null) {
                Drawable drawable2 = A0L.getDrawable(R.drawable.instagram_pause_filled_16);
                if (drawable2 != null) {
                    AbstractC167027dH.A0d(porterDuffColorFilter, drawable2);
                    AbstractC167027dH.A0d(porterDuffColorFilter, drawable);
                    drawable.mutate().setAlpha(255);
                    drawable2.mutate().setAlpha(0);
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable3, shapeDrawable, drawable2, drawable});
                    layerDrawable.setPaddingMode(1);
                    layerDrawable.setLayerInset(3, i, i, i, i);
                    layerDrawable.setLayerInset(4, i + A04, i, i - A04, i);
                    LKJ lkj2 = new LKJ(A0L, drawable, drawable2, shapeDrawable, shapeDrawable2, shapeDrawable3);
                    imageView.setImageDrawable(layerDrawable);
                    weakHashMap.put(layerDrawable, lkj2);
                    return lkj2;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        return lkj;
    }
}
