package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* loaded from: classes5.dex */
public abstract class CBV {
    public static final InterfaceC137546La A00(C5Tl c5Tl, int i) {
        if (C0fH.A02()) {
            C0fH.A01(-1664502064, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context A0K = AbstractC25228BEl.A0K(c5Tl);
        Object EEc = c5Tl.EEc();
        Object obj = C5UI.A00;
        if (EEc == obj) {
            EEc = new TypedValue();
            c5Tl.FBy(EEc);
        }
        TypedValue typedValue = (TypedValue) EEc;
        A0K.getResources().getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        C14360o3.A0A(charSequence);
        boolean AH4 = c5Tl.AH4(charSequence.toString());
        Object EEc2 = c5Tl.EEc();
        if (AH4 || EEc2 == obj) {
            Drawable drawable = A0K.getResources().getDrawable(i, null);
            C14360o3.A0C(drawable, MSV.A00(523));
            EEc2 = new C6LZ(((BitmapDrawable) drawable).getBitmap());
            c5Tl.FBy(EEc2);
        }
        InterfaceC137546La interfaceC137546La = (InterfaceC137546La) EEc2;
        if (C0fH.A02()) {
            C0fH.A00(-281877112);
        }
        return interfaceC137546La;
    }
}
