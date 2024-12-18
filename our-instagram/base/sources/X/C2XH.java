package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* renamed from: X.2XH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XH {
    public final Context A00;
    public final Resources A01;
    public final C2XF A02;
    public final Resources.Theme A03;

    public C2XH(Context context, C2XF c2xf) {
        C14360o3.A0B(c2xf, 2);
        this.A00 = context;
        this.A02 = c2xf;
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        this.A01 = resources;
        Resources.Theme theme = context.getTheme();
        C14360o3.A07(theme);
        this.A03 = theme;
    }

    public final int A00(float f) {
        return C2WL.A00(f * this.A01.getDisplayMetrics().density);
    }

    public final int A01(int i) {
        TypedArray obtainStyledAttributes = this.A03.obtainStyledAttributes(new int[]{i});
        C14360o3.A07(obtainStyledAttributes);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final int A02(int i) {
        if (i != 0) {
            C2XF c2xf = this.A02;
            Number number = (Number) ((C2XG) c2xf).A00.A02(Integer.valueOf(i));
            if (number != null) {
                return number.intValue();
            }
            int color = this.A00.getColor(i);
            c2xf.A00(i, Integer.valueOf(color));
            return color;
        }
        return 0;
    }

    public final int A03(int i) {
        if (i != 0) {
            C2XF c2xf = this.A02;
            Number number = (Number) ((C2XG) c2xf).A00.A02(Integer.valueOf(i));
            if (number != null) {
                return number.intValue();
            }
            int dimensionPixelSize = this.A01.getDimensionPixelSize(i);
            c2xf.A00(i, Integer.valueOf(dimensionPixelSize));
            return dimensionPixelSize;
        }
        return 0;
    }

    public final String A04(int i) {
        if (i != 0) {
            C2XF c2xf = this.A02;
            String str = (String) ((C2XG) c2xf).A00.A02(Integer.valueOf(i));
            if (str == null) {
                String string = this.A01.getString(i);
                C14360o3.A07(string);
                c2xf.A00(i, string);
                return string;
            }
            return str;
        }
        return null;
    }
}
