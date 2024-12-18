package X;

import android.text.Spanned;

/* loaded from: classes4.dex */
public abstract class A2U {
    public static final boolean A00(Spanned spanned, String str) {
        C14360o3.A0B(spanned, 1);
        String obj = spanned.toString();
        if (!str.equals(obj)) {
            if (str.equalsIgnoreCase(obj)) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    if (str.charAt(i) == spanned.charAt(i) || ((C202908y8[]) spanned.getSpans(i, i + 1, C202908y8.class)).length != 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
