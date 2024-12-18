package X;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* loaded from: classes11.dex */
public final class W1P {
    public final C1WA A00;

    public static final Drawable A00(Resources resources, Drawable drawable, C27771Wf c27771Wf) {
        Drawable ump;
        C59182nJ c59182nJ = c27771Wf.A0J;
        if (c59182nJ != null) {
            if (drawable instanceof BitmapDrawable) {
                drawable = new UMS(resources, ((BitmapDrawable) drawable).getBitmap());
            } else {
                if (drawable instanceof NinePatchDrawable) {
                    ump = new AbstractC66318U8r(drawable);
                } else if (drawable instanceof ColorDrawable) {
                    ump = new C66317U8q(((ColorDrawable) drawable).getColor());
                    C14360o3.A0C(ump, "null cannot be cast to non-null type T of com.facebook.fresco.vito.drawable.RoundingUtils.getRoundedDrawable");
                } else {
                    ump = new UMP(drawable);
                }
                drawable = ump;
            }
            if (!c59182nJ.A02) {
                float[] fArr = c59182nJ.A03;
                if (fArr != null) {
                    ((XD1) drawable).Ec4(fArr);
                } else {
                    ((XD1) drawable).Ec5(c59182nJ.A00);
                    return drawable;
                }
            } else {
                ((XD1) drawable).ERO(true);
                return drawable;
            }
        }
        return drawable;
    }

    public W1P(C1WA c1wa) {
        this.A00 = c1wa;
    }
}
