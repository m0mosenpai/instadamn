package X;

import java.util.Arrays;

/* renamed from: X.6Hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136736Hc {
    public static final String A00(C5Tl c5Tl, int i) {
        if (C0fH.A02()) {
            C0fH.A01(2099468597, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = AbstractC136746Hd.A00(c5Tl).getString(i);
        if (C0fH.A02()) {
            C0fH.A00(-1941716134);
        }
        return string;
    }

    public static final String A01(C5Tl c5Tl, Object[] objArr, int i) {
        if (C0fH.A02()) {
            C0fH.A01(261738968, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = AbstractC136746Hd.A00(c5Tl).getString(i, Arrays.copyOf(objArr, objArr.length));
        if (C0fH.A02()) {
            C0fH.A00(1247112439);
        }
        return string;
    }

    public static final String A02(C5Tl c5Tl, Object[] objArr, int i, int i2) {
        if (C0fH.A02()) {
            C0fH.A01(1599018698, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = AbstractC136746Hd.A00(c5Tl).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        if (C0fH.A02()) {
            C0fH.A00(-1439606766);
        }
        return quantityString;
    }
}
