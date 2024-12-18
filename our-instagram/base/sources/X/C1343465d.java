package X;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import com.facebook.R;

/* renamed from: X.65d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1343465d {
    public final float A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public final int A00(int i, float f) {
        if (this.A03 && AbstractC56842jH.A06(i, 255) == this.A01) {
            float f2 = 0.0f;
            if (this.A00 > 0.0f && f > 0.0f) {
                f2 = Math.min(((((float) Math.log1p(f / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            }
            return AbstractC56842jH.A06(AbstractC69853Vwe.A00(f2, AbstractC56842jH.A06(i, 255), this.A02), Color.alpha(i));
        }
        return i;
    }

    public C1343465d(Context context) {
        int i;
        int i2;
        boolean z = false;
        TypedValue A02 = AbstractC1343565e.A02(context, R.attr.elevationOverlayEnabled);
        if (A02 != null && A02.type == 18 && A02.data != 0) {
            z = true;
        }
        this.A03 = z;
        TypedValue A022 = AbstractC1343565e.A02(context, R.attr.elevationOverlayColor);
        if (A022 != null) {
            i = A022.data;
        } else {
            i = 0;
        }
        this.A02 = i;
        TypedValue A023 = AbstractC1343565e.A02(context, R.attr.colorSurface);
        if (A023 != null) {
            i2 = A023.data;
        } else {
            i2 = 0;
        }
        this.A01 = i2;
        this.A00 = context.getResources().getDisplayMetrics().density;
    }
}
