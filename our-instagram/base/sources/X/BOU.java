package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class BOU {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.093] */
    public static final ShapeDrawable A01(Context context, GradientDrawable.Orientation orientation, double d, float f, float f2) {
        int i = 0;
        if (0.0d > d || d > 1.0d) {
            d = 0.5d;
        }
        int A06 = AbstractC56842jH.A06(context.getColor(R.color.black), C1H4.A00(d * 255.0d));
        Float A0l = AbstractC25227BEk.A0l();
        Float valueOf = Float.valueOf(0.118f);
        Float valueOf2 = Float.valueOf(0.214f);
        Float valueOf3 = Float.valueOf(0.291f);
        Float valueOf4 = Float.valueOf(0.353f);
        Float valueOf5 = Float.valueOf(0.404f);
        Float valueOf6 = Float.valueOf(0.446f);
        Float valueOf7 = Float.valueOf(0.482f);
        Float valueOf8 = Float.valueOf(0.518f);
        Float valueOf9 = Float.valueOf(0.554f);
        Float valueOf10 = Float.valueOf(0.596f);
        Float valueOf11 = Float.valueOf(0.647f);
        Float valueOf12 = Float.valueOf(0.709f);
        Float valueOf13 = Float.valueOf(0.786f);
        Float valueOf14 = Float.valueOf(0.882f);
        Float A0m = AbstractC25227BEk.A0m();
        ArrayList A1N = AbstractC16960so.A1N(A0l, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, A0m);
        ArrayList A0i = AbstractC167007dF.A0i(A1N);
        Iterator it = A1N.iterator();
        while (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue() * (1.0f - f2);
            if (orientation == GradientDrawable.Orientation.TOP_BOTTOM) {
                floatValue += f2;
            }
            A0i.add(Float.valueOf(floatValue));
        }
        ArrayList A0U = AbstractC001800i.A0U(A0i);
        GradientDrawable.Orientation orientation2 = GradientDrawable.Orientation.TOP_BOTTOM;
        if (orientation == orientation2) {
            A0U.add(0, A0l);
        } else {
            A0U.add(A0m);
        }
        float[] A0w = AbstractC001800i.A0w(A0U);
        float[] fArr = {0.0f, 0.008f, 0.03f, 0.07f, 0.12f, 0.18f, 0.25f, 0.33f, 0.41f, 0.5f, 0.59f, 0.67f, 0.76f, 0.85f, 0.93f, 1.0f, 1.0f};
        ArrayList A17 = AbstractC25225BEi.A17(17);
        do {
            A17.add(Float.valueOf(fArr[i]));
            i++;
        } while (i < 17);
        AbstractC002900t.A10(A17);
        ArrayList A0i2 = AbstractC167007dF.A0i(A17);
        Iterator it2 = A17.iterator();
        while (it2.hasNext()) {
            A0i2.add(Integer.valueOf(AbstractC13950nL.A06(A06, (((Number) it2.next()).floatValue() * Color.alpha(A06)) / 255.0f)));
        }
        if (orientation != orientation2) {
            A0i2 = new AnonymousClass093(A0i2);
        }
        int[] A0x = AbstractC001800i.A0x(A0i2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, A0x, A0w, Shader.TileMode.CLAMP));
        return shapeDrawable;
    }

    public static final GradientDrawable A00(Context context, GradientDrawable.Orientation orientation, double d) {
        if (0.0d > d || d > 1.0d) {
            d = 0.5d;
        }
        return BOV.A00(orientation, AbstractC56842jH.A06(context.getColor(R.color.black), C1H4.A00(d * 255.0d)));
    }
}
