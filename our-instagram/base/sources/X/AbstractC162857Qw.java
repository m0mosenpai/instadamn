package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.7Qw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162857Qw {
    public static final C09530e4 A00(Shape shape, boolean z) {
        C162867Qx c162867Qx;
        ShapeDrawable shapeDrawable = new ShapeDrawable(shape);
        shapeDrawable.getPaint().setAlpha(0);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(shape);
        shapeDrawable2.getPaint().setAlpha(0);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(shape);
        shapeDrawable3.getPaint().setAlpha(0);
        ArrayList A1N = AbstractC16960so.A1N(shapeDrawable, shapeDrawable2);
        if (z) {
            c162867Qx = new C162867Qx(null);
            c162867Qx.setAlpha(0);
            A1N.add(c162867Qx);
        } else {
            c162867Qx = null;
        }
        A1N.add(shapeDrawable3);
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) A1N.toArray(new Drawable[0]));
        C162247Oj c162247Oj = new C162247Oj(shapeDrawable, shapeDrawable2, shapeDrawable3, shape, c162867Qx, new WeakReference(layerDrawable));
        C162247Oj.A06.put(layerDrawable, c162247Oj);
        return new C09530e4(layerDrawable, c162247Oj);
    }
}
