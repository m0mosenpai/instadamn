package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;

/* renamed from: X.69X, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C69X {
    public static AbstractC119845bi A00;

    public static final AbstractC119845bi A00(Context context) {
        C14360o3.A0B(context, 0);
        AbstractC119845bi abstractC119845bi = A00;
        if (abstractC119845bi == null) {
            Typeface A02 = C3WY.A02(context, R.font.ig_logo_font);
            if (A02 != null) {
                abstractC119845bi = C69Y.A00(A02);
            } else {
                abstractC119845bi = null;
            }
            A00 = abstractC119845bi;
        }
        return abstractC119845bi;
    }
}
