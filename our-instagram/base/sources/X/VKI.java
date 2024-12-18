package X;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes11.dex */
public abstract class VKI {
    public static boolean A00 = true;
    public static Field A01;
    public static boolean A02;

    public float A00(View view) {
        if (A00) {
            try {
                return AbstractC69810Vvw.A00(view);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
        return view.getAlpha();
    }

    public void A01(Matrix matrix, View view) {
        if (UKD.A00) {
            try {
                AbstractC69811Vvx.A00(matrix, view);
            } catch (NoSuchMethodError unused) {
                UKD.A00 = false;
            }
        }
    }

    public void A02(Matrix matrix, View view) {
        if (UKD.A01) {
            try {
                AbstractC69811Vvx.A01(matrix, view);
            } catch (NoSuchMethodError unused) {
                UKD.A01 = false;
            }
        }
    }

    public void A03(View view, float f) {
        if (A00) {
            try {
                AbstractC69810Vvw.A01(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
        view.setAlpha(f);
    }

    public void A04(View view, int i) {
        if (!A02) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                A01 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            A02 = true;
        }
        Field field = A01;
        if (field != null) {
            try {
                A01.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void A05(View view, int i, int i2, int i3, int i4) {
        if (UKC.A00) {
            try {
                AbstractC68271VKi.A00(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                UKC.A00 = false;
            }
        }
    }
}
