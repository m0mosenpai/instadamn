package X;

import android.os.Bundle;
import android.text.Spanned;

/* loaded from: classes11.dex */
public abstract class W1B {
    public static final String A03 = Integer.toString(0, 36);
    public static final String A00 = Integer.toString(1, 36);
    public static final String A01 = Integer.toString(2, 36);
    public static final String A04 = Integer.toString(3, 36);
    public static final String A02 = Integer.toString(4, 36);

    public static Bundle A00(Bundle bundle, Spanned spanned, Object obj, int i) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(A03, spanned.getSpanStart(obj));
        bundle2.putInt(A00, spanned.getSpanEnd(obj));
        bundle2.putInt(A01, spanned.getSpanFlags(obj));
        bundle2.putInt(A04, i);
        if (bundle != null) {
            bundle2.putBundle(A02, bundle);
        }
        return bundle2;
    }
}
