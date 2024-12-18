package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spannable;

/* renamed from: X.JWf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43745JWf {
    public static final int A00(Context context, JV1 jv1) {
        C14360o3.A0B(context, 0);
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setTextSize(context.getResources().getDimension(jv1.A02));
        A0R.setTypeface((Typeface) jv1.A04);
        return ((int) A0R.measureText(jv1.A03.toString())) + 100;
    }

    public static final C6RB A01(Context context, JV1 jv1, int i) {
        C14360o3.A0B(context, 0);
        C6RB A0z = AbstractC166987dD.A0z(context, i);
        A0z.A0A(context.getResources().getDimension(jv1.A02));
        A0z.A0I((Typeface) jv1.A04);
        A0z.A0F(jv1.A01);
        A0z.A0L((Spannable) jv1.A03);
        return A0z;
    }
}
