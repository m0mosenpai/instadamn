package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes7.dex */
public abstract class I7T {
    public static final String A00(Context context, Integer num) {
        int intValue;
        C14360o3.A0B(context, 0);
        if (num != null && (intValue = num.intValue()) != 0) {
            String quantityString = context.getResources().getQuantityString(R.plurals.shopping_cart_count_content_description, intValue, num);
            C14360o3.A0A(quantityString);
            return quantityString;
        }
        return AbstractC166997dE.A0q(context.getResources(), 2131973957);
    }
}
