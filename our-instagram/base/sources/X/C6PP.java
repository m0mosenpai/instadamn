package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.R;

/* renamed from: X.6PP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PP {
    public static C6PQ A00;
    public static C6PQ A01;
    public static final C6PP A02 = new Object();

    public static final Drawable A00(Context context) {
        C6PQ c6pq;
        if (AbstractC13620mo.A02(context)) {
            c6pq = A01;
            if (c6pq == null) {
                Context applicationContext = context.getApplicationContext();
                C14360o3.A07(applicationContext);
                c6pq = new C6PQ(applicationContext);
                A01 = c6pq;
            }
        } else {
            c6pq = A00;
            if (c6pq == null) {
                Context applicationContext2 = context.getApplicationContext();
                C14360o3.A07(applicationContext2);
                c6pq = new C6PQ(applicationContext2);
                A00 = c6pq;
            }
        }
        Object value = c6pq.A00.getValue();
        C14360o3.A07(value);
        return (Drawable) value;
    }

    public static final void A01(Context context, Drawable drawable, SpannableStringBuilder spannableStringBuilder) {
        int length;
        byte directionality;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        if (AbstractC13620mo.A02(context) && (directionality = Character.getDirectionality(spannableStringBuilder.charAt(0))) != 1 && directionality != 2 && directionality != 16 && directionality != 17) {
            length = 0;
        } else {
            length = spannableStringBuilder.length();
        }
        C4GL.A02(drawable, spannableStringBuilder, length, dimensionPixelSize, 0);
    }
}
