package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.R;

/* renamed from: X.5XT, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5XT {
    public static final float A00(C5Tl c5Tl) {
        return A02(c5Tl, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    public static final float A01(C5Tl c5Tl) {
        return A02(c5Tl, R.dimen.abc_button_padding_horizontal_material);
    }

    public static final float A02(C5Tl c5Tl, int i) {
        if (C0fH.A02()) {
            C0fH.A01(-1605918876, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:75)");
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        float dimension = ((Context) C5UT.A01(AndroidCompositionLocals_androidKt.A01, C117505Tk.A04(c117505Tk))).getResources().getDimension(i) / ((InterfaceC1128957x) C5UT.A01(C5V2.A01, C117505Tk.A04(c117505Tk))).Awk();
        if (C0fH.A02()) {
            C0fH.A00(-1586844585);
        }
        return dimension;
    }
}
