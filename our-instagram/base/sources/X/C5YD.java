package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.5YD, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5YD {
    public static final String A01(C5Tl c5Tl, Object[] objArr, int i) {
        C14360o3.A0B(objArr, 1);
        if (C0fH.A02()) {
            C0fH.A01(1653749159, "com.instagram.compose.resources.igStringResource (IgStringResource.kt:30)");
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        String Ep0 = ((InterfaceC117985Vi) C5UT.A01(AbstractC117955Vf.A00, C117505Tk.A04(c117505Tk))).Ep0((Context) C5UT.A01(AndroidCompositionLocals_androidKt.A01, C117505Tk.A04(c117505Tk)), i);
        Locale A02 = C1Q2.A02();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(A02, Ep0, Arrays.copyOf(copyOf, copyOf.length));
        C14360o3.A07(format);
        if (C0fH.A02()) {
            C0fH.A00(-1174987572);
        }
        return format;
    }

    public static final String A00(C5Tl c5Tl, int i) {
        if (C0fH.A02()) {
            C0fH.A01(-1178697836, "com.instagram.compose.resources.igStringResource (IgStringResource.kt:19)");
        }
        String A00 = C5YE.A00(c5Tl, i);
        if (C0fH.A02()) {
            C0fH.A00(-1987842008);
        }
        return A00;
    }

    public static final String A02(C5Tl c5Tl, Object[] objArr, int i, int i2) {
        if (C0fH.A02()) {
            C0fH.A01(1074553615, "com.instagram.compose.resources.igPluralStringResource (IgStringResource.kt:39)");
        }
        String quantityString = ((Context) C5UT.A01(AndroidCompositionLocals_androidKt.A01, C117505Tk.A04((C117505Tk) c5Tl))).getResources().getQuantityString(i, i2, Arrays.copyOf(objArr, 1));
        C14360o3.A07(quantityString);
        if (C0fH.A02()) {
            C0fH.A00(207469930);
        }
        return quantityString;
    }
}
